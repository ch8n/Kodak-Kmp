package dev.ch8n.kodak

import android.graphics.BitmapFactory
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap

actual fun imageBitmapFromBytes(encodedImageData: ByteArray): ImageBitmap {
    return BitmapFactory.decodeByteArray(encodedImageData, 0, encodedImageData.size).asImageBitmap()
}