package testbanker.com.testbanker.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockBankDataSourceTest{

    val mockDataSource = MockBankDataSource()

    // Testing the test case as a POJO
    @Test
    fun `should return collection of bank`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `account number, trust and transactionFee should not be blank`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertThat(banks).allMatch{ it.accountNumber.isNotBlank()}
        assertThat(banks).anyMatch{ it.trust != 0.0}
        assertThat(banks).anyMatch{ it.transactionFee != 0}
    }
}