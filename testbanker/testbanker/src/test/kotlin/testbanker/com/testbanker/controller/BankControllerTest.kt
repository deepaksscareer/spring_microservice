package testbanker.com.testbanker.controller

import jdk.jfr.ContentType
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class BankControllerTest{

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `should return all banks`() {
        // given // when
        mockMvc.get("/api/banks")
            .andDo { print() }
            // then
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$[0].accountNumber"){value("A1")}
            }

    }

    @Test
    fun `get bank details for account `() {

        val accountNumber = "A1"

        // given //when
        mockMvc.get("/api/banks/$accountNumber")
            .andDo { print() }
            .andExpect {
                status { isOk() }
            }
    }
}