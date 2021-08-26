package com.sistemaifnmg.sistemaifnmg.Repository;

import com.sistemaifnmg.sistemaifnmg.Models.Contrato;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ContratoRepository extends CrudRepository<Contrato, String> {
    @Query("select c from Contrato c where c.objeto like %?1% ")
    List<Contrato> findByObjeto(String objeto);

}
