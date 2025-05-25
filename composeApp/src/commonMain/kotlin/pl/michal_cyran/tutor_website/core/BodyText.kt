package pl.michal_cyran.tutor_website.core

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString

@Composable
fun BodyText(
    text: String,
    modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier,
) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyLarge.copy(
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.9f)
        ),
        modifier = modifier
    )
}

@Composable
fun BodyText(
    text: AnnotatedString,
    modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier,
) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyLarge.copy(
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.95f)
        ),
        modifier = modifier
    )
}