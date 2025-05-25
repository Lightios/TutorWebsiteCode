package pl.michal_cyran.tutor_website.core

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import pl.michal_cyran.tutor_website.HEADLINE_SIZE


@Composable
fun SectionHeading(
    text: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text,
        fontSize = HEADLINE_SIZE,
        fontWeight = FontWeight.Bold,
        textAlign =TextAlign.Center,
        modifier = modifier
    )
}