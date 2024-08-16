package dev.ch8n.kodak

import androidx.compose.ui.graphics.ImageBitmap


expect fun imageBitmapFromBytes(encodedImageData: ByteArray): ImageBitmap