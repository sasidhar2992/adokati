package com.econnect.eConnectSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.econnect.eConnectSystem.model.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer>{

}
