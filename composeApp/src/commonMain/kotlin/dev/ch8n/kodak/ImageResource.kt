package dev.ch8n.kodak

sealed class ImageResource {
    data class Url(val imageUrl: String) : ImageResource()
}