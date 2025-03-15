//Controller layer for testing 
// websocket connection

package com.websocket.geeksforgeeks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for handling web requests.
 */
@Controller
public class HomeController {

    /**
     * Handles GET requests to the "/" endpoint.
     *
     * @return View name for the client page.
     */
    @GetMapping("/")
    public String index() {
        return "cliente.html";
    }
}
