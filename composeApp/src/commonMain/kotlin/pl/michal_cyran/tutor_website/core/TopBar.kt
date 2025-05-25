package pl.michal_cyran.tutor_website.core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import tutorwebsite.composeapp.generated.resources.Res
import tutorwebsite.composeapp.generated.resources.dark_mode
import tutorwebsite.composeapp.generated.resources.light_mode

@Composable
fun TopBar(
    darkTheme: Boolean,
    onToggleTheme: () -> Unit,
    listState: LazyListState,
) {

    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 120.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,

    ) {

        IconButton(
            onClick = onToggleTheme
        ) {
            Icon(
                painter = if (darkTheme) painterResource(Res.drawable.light_mode) else painterResource(
                    Res.drawable.dark_mode),
                contentDescription = "Menu"
            )
        }

        Text(
            text = "Michał Cyran",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
        )

        Spacer(
            modifier = Modifier.weight(1f)
        )

        SectionButton(0, "Strona główna", listState)
        SectionButton(1, "O mnie", listState)
        SectionButton(2, "Oferta", listState)
        SectionButton(3, "O zajęciach", listState)
        SectionButton(4, "Opinie", listState)
        SectionButton(5, "Kontakt", listState)
    }
}