package ru.digital.league.x5.sign.bindings.edw.processor;


import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.digital.league.x5.sign.bindings.edw.client.Bindings;
import ru.digital.league.x5.sign.bindings.edw.database.rawentities.RawEntities;
import ru.digital.league.x5.sign.bindings.edw.database.repository.rawentityclass.RawEntityRepository;
import ru.digital.league.x5.sign.bindings.edw.dto.RawEntityDto;
import ru.digital.league.x5.sign.bindings.edw.utils.Mapper;

import java.util.List;
@Slf4j
@lombok.Value
@RequiredArgsConstructor
@Component
public class RawEntitiesUploadProcessor {
    RawEntityRepository rawEntityRepository;
    Bindings bindings;
    Gson gson = new Gson();
    public void process(){
        List<RawEntities> rawEntities = rawEntityRepository.findAll();

        for (RawEntities rawEntity : rawEntities) {
            bindings.sendData(gson.toJson(Mapper.convertEntityToDto(rawEntity)));
        }

    }



}
