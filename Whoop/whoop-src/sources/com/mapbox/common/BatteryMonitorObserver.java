package com.mapbox.common;

/* JADX INFO: loaded from: classes.dex */
public interface BatteryMonitorObserver {
    void onBatteryChargingStatusChanged(boolean z4);

    void onBatteryStatusError(String str);
}
