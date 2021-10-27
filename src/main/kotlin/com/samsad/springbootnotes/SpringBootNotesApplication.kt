package com.samsad.springbootnotes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootNotesApplication

fun main(args: Array<String>) {
	runApplication<SpringBootNotesApplication>(*args)
}
