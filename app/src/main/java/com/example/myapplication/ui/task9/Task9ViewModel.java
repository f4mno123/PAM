package com.example.myapplication.ui.task9;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task9ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task9ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 9 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
