package com.example.client.service;
import java.util.List;

import com.example.client.repository.SMPRepository;
import com.example.client.model.SMP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SMPService {
    @Autowired
	private SMPRepository repo;
	
	public List listAll() {
		return repo.findAll();
	}

	public SMP get(long smp_id) {
		return repo.findById(smp_id).get();
	}

	public void save(SMP smp) {
		repo.save(smp);
	}
}