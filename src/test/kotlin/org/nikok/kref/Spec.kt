package org.nikok.kref

import com.natpryce.hamkrest.absent
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.jetbrains.spek.api.dsl.xit

internal object Spec: Spek({
    data class Data(val x: Int)

    fun gc() {
        Thread.sleep(10)
        System.gc()
        Thread.sleep(10)
    }
    describe("weak ref") {
        val v by weak(Data(1))
        it("should contain the passed value") {
            v shouldMatch equalTo(Data(1))
        }
        on("garbage collection") {
            gc()
            it("should clear the object") {
                v shouldMatch absent()
            }
        }
    }
    describe("soft ref") {
        val v by soft(Data(1))
        it("should contain the passed value") {
            v shouldMatch equalTo(Data(1))
        }
        on("garbage collection") {
            gc()
            xit("should clear the object") {
                v shouldMatch absent()
            }
        }
    }
    describe("strong ref") {
        val v by strong(Data(1))
        it("should contain the passed value") {
            v shouldMatch equalTo(Data(1))
        }
        on("garbage collection") {
            gc()
            it("should not clear the object") {
                v shouldMatch equalTo(Data(1))
            }
        }
    }
    describe("mutable weak ref") {
        var v by mutableWeak(Data(1))
        xit("should contain the passed value") {
            v shouldMatch equalTo(Data(1))
        }
        on("setting the value to 2") {
            v = Data(2)
            it("should update the value to 2") {
                v shouldMatch equalTo(Data(2))
            }
        }
        on("garbage collection") {
            gc()
            it("should clear the reference") {
                v shouldMatch absent()
            }
        }
    }
    describe("mutable soft ref") {
        var v by mutableSoft(Data(1))
        it("should contain the passed value") {
            v shouldMatch equalTo(Data(1))
        }
        on("setting the value to 2") {
            v = Data(2)
            it("should update the value to 2") {
                v shouldMatch equalTo(Data(2))
            }
        }
        on("garbage collection") {
            gc()
            xit("should clear the reference") {
                v shouldMatch absent()
            }
        }
    }
    describe("mutable strong ref") {
        var v by mutableStrong(Data(1))
        it("should contain the passed value") {
            v shouldMatch equalTo(Data(1))
        }
        on("setting the value to 2") {
            v = Data(2)
            it("should update the value to 2") {
                v shouldMatch equalTo(Data(2))
            }
        }
        on("garbage collection") {
            gc()
            it("should not clear the reference") {
                v shouldMatch equalTo(Data(2))
            }
        }
    }
})