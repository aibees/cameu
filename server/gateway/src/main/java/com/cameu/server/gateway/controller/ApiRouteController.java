package com.cameu.server.gateway.controller;

import com.cameu.server.gateway.service.ApiRouteService;
import com.cameu.server.gateway.vo.ApiRouteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/route")
public class ApiRouteController {

    @Autowired
    private ApiRouteService apiRouteService;

    @GetMapping("/all")
    public String findApiRoutes() {
        return "all";
    }

    @PostMapping("/register")
    public String registerRoute(ApiRouteVo routeVo) {

        apiRouteService.updateApiRoute(routeVo);
        return null;
    }

    @GetMapping("/turnoff")
    public String turnOffRoute(@RequestParam String id) {
        apiRouteService.turnOffRoute(id);
        return null;
    }
}
