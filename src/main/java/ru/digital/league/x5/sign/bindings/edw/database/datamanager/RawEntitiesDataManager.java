package ru.digital.league.x5.sign.bindings.edw.database.datamanager;

import org.springframework.stereotype.Component;
import ru.digital.league.x5.sign.bindings.edw.database.rawentities.RawEntities;
import ru.digital.league.x5.sign.bindings.edw.database.repository.rawentityclass.RawEntityRepository;

import java.util.List;

@Component
public class RawEntitiesDataManager {
    private final RawEntityRepository rawEntityRepository;

    public RawEntitiesDataManager(RawEntityRepository rawEntityRepository) {
        this.rawEntityRepository = rawEntityRepository;
    }
    public List<RawEntities> getAllRawEntities() {
        return rawEntityRepository.findAll();
    }
}
