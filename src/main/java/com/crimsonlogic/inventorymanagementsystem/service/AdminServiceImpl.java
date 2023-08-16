package com.crimsonlogic.inventorymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.exception.AdminNotFoundException;
import com.crimsonlogic.inventorymanagementsystem.repository.IAdminRepository;

@Service
public class AdminServiceImpl implements IAdminService{
	
	@Autowired
	private IAdminRepository adRepo;

	@Override
	public List<Admin> viewAllAdmin() {
		return adRepo.findAll();
	}

	@Override
	public Admin viewAdminById(int adminId) throws AdminNotFoundException {
		return adRepo.viewAdminById(adminId);
	}

	@Override
	public Admin insertAdmin(Admin admin) {
		return adRepo.save(admin);
	}

}
