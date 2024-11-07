package com.example.myapplication.ui.task5;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task5ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task5ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 5 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
