package pl.michal_cyran.tutor_website.core

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun SectionButton(
    index: Int,
    text: String,
    listState: LazyListState,
) {
    val coroutineScope = rememberCoroutineScope()

    TextButton(
        onClick = {
            coroutineScope.launch {
                listState.animateScrollToItem(index)
            }
        },
        modifier = Modifier.padding(start = 8.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}