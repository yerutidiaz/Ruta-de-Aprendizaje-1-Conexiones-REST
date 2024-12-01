package com.example.racetracker.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch
import com.example.racetracker.ui.theme.* 

@Composable
fun RaceTrackerApp() {
    val playerOne = remember { RaceParticipant(name = "Player 1") }
    val playerTwo = remember { RaceParticipant(name = "Player 2", progressIncrement = 2) }
    var isRunning by remember { mutableStateOf(false) }

    if (isRunning) {
        LaunchedEffect(Unit) {
            launch { playerOne.run() }
            launch { playerTwo.run() }
            isRunning = false
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Race Tracker", style = MaterialTheme.typography.headlineLarge)

        Button(
            onClick = { isRunning = !isRunning },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = DarkGreen) 
        ) {
            Text(text = if (isRunning) "Pause" else "Start", color = White) 
        }

        // Barras de progreso
        LinearProgressIndicator(
            progress = playerOne.currentProgress / 100f,
            modifier = Modifier.fillMaxWidth(),
            color = LightPink 
        )

        LinearProgressIndicator(
            progress = playerTwo.currentProgress / 100f,
            modifier = Modifier.fillMaxWidth(),
            color = LightPink 
        )
        
        Button(
            onClick = { isRunning = false },
            modifier = Modifier
                .fillMaxWidth()
                .border(2.dp, CancelButtonBorderGreen), 
            colors = ButtonDefaults.buttonColors(containerColor = White) 
        ) {
            Text(text = "Cancel", color = CancelButtonBorderGreen) 
        }
    }
}

@Composable
@Preview
fun PreviewRaceTrackerApp() {
    RaceTrackerApp()
}


