package com.example.myapplication.ui.task14;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task14ViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public Task14ViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Task 14 Fragment");
    }

    public LiveData<String> getText() {
        return text;
    }
}
