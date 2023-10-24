package com.company.hrworker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EntityScan("com.company.hrworker.entities")
class HrWorkerApplicationTests {

	@Test
	void contextLoads() {
	}

}
