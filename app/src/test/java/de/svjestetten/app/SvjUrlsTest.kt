package de.svjestetten.app

import de.svjestetten.app.util.SvjUrls
import org.junit.Assert.assertTrue
import org.junit.Test

class SvjUrlsTest {

    @Test
    fun newsUrl_startsWith_baseUrl() {
        assertTrue(SvjUrls.NEWS.startsWith("https://www.sv-jestetten.de"))
    }

    @Test
    fun teamsUrl_containsTeams() {
        assertTrue(SvjUrls.TEAMS.contains("mannschaften"))
    }

    @Test
    fun scheduleUrl_containsSpielplan() {
        assertTrue(SvjUrls.SCHEDULE.contains("spielplan"))
    }

    @Test
    fun allUrls_useHttps() {
        listOf(SvjUrls.NEWS, SvjUrls.TEAMS, SvjUrls.SCHEDULE, SvjUrls.CONTACT).forEach { url ->
            assertTrue("URL should use HTTPS: $url", url.startsWith("https://"))
        }
    }
}
