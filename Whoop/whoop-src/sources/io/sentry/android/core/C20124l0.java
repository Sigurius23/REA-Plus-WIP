package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Looper;
import bd3.C3130k;
import bd3.C3142u;
import com.iterable.iterableapi.CallableC5351m1;
import hg3.AbstractC17269i;
import io.sentry.AbstractC20519r4;
import io.sentry.C20321e5;
import io.sentry.C20337g0;
import io.sentry.C20542s6;
import io.sentry.C20577u5;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20258b0;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.internal.util.C20104e;
import io.sentry.android.core.performance.C20144g;
import io.sentry.android.core.performance.C20145h;
import io.sentry.protocol.C20466a;
import io.sentry.protocol.C20469b0;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20471c0;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20476f;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20492p;
import io.sentry.protocol.C20500u;
import io.sentry.protocol.C20505z;
import io.sentry.util.C20579a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20124l0 implements InterfaceC20258b0 {

    /* JADX INFO: renamed from: w */
    public final Context f75599w;

    /* JADX INFO: renamed from: x */
    public final C20121k0 f75600x;

    /* JADX INFO: renamed from: y */
    public final SentryAndroidOptions f75601y;

    /* JADX INFO: renamed from: z */
    public final Future f75602z;

    public C20124l0(Context context, C20121k0 c20121k0, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        new C20579a();
        Context applicationContext = context.getApplicationContext();
        this.f75599w = applicationContext != null ? applicationContext : context;
        this.f75600x = c20121k0;
        AbstractC29125c.m88510S(sentryAndroidOptions, "The options object is required.");
        this.f75601y = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new CallableC5351m1(3, this, sentryAndroidOptions));
        } catch (RejectedExecutionException e5) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.WARNING, "Device info caching task rejected.", e5);
            futureSubmit = null;
        }
        this.f75602z = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: renamed from: a */
    public final void m56026a(AbstractC20519r4 abstractC20519r4, C20337g0 c20337g0) {
        Boolean bool;
        C20466a c20466aMo56538d = abstractC20519r4.f76884x.mo56538d();
        if (c20466aMo56538d == null) {
            c20466aMo56538d = new C20466a();
        }
        c20466aMo56538d.f76596E = (String) AbstractC20118j0.f75581c.m56072b(this.f75599w);
        C20145h c20145hM56043b = C20144g.m56042c().m56043b(this.f75601y);
        C20130n0 c20130n0 = null;
        if (c20145hM56043b.m56047b()) {
            C20577u5 c20577u5 = c20145hM56043b.m56047b() ? new C20577u5(c20145hM56043b.f75677x * 1000000) : null;
            c20466aMo56538d.f76607x = c20577u5 == null ? null : AbstractC21598x.m60660P(Double.valueOf(c20577u5.f77060w / 1000000.0d).longValue());
        }
        if (!AbstractC17269i.m48877X(c20337g0) && c20466aMo56538d.f76602K == null && (bool = C20071e0.f75391E.f75395z) != null) {
            c20466aMo56538d.f76602K = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.f75599w;
        SentryAndroidOptions sentryAndroidOptions = this.f75601y;
        InterfaceC20602v0 logger = sentryAndroidOptions.getLogger();
        C20121k0 c20121k0 = this.f75600x;
        PackageInfo packageInfoM56011e = AbstractC20118j0.m56011e(context, logger, c20121k0);
        if (packageInfoM56011e != null) {
            c20121k0.getClass();
            String string = Long.toString(packageInfoM56011e.getLongVersionCode());
            if (abstractC20519r4.f76879L == null) {
                abstractC20519r4.f76879L = string;
            }
            Future future = this.f75602z;
            if (future != null) {
                try {
                    c20130n0 = (C20130n0) future.get();
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to retrieve device info", th3);
                }
            } else {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            c20466aMo56538d.f76606w = packageInfoM56011e.packageName;
            c20466aMo56538d.f76597F = packageInfoM56011e.versionName;
            c20466aMo56538d.f76598G = Long.toString(packageInfoM56011e.getLongVersionCode());
            HashMap map = new HashMap();
            String[] strArr = packageInfoM56011e.requestedPermissions;
            int[] iArr = packageInfoM56011e.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    String str = strArr[i13];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i13] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            c20466aMo56538d.f76599H = map;
            if (c20130n0 != null) {
                try {
                    C3130k c3130k = c20130n0.f75622f;
                    if (c3130k != null) {
                        c20466aMo56538d.f76603L = Boolean.valueOf(c3130k.f12276b);
                        String[] strArr2 = (String[]) c3130k.f12277c;
                        if (strArr2 != null) {
                            c20466aMo56538d.f76604M = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        abstractC20519r4.f76884x.mo56547m(c20466aMo56538d);
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: b */
    public final C20542s6 mo56027b(C20542s6 c20542s6, C20337g0 c20337g0) {
        boolean zM56029d = m56029d(c20542s6, c20337g0);
        if (zM56029d) {
            m56026a(c20542s6, c20337g0);
        }
        m56028c(c20542s6, false, zM56029d);
        return c20542s6;
    }

    /* JADX INFO: renamed from: c */
    public final void m56028c(AbstractC20519r4 abstractC20519r4, boolean z4, boolean z13) {
        C20481h0 c20481h0 = abstractC20519r4.f76876I;
        if (c20481h0 == null) {
            c20481h0 = new C20481h0();
            abstractC20519r4.f76876I = c20481h0;
        }
        if (c20481h0.f76688x == null) {
            c20481h0.f76688x = AbstractC20157t0.m56061a(this.f75599w);
        }
        String str = c20481h0.f76690z;
        SentryAndroidOptions sentryAndroidOptions = this.f75601y;
        if (str == null && sentryAndroidOptions.isSendDefaultPii()) {
            c20481h0.f76690z = "{{auto}}";
        }
        C20470c c20470c = abstractC20519r4.f76884x;
        C20476f c20476fMo56539e = c20470c.mo56539e();
        Future future = this.f75602z;
        if (c20476fMo56539e == null) {
            if (future != null) {
                try {
                    c20470c.mo56549o(((C20130n0) future.get()).m56033a(z4, z13));
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to retrieve device info", th3);
                }
            } else {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            C20492p c20492pMo56541g = c20470c.mo56541g();
            if (future != null) {
                try {
                    c20470c.mo56552r(((C20130n0) future.get()).f75623g);
                } catch (Throwable th4) {
                    sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to retrieve os system", th4);
                }
            } else {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (c20492pMo56541g != null) {
                String str2 = c20492pMo56541g.f76751w;
                c20470c.mo56545k(c20492pMo56541g, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            C3142u c3142u = ((C20130n0) future.get()).f75621e;
            if (c3142u != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(c3142u.f12307w));
                String str3 = c3142u.f12308x;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    abstractC20519r4.m56671b((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error getting side loaded info.", th5);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m56029d(AbstractC20519r4 abstractC20519r4, C20337g0 c20337g0) {
        if (AbstractC17269i.m48899k0(c20337g0)) {
            return true;
        }
        this.f75601y.getLogger().mo16066m(EnumC20436n5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC20519r4.f76883w);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: h */
    public final C20321e5 mo55901h(C20321e5 c20321e5, C20337g0 c20337g0) {
        C20469b0 c20469b0;
        List list;
        boolean z4;
        boolean zM56029d = m56029d(c20321e5, c20337g0);
        if (zM56029d) {
            m56026a(c20321e5, c20337g0);
            if (c20321e5.m56481e() != null) {
                boolean zM48877X = AbstractC17269i.m48877X(c20337g0);
                for (C20471c0 c20471c0 : c20321e5.m56481e()) {
                    C20104e.f75528a.getClass();
                    Long l7 = c20471c0.f76627w;
                    if (l7 == null) {
                        z4 = false;
                    } else if (C20104e.m55995d(Looper.getMainLooper().getThread()) == l7.longValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c20471c0.f76621F == null) {
                        c20471c0.f76621F = Boolean.valueOf(z4);
                    }
                    if (!zM48877X && c20471c0.f76623H == null) {
                        c20471c0.f76623H = Boolean.valueOf(z4);
                    }
                }
            }
        }
        m56028c(c20321e5, true, zM56029d);
        ArrayList arrayListM56480d = c20321e5.m56480d();
        if (arrayListM56480d != null && arrayListM56480d.size() > 1) {
            C20500u c20500u = (C20500u) AbstractC25012a.m73371d(arrayListM56480d, 1);
            if ("java.lang".equals(c20500u.f76800y) && (c20469b0 = c20500u.f76795E) != null && (list = c20469b0.f76614w) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((C20505z) it.next()).f76825F)) {
                        Collections.reverse(arrayListM56480d);
                        break;
                    }
                }
            }
        }
        return c20321e5;
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: i */
    public final C20473d0 mo55902i(C20473d0 c20473d0, C20337g0 c20337g0) {
        boolean zM56029d = m56029d(c20473d0, c20337g0);
        if (zM56029d) {
            m56026a(c20473d0, c20337g0);
        }
        m56028c(c20473d0, false, zM56029d);
        return c20473d0;
    }
}
