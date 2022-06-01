package mumtaz.binar.challangechapterdelapan.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mumtaz.binar.challangechapterdelapan.R
import mumtaz.binar.challangechapterdelapan.activity.ui.theme.ChallangeChapterDelapanTheme

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallangeChapterDelapanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting5("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting5(name: String) {
    Column(modifier = Modifier.padding(10.dp),
    horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Detail Film",
            fontSize = 30.sp,
        )

        Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "img")

        Text(text = "Judul")
        Text(text = "Tanggal")
        Text(text = "Description")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview5() {
    ChallangeChapterDelapanTheme {
        Greeting5("Android")
    }
}