package ru.digital.league.x5.sign.bindings.edw.database.repository.rawentityclass;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.digital.league.x5.sign.bindings.edw.database.rawentities.RawEntities;

import java.util.List;

@Transactional(transactionManager = "transactionManager")
public interface RawEntityRepository extends JpaRepository<RawEntities, RawEntities.RawEntitiesId>  {
    List<RawEntities> findAll();
}
