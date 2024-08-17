package dev.ch8n.kodak

import androidx.compose.ui.graphics.ImageBitmap
import kotlinx.coroutines.CoroutineDispatcher


expect fun imageBitmapFromBytes(encodedImageData: ByteArray): ImageBitmap

expect val KodakDispatcher : CoroutineDispatcher