package testbanker.com.testbanker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestbankerApplication

fun main(args: Array<String>) {
	runApplication<TestbankerApplication>(*args)
}
