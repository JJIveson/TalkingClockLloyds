package lcc.api;

import lcc.api.dto.HumanClock;
import lcc.helper.ClockHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

import static java.util.Objects.isNull;

@RestController
public class TalkingClockController {
    ClockHelper clockHelper = new ClockHelper();

    @GetMapping("/humanTime")
    public HumanClock HumanClock(@RequestParam(value = "time", required=false) LocalTime time) {
        if(isNull(time)) {
            time = LocalTime.now();
        }
        return new HumanClock(time, clockHelper.getHumanReadibleTime(time));
    }
}
