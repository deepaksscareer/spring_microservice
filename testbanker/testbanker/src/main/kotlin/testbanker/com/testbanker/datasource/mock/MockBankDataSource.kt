package testbanker.com.testbanker.datasource.mock

import org.springframework.stereotype.Repository
import testbanker.com.testbanker.datasource.BankDataSource
import testbanker.com.testbanker.model.Bank
@Repository
class MockBankDataSource: BankDataSource {
    override fun getBanks(): Collection<Bank> {
        TODO("Not yet implemented")
    }
}