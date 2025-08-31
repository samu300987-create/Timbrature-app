package it.sam.timbrature

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = { TopAppBar(title = { Text("Timbrature") }) },
                floatingActionButton = {
                    Column {
                        Button(onClick = {}) { Text("Timbra Entrata") }
                        Button(onClick = {}) { Text("Timbra Uscita") }
                    }
                }
            ) { padding ->
                LazyColumn(modifier = Modifier.padding(padding).fillMaxSize()) {
                    items(listOf("Prova timbro")) { Text(it, modifier = Modifier.padding(4.dp)) }
                }
            }
        }
    }
}