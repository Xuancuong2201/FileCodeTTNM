package com.example.app_coffee_thaiyen.persistence;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.app_coffee_thaiyen.model.Beverage;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface BeverageDao {
    @Query("Select * From Beverage ")
    Flowable<Beverage> getBeverage();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insertUser(Beverage beverage);

    @Query("DELETE FROM Beverage")
    void deleteAllBeverage();
}
