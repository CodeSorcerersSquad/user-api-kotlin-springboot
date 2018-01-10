package com.kotlin.springboot.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class UserController {

    val counter = AtomicLong()

    @GetMapping("/users")
    fun getUsers() =
            listOf(User(counter.incrementAndGet(), "Rafael Manzoni"))

}
