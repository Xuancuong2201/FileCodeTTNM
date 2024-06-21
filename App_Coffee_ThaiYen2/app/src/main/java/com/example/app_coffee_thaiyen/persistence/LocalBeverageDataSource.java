package com.example.app_coffee_thaiyen.persistence;

import com.example.app_coffee_thaiyen.BeverageDataSource;
import com.example.app_coffee_thaiyen.model.Beverage;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

public class LocalBeverageDataSource implements BeverageDataSource {
    private final BeverageDao mBeverageDao;

    public LocalBeverageDataSource(BeverageDao mBeverageDao) {
        this.mBeverageDao = mBeverageDao;
    }

    @Override
    public Flowable<Beverage> getBeverage() {
        return mBeverageDao.getBeverage();
    }

    @Override
    public Completable insertOrUpdateUser(Beverage beverage) {
        return mBeverageDao.insertUser(beverage);
    }

    @Override
    public void deleteAllUsers() {
        mBeverageDao.deleteAllBeverage();
    }
}
