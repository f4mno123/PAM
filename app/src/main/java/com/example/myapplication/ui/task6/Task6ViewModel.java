package com.example.myapplication.ui.task6;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task6ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task6ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 6 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
