package com.crimsonlogic.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.exception.AdminNotFoundException;
import com.crimsonlogic.inventorymanagementsystem.service.IAdminService;

@RestController
@RequestMapping
public class AdminController {

	@Autowired
	private IAdminService adServ;
	
	@GetMapping("viewalladmin")
	public List<Admin> viewAllAdmin(){
		return adServ.viewAllAdmin();		
	}
	
	
	@PostMapping("/insertadmin")
	public Admin insertAdmin(@RequestBody Admin admin) {
		return adServ.insertAdmin(admin);
	}
	
	
	@GetMapping("/viewadminid/{adid}")
	public Admin viewAdminById(@PathVariable("adid")int adminId) throws AdminNotFoundException {
		return adServ.viewAdminById(adminId);
	}
}
