package com.Procesual_Hito3.Covid19.Services;

import com.Procesual_Hito3.Covid19.Model.CasosModel;

import java.util.List;

public interface VirusServiceInterfaz {
    public CasosModel save(CasosModel cModel);
    public CasosModel update(CasosModel cModel, Integer idcoronavirus);
    public Integer delete(Integer idcoronavirus);
    public List<CasosModel> getAllcasos();
    public CasosModel getcasosByIdcoronavirus(Integer idcoronavirus);
}