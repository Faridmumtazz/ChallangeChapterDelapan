package mumtaz.binar.challangechapterdelapan.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mumtaz.binar.challangechapterdelapan.R
import mumtaz.binar.challangechapterdelapan.activity.ui.theme.ChallangeChapterDelapanTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallangeChapterDelapanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {
    Column(
        modifier = Modifier.padding(15.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Welcome, User!")
            Text(text = "Home", modifier = Modifier.padding(horizontal = 20.dp))
            Text(text = "Logout", modifier = Modifier.padding(horizontal = 40.dp))
        }

        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(100.dp),
            backgroundColor = Color.White,
            shape = RoundedCornerShape(15.dp)
        ) {
            Row(
                modifier = Modifier.padding(10.dp)
            ) {
                Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "img")
                Column(modifier = Modifier.padding(horizontal = 20.dp)) {
                    Text(text = "Judul")
                    Text(text = "Tanggal")
                    Text(text = "Description")

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview4() {
    ChallangeChapterDelapanTheme {
        Greeting4("Android")
    }
}