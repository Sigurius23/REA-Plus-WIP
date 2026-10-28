package io.seon.androidsdk.service;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.wifi.WifiManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p037bu.C3632c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C20700w extends AbstractC20664g {

    /* JADX INFO: renamed from: h */
    public static final String[] f77506h = {"wifi_mac_address", "wifi_ssid", "vpn_state", "proxy_state", "proxy_address", "wifi_private_ip"};

    /* JADX INFO: renamed from: i */
    public static final C3632c f77507i = new C3632c(C20700w.class.getName());

    /* JADX INFO: renamed from: e */
    public Context f77508e;

    /* JADX INFO: renamed from: f */
    public ConnectivityManager f77509f;

    /* JADX INFO: renamed from: g */
    public WifiManager f77510g;

    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[Catch: Exception -> 0x005f, all -> 0x0062, TryCatch #1 {Exception -> 0x005f, blocks: (B:16:0x004f, B:18:0x0053, B:20:0x0059, B:21:0x005c), top: B:50:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[Catch: Exception -> 0x005f, all -> 0x0062, TryCatch #1 {Exception -> 0x005f, blocks: (B:16:0x004f, B:18:0x0053, B:20:0x0059, B:21:0x005c), top: B:50:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[Catch: Exception -> 0x005f, all -> 0x0062, TRY_LEAVE, TryCatch #1 {Exception -> 0x005f, blocks: (B:16:0x004f, B:18:0x0053, B:20:0x0059, B:21:0x005c), top: B:50:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: all -> 0x0095, TryCatch #4 {all -> 0x0095, blocks: (B:29:0x006e, B:31:0x0072, B:33:0x0078), top: B:54:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x005f A[EXC_TOP_SPLITTER, PHI: r0
      0x005f: PHI (r0v3 ??) = (r0v1 ??), (r0v0 ??) binds: [B:42:0x005f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [bu.c] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3, types: [bu.c] */
    /* JADX WARN: Type inference failed for: r0v5, types: [io.seon.androidsdk.service.NetworkProbe$NetworkEnum] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: a */
    public final Map mo56774a() {
        NetworkProbe$NetworkEnum networkProbe$NetworkEnum;
        String str;
        ConnectivityManager connectivityManager;
        ProxyInfo defaultProxy;
        ConnectivityManager connectivityManager2;
        ?? r10 = AbstractC20664g.f77301d;
        HashMap map = new HashMap();
        map.put("wifi_mac_address", AbstractC20664g.m56801d(new C20698v(this, 0)));
        map.put("wifi_ssid", AbstractC20664g.m56801d(new C20698v(this, 1)));
        String strM56848a = null;
        try {
            try {
                try {
                    try {
                        ConnectivityManager connectivityManager3 = this.f77509f;
                        if (connectivityManager3 != null) {
                            networkProbe$NetworkEnum = connectivityManager3.getNetworkCapabilities(connectivityManager3.getActiveNetwork()).hasTransport(4) ? NetworkProbe$NetworkEnum.CONNECTED : NetworkProbe$NetworkEnum.NOT_CONNECTED;
                        } else {
                            try {
                                networkProbe$NetworkEnum = NetworkProbe$NetworkEnum.UNKNOWN;
                            } catch (Exception e5) {
                                r10.m11163L(3, e5);
                                networkProbe$NetworkEnum = null;
                            }
                        }
                    } catch (Exception unused) {
                    }
                } catch (Throwable unused2) {
                    networkProbe$NetworkEnum = null;
                    map.put("vpn_state", networkProbe$NetworkEnum);
                    connectivityManager2 = this.f77509f;
                    if (connectivityManager2 != null) {
                        try {
                            r10 = NetworkProbe$NetworkEnum.UNKNOWN;
                        } catch (Exception e13) {
                            r10.m11163L(3, e13);
                            r10 = 0;
                        }
                    } else if (connectivityManager2.getDefaultProxy() != null) {
                        r10 = NetworkProbe$NetworkEnum.CONNECTED;
                    } else {
                        r10 = NetworkProbe$NetworkEnum.NOT_CONNECTED;
                    }
                    map.put("proxy_state", r10);
                    connectivityManager = this.f77509f;
                    if (connectivityManager != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    map.put("proxy_address", str);
                    strM56848a = AbstractC20684o.m56848a(this.f77510g.getConnectionInfo().getIpAddress());
                    map.put("wifi_private_ip", strM56848a);
                    return map;
                }
                connectivityManager2 = this.f77509f;
                if (connectivityManager2 != null) {
                    r10 = NetworkProbe$NetworkEnum.UNKNOWN;
                } else if (connectivityManager2.getDefaultProxy() != null) {
                    r10 = NetworkProbe$NetworkEnum.CONNECTED;
                } else {
                    r10 = NetworkProbe$NetworkEnum.NOT_CONNECTED;
                }
            } catch (Exception unused3) {
            }
        } catch (Throwable unused4) {
            r10 = 0;
            map.put("proxy_state", r10);
            connectivityManager = this.f77509f;
            if (connectivityManager != null) {
                str = null;
            } else {
                str = null;
            }
            map.put("proxy_address", str);
            strM56848a = AbstractC20684o.m56848a(this.f77510g.getConnectionInfo().getIpAddress());
            map.put("wifi_private_ip", strM56848a);
            return map;
        }
        map.put("vpn_state", networkProbe$NetworkEnum);
        map.put("proxy_state", r10);
        try {
            connectivityManager = this.f77509f;
            if (connectivityManager != null || (defaultProxy = connectivityManager.getDefaultProxy()) == null) {
                str = null;
            } else {
                str = defaultProxy.getHost() + ":" + defaultProxy.getPort();
            }
        } catch (Throwable unused5) {
        }
        map.put("proxy_address", str);
        try {
            strM56848a = AbstractC20684o.m56848a(this.f77510g.getConnectionInfo().getIpAddress());
        } catch (Throwable unused6) {
        }
        map.put("wifi_private_ip", strM56848a);
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: b */
    public final Map mo56775b() {
        HashMap map = new HashMap();
        String strM56848a = null;
        try {
            strM56848a = AbstractC20684o.m56848a(this.f77510g.getDhcpInfo().gateway);
        } catch (Throwable unused) {
        }
        map.put("wifi_gw", strM56848a);
        map.put("nw_if_list", AbstractC20664g.m56801d(new C20698v(this, 2)));
        return map;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20670i
    /* JADX INFO: renamed from: c */
    public final void mo56776c(C20663f1 c20663f1) {
        this.f77508e = c20663f1.f77299a;
        this.f77303b = c20663f1;
        AtomicInteger atomicInteger = AbstractC20684o.f77414a;
        try {
            this.f77509f = (ConnectivityManager) this.f77508e.getSystemService("connectivity");
        } catch (Throwable unused) {
        }
        try {
            this.f77510g = (WifiManager) this.f77508e.getApplicationContext().getSystemService("wifi");
        } catch (Throwable unused2) {
        }
    }
}
