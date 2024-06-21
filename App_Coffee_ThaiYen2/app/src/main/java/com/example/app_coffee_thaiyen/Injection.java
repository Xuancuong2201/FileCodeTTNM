package com.example.app_coffee_thaiyen;

import android.content.Context;

import com.example.app_coffee_thaiyen.persistence.AppDatabase;
import com.example.app_coffee_thaiyen.persistence.LocalBeverageDataSource;
import com.example.app_coffee_thaiyen.viewmodel.ViewModelFactory;

public class Injection {

    public static BeverageDataSource provideBeverageDataSource(Context context) {
        AppDatabase database = AppDatabase.getInstance(context);
        return new LocalBeverageDataSource(database.beverageDao());
    }

    public static ViewModelFactory provideViewModelFactory(Context context){
        BeverageDataSource dataSource = provideBeverageDataSource(context);
        return new ViewModelFactory(dataSource);
    }
}
