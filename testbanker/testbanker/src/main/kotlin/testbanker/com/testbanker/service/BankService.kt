package testbanker.com.testbanker.service

import org.springframework.stereotype.Service
import testbanker.com.testbanker.datasource.BankDataSource
import testbanker.com.testbanker.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }
}