package ru.digital.league.x5.sign.bindings.edw.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.digital.league.x5.sign.bindings.edw.configuration.BindingsConfig;
import ru.digital.league.x5.sign.bindings.edw.database.rawentities.RawEntities;

@FeignClient(url = " ", name = "bindings", configuration = BindingsConfig.class)
public interface Bindings {
    @PostMapping(value = "/bind/chizhik", consumes = MediaType.APPLICATION_JSON_VALUE)
    void sendData(@RequestBody RawEntities rawEntitiesDtoString);
}

