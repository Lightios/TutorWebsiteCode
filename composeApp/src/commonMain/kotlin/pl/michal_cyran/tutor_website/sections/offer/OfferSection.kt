package pl.michal_cyran.tutor_website.sections.offer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.tutor_website.HEADLINE_SIZE
import pl.michal_cyran.tutor_website.SUBHEADLINE_SIZE
import pl.michal_cyran.tutor_website.sections.lessons.OfferCard
import pl.michal_cyran.tutor_website.sections.lessons.PropertyCard
import tutorwebsite.composeapp.generated.resources.Res
import tutorwebsite.composeapp.generated.resources.assignment
import tutorwebsite.composeapp.generated.resources.backpack
import tutorwebsite.composeapp.generated.resources.calculate
import tutorwebsite.composeapp.generated.resources.desktop
import tutorwebsite.composeapp.generated.resources.extension
import tutorwebsite.composeapp.generated.resources.keyboard
import tutorwebsite.composeapp.generated.resources.memory
import tutorwebsite.composeapp.generated.resources.schedule
import tutorwebsite.composeapp.generated.resources.school

@Composable
fun OfferSection(
    modifier: Modifier = Modifier
)  {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(horizontal = 100.dp, vertical = 64.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Moja oferta",
            fontSize = HEADLINE_SIZE,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        
        Text(
            text = "Oferuję korepetycje dostosowane do Twoich potrzeb i poziomu zaawansowania.",
            fontSize = SUBHEADLINE_SIZE,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                OfferHeading(
                    title = "Matematyka",
                    painter = painterResource(Res.drawable.calculate),
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                OfferCard(
                    painter = painterResource(Res.drawable.backpack),
                    title = "Szkoła podstawowa",
                    description = "Pomoc w zrozumieniu podstawowych pojęć matematycznych i przygotowanie do egzaminu ósmoklasisty.",
                )

                OfferCard(
                    painter = painterResource(Res.drawable.school),
                    title = "Szkoła średnia - poziom podstawowy",
                    description = "Wsparcie w bieżących lekcjach i przygotowanie do matury na poziomie podstawowym.",
                )

                OfferCard(
                    painter = painterResource(Res.drawable.extension),
                    title = "Szkoła średnia - poziom rozszerzony",
                    description = "Zaawansowane zagadnienia matematyczne i przygotowanie do matury rozszerzonej.",
                )

            }

            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                OfferHeading(
                    title = "Informatyka",
                    painter = painterResource(Res.drawable.desktop),
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                OfferCard(
                    painter = painterResource(Res.drawable.memory),
                    title = "Szkoła podstawowa",
                    description = "Informatyka w szkole podstawowej - nauka i pomoc w bieżących lekcjach, w szczególności Scratch.",
                )

                OfferCard(
                    painter = painterResource(Res.drawable.keyboard),
                    title = "Szkoła średnia",
                    description = "Pomoc w bieżących lekcjach z informatyki ogólnej i zajęć na kierunkach technik informatyk i technik programista.",
                )

                OfferCard(
                    painter = painterResource(Res.drawable.assignment),
                    title = "Egzamin zawodowy",
                    description = "Pomoc w przygotowaniu do egzaminu z poziomu kwalifikacji E.13 i E.14 / EE.08 i EE.09 / INF.03 i INF.04.",
                )
            }
        }
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Text(
            text = "Cennik",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp),
            color = MaterialTheme.colorScheme.primary,
        )
        
        Row(
            modifier = Modifier.fillMaxWidth(0.8f),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            PriceCard(duration = "30 minut", price = "35 zł")
            PriceCard(duration = "60 minut", price = "70 zł")
            PriceCard(duration = "90 minut", price = "105 zł")
            PriceCard(duration = "120 minut", price = "140 zł")
        }

        Spacer(modifier = Modifier.height(24.dp))

    }
}


