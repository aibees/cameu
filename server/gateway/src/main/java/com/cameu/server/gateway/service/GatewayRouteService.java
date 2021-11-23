package com.cameu.server.gateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.event.RefreshRoutesEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class GatewayRouteService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

//    private void refreshGateway() {
//        applicationEventPublisher.publishEvent(new RefreshRoutesEvent(this));
//    }

}
