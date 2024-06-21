package com.example.app_coffee_thaiyen.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_coffee_thaiyen.BeverageDataSource;

public class ViewModelFactory implements ViewModelProvider.Factory {
    private final BeverageDataSource mDataSource;

    public ViewModelFactory(BeverageDataSource mDataSource) {
        this.mDataSource = mDataSource;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MenuViewModel.class)) {
            return (T) new MenuViewModel(mDataSource);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
