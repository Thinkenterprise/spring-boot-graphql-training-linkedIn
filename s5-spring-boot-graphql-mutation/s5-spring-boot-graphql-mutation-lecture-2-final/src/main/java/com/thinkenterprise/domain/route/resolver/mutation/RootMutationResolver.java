package com.thinkenterprise.domain.route.resolver.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.domain.route.RouteRepository;

/**  
* GraphQL Spring Boot Samples 
* Design and Development by Michael Schäfer 
* Copyright (c) 2019 
* All Rights Reserved.
* 
* @author Michael Schäfer
*/

@Service 
public class RootMutationResolver implements GraphQLMutationResolver {

    private RouteRepository routeRepository;
  

    @Autowired
    public RootMutationResolver(RouteRepository routeRepository) {
        this.routeRepository=routeRepository;	
    }
 
    public Route createRoute(String flightNumber) {
        Route route = new Route(flightNumber);
        routeRepository.save(route);
        return route; 
    }

    public Route updateRoute(Long id, String departure) {
        Route route = routeRepository.findById(id).get();
        route.setDeparture(departure);
        routeRepository.save(route);
        return route;
    }

}