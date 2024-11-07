package com.example.myapplication.ui.task17;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task17ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task17ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 17 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
