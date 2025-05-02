package com.lebaillyapp.pagecurltest.composition

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import eu.wewox.pagecurl.ExperimentalPageCurlApi
import eu.wewox.pagecurl.config.PageCurlConfig
import eu.wewox.pagecurl.config.rememberPageCurlConfig
import eu.wewox.pagecurl.page.PageCurl
import eu.wewox.pagecurl.page.rememberPageCurlState

@OptIn(ExperimentalPageCurlApi::class)
@Composable
fun EnhancedPageCurlScreen() {
    val pages = listOf("Screen 1", "Screen 2", "Screen 3", "Screen 4", "Screen 5")
    val colors = listOf(Color.Red, Color.Green, Color.Blue, Color.Yellow, Color.Magenta)

    val state = rememberPageCurlState()
    val scope = rememberCoroutineScope()
    var currentPage by remember { mutableStateOf(0) }

    // Nouvelle config de la v1.5.0
    val config = rememberPageCurlConfig(
        dragInteraction = PageCurlConfig.GestureDragInteraction(
            pointerBehavior = PageCurlConfig.DragInteraction.PointerBehavior.PageEdge
        ),
        tapInteraction = PageCurlConfig.TargetTapInteraction()
    )

    Column(modifier = Modifier.fillMaxSize()) {
        // Affichage index actuel
        Text(
            text = "${currentPage + 1} / ${pages.size}",
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.titleLarge
        )

        // Composant PageCurl avec configuration avancée
        PageCurl(
            count = pages.size,
            state = state,
            config = config,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) { index ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colors[index]),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = pages[index],
                    fontSize = 32.sp,
                    color = Color.White
                )
            }
        }


    }
}