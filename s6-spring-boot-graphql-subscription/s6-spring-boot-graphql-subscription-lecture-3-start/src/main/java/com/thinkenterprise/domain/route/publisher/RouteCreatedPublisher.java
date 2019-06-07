package com.thinkenterprise.domain.route.publisher;

import com.thinkenterprise.domain.route.Route;

import org.springframework.stereotype.Component;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.observables.ConnectableObservable;

/**  
* GraphQL Spring Boot Samples 
* Design and Development by Michael Schäfer 
* Copyright (c) 2019 
* All Rights Reserved.
* 
* @author Michael Schäfer
*/

@Component
public class RouteCreatedPublisher {

    private final Flowable<Route> publisher;
    private ObservableEmitter<Route> observableEmitter;

    public RouteCreatedPublisher() {
        Observable<Route> stockPriceUpdateObservable = Observable.create(emitter -> {
            observableEmitter=emitter;
        });
        

        ConnectableObservable<Route> connectableObservable = stockPriceUpdateObservable.share().publish();
        connectableObservable.connect();

        publisher = connectableObservable.toFlowable(BackpressureStrategy.BUFFER);
    }

    public void emit(Route route) {
        observableEmitter.onNext(route);
    }

    public Flowable<Route> getPublisher() {
        return publisher;
    }

}
