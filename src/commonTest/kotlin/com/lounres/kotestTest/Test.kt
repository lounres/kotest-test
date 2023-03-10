package com.lounres.kotestTest

import io.kotest.core.spec.style.FreeSpec
import kotlin.time.Duration.Companion.seconds


class Test : FreeSpec() {
    override fun timeout(): Long = 5000
    override fun invocationTimeout(): Long = 5000

    init {
        timeout = 5000
        invocationTimeout = 5000
        "normal test" {
            normalFunction()
        }
        "bugged function".config(timeout = 5.seconds) {
            buggedFunction()
        }
    }
}