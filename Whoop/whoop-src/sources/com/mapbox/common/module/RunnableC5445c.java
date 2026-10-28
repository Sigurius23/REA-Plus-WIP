package com.mapbox.common.module;

import android.content.res.Configuration;
import androidx.core.app.NotificationCompat;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.http_backend.RequestObserver;
import io.sentry.C20315e;
import io.sentry.C20337g0;
import io.sentry.EnumC20436n5;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.C20211j;
import io.sentry.android.replay.C20212k;
import io.sentry.android.replay.capture.AbstractC20187c;
import io.sentry.android.replay.capture.C20190f;
import io.sentry.android.replay.capture.C20193i;
import io.sentry.protocol.EnumC20474e;
import io.sentry.rrweb.AbstractC20523b;
import io.sentry.rrweb.C20534m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m83.AbstractC25265s;
import p012ab.C0667a;
import p031b9.C2830f0;
import p031b9.SurfaceHolderCallbackC2821c0;
import p043c4.C3974q;
import p047c9.C4310a;
import p047c9.C4314e;
import p047c9.C4317h;
import p078d1.C11457j;
import p128ew.RunnableC13719f;
import p309lo.AbstractC24567y;
import p465rm.C31571u;
import p465rm.SurfaceHolderCallbackC31565r;
import p607x8.AbstractC38065t;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import qa.C30097b;
import sm.C32708a;
import sm.C32711d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: com.mapbox.common.module.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5445c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21933w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f21934x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f21935y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f21936z;

    public /* synthetic */ RunnableC5445c(Object obj, long j7, Object obj2, int i13) {
        this.f21933w = i13;
        this.f21934x = obj;
        this.f21935y = j7;
        this.f21936z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f21933w;
        int i14 = 0;
        EnumC20474e enumC20474e = null;
        long j7 = this.f21935y;
        Object obj = this.f21936z;
        Object obj2 = this.f21934x;
        switch (i13) {
            case 0:
                MapboxHttpClient.request$lambda$5((RequestObserver) obj2, j7, (HttpRequestError) obj);
                return;
            case 1:
                MapboxHttpClient.request$lambda$6((RequestObserver) obj2, j7, (Exception) obj);
                return;
            case 2:
                RunnableC13719f this$0 = (RunnableC13719f) obj2;
                Exception exception = (Exception) obj;
                AbstractC22676k.m65750j(this$0, "this$0");
                AbstractC22676k.m65750j(exception, "$exception");
                this$0.f48696E.mo34835a(j7, 0, exception);
                return;
            case 3:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                Configuration configuration = (Configuration) obj;
                if (appComponentsBreadcrumbsIntegration.f75238x != null) {
                    int i15 = appComponentsBreadcrumbsIntegration.f75237w.getResources().getConfiguration().orientation;
                    if (i15 == 1) {
                        enumC20474e = EnumC20474e.PORTRAIT;
                    } else if (i15 == 2) {
                        enumC20474e = EnumC20474e.LANDSCAPE;
                    }
                    String lowerCase = enumC20474e != null ? enumC20474e.name().toLowerCase(Locale.ROOT) : "undefined";
                    C20315e c20315e = new C20315e(j7);
                    c20315e.f76286E = NotificationCompat.CATEGORY_NAVIGATION;
                    c20315e.f76288G = "device.orientation";
                    c20315e.m56470c(lowerCase, "position");
                    c20315e.f76290I = EnumC20436n5.INFO;
                    C20337g0 c20337g0 = new C20337g0();
                    c20337g0.m56493d(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.f75238x.mo56429i(c20315e, c20337g0);
                    return;
                }
                return;
            case 4:
                C20190f c20190f = (C20190f) obj2;
                C3974q c3974q = (C3974q) obj;
                C20212k c20212k = c20190f.f75838h;
                if (c20212k != null) {
                    c3974q.invoke(c20212k, Long.valueOf(j7));
                }
                long jMo52216c = c20190f.f75858t.mo52216c() - c20190f.f75856r.getSessionReplay().f77067i;
                C20212k c20212k2 = c20190f.f75838h;
                c20190f.f75842l.setValue(c20190f, AbstractC20187c.f75830q[2], c20212k2 != null ? c20212k2.m56139m(jMo52216c) : null);
                ArrayList arrayList = c20190f.f75860v;
                C22659b0 c22659b0 = new C22659b0();
                AbstractC25265s.m74132j1(arrayList, new C20211j(c20190f, jMo52216c, c22659b0, 1));
                if (c22659b0.f89329w) {
                    for (Object obj3 : arrayList) {
                        int i16 = i14 + 1;
                        if (i14 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C20193i c20193i = (C20193i) obj3;
                        c20193i.f75861a.f76990T = i14;
                        List<AbstractC20523b> list = c20193i.f75862b.f77172x;
                        if (list != null) {
                            for (AbstractC20523b abstractC20523b : list) {
                                if (abstractC20523b instanceof C20534m) {
                                    ((C20534m) abstractC20523b).f76950z = i14;
                                }
                            }
                        }
                        i14 = i16;
                    }
                    return;
                }
                return;
            case 5:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = (SurfaceHolderCallbackC31565r) ((C11457j) obj2).f36754y;
                int i17 = AbstractC24567y.f95875a;
                C31571u c31571u = surfaceHolderCallbackC31565r.f130359w;
                C32711d c32711d = c31571u.f130402S;
                C32708a c32708aM102667y = c32711d.m102667y();
                Object obj4 = this.f21936z;
                c32711d.m102668z(c32708aM102667y, 26, new C4314e(c32708aM102667y, obj4, this.f21935y, 1));
                if (c31571u.f130427r0 == obj4) {
                    c31571u.f130395M.m31625i(26, new C30097b(14));
                    return;
                }
                return;
            default:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = (SurfaceHolderCallbackC2821c0) ((C38445a) obj2).f164637y;
                int i18 = AbstractC38065t.f163031a;
                C2830f0 c2830f0 = surfaceHolderCallbackC2821c0.f11043w;
                C4317h c4317h = c2830f0.f11124T;
                C4310a c4310aM13601k = c4317h.m13601k();
                Object obj5 = this.f21936z;
                c4317h.m13602l(c4310aM13601k, 26, new C4314e(c4310aM13601k, obj5, this.f21935y, 0));
                if (c2830f0.f11148r0 == obj5) {
                    c2830f0.f11118N.m121835e(26, new C0667a(8));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC5445c(Object obj, Object obj2, long j7, int i13) {
        this.f21933w = i13;
        this.f21934x = obj;
        this.f21936z = obj2;
        this.f21935y = j7;
    }
}
