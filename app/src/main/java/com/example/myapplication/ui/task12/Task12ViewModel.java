package com.example.myapplication.ui.task12;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task12ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task12ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 12 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
