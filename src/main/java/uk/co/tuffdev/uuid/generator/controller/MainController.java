package uk.co.tuffdev.uuid.generator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MainController {

    @RequestMapping("/generate")
    public ResponseEntity<UUID> generateUUID() {
        System.out.println("Generating Random UUID");
        return ResponseEntity.ok(UUID.randomUUID());
    }

}
