package io.seon.androidsdk.service;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.seon.androidsdk.service.v */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20698v implements InterfaceC20695t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C20700w f77505b;

    public /* synthetic */ C20698v(C20700w c20700w, int i13) {
        this.f77504a = i13;
        this.f77505b = c20700w;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20695t0
    /* JADX INFO: renamed from: a */
    public final Object mo56800a() {
        String ssid;
        int i13 = this.f77504a;
        C20700w c20700w = this.f77505b;
        switch (i13) {
            case 0:
                c20700w.getClass();
                try {
                    for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                        if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                            byte[] hardwareAddress = networkInterface.getHardwareAddress();
                            if (hardwareAddress == null) {
                                return null;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            for (byte b : hardwareAddress) {
                                sb4.append(String.format("%02X:", Byte.valueOf(b)));
                            }
                            if (sb4.length() > 0) {
                                sb4.deleteCharAt(sb4.length() - 1);
                            }
                            return sb4.toString();
                        }
                    }
                    return null;
                } catch (Exception e5) {
                    C20700w.f77507i.m11163L(6, e5);
                    return null;
                }
            case 1:
                WifiManager wifiManager = (WifiManager) c20700w.f77508e.getApplicationContext().getSystemService("wifi");
                if (!AbstractC20684o.m56854g(c20700w.f77508e, "android.permission.ACCESS_WIFI_STATE")) {
                    return null;
                }
                WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
                if (connectionInfo == null || (ssid = connectionInfo.getSSID()) == null || ssid.toLowerCase().contains("unknown")) {
                    return null;
                }
                String strReplace = ssid.replace("\"", "");
                if (strReplace.equals("0x")) {
                    return null;
                }
                return strReplace;
            default:
                c20700w.getClass();
                ArrayList arrayList = new ArrayList();
                try {
                    for (NetworkInterface networkInterface2 : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                        Locale locale = Locale.ENGLISH;
                        String displayName = networkInterface2.getDisplayName();
                        boolean zIsUp = networkInterface2.isUp();
                        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                        arrayList.add(displayName + ":" + (zIsUp ? 1 : 0));
                    }
                } catch (Exception unused) {
                }
                return arrayList;
        }
    }
}
