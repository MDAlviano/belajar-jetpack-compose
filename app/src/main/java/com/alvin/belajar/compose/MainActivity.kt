package com.alvin.belajar.compose

import android.os.Bundle
import android.text.Selection
import android.text.style.SuperscriptSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alvin.belajar.compose.ui.theme.BelajarComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarComposeTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    ExpandableCard(
                        title = "My Title",
                        description = stringResource(
                            id = R.string.desc_expand_card
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun TestText(name: String, age: Int) {
    if (age > 18) {
        Text(
            text = "Hello $name, age: $age, adult",
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.ExtraBold,
        )
    } else if (age >= 14) {
        Text(
            text = "Hello $name, age: $age, teen",
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Medium,
        )
    } else {
        Text(
            text = "Hello $name, age: $age, kids",
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Thin,
        )
    }
}

@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .weight(weight),
        color = color
    ) {}
}

@Composable
fun RowScope.CustomRowItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {}
}

@Composable
fun TestBox() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .background(Color.Green)
            )
            Text(text = "I Love Jetpack Compose", fontSize = 20.sp)
        }
    }
}

@Composable
fun TextCustomization() {
    Text(
        text = stringResource(id = R.string.app_name),
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp)
            .width(200.dp),
        color = Color.White,
        fontSize = MaterialTheme.typography.labelLarge.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextCustomization2() {
    Text(
        buildAnnotatedString {
            append("Sudah Punya Akun? ")
            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colorScheme.error,
                    textDecoration = TextDecoration.Underline
                )
            ) {
                append("Login Sekarang!")
            }
        },
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold
    )
    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue,
                        fontSize = 50.sp
                    )
                ) {
                    append("A")
                }
                append("B")
                append("C")
                append("D")
            }
        },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun TextCustomization3() {
    Text(text = "Hello World!".repeat(20),
        maxLines = 4,
        overflow = TextOverflow.Clip
    )
}

@Composable
fun TextSelection() {
    SelectionContainer {
        Column {
            Text(text = "Hello World!")
            DisableSelection {
                Text(text = "Hello World!")
            }
            Text(text = "Hello World!")
        }
    }
}

@Composable
fun SuperAndSubsScriptText(
    normalText: String,
    normalFontSize: TextUnit = 16.sp,
    superAndSubsText: String,
    superAndSubsTextFontSize: TextUnit = 10.sp,
    superTextAndSubsFontWeight: FontWeight = FontWeight.Normal,
    baselineShift: BaselineShift = BaselineShift.None
) {
    Text(
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = normalFontSize
                )
            ) {
                append(normalText)
            }
            withStyle(
                style = SpanStyle(
                    fontSize = superAndSubsTextFontSize,
                    fontWeight = superTextAndSubsFontWeight,
                    baselineShift = baselineShift
                )
            ) {
                append(superAndSubsText)
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BelajarComposeTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            ExpandableCard(
                title = "My Title",
                description = stringResource(
                    id = R.string.desc_expand_card
                )
            )
        }
    }
}