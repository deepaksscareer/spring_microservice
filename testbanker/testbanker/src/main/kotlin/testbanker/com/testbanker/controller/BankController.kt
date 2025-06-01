package testbanker.com.testbanker.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import testbanker.com.testbanker.model.Bank
import testbanker.com.testbanker.service.BankService

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {

    @GetMapping
    fun getBanks(): String = "Bank 1"// service.getBanks()
}