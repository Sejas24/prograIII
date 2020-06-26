package com.Examen.SergioC.Repository;

import com.Examen.SergioC.Model.ButtonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ButtonRepository  extends JpaRepository {
    @Query(value = "SELECT * FROM dictionary WHERE word = :wordSelected", nativeQuery = true)
    public ButtonModel getWordTranslate(@Param("wordSelected") String wordSelected);
}
