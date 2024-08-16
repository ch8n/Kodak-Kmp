package dev.ch8n.kodak

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform