package org.ECommerece.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcommereceController {
   @GetMapping(value = "/hello")
    public String Hello() {
        return "Hello Yamini  !!";
    }
}
