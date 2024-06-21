package com.example.app_coffee_thaiyen;

import com.example.app_coffee_thaiyen.model.Beverage;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

public interface BeverageDataSource {

    Flowable<Beverage> getBeverage();

    Completable insertOrUpdateUser(Beverage beverage);

    void deleteAllUsers();
}
