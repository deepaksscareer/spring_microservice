package testbanker.com.testbanker.datasource

import testbanker.com.testbanker.model.Bank

interface BankDataSource {
    fun getBanks(): Collection<Bank>
}