package pl.michal_cyran.tutor_website.animation

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun AnimationExample(
    lines: List<Pair<Offset, Offset>>
) {
    val animProgress = remember { Animatable(0f) }

    LaunchedEffect(lines) {
        while (true) {
            animProgress.snapTo(0f)
            animProgress.animateTo(
                targetValue = lines.size.toFloat(),
                animationSpec = tween(durationMillis = 1000 * lines.size)
            )
            delay(500) // Optional pause before repeating
        }
    }

    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        val currentLine = animProgress.value
        for (i in 0 until currentLine.toInt()) {
            val (start, end) = lines[i]
            drawLine(
                color = Color.Blue,
                start = start,
                end = end,
                strokeWidth = 4f
            )
        }
        // Optionally animate the last line being drawn
        val partial = currentLine - currentLine.toInt()
        if (currentLine.toInt() < lines.size && partial > 0f) {
            val (start, end) = lines[currentLine.toInt()]
            val animatedEnd = Offset(
                start.x + (end.x - start.x) * partial,
                start.y + (end.y - start.y) * partial
            )
            drawLine(
                color = Color.Blue,
                start = start,
                end = animatedEnd,
                strokeWidth = 4f
            )
        }
    }
}