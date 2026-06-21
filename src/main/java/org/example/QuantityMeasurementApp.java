package org.example;
import org.example.controller.QuantityMeasurementController;
import org.example.dto.QuantityDTO;
import org.example.repository.IQuantityMeasurementRepository;
import org.example.repository.QuantityMeasurementCacheRepository;
import org.example.service.IQuantityMeasurementService;
import org.example.service.QuantityMeasurementServiceImpl;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        // Factory + DI
        IQuantityMeasurementRepository repo =
                QuantityMeasurementCacheRepository.getInstance();

        IQuantityMeasurementService service =
                new QuantityMeasurementServiceImpl(repo);

        QuantityMeasurementController controller =
                new QuantityMeasurementController(service);

        // Example Usage
        controller.performComparison(
                new QuantityDTO(1, "FEET", "LENGTH"),
                new QuantityDTO(12, "INCHES", "LENGTH")
        );

        controller.performConversion(
                new QuantityDTO(100, "CELSIUS", "TEMPERATURE"),
                "FAHRENHEIT"
        );

        controller.performAddition(
                new QuantityDTO(1, "KILOGRAM", "WEIGHT"),
                new QuantityDTO(1000, "GRAM", "WEIGHT")
        );
    }
}