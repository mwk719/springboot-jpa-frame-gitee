package com.jdy.data.role.decker;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jdy.data.role.dto.SysUserRole;
import com.jdy.data.role.repository.SysUserRoleRepository;

@Repository
public class SysUserRoleDecker {

	@Autowired
	SysUserRoleRepository sysUserRoleRepository;

	public SysUserRole findByAdminId(Integer adminId) {
		Optional<SysUserRole> r = sysUserRoleRepository.findById(adminId);
		return r.isPresent() ? r.get() : null;

	}

}
