package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.reset;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Placement;
import com.example.demo.service.PlacementService;

@SpringBootTest
public class TestPlacement {
    @Autowired
    private PlacementService placementService;

    @Test
	void post(){
		// ARRANGE
		// Placement job = new Placement();
		// job.setName("Talent Augmentation");
		// job.setBasePay(6000000);

		Placement placement = new Placement(null, "PT. K");

		//ACT
		Boolean result = placementService.save(placement);

		//ASSERT
		assertEquals(true, result);
	}

	@Test
	void delete(){
		Integer id = 6;
		Boolean result = placementService.delete(id);
		assertEquals(true, result);
	}

	@Test
	void get(){
		List<Placement> list = placementService.get();
		for (Placement placement : list) {
			System.out.println("ID: " + placement.getId() + "\tCompany Name: " + placement.getName());
		}
	}

	// @Test
	// void get(){
	// 	Integer inputId = 4;
	// 	Placement placement = placementService.get(inputId);
	// 	assertEquals("No Placement", placement.getName());
	// }
}
