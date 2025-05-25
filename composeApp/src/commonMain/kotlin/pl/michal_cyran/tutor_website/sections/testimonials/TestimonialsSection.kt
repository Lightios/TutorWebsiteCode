package pl.michal_cyran.tutor_website.sections.testimonials

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.tutor_website.HEADLINE_SIZE
import pl.michal_cyran.tutor_website.SUBHEADLINE_SIZE
import tutorwebsite.composeapp.generated.resources.Res
import tutorwebsite.composeapp.generated.resources.star


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TestimonialsSection(
    modifier: Modifier = Modifier
) {
    val uriHandler = LocalUriHandler.current
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 120.dp, vertical = 64.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        Text(
            text = "Opinie uczniów",
            fontSize = HEADLINE_SIZE,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        
        Text(
            text = "Zobacz, co mówią o mnie moi uczniowie i ich rodzice.",
            fontSize = SUBHEADLINE_SIZE,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(60.dp)
        ) {
            TestimonialCard(
                text = "\"Michał bardzo fajnie prowadzi zajecia, zawsze odpisuje i widac ze zalezy mu na jego uczniach, polecam!!!\"",
                author = "Julka",
                description = ", uczennica 1 klasy liceum",
                modifier = Modifier.weight(1f)
            )
            
            TestimonialCard(
                text = "\"Idealne przygotowanie pod kątem matury! Świetna atmosfera, empatyczna osoba i duża wyrozumiałość dla ucznia.\"",
                author = "Aleksandra",
                description = ", maturzystka",
                modifier = Modifier.weight(1f)
            )
            
            TestimonialCard(
                text = "\"Polecam z całego serca. Bardzo zadowoleni z lekcji. Córka napisała egzamin 8 klasisty na 100%!\"",
                author = "Pavel",
                description = ", rodzic uczennicy 8 klasy",
                modifier = Modifier.weight(1f)
            )
        }

        Text(
            buildAnnotatedString {
                append("Wszystkie opinie są ")
                withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("autentyczne")
                }
                append(" i pochodzą z mojego profilu na stronie Superprof.pl.")
            },
        )
        OutlinedButton(
            onClick = {
                uriHandler.openUri("https://www.superprof.pl/absolwent-informatyki-uniwersytetu-jagiellonskiego-laureat-wielu-konkursow-matematycznych-informatycznych-nawet-ortograficznych.html")
            },
            shape = RectangleShape
        ) {
            Text(
                text = "Zobacz mój profil",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

