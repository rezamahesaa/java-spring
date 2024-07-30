package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Job;
import com.example.demo.service.JobService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private JobService jobService;

	@Test
	void post(){
		// ARRANGE
		Job job = new Job();
		job.setName("Talent Augmentation");
		job.setBasePay(6000000);

		// Job job1 = new Job(15, "Designer", 4000000);

		//ACT
		Boolean result = jobService.save(job);

		//ASSERT
		assertEquals(true, result);
	}

	@Test
	void delete(){
		Integer id = 8;
		Boolean result = jobService.delete(id);
		assertEquals(true, result);
	}

	// @Test
	// void contextLoads() {
	// }

}
