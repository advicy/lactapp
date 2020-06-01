package com.advicy.lactapp.viewModels;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

public class SettingsViewModel extends ViewModel {
    // TODO: Implement the viewModel
    //profile, sound, notifications
    private MutableLiveData<String> profile;

    public MutableLiveData<String> getProfile() {
        if (profile == null) {
            profile = new MutableLiveData<String>();
        }
        return profile;
    }


}
