package com.example.Medicament.service;

import com.example.Medicament.entites.Medicament;



public interface MedicamentService {
	Medicament saveMedicament(Medicament M);
	Medicament updateMedicament(Medicament M);
	void deleteMedicament(Medicament M);
	void deleteMedicamentById(Long id);
	Medicament getMedicament(Long id);
	

}
