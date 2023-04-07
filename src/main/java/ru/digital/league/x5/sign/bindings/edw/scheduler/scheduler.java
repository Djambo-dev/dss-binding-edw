package ru.digital.league.x5.sign.bindings.edw.scheduler;

import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.digital.league.x5.sign.bindings.edw.processor.RawEntitiesUploadProcessor;
import ru.digital.league.x5.sign.bindings.edw.utils.Mapper;

import static java.lang.System.currentTimeMillis;

@Log4j2
@Value
@Component
public class scheduler {

    RawEntitiesUploadProcessor rawEntitiesUploadProcessor;
    @Scheduled(initialDelay = 60000, fixedDelay = 10000)
    public void schedule() {
        //log.debug("Started system metric processor scheduler");
        rawEntitiesUploadProcessor.process();
    }
}
