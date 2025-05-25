package pl.michal_cyran.tutor_website.sections.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.tutor_website.HEADLINE_SIZE
import pl.michal_cyran.tutor_website.SUBHEADLINE_SIZE
import tutorwebsite.composeapp.generated.resources.Res
import tutorwebsite.composeapp.generated.resources.android
import tutorwebsite.composeapp.generated.resources.book
import tutorwebsite.composeapp.generated.resources.draw
import tutorwebsite.composeapp.generated.resources.event_busy
import tutorwebsite.composeapp.generated.resources.fitness_center
import tutorwebsite.composeapp.generated.resources.forum
import tutorwebsite.composeapp.generated.resources.notifications
import tutorwebsite.composeapp.generated.resources.person
import tutorwebsite.composeapp.generated.resources.pin_drop
import tutorwebsite.composeapp.generated.resources.schedule
import tutorwebsite.composeapp.generated.resources.school

@Composable
fun LessonsSection(
    modifier: Modifier = Modifier
)  {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(horizontal = 120.dp, vertical = 64.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "O zajęciach",
            fontSize = HEADLINE_SIZE,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                PropertyCard(
                    painter = painterResource(Res.drawable.pin_drop),
                    title = "Online lub stacjonarnie",
                    description = "Zajęcia prowadzę online lub stacjonarnie w Krakowie - na terenie Ruczaju i Pychowic.",
                )
                PropertyCard(
                    painter = painterResource(Res.drawable.book),
                    title = "Materiały",
                    description = "Na moim serwerze dostępne są materiały w postaci plików PDF, dzięki którym możesz nauczyć się teorii i przykładowych zadań z danych tematów.",
                )
                PropertyCard(
                    painter = painterResource(Res.drawable.event_busy),
                    title = "Odwoływanie lekcji",
                    description = "Jeśli dasz mi znać dzień wcześniej, że nie dasz rady pojawić się na lekcji, nie będzie żadnego problemu. W nagłych przypadkach (np. choroba) możesz odwołać lekcję nawet kilka godzin wcześniej.",
                )
                PropertyCard(
                    painter = painterResource(Res.drawable.notifications),
                    title = "Przypomnienia o lekcjach",
                    description = "Napisałem skrypt, który codziennie wieczorem przypomina o zajęciach zaplanowanych na następny dzień. Dzięki temu nie zapomnisz o lekcji, a jeśli okaże się wówczas, że musisz ją odwołać, nie będzie problemu.",
                )
                PropertyCard(
                    painter = painterResource(Res.drawable.android),
                    title = "Aplikacja do nauki matematyki",
                    description = "Jestem autorem aplikacji mobilnej do nauki matematyki. Jest jeszcze we wczesnej fazie rozwoju, Twój feedback może mieć realny wpływ na jej rozwój.",
                )
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                PropertyCard(
                    painter = painterResource(Res.drawable.schedule),
                    title = "Elastyczny grafik",
                    description = "Mój grafik jest dostępny dla wszystkich na Discordzie i aktualizowany cały czas. Możesz więc umawiać się na zajęcia w dogodnych dla Ciebie terminach.",
                )
                PropertyCard(
                    painter = painterResource(Res.drawable.person),
                    title = "Indywidualne podejście",
                    description = "Każde zajęcia są dostosowane do Twoich potrzeb i poziomu zaawansowania.",
                )
                PropertyCard(
                    painter = painterResource(Res.drawable.forum),
                    title = "Kontakt poza zajęciami",
                    description = "Jeśli przygotowując się do spawdzianu lub matury, będziesz mieć pilne pytanie odnośnie danego zadania, możesz zapytać mnie o to na Discordzie. Postaram się odpowiedzieć jak najszybciej.",
                )
                PropertyCard(
                    painter = painterResource(Res.drawable.fitness_center),
                    title = "Zadania do rozwiązywania",
                    description = "Jeśli będziesz tego potrzebować, mogę po zajęciach wysłać Ci zadania/próbny test do samodzielnego rozwiązania. Po ich rozwiązaniu możesz je wysłać do mnie, a ja je sprawdzę.",
                )
                PropertyCard(
                    painter = painterResource(Res.drawable.draw),
                    title = "Dodatkowe materiały",
                    description = "Jeśli będziesz potrzebować dodatkowych materiałów do nauki, mogę je dla Ciebie przygotować. Wystarczy, że powiesz mi, czego potrzebujesz.",
                )
            }
        }

    }
}

