package pl.michal_cyran.tutor_website.previews

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import pl.michal_cyran.tutor_website.sections.about.AboutSection
import androidx.compose.desktop.ui.tooling.preview.Preview


@Preview
@Composable
fun AboutSectionPreview() {
    MaterialTheme {
        AboutSection()
    }
}