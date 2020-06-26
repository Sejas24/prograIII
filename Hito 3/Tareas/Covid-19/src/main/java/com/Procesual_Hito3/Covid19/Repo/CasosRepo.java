package com.Procesual_Hito3.Covid19.Repo;

import com.Procesual_Hito3.Covid19.Model.CasosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasosRepo  extends JpaRepository<CasosModel, Integer> {

}