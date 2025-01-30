package fr.mickaelplichard.project_portfolio.controller

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestControllerTest {

    private val restTemplate = TestRestTemplate()

    @Test
    fun `test GET test endpoint`() {
        val response = restTemplate.getForEntity("/test", String::class.java)
        assertEquals(HttpStatus.OK, response.statusCode)
        assertEquals("Le backend fonctionne correctement avec Docker !", response.body)
    }
}