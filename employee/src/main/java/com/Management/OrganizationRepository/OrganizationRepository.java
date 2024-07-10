package com.Management.OrganizationRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Management.OrganizationEntity.OrganizationEntity;

public interface OrganizationRepository extends JpaRepository<OrganizationEntity, Integer>{

}
