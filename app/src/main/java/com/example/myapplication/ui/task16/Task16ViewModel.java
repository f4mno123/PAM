package com.example.myapplication.ui.task16;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task16ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task16ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 16 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
