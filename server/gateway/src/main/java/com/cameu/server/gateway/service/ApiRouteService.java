package com.cameu.server.gateway.service;

import com.cameu.server.gateway.vo.ApiRouteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.event.RefreshRoutesEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ApiRouteService {

    @Autowired
    GatewayRouteService routeService;

    public int updateApiRoute(ApiRouteVo vo) {
        // DB update

        // gateway refresh

        return 0;
    }
    public void turnOffRoute(String id) {
        // db useyn Y -> N

    }
}
