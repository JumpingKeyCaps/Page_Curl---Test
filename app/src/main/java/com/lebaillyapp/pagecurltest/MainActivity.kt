package com.lebaillyapp.pagecurltest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.lebaillyapp.pagecurltest.composition.ImagePageCurlScreen
import com.lebaillyapp.pagecurltest.ui.theme.PageCurlTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PageCurlTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){
                       // PageCurlScreen()
                       // EnhancedPageCurlScreen()
                        ImagePageCurlScreen()

                    }
                }
            }
        }
    }
}


