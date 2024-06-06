package com.evalueytor.empresa2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.evalueytor.empresa2.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long > {

}
