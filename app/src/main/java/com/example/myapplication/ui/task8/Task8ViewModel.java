package com.example.myapplication.ui.task8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task8ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task8ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 8 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
