package com.Examen.ExamenHito3.Services;

import com.Examen.ExamenHito3.Model.CasosModel;

import java.util.List;

public interface VirusServiceInterfaz {
    public CasosModel save(CasosModel cModel);
    public CasosModel update(CasosModel cModel, Integer idcoronavirus);
    public Integer delete(Integer idcoronavirus);
    public List<CasosModel> getAllcasos();
    public CasosModel getcasosByIdcoronavirus(Integer idcoronavirus);
}