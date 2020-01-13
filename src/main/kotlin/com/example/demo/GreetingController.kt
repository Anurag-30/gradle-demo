package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import reactor.core.publisher.Mono
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.toMono


@RestController
@RequestMapping("/greet")
class GreetingController {

    @GetMapping("/")
    private fun greet(): Mono<String> {
        return "Hello".toMono()
    }

    @GetMapping("/{name}")
    private fun greetWithName(@PathVariable name: String): Mono<String> {
        return "Hello $name".toMono()
    }
}
