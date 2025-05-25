package pl.michal_cyran.tutor_website.core

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun SubsectionHeading(
    text: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyLarge.copy(
            fontSize = 20.sp,
            lineHeight = 30.sp,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f) // Similar to gray-600/400
        ),
        modifier = modifier
    )
}