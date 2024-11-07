package com.example.myapplication.ui.task4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task4ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task4ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 4 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
