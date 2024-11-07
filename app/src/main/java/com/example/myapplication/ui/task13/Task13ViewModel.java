package com.example.myapplication.ui.task13;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task13ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task13ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 13 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
