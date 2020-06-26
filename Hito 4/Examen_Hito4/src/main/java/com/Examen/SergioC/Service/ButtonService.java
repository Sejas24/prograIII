package com.Examen.SergioC.Service;

import com.Examen.SergioC.Model.ButtonModel;
import com.Examen.SergioC.Repository.ButtonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ButtonService implements ButtonServiceInterface{
    @Autowired
    private ButtonServiceInterface buttonServiceInterface;

    @Override
    public void saveData() {
        if (ButtonRepository.count() == 0) {

            buttonServiceInterface.saveData(new ButtonModel("MONDAY", "SEGUNDA-FEIRA","LUNES");
            buttonServiceInterface.saveData(new ButtonModel("TUESDAY","TERCA-FEIRA" ,"MARTES"));
            buttonServiceInterface.saveData(new ButtonModel("WEDNESDAY","QUARTA-FEIRA","MIERCOLES"));
            buttonServiceInterface.saveData(new ButtonModel("THURSDAY","QUINTA-FEIRA","JUEVES"));
            buttonServiceInterface.saveData(new ButtonModel("FRIDAY","SEXTA-FEIRA","VIERNES"));
            buttonServiceInterface.saveData(new ButtonModel("SATURDAY","SABADO","SABADO"));
            buttonServiceInterface.saveData(new ButtonModel("SUNDAY","DOMINGO","DOMINGO"));
        }
    }

    @Override
    public String traducir(String t, String l) {
        ButtonModel dictionaryModel = ButtonRepository.getWordTranslate(t);
        String ingles = dictionaryModel.getEnglish();
        String ln_i = "INGLES";
        String word = dictionaryModel.getWord();
        String ln_w = "ESPAÑOL";
        String portugues = dictionaryModel.getPortugues();
        String ln_p = "PORTUGUES";
        String traduccion = "";
        if(l.equals(ln_i)){
            traduccion = ingles;
        }
        if(l.equals(ln_w)){
            traduccion = word;
        }
        if(l.equals(ln_p)){
            traduccion = portugues;
        }
        return traduccion;
    }
}
