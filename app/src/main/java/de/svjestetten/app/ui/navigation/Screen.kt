package de.svjestetten.app.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.ContactMail
import androidx.compose.material.icons.filled.Groups
import androidx.compose.ui.graphics.vector.ImageVector
import de.svjestetten.app.R

sealed class Screen(
    val route: String,
    @StringRes val labelRes: Int,
    val icon: ImageVector
) {
    data object News : Screen(
        route = "news",
        labelRes = R.string.nav_news,
        icon = Icons.Filled.Article
    )
    data object Teams : Screen(
        route = "teams",
        labelRes = R.string.nav_teams,
        icon = Icons.Filled.Groups
    )
    data object Schedule : Screen(
        route = "schedule",
        labelRes = R.string.nav_schedule,
        icon = Icons.Filled.CalendarMonth
    )
    data object Contact : Screen(
        route = "contact",
        labelRes = R.string.nav_contact,
        icon = Icons.Filled.ContactMail
    )
}

val bottomNavItems = listOf(
    Screen.News,
    Screen.Teams,
    Screen.Schedule,
    Screen.Contact
)
