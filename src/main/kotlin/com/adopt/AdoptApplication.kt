package com.adopt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AdoptApplication

fun main(args: Array<String>) {
	runApplication<AdoptApplication>(*args)
}
