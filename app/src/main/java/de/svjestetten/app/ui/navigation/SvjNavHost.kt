package de.svjestetten.app.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import de.svjestetten.app.ui.screens.ContactScreen
import de.svjestetten.app.ui.screens.NewsScreen
import de.svjestetten.app.ui.screens.ScheduleScreen
import de.svjestetten.app.ui.screens.TeamsScreen

@Composable
fun SvjNavHost() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Scaffold(
        bottomBar = {
            NavigationBar {
                bottomNavItems.forEach { screen ->
                    NavigationBarItem(
                        icon = {
                            Icon(
                                imageVector = screen.icon,
                                contentDescription = stringResource(screen.labelRes)
                            )
                        },
                        label = { Text(stringResource(screen.labelRes)) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        onClick = {
                            navController.navigate(screen.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.News.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.News.route) { NewsScreen() }
            composable(Screen.Teams.route) { TeamsScreen() }
            composable(Screen.Schedule.route) { ScheduleScreen() }
            composable(Screen.Contact.route) { ContactScreen() }
        }
    }
}
