package com.lounres.kotestTest

import io.kotest.core.spec.style.FreeSpec


class Test : FreeSpec({
    "normal test" {
        normalFunctioon()
    }
    "bugged function" {
        buggedFunction()
    }
})