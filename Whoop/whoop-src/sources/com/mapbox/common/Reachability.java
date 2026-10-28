package com.mapbox.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p479s4.AbstractC32122c;

/* JADX INFO: loaded from: classes.dex */
public class Reachability implements ReachabilityInterface {
    private ConnectionChangeCallback callback;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final String hostname;
    private final ReachabilityOfflineSwitchObserver offlineObserver;
    public int peer;
    public final String TAG = "MapboxReachability";
    public int timeoutInMs = 200;
    private final Map<Long, ReachabilityChanged> listeners = new ConcurrentHashMap();
    private NetworkStatus currentStatus = NetworkStatus.NOT_REACHABLE;
    private boolean networkConnected = true;
    private boolean publish = false;

    /* JADX INFO: loaded from: classes6.dex */
    public class ReachabilityOfflineSwitchObserver implements OfflineSwitchObserver {
        private ReachabilityOfflineSwitchObserver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$statusChanged$0(boolean z4) {
            Reachability.this.setNetworkConnected(z4);
            Reachability.this.onNetworkChanged();
        }

        @Override // com.mapbox.common.OfflineSwitchObserver
        public void statusChanged(final boolean z4) {
            boolean z13 = Looper.myLooper() == Looper.getMainLooper();
            Runnable runnable = new Runnable() { // from class: com.mapbox.common.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21913w.lambda$statusChanged$0(z4);
                }
            };
            if (z13) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    public Reachability(String str) {
        Context context = MapboxSDKCommon.INSTANCE.getContext();
        this.context = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.connectivityManager = connectivityManager;
        this.callback = null;
        if (connectivityManager == null) {
            throw new AssertionError("This Android platform doesn't have Connectivity Service");
        }
        this.hostname = str;
        if (AbstractC32122c.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addCapability(16).build();
            Log.info("Application permission for ACCESS_NETWORK_STATE granted", "MapboxReachability");
            ConnectionChangeCallback connectionChangeCallback = new ConnectionChangeCallback(this);
            try {
                connectivityManager.registerNetworkCallback(networkRequestBuild, connectionChangeCallback);
                this.callback = connectionChangeCallback;
            } catch (RuntimeException e5) {
                Log.error("Failed to subscribe to network connectivity changes: " + e5.getMessage(), "MapboxReachability");
            }
        } else {
            Log.warning("Couldn't get application permission for ACCESS_NETWORK_STATE", "MapboxReachability");
        }
        ReachabilityOfflineSwitchObserver reachabilityOfflineSwitchObserver = new ReachabilityOfflineSwitchObserver();
        this.offlineObserver = reachabilityOfflineSwitchObserver;
        OfflineSwitch.getInstance().registerObserver(reachabilityOfflineSwitchObserver);
        onNetworkChanged();
    }

    public static ReachabilityInterface createPlatformReachability(String str) {
        return new Reachability(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setNetworkConnected(boolean z4) {
        this.networkConnected = z4;
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized long addListener(ReachabilityChanged reachabilityChanged) {
        long newId;
        newId = IdGenerator.getNewId();
        this.listeners.put(Long.valueOf(newId), reachabilityChanged);
        reachabilityChanged.run(this.currentStatus);
        this.publish = true;
        return newId;
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized NetworkStatus currentNetworkStatus() {
        return this.currentStatus;
    }

    public void finalize() {
        OfflineSwitch.getInstance().unregisterObserver(this.offlineObserver);
        try {
            ConnectionChangeCallback connectionChangeCallback = this.callback;
            if (connectionChangeCallback != null) {
                this.connectivityManager.unregisterNetworkCallback(connectionChangeCallback);
            }
            super.finalize();
        } catch (Throwable th3) {
            Log.error(th3.toString(), "MapboxReachability");
        }
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized boolean isReachable() {
        try {
            boolean z4 = false;
            if (!this.networkConnected) {
                return false;
            }
            String str = this.hostname;
            if (str == null || str.isEmpty()) {
                if (AbstractC32122c.checkSelfPermission(this.context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    try {
                        ConnectivityManager connectivityManager = this.connectivityManager;
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                            z4 = true;
                        }
                        return z4;
                    } catch (RuntimeException e5) {
                        Log.error("ConnectivityManager interaction failed with exception: " + e5.getMessage(), "MapboxReachability");
                    }
                }
                return false;
            }
            try {
                return InetAddress.getByName(this.hostname).isReachable(this.timeoutInMs);
            } catch (IOException e13) {
                Log.warning("Network error. " + e13.getMessage(), "MapboxReachability");
                return false;
            } catch (IllegalArgumentException e14) {
                Log.warning("Bad timeout. " + e14.getMessage(), "MapboxReachability");
                return false;
            }
            throw th;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void onNetworkChanged() {
        NetworkStatus networkStatus = this.currentStatus;
        this.currentStatus = NetworkStatus.NOT_REACHABLE;
        if (this.networkConnected) {
            if (AbstractC32122c.checkSelfPermission(this.context, "android.permission.ACCESS_NETWORK_STATE") == -1) {
                Log.warning("Unable to get application permission for ACCESS_NETWORK_STATE", "MapboxReachability");
                return;
            }
            try {
                ConnectivityManager connectivityManager = this.connectivityManager;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        this.currentStatus = NetworkStatus.REACHABLE_VIA_WI_FI;
                    } else if (networkCapabilities.hasTransport(0)) {
                        this.currentStatus = NetworkStatus.REACHABLE_VIA_WWAN;
                    } else if (networkCapabilities.hasTransport(3)) {
                        this.currentStatus = NetworkStatus.REACHABLE_VIA_ETHERNET;
                    }
                }
            } catch (RuntimeException e5) {
                Log.error("ConnectivityManager interaction failed with exception: " + e5.getMessage(), "MapboxReachability");
                return;
            }
        }
        if (this.publish && networkStatus != this.currentStatus) {
            Iterator<ReachabilityChanged> it = this.listeners.values().iterator();
            while (it.hasNext()) {
                it.next().run(this.currentStatus);
            }
        }
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public synchronized boolean removeListener(long j7) {
        try {
            this.listeners.remove(Long.valueOf(j7));
            if (this.listeners.isEmpty()) {
                this.publish = false;
            }
        } catch (Exception unused) {
            return false;
        }
        return true;
    }
}
