package com.seda.basic_compose_affirmations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.seda.basic_compose_affirmations.model.Affirmation
import com.seda.basic_compose_affirmations.ui.theme.Basic_compose_affirmationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Basic_compose_affirmationsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AffirmationApp()
                }
            }
        }
    }
}

@Composable
fun AffirmationApp() {

}

@Composable
fun AffirmationCard(affirmation: Affirmation,modifier: Modifier=Modifier){
    Card() {

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Basic_compose_affirmationsTheme {
        AffirmationCard(affirmation = Affirmation(R.string.affirmation1,R.drawable.image1))
    }
}