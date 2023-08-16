package com.crimsonlogic.inventorymanagementsystem.service;

import java.util.List;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.exception.AdminNotFoundException;

public interface IAdminService {

	public List<Admin> viewAllAdmin();
	public Admin viewAdminById(int adminId) throws AdminNotFoundException;
	public Admin insertAdmin(Admin admin);
}
