package com.example.myapplication.ui.task10;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task10ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task10ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 10 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
