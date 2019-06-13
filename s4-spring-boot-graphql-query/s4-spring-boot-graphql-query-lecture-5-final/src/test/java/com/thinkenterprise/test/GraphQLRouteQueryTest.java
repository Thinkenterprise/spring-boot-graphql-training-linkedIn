package com.thinkenterprise.test;


import static graphql.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class GraphQLRouteQueryTest {

    @Autowired
    private GraphQLTestTemplate graphQLTestTemplate;

    @Test
    public void routeQueryroutes() throws IOException { 
        GraphQLResponse response  = graphQLTestTemplate.postForResource("routes.graphql");
        assertNotNull(response);
        assertTrue(response.isOk());
        assertEquals("101", response.get("$.data.routes[0].id"));
    }
    
     
      
}