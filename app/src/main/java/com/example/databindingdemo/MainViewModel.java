package com.example.databindingdemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel  extends ViewModel {
    private MutableLiveData<String> etTexto = new MutableLiveData<String>("");

    public MutableLiveData<String> getEtTexto() {
        return etTexto;
    }
}
