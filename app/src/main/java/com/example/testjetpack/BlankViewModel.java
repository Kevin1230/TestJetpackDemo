package com.example.testjetpack;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BlankViewModel extends ViewModel {
    MutableLiveData<Integer> mNumber;

    public MutableLiveData<Integer> getNumber() {
        if (mNumber == null) {
            mNumber = new MediatorLiveData<>();
            mNumber.setValue(0);
        }
        return mNumber;
    }

    public void add() {
        mNumber.setValue(mNumber.getValue() + 1);
        //测试我在这里又增加了一行代码//测试我在这里又增加了一行代码//测试我在这里又增加了一行代码
        //测试我在这里又增加了一行代码//测试我在这里又增加了一行代码//测试我在这里又增加了一行代码
        //测试我在这里又增加了一行代码//测试我在这里又增加了一行代码//测试我在这里又增加了一行代码
    }
}
