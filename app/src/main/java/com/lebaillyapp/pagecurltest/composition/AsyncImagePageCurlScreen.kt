package com.lebaillyapp.pagecurltest.composition

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.request.ImageRequest
import eu.wewox.pagecurl.ExperimentalPageCurlApi
import eu.wewox.pagecurl.config.PageCurlConfig
import eu.wewox.pagecurl.config.rememberPageCurlConfig
import eu.wewox.pagecurl.page.PageCurl
import eu.wewox.pagecurl.page.rememberPageCurlState

@OptIn(ExperimentalPageCurlApi::class)
@Composable
fun AsyncImagePageCurlScreen() {

    val context = LocalContext.current
    val state = rememberPageCurlState()
    val scope = rememberCoroutineScope()
    var currentPage by remember { mutableStateOf(0) }

    // Liste des noms d’images sans l’extension
    val imageNames = (1..12).map { i ->
        "jde_%03d".format(i) // jde_001, jde_002, ...
    }

    // Nouvelle configuration avec GestureDragInteraction + PageEdge
    val config = rememberPageCurlConfig(
        dragInteraction = PageCurlConfig.GestureDragInteraction(
            pointerBehavior = PageCurlConfig.DragInteraction.PointerBehavior.PageEdge
        ),
        tapInteraction = PageCurlConfig.TargetTapInteraction()
    )

    Box(modifier = Modifier.fillMaxSize().background(Color.White)) {


        PageCurl(
            count = imageNames.size,
            state = state,
            config = config,
            modifier = Modifier
                .fillMaxSize()
        ) { index ->
            val imageResId = remember(imageNames[index]) {
                context.resources.getIdentifier(imageNames[index], "drawable", context.packageName)
            }

            if (imageResId != 0) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(imageResId)
                        .build(),
                    contentDescription = "Page ${index + 1}",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxSize()
                )
            } else {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Gray),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Image not found", color = Color.White)
                }
            }
        }


    }
}