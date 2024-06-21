package com.example.app_coffee_thaiyen.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.app_coffee_thaiyen.BeverageDataSource;
import com.example.app_coffee_thaiyen.model.Beverage;

import io.reactivex.rxjava3.core.Flowable;

public class MenuViewModel extends ViewModel {
    private final BeverageDataSource mDataSource;

    private Beverage beverage;

    public MenuViewModel(BeverageDataSource mDataSource) {
        this.mDataSource = mDataSource;
    }

    public Flowable<Beverage> getBeverage() {
        return mDataSource.getBeverage();
    }
}
