package fr.mickaelplichard.`project-portfolio`.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun testEndpoint(): String {
        return "Le backend fonctionne correctement avec Docker !"
    }
}