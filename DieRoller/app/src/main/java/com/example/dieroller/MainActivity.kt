package com.example.dieroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dieroller.ui.theme.DieRollerTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.LinearEasing
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DieRollerApp()
        }
    }
}

@Composable
fun DieRollerApp() {
    DieWithButtonAndImage()
}

@Composable
fun DieWithButtonAndImage() {
        var result by remember { mutableIntStateOf(1) }
        var rolling by remember { mutableStateOf(false) }
    val rotation by animateFloatAsState(
        targetValue = if (rolling) 360f else 0f,
        animationSpec = tween(durationMillis = 600, easing = LinearEasing),
        finishedListener = {
            result = (1..6).random()
            rolling = false
        },
        label = "rotation"
    )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = getImageResource(result)),
                contentDescription = result.toString(),
                modifier = Modifier
                    .size(150.dp)
                    .rotate(rotation)
            )
            Button(onClick = {
                if (!rolling) rolling = true
            }) {
                Text("Lançar o dado")
            }
        }
    }


fun getImageResource(dieValue: Int): Int{
    return when (dieValue){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
}

@Preview(showBackground = true)
@Composable
fun DieRollerPreview() {
    DieRollerTheme {
        DieWithButtonAndImage()
    }
}