package ru.digital.league.x5.sign.bindings.edw.database.repository.entityclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.digital.league.x5.sign.bindings.edw.database.entity.EntitiesClass;
import ru.digital.league.x5.sign.bindings.edw.database.rawentities.RawEntities;

import java.util.List;

@Transactional(transactionManager = "transactionManager")
public interface EntityRepository extends JpaRepository<EntitiesClass, RawEntities.RawEntitiesId> {
    List<EntitiesClass> findAll();

}
