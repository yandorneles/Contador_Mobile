package com.example.contador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contador.ui.theme.ContadorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContadorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    var count: Int by remember {
        mutableStateOf<Int>(value = 0)

    };
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = count.toString(),
            modifier = Modifier
                .padding(0.dp)
                .align(Alignment.CenterHorizontally),
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 60.sp
        )
        Button(
            onClick = { count++ },
            modifier = Modifier
                .padding(25.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Contar" , fontSize = 30.sp)
        }
    }
}