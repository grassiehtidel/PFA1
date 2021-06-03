package com.example.Medicament;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Medicament.entites.Medicament;
import com.example.Medicament.repos.MedicamentRepository;



@SpringBootTest
class MedicamentApplicationTests {

	@Autowired
	private MedicamentRepository MedicamentRepository;
	
	@Test
	public void testCreateMedicament() {
		Medicament Med = new Medicament();
		MedicamentRepository.save(Med);
	}
	
	@Test
	public void testFindMedicament() {
		Medicament M = MedicamentRepository.findById(1L).get();
		System.out.println(M);
				
	}
	
	@Test
	public void testUpdateMedicament() {
		Medicament M =MedicamentRepository.findById(1L).get();
		
		MedicamentRepository.save(M);
		System.out.println(M);
		
	}
	
	@Test 
	public void testDeleteMedicament() {
		MedicamentRepository.deleteById(1L);
	}
	
	
}
