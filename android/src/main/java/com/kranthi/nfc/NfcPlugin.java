package com.kranthi.nfc;

import android.util.Log;

public class NfcPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
