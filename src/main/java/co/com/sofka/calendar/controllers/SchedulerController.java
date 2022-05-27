package co.com.sofka.calendar.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.sofka.calendar.model.ProgramDate;
import co.com.sofka.calendar.services.SchedulerService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class SchedulerController {

    @Autowired SchedulerService schedulerService;

    @GetMapping("/calendar")
    public Flux<ProgramDate> generateCalendar() {
        String programId = "xxxx";
        LocalDate startDate = LocalDate.of(2022, 1, 2);
        return schedulerService.generateCalendar(programId, startDate);
    }

}
