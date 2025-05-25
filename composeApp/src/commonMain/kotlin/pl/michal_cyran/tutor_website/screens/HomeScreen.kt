package pl.michal_cyran.tutor_website.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.tutor_website.sections.about.AboutSection
import pl.michal_cyran.tutor_website.sections.contact.ContactSection
import pl.michal_cyran.tutor_website.sections.hero.HeroSection
import pl.michal_cyran.tutor_website.sections.lessons.LessonsSection
import pl.michal_cyran.tutor_website.components.NavigationDrawer
import pl.michal_cyran.tutor_website.core.TopBar
import pl.michal_cyran.tutor_website.sections.testimonials.TestimonialsSection
import pl.michal_cyran.tutor_website.sections.offer.OfferSection
import tutorwebsite.composeapp.generated.resources.Res


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    darkTheme: Boolean,
    onToggleTheme: () -> Unit,
) {
    val listState = rememberLazyListState()
    var showMenu by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceDim,
                ),
                title = {
                    TopBar(
                        darkTheme = darkTheme,
                        listState = listState,
                        onToggleTheme = onToggleTheme
                    )
                },
                navigationIcon = {
                }
            )
        },
        content = { padding ->
            Box(
                modifier = Modifier.padding(padding)
            ) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    state = listState,
                ) {
                    item(0) {
                        HeroSection()
                    }
                    item(1) {
                        AboutSection()
                    }
                    item(2) {
                        OfferSection()
                    }
                    item(3) {
                        LessonsSection()
                    }
                    item(4) {
                        TestimonialsSection()
                    }
                    item(5) {
                        ContactSection()

                    }
//                    GallerySection()

                }

                if (showMenu) {
                    NavigationDrawer(
                        onDismiss = { showMenu = false },
                        onNavigate = { section ->
                            // Handle navigation to section
                            showMenu = false
                        }
                    )
                }
            }
        }
    )
}
