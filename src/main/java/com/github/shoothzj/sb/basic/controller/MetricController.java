package com.github.shoothzj.sb.basic.controller;

import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hezhangjian
 */
@Slf4j
@RestController
public class MetricController {

    @Autowired
    private MeterRegistry meterRegistry;

    @RequestMapping(method = RequestMethod.GET, path = "/metric")
    public void meter() {
        Map<String, String> map = new HashMap<>();
        meterRegistry.forEachMeter(meter -> {
            Meter.Id id = meter.getId();
            meter.measure().forEach(measurement -> {
                String key = id.getName() + measurement.getStatistic().getTagValueRepresentation();
                map.put(key, String.valueOf(measurement.getValue()));
            });
        });
    }

}
