package com.thinkenterprise.domain.route.resolver.subscription;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.domain.route.publisher.RouteUpdatePublisher;

import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * RootGrapQLSubscriptionResolver
 */
@Component
public class RootGrapQLSubscriptionResolver implements GraphQLSubscriptionResolver {

    @Autowired
    private RouteUpdatePublisher routeUpdatePublisher;

    // registerRouteCreated: Route
    public Publisher<Route> registerRouteCreated() {
        return routeUpdatePublisher.getPublisher();
    } 
}