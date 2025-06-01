package testbanker.com.testbanker.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import testbanker.com.testbanker.datasource.BankDataSource
import testbanker.com.testbanker.datasource.mock.MockBankDataSource

internal class BankServiceTest {
    // Checks the service calls the data source correctly

    private val bankDataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(bankDataSource)

    @Test
    fun `should call the banks`() {

        // Given
        // If we give the relaxed astrue, then the mockito will return some default values!!

        // When
        val bankList = bankService.getBanks()

        // Then
        verify(exactly = 1) { bankDataSource.retrieveBanks() }

    }
}