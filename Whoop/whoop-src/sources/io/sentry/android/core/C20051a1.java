package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.getstream.chat.android.models.MessageType;
import io.sentry.C20315e;
import io.sentry.C20337g0;
import io.sentry.C20371i4;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20606v4;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.a1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20051a1 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: b */
    public final C20121k0 f75319b;

    /* JADX INFO: renamed from: e */
    public final InterfaceC20606v4 f75322e;

    /* JADX INFO: renamed from: c */
    public NetworkCapabilities f75320c = null;

    /* JADX INFO: renamed from: d */
    public long f75321d = 0;

    /* JADX INFO: renamed from: a */
    public final C20371i4 f75318a = C20371i4.f76402a;

    public C20051a1(C20121k0 c20121k0, InterfaceC20606v4 interfaceC20606v4) {
        AbstractC29125c.m88510S(c20121k0, "BuildInfoProvider is required");
        this.f75319b = c20121k0;
        AbstractC29125c.m88510S(interfaceC20606v4, "SentryDateProvider is required");
        this.f75322e = interfaceC20606v4;
    }

    /* JADX INFO: renamed from: a */
    public static C20315e m55915a(String str) {
        C20315e c20315e = new C20315e();
        c20315e.f76286E = MessageType.SYSTEM;
        c20315e.f76288G = "network.event";
        c20315e.m56470c(str, "action");
        c20315e.f76290I = EnumC20436n5.INFO;
        return c20315e;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f75318a.mo56428h(m55915a("NETWORK_AVAILABLE"));
        this.f75320c = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C20172z0 c20172z0;
        long jMo56606d = this.f75322e.now().mo56606d();
        NetworkCapabilities networkCapabilities2 = this.f75320c;
        long j7 = this.f75321d;
        C20121k0 c20121k0 = this.f75319b;
        if (networkCapabilities2 == null) {
            c20172z0 = new C20172z0(networkCapabilities, c20121k0, jMo56606d);
        } else {
            C20172z0 c20172z1 = new C20172z0(networkCapabilities2, c20121k0, j7);
            c20172z0 = new C20172z0(networkCapabilities, c20121k0, jMo56606d);
            int iAbs = Math.abs(c20172z1.f75771c - c20172z0.f75771c);
            int i13 = c20172z0.f75769a;
            int i14 = c20172z1.f75769a;
            int iAbs2 = Math.abs(i14 - i13);
            int i15 = c20172z0.f75770b;
            int i16 = c20172z1.f75770b;
            int iAbs3 = Math.abs(i16 - i15);
            boolean z4 = ((double) Math.abs(c20172z1.f75772d - c20172z0.f75772d)) / 1000000.0d < 5000.0d;
            boolean z13 = z4 || iAbs <= 5;
            boolean z14 = z4 || ((double) iAbs2) <= Math.max(1000.0d, ((double) Math.abs(i14)) * 0.1d);
            boolean z15 = z4 || ((double) iAbs3) <= Math.max(1000.0d, ((double) Math.abs(i16)) * 0.1d);
            if (c20172z1.f75773e == c20172z0.f75773e && c20172z1.f75774f.equals(c20172z0.f75774f) && z13 && z14 && z15) {
                c20172z0 = null;
            }
        }
        if (c20172z0 == null) {
            return;
        }
        this.f75320c = networkCapabilities;
        this.f75321d = jMo56606d;
        C20315e c20315eM55915a = m55915a("NETWORK_CAPABILITIES_CHANGED");
        c20315eM55915a.m56470c(Integer.valueOf(c20172z0.f75769a), "download_bandwidth");
        c20315eM55915a.m56470c(Integer.valueOf(c20172z0.f75770b), "upload_bandwidth");
        c20315eM55915a.m56470c(Boolean.valueOf(c20172z0.f75773e), "vpn_active");
        c20315eM55915a.m56470c(c20172z0.f75774f, "network_type");
        int i17 = c20172z0.f75771c;
        if (i17 != 0) {
            c20315eM55915a.m56470c(Integer.valueOf(i17), "signal_strength");
        }
        C20337g0 c20337g0 = new C20337g0();
        c20337g0.m56493d(c20172z0, "android:networkCapabilities");
        this.f75318a.mo56429i(c20315eM55915a, c20337g0);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f75318a.mo56428h(m55915a("NETWORK_LOST"));
        this.f75320c = null;
    }
}
