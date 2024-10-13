package com.example.sergio_casalgerman_uf1_act2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sergio_casalgerman_uf1_act2.ui.theme.Sergio_CasalGerman_UF1_ACT2Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sergio_CasalGerman_UF1_ACT2Theme {
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
    Row(modifier = modifier) {
        Text(text = "Hola ")
        Text(text = "mon!")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Sergio_CasalGerman_UF1_ACT2Theme {
        Greeting()
    }
}