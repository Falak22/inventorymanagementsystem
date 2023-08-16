package com.crimsonlogic.inventorymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Integer> {

	Admin viewAdminById(int adminId);

}
