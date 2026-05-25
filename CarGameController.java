Java
package com.cargame;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarGameController {

    @GetMapping("/score")
    public String gameStatus() {
        return "🚗 Car Game Running Successfully via DevOps Pipeline!";
    }
}
