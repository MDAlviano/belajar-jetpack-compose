package com.alvin.belajar.compose

import android.os.Bundle
import android.text.Selection
import android.text.style.SuperscriptSpan
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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
import com.alvin.belajar.compose.components.CoilImage
import com.alvin.belajar.compose.components.CustomItem
import com.alvin.belajar.compose.repository.PersonRepository
import com.alvin.belajar.compose.ui.theme.BelajarComposeTheme
import java.util.Vector

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarComposeTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    PasswordTextFields()
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

@Composable
fun TextFields() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var text by remember {
            mutableStateOf("Type Here...")
        }
        OutlinedTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = {
                Text(
                    text = "Please fill this input below",
                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.Bold
                )
            },
            leadingIcon = {
                IconButton(
                    onClick = {

                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon"
                    )
                }
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        Log.d("TrailingIcon", "Checked")
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "Email Icon"
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.d("OnSearch", "Clicked")
                }
            )
        )
    }
}

@Composable
fun PasswordTextFields() {
    var password by rememberSaveable {
        mutableStateOf("")
    }
    var passwordVisibility by remember {
        mutableStateOf(false
        )
    }

    val icon = if (passwordVisibility)
        painterResource(id = R.drawable.ic_google_logo)
    else
        painterResource(id = R.drawable.ic_launcher_foreground)

    OutlinedTextField(
        value = password,
        onValueChange = {
            password = it
        },
        placeholder = {
            Text(
                text = "Password"
            )
        },
        label = {
            Text(
                text = "Password"
            )
        },
        trailingIcon = {
            IconButton(
                onClick = {
                    passwordVisibility = !passwordVisibility
                }
            ) {
                Icon(
                    painter = icon,
                    contentDescription = "Trailing Icon",
                    tint = Color.Unspecified
                )
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ),
        visualTransformation = if (passwordVisibility) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        }
    )
}

@Composable
fun MyLazyColumn() {
    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()

    LazyColumn(
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(items = getAllData) { person ->
            CustomItem(person = person)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyStickyHeader() {
    val sections = listOf("A","B","C","D","E","F","G")

    LazyColumn(
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        sections.forEach { section ->
            stickyHeader {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(12.dp),
                    text = "Section $section"
                )
            }
            items(10) {
                Text(
                    modifier = Modifier.padding(12.dp),
                    text = "Item $it from the section $section"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BelajarComposeTheme {
        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            MyLazyColumn()
        }
    }
}