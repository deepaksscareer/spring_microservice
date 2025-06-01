package testbanker.com.testbanker.datasource.mock

import org.springframework.stereotype.Repository
import testbanker.com.testbanker.datasource.BankDataSource
import testbanker.com.testbanker.model.Bank
@Repository
class MockBankDataSource: BankDataSource {

    val listBank = listOf(
        Bank(accountNumber = "A1", transactionFee = 0, trust = 1.0),
        Bank(accountNumber = "A2", transactionFee = 0, trust = 1.0),
        Bank(accountNumber = "A3", transactionFee = 1, trust = 1.0)
    )
    override fun retrieveBanks(): Collection<Bank> {
        return listBank
    }
}