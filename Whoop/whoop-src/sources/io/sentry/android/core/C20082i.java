package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import ge3.AbstractC15751g;
import io.sentry.C20422m3;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.InterfaceC20639z0;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C20082i implements InterfaceC20639z0 {

    /* JADX INFO: renamed from: g */
    public final InterfaceC20602v0 f75436g;

    /* JADX INFO: renamed from: a */
    public long f75430a = 0;

    /* JADX INFO: renamed from: b */
    public long f75431b = 0;

    /* JADX INFO: renamed from: c */
    public long f75432c = 1;

    /* JADX INFO: renamed from: d */
    public long f75433d = 1;

    /* JADX INFO: renamed from: e */
    public double f75434e = 1.0E9d / 1;

    /* JADX INFO: renamed from: f */
    public final File f75435f = new File("/proc/self/stat");

    /* JADX INFO: renamed from: h */
    public boolean f75437h = false;

    /* JADX INFO: renamed from: i */
    public final Pattern f75438i = Pattern.compile("[\n\t\r ]");

    public C20082i(InterfaceC20602v0 interfaceC20602v0) {
        AbstractC29125c.m88510S(interfaceC20602v0, "Logger is required.");
        this.f75436g = interfaceC20602v0;
    }

    @Override // io.sentry.InterfaceC20639z0
    /* JADX INFO: renamed from: a */
    public final void mo55960a() {
        this.f75437h = true;
        this.f75432c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f75433d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f75434e = 1.0E9d / this.f75432c;
        this.f75431b = m55962c();
    }

    @Override // io.sentry.InterfaceC20639z0
    /* JADX INFO: renamed from: b */
    public final void mo55961b(C20422m3 c20422m3) {
        if (this.f75437h) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j7 = jElapsedRealtimeNanos - this.f75430a;
            this.f75430a = jElapsedRealtimeNanos;
            long jM55962c = m55962c();
            long j13 = jM55962c - this.f75431b;
            this.f75431b = jM55962c;
            c20422m3.f76498a = Double.valueOf(((j13 / j7) / this.f75433d) * 100.0d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m55962c() {
        String strM44437Q;
        InterfaceC20602v0 interfaceC20602v0 = this.f75436g;
        try {
            strM44437Q = AbstractC15751g.m44437Q(this.f75435f);
        } catch (IOException e5) {
            this.f75437h = false;
            interfaceC20602v0.mo16060j(EnumC20436n5.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e5);
            strM44437Q = null;
        }
        if (strM44437Q != null) {
            String[] strArrSplit = this.f75438i.split(strM44437Q.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f75434e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e13) {
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error parsing /proc/self/stat file.", e13);
            }
        }
        return 0L;
    }
}
