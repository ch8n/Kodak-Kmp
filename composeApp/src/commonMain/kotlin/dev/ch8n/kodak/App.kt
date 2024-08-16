package dev.ch8n.kodak

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp
import io.ktor.client.*
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {

    LaunchedEffect(Unit) {
        Console.init()
    }

    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

            val scope = rememberCoroutineScope()
            val kodakImageLoader = remember {
                KodakImageLoader(httpClient = HttpClient())
            }

            var image by remember { mutableStateOf<ImageBitmap?>(null) }

            Button(onClick = {
                scope.launch {
                    try {
                        val remoteImage = kodakImageLoader.loadImage(ImageResource.Url("https://fastly.picsum.photos/id/866/536/354.jpg?hmac=tGofDTV7tl2rprappPzKFiZ9vDh5MKj39oa2D--gqhA"))
                        image = remoteImage
                    } catch (e:Exception) {
                        Console.error(e.message, e.cause)
                    }
                }
            }) {
                Text("Load image")
            }

            if (image != null) {
                Image(
                    bitmap = image!!,
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(50.dp)
                        .border(2.dp, Color.DarkGray),
                    contentDescription = ""
                )
            }
        }
    }
}