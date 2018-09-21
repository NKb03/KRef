package org.nikok.kref

import com.natpryce.hamkrest.absent
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

internal object Spec: Spek({
    describe("weak ref") {
        val v by weak(1)
        it("should contain the passed value") {
            v shouldMatch equalTo(1)
        }
        on("garbage collection") {
            System.gc()
            it("should clear the object") {
                v shouldMatch absent()
            }
        }
    }
    describe("soft ref") {
        val v by soft(1)
        it("should contain the passed value") {
            v shouldMatch equalTo(1)
        }
        on("garbage collection") {
            System.gc()
            it("should clear the object") {
                v shouldMatch absent()
            }
        }
    }
    describe("strong ref") {
        val v by strong(1)
        it("should contain the passed value") {
            v shouldMatch equalTo(1)
        }
        on("garbage collection") {
            System.gc()
            it("should not clear the object") {
                v shouldMatch equalTo(1)
            }
        }
    }
    describe("mutable weak ref") {
        val v by mutableWeak(1)
        it("should contain the passed value") {
            v shouldMatch equalTo(1)
        }
        on("setting the value to 2") {
            it("should update the value to 2") {
                v shouldMatch equalTo(2)
            }
        }
        on("garbage collection") {
            System.gc()
            it("should clear the reference") {
                v shouldMatch absent()
            }
        }
    }
    describe("mutable soft ref") {
        val v by mutableSoft(1)
        it("should contain the passed value") {
            v shouldMatch equalTo(1)
        }
        on("setting the value to 2") {
            it("should update the value to 2") {
                v shouldMatch equalTo(2)
            }
        }
        on("garbage collection") {
            System.gc()
            it("should clear the reference") {
                v shouldMatch absent()
            }
        }
    }
    describe("mutable strong ref") {
        val v by mutableStrong(1)
        it("should contain the passed value") {
            v shouldMatch equalTo(1)
        }
        on("setting the value to 2") {
            it("should update the value to 2") {
                v shouldMatch equalTo(2)
            }
        }
        on("garbage collection") {
            System.gc()
            it("should not clear the reference") {
                v shouldMatch equalTo(2)
            }
        }
    }
})