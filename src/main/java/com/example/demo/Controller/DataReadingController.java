
package com.example.demo.Controller;

import com.example.demo.Class.DataReading;
import com.example.demo.repositries.DataReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://54.86.0.188")
@RequestMapping("/data-readings")
public class DataReadingController {
    private final DataReadingRepository dataReadingRepository;

    @Autowired
    public DataReadingController(DataReadingRepository dataReadingRepository) {
        this.dataReadingRepository = dataReadingRepository;
    }

    @PostMapping
    public ResponseEntity<String> addDataReading(@RequestBody DataReading dataReading) {
        if (dataReading.getHumidity() > 0.6 && dataReading.getTemperature() > 20) {
            dataReading.setSuitableForPlanting(true);
        } else {
            dataReading.setSuitableForPlanting(false);
        }

        dataReadingRepository.save(dataReading);

        return ResponseEntity.ok("Datos recibidos correctamente");
    }

    @GetMapping
    public ResponseEntity<List<DataReading>> getAllDataReadings() {
        List<DataReading> dataReadings = dataReadingRepository.findAll();
        return ResponseEntity.ok(dataReadings);
    }
}
