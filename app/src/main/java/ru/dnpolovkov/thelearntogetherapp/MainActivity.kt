package ru.dnpolovkov.thelearntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale.Companion.FillWidth
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.dnpolovkov.thelearntogetherapp.ui.theme.TheLearnTogetherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheLearnTogetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleImage(
                        stringResource(R.string.title_text),
                        stringResource(R.string.article_one),
                        stringResource(R.string.article_second)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleText(title: String, articleOne: String, articleSecond: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp,140.dp,16.dp,16.dp)
        )
        Text(
            text = articleOne,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp, 0.dp, 16.dp, 0.dp)
        )
        Text(
            text = articleSecond,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Composable
fun ArticleImage(title: String, articleOne: String, articleSecond: String, modifier: Modifier = Modifier) {
    Box {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = FillWidth,
            modifier = modifier
        )
        ArticleText(
            title = title,
            articleOne = articleOne,
            articleSecond = articleSecond,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheLearnTogetherAppTheme {
        ArticleImage(
            stringResource(R.string.title_text),
            stringResource(R.string.article_one),
            stringResource(R.string.article_second)
        )
    }
}