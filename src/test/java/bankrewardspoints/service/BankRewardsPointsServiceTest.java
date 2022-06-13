package bankrewardspoints.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.bank.bankrewardspoints.service.BankRewardsPointsService;

@SpringBootConfiguration
@SpringBootTest
public class BankRewardsPointsServiceTest {
	
	@Test
	void test_RewardsPoints() {
		
		BankRewardsPointsService  bankRewardsPointsService =new BankRewardsPointsService();
		int rewards=bankRewardsPointsService.calculateRewards(120);
        assertEquals(90, rewards);
        assertNotEquals(24, rewards);
	}

}
