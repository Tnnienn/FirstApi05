package co.develhope.firstapi.controller;

import co.develhope.firstapi.entities.CarDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cars")
public class CarController {

    @GetMapping
    public CarDTO getCar() {
        return new CarDTO();
    }

    @PostMapping
    //@ResponseStatus(code = HttpStatus.CREATED, reason = "CREATED")
    public HttpStatus postCar(@Valid @RequestBody CarDTO car) {
        System.out.println(car);
        return HttpStatus.CREATED;
    }
}
