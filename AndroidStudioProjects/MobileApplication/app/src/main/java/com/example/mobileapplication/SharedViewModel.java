package com.example.mobileapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
public class SharedViewModel {
    private final MutableLiveData<String> data = new MutableLiveData<>();

    public void setData(String newData) {
        data.setValue(newData);
    }

    public LiveData<String> getData() {
        return data;
    }
}

