package com.example.myapplication.ui.task18;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task18ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task18ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 18 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
