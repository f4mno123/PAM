package com.example.myapplication.ui.task15;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task15ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task15ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 15 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
