package com.sistemaifnmg.sistemaifnmg.Repository;

import com.sistemaifnmg.sistemaifnmg.Models.Contrato;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface ContratoRepository extends CrudRepository<Contrato, Long> {
    @Query("select c from Contrato c where c.objeto like %?1% ")
    List<Contrato> findByObjeto(String objeto);

    Optional<Contrato> findById(Long idcontrato);
    // Contrato findById(Long idcontrato);


    Contrato deleteById(long idcont);
}
