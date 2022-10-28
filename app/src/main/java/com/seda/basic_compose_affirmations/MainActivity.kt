package com.seda.basic_compose_affirmations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.seda.basic_compose_affirmations.data.Datasource
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

        Scaffold(
            content = {
                AffirmationList(affirmationList = Datasource().loadAffirmations())
            }
        )

}

@Composable
private fun AffirmationList(affirmationList:List<Affirmation>,modifier: Modifier=Modifier){
    LazyColumn{
        items(affirmationList){ affirmation ->

            AffirmationCard(affirmation)

        }
    }

}
@Composable
fun AffirmationCard(affirmation: Affirmation,modifier: Modifier=Modifier){
    Card(modifier = modifier.padding(8.dp), elevation = 4.dp) {
Column() {
    Image(painter = painterResource(id = affirmation.imageResourceId), contentDescription = stringResource(
        id = affirmation.stringResourceId
    ), modifier = modifier
        .fillMaxWidth()
        .height(194.dp), contentScale = ContentScale.Crop)
    Text(
        text = stringResource(affirmation.stringResourceId),
        modifier = Modifier.padding(16.dp),
        style = MaterialTheme.typography.h6
    )
}
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Basic_compose_affirmationsTheme {
AffirmationApp()
    }
}