package dev.ch8n.kodak

import androidx.compose.ui.graphics.ImageBitmap
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*


class KodakImageLoader(
    private val httpClient: HttpClient,
) {
    suspend fun loadImage(imageResource: ImageResource): ImageBitmap {
        when (imageResource) {
            is ImageResource.Url -> {
                val imageUrl = imageResource.imageUrl
                return loadFromRemote(imageUrl)
            }
        }
    }

    private suspend fun loadFromRemote(url: String): ImageBitmap {
        val response: HttpResponse = httpClient.get(url)
        val imageBytes = response.readBytes()
        Console.log(imageBytes.toString())
        return imageBitmapFromBytes(imageBytes)
    }
}
