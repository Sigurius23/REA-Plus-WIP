package com.mapbox.common;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
class ConnectionChangeCallback extends ConnectivityManager.NetworkCallback {
    private final WeakReference<Reachability> reachability;

    public ConnectionChangeCallback(Reachability reachability) {
        this.reachability = new WeakReference<>(reachability);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyReachability$0() {
        Reachability reachability = this.reachability.get();
        if (reachability != null) {
            reachability.onNetworkChanged();
        }
    }

    private void notifyReachability() throws Throwable {
        boolean z4 = Looper.myLooper() == Looper.getMainLooper();
        RunnableC5410a runnableC5410a = new RunnableC5410a(this, 0);
        if (z4) {
            runnableC5410a.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnableC5410a);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) throws Throwable {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) throws Throwable {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) throws Throwable {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() throws Throwable {
        notifyReachability();
    }
}
