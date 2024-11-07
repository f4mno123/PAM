package com.example.myapplication.ui.task7;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task7ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task7ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 7 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
