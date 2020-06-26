package com.Examen.SergioC.Service;

import com.Examen.SergioC.Model.AlphabetModel;

import java.util.List;

public interface AlphabetServiceInterface {
    public void saveData();
    public List<AlphabetModel> getAllLettersFirst();
    public List<AlphabetModel> getAllLettersSecond();
    public List<AlphabetModel> getAllLettersThree();
}
