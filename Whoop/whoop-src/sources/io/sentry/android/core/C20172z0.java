package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;
import io.sentry.android.core.internal.util.C20102c;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20172z0 {

    /* JADX INFO: renamed from: a */
    public final int f75769a;

    /* JADX INFO: renamed from: b */
    public final int f75770b;

    /* JADX INFO: renamed from: c */
    public final int f75771c;

    /* JADX INFO: renamed from: d */
    public final long f75772d;

    /* JADX INFO: renamed from: e */
    public final boolean f75773e;

    /* JADX INFO: renamed from: f */
    public final String f75774f;

    public C20172z0(NetworkCapabilities networkCapabilities, C20121k0 c20121k0, long j7) {
        AbstractC29125c.m88510S(networkCapabilities, "NetworkCapabilities is required");
        AbstractC29125c.m88510S(c20121k0, "BuildInfoProvider is required");
        this.f75769a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.f75770b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.f75771c = signalStrength > -100 ? signalStrength : 0;
        this.f75773e = networkCapabilities.hasTransport(4);
        String strM55984s = C20102c.m55984s(networkCapabilities);
        this.f75774f = strM55984s == null ? "" : strM55984s;
        this.f75772d = j7;
    }
}
