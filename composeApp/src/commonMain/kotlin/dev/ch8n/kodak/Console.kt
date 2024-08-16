package dev.ch8n.kodak

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

object Console {
    fun log(message: String) {
        Napier.d(message = message)
    }

    fun error(message: String?, throwable: Throwable? = null) {
        Napier.e(message = message ?: "", throwable = throwable)
    }

    fun init() {
        Napier.base(DebugAntilog())
    }
}