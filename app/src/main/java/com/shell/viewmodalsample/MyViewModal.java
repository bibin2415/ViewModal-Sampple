package com.shell.viewmodalsample;

import androidx.lifecycle.ViewModel;

public class MyViewModal extends ViewModel {

    public String mUsername = "Bibin";

    public void setUsername(String username) {
        this.mUsername = username;
    }
}
