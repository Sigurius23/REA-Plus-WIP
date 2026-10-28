package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import cd3.C4455g;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20399k1;
import io.sentry.InterfaceC20602v0;
import io.sentry.logger.InterfaceC20415a;
import io.sentry.logger.InterfaceC20416b;
import io.sentry.metrics.InterfaceC20427a;
import io.sentry.metrics.InterfaceC20428b;

/* JADX INFO: renamed from: io.sentry.android.core.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C20156t implements InterfaceC20399k1, InterfaceC20154s0, InterfaceC20602v0, InterfaceC20416b, InterfaceC20428b {

    /* JADX INFO: renamed from: x */
    public static final C20156t f75721x = new C20156t(0);

    /* JADX INFO: renamed from: y */
    public static final C20156t f75722y = new C20156t(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75723w;

    public /* synthetic */ C20156t(int i13) {
        this.f75723w = i13;
    }

    @Override // io.sentry.InterfaceC20399k1
    /* JADX INFO: renamed from: a */
    public void mo56057a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.logger.InterfaceC20416b
    /* JADX INFO: renamed from: b */
    public InterfaceC20415a mo56058b(C20513q6 c20513q6, C4455g c4455g) {
        return new C20123l(c20513q6, c4455g);
    }

    @Override // io.sentry.InterfaceC20399k1
    /* JADX INFO: renamed from: c */
    public void mo56060c() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: i */
    public void mo16058i(EnumC20436n5 enumC20436n5, Throwable th3, String str, Object... objArr) {
        switch (this.f75723w) {
            case 2:
                if (objArr.length != 0) {
                    mo16060j(enumC20436n5, String.format(str, objArr), th3);
                } else {
                    mo16060j(enumC20436n5, str, th3);
                }
                break;
            default:
                if (objArr.length != 0) {
                    mo16060j(enumC20436n5, String.format(str, objArr), th3);
                } else {
                    mo16060j(enumC20436n5, str, th3);
                }
                break;
        }
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: j */
    public void mo16060j(EnumC20436n5 enumC20436n5, String str, Throwable th3) {
        switch (this.f75723w) {
            case 2:
                Log.wtf("Sentry", str, th3);
                break;
            default:
                int i13 = AbstractC20120k.f75589a[enumC20436n5.ordinal()];
                if (i13 == 1) {
                    Log.i("Sentry", str, th3);
                } else if (i13 == 2) {
                    Log.w("Sentry", str, th3);
                } else if (i13 == 3) {
                    Log.e("Sentry", str, th3);
                } else if (i13 == 4) {
                    Log.wtf("Sentry", str, th3);
                } else {
                    Log.d("Sentry", str, th3);
                }
                break;
        }
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: m */
    public void mo16066m(EnumC20436n5 enumC20436n5, String str, Object... objArr) {
        switch (this.f75723w) {
            case 2:
                if (objArr.length != 0) {
                    Log.println(7, "Sentry", String.format(str, objArr));
                } else {
                    Log.println(7, "Sentry", str);
                }
                break;
            default:
                int i13 = 5;
                if (objArr.length != 0) {
                    int i14 = AbstractC20120k.f75589a[enumC20436n5.ordinal()];
                    if (i14 == 1) {
                        i13 = 4;
                    } else if (i14 != 2) {
                        i13 = i14 != 4 ? 3 : 7;
                    }
                    Log.println(i13, "Sentry", String.format(str, objArr));
                } else {
                    int i15 = AbstractC20120k.f75589a[enumC20436n5.ordinal()];
                    if (i15 == 1) {
                        i13 = 4;
                    } else if (i15 != 2) {
                        i13 = i15 != 4 ? 3 : 7;
                    }
                    Log.println(i13, "Sentry", str);
                }
                break;
        }
    }

    @Override // io.sentry.InterfaceC20602v0
    /* JADX INFO: renamed from: o */
    public boolean mo16069o(EnumC20436n5 enumC20436n5) {
        switch (this.f75723w) {
        }
        return true;
    }

    @Override // io.sentry.metrics.InterfaceC20428b
    /* JADX INFO: renamed from: b */
    public InterfaceC20427a mo56059b(C20513q6 c20513q6, C4455g c4455g) {
        C20132o c20132o = new C20132o(c20513q6, c4455g);
        C20071e0.f75391E.m55941b(c20132o);
        return c20132o;
    }
}
