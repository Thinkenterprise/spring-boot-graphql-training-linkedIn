package com.thinkenterprise.domain.route.resolver.subscription;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.domain.route.publisher.RouteCreatedPublisher;

import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * GraphQL Spring Boot Samples Design and Development by Michael Schäfer
 * Copyright (c) 2019 All Rights Reserved.
 * 
 * @author Michael Schäfer
 */

@Component
public class RootSubscriptionResolver implements GraphQLSubscriptionResolver {

        RouteCreatedPublisher routeCreatedPublisher;

        @Autowired
        public RootSubscriptionResolver(RouteCreatedPublisher routeCreatedPublisher) {
                this.routeCreatedPublisher=routeCreatedPublisher;
        }

        public Publisher<Route> registerRouteCreated() {
                return routeCreatedPublisher.getPublisher();
        }

}