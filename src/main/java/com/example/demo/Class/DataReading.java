package com.example.demo.Class;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@CrossOrigin(origins = "http://localhost:5173")
@Table(name = "data_readings")
public class DataReading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "humidity")
    private float humidity;

    @Column(name = "temperature")
    private float temperature;

    @Column(name = "day_night")
    private String dayNight;

    @Column(name = "location")
    private String location;

    @Column(name = "suitable_for_planting")
    private boolean suitableForPlanting;

    public DataReading() {

        this.id = 0L;
        this.humidity = 0.0f;
        this.temperature = 0.0f;
        this.dayNight = "";
        this.location = "";
        this.suitableForPlanting = false;
    }

    public DataReading(Long id, float humidity, float temperature, String dayNight, String location, boolean suitableForPlanting) {
        this.id = id;
        this.humidity = humidity;
        this.temperature = temperature;
        this.dayNight = dayNight;
        this.location = location;
        this.suitableForPlanting = suitableForPlanting;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getDayNight() {
        return dayNight;
    }

    public void setDayNight(String dayNight) {
        this.dayNight = dayNight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isSuitableForPlanting() {
        return suitableForPlanting;
    }

    public void setSuitableForPlanting(boolean suitableForPlanting) {
        this.suitableForPlanting = suitableForPlanting;
    }
}
