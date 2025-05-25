package pl.michal_cyran.tutor_website.sections.hero

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.tutor_website.core.ContactButton
import pl.michal_cyran.tutor_website.core.SubsectionHeading
import tutorwebsite.composeapp.generated.resources.Res
import tutorwebsite.composeapp.generated.resources._1

@OptIn(ExperimentalResourceApi::class)
@Composable
fun HeroSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(horizontal = 210.dp, vertical = 50.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.onBackground
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(26.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("Korepetycje z ")
                        withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                            append("matematyki")
                        }
                        append(" i ")
                        withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                            append("informatyki")
                        }
                        append(" dla uczniów szkół podstawowych i średnich.")
                    },
//                    text = "Korepetycje z matematyki na poziomie szkoły podstawowej i średniej",
                    style = MaterialTheme.typography.displayLarge
                )

                SubsectionHeading(
                    text = "Pomogę Ci zrozumieć matematykę i osiągnąć lepsze wyniki. Indywidualne podejście i skuteczne metody nauczania.",
//                    fontSize = SUBHEADLINE_SIZE,
//                    textAlign = TextAlign.Left,
//                    color = Color.Gray,
//                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(bottom = 24.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)
                ) {
                    ContactButton()

//                    OutlinedButton(
//                        onClick = { /* Handle click */ },
//                        shape = RectangleShape
//                    ) {
//                        Text("Dowiedz się więcej")
//                    }
                }
            }
            Image(
                painter = painterResource(Res.drawable._1),
                contentDescription = "Korepetytor matematyki",
                modifier = Modifier
                    .weight(1f)
                    .height(400.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
        }


    }
}