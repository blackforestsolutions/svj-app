package de.svjestetten.app.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.svjestetten.app.util.SvjUrls

@Composable
fun ScheduleScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        SvjWebView(url = SvjUrls.SCHEDULE)
    }
}
