package com.uz.exampleincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uz.firsttaskincompose.R
import com.uz.firsttaskincompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
//                    task1
//                    JetpackCompose(
//                        title = stringResource(R.string.title),
//                        short = stringResource(R.string.short_content),
//                        desc = stringResource(R.string.desc)
//                    )

//                    task2
//                    TaskManager(

//                        str1 = stringResource(R.string.all_task_completed),
//                        str2 = stringResource(R.string.nice_work),
//                    )

//                    task3
                    ComposeQuadrant(
                        title1 = stringResource(R.string.title1),
                        desc1 = stringResource(R.string.desc1),
                        title2 = stringResource(R.string.title2),
                        desc2 = stringResource(R.string.desc2),
                        title3 = stringResource(R.string.title3),
                        desc3 = stringResource(R.string.desc3),
                        title4 = stringResource(R.string.title4),
                        desc4 = stringResource(R.string.desc4),
                    )
                }
            }
        }
    }
}

@Composable
fun JetpackCompose(title: String, short: String, desc: String) {
    Column {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null
        )
        Text(
            text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp)
        )
        Text(
            text = short, fontSize = 16.sp, modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = desc, fontSize = 16.sp, modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun TaskManager(str1: String, str2: String) {
    Column(
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed), contentDescription = null
        )
        Text(
            text = str1,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = str2, fontWeight = FontWeight.Bold, fontSize = 16.sp
        )
    }
}

@Composable
fun ComposeQuadrant(
    title1: String,
    desc1: String,
    title2: String,
    desc2: String,
    title3: String,
    desc3: String,
    title4: String,
    desc4: String
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxHeight(0.5f)) {
            Column(
                modifier = Modifier
                    .background(color = Color.Green)
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = title1, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
                Text(text = desc1, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
            }
            Column(
                modifier = Modifier
                    .background(color = Color.Yellow)
                    .fillMaxHeight()
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = title2, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
                Text(text = desc2, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
            }
        }
        Row(modifier = Modifier.fillMaxHeight()) {
            Column(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = title3, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
                Text(text = desc3, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
            }
            Column(
                modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxHeight()
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = title4, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
                Text(text = desc4, fontSize = 16.sp, modifier = Modifier.padding(16.dp))
            }
        }
    }
}

@Composable
fun ImageCompose(title: String, desc: String) {

}

@Composable
fun RowCompose(title: String, desc: String) {

}

@Composable
fun ColumnCompose(title: String, desc: String) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
//        task1
//        JetpackCompose(
//            title = stringResource(R.string.title),
//            short = stringResource(R.string.short_content),
//            desc = stringResource(R.string.desc)
//        )

//        task2
//        TaskManager(
//            str1 = stringResource(R.string.all_task_completed),
//            str2 = stringResource(R.string.nice_work),
//        )

//        task3
        ComposeQuadrant(
            title1 = stringResource(R.string.title1),
            desc1 = stringResource(R.string.desc1),
            title2 = stringResource(R.string.title2),
            desc2 = stringResource(R.string.desc2),
            title3 = stringResource(R.string.title3),
            desc3 = stringResource(R.string.desc3),
            title4 = stringResource(R.string.title4),
            desc4 = stringResource(R.string.desc4),
        )
    }
}