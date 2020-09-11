package com.AndroTools.FreeProVPN.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.AndroTools.FreeProVPN.App;


public class NetworkState {

    public static boolean isOnline()
    {
        ConnectivityManager cm =
                (ConnectivityManager) App.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}
