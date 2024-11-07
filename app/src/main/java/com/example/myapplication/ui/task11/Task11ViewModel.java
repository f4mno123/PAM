package com.example.myapplication.ui.task11;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task11ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task11ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 11 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
