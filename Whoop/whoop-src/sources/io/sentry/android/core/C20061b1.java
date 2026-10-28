package io.sentry.android.core;

import io.getstream.chat.android.client.ChatClient;
import io.sentry.C20321e5;
import io.sentry.C20323e7;
import io.sentry.C20337g0;
import io.sentry.C20353h7;
import io.sentry.C20535s;
import io.sentry.EnumC20374i7;
import io.sentry.EnumC20400k2;
import io.sentry.InterfaceC20258b0;
import io.sentry.android.core.internal.util.C20104e;
import io.sentry.android.core.performance.C20144g;
import io.sentry.android.core.performance.C20145h;
import io.sentry.android.core.performance.EnumC20143f;
import io.sentry.protocol.C20466a;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20489m;
import io.sentry.protocol.C20501v;
import io.sentry.protocol.C20504y;
import io.sentry.util.C20579a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20061b1 implements InterfaceC20258b0 {

    /* JADX INFO: renamed from: w */
    public final C20067d f75359w;

    /* JADX INFO: renamed from: x */
    public final SentryAndroidOptions f75360x;

    /* JADX INFO: renamed from: y */
    public final C20579a f75361y = new C20579a();

    public C20061b1(SentryAndroidOptions sentryAndroidOptions, C20067d c20067d) {
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75360x = sentryAndroidOptions;
        this.f75359w = c20067d;
    }

    /* JADX INFO: renamed from: a */
    public static void m55927a(C20144g c20144g, C20473d0 c20473d0) {
        C20353h7 c20353h7;
        if (c20144g.f75672w != EnumC20143f.COLD) {
            return;
        }
        C20470c c20470c = c20473d0.f76884x;
        ArrayList arrayList = c20473d0.f76637S;
        C20323e7 c20323e7Mo56543i = c20470c.mo56543i();
        if (c20323e7Mo56543i == null) {
            return;
        }
        C20501v c20501v = c20323e7Mo56543i.f76321w;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c20353h7 = null;
                break;
            }
            C20504y c20504y = (C20504y) it.next();
            if (c20504y.f76812F.contentEquals("app.start.cold")) {
                c20353h7 = c20504y.f76823z;
                break;
            }
        }
        C20145h c20145h = new C20145h();
        C20145h c20145h2 = c20144g.f75675z;
        long j7 = c20145h2.f75677x;
        long j13 = c20145h2.f75678y;
        long j14 = C20144g.f75658P;
        c20145h.f75676w = "Process Initialization";
        c20145h.f75677x = j7;
        c20145h.f75678y = j13;
        c20145h.f75679z = j14;
        if (c20145h.m56047b() && Math.abs(c20145h.m56046a()) <= ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) {
            arrayList.add(m55930e(c20145h, c20353h7, c20501v, "process.load"));
        }
        ArrayList arrayList2 = new ArrayList(c20144g.f75663G.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList.add(m55930e((C20145h) it3.next(), c20353h7, c20501v, "contentprovider.load"));
            }
        }
        C20145h c20145h3 = c20144g.f75662F;
        if (c20145h3.f75679z != 0) {
            arrayList.add(m55930e(c20145h3, c20353h7, c20501v, "application.load"));
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m55928c(C20473d0 c20473d0) {
        for (C20504y c20504y : c20473d0.f76637S) {
            if (c20504y.f76812F.contentEquals("app.start.cold") || c20504y.f76812F.contentEquals("app.start.warm")) {
                return true;
            }
        }
        C20323e7 c20323e7Mo56543i = c20473d0.f76884x.mo56543i();
        if (c20323e7Mo56543i == null) {
            return false;
        }
        String str = c20323e7Mo56543i.f76310E;
        return str.equals("app.start.cold") || str.equals("app.start.warm");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX INFO: renamed from: d */
    public static void m55929d(C20473d0 c20473d0) {
        boolean z4;
        Double d3;
        Double d14;
        Object obj;
        ArrayList<C20504y> arrayList = c20473d0.f76637S;
        C20504y c20504y = null;
        C20504y c20504y2 = null;
        for (C20504y c20504y3 : arrayList) {
            if ("ui.load.initial_display".equals(c20504y3.f76812F)) {
                c20504y = c20504y3;
            } else if ("ui.load.full_display".equals(c20504y3.f76812F)) {
                c20504y2 = c20504y3;
            }
            if (c20504y != null && c20504y2 != null) {
                break;
            }
        }
        if (c20504y == null && c20504y2 == null) {
            return;
        }
        for (C20504y c20504y4 : arrayList) {
            if (c20504y4 != c20504y && c20504y4 != c20504y2) {
                Map map = c20504y4.f76817K;
                Double d15 = c20504y4.f76820w;
                boolean z13 = false;
                boolean z14 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
                if (c20504y != null) {
                    double dDoubleValue = d15.doubleValue();
                    if (dDoubleValue < c20504y.f76820w.doubleValue() || (((d14 = c20504y.f76821x) != null && dDoubleValue > d14.doubleValue()) || !z14)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                } else {
                    z4 = false;
                }
                if (c20504y2 != null) {
                    double dDoubleValue2 = d15.doubleValue();
                    if (dDoubleValue2 >= c20504y2.f76820w.doubleValue() && ((d3 = c20504y2.f76821x) == null || dDoubleValue2 <= d3.doubleValue())) {
                        z13 = true;
                    }
                }
                if (z4 || z13) {
                    Map concurrentHashMap = c20504y4.f76817K;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        c20504y4.f76817K = concurrentHashMap;
                    }
                    if (z4) {
                        concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z13) {
                        concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C20504y m55930e(C20145h c20145h, C20353h7 c20353h7, C20501v c20501v, String str) {
        long jM56046a;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(C20104e.f75529b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        Double dValueOf = Double.valueOf(c20145h.f75677x / 1000.0d);
        if (c20145h.m56047b()) {
            jM56046a = c20145h.m56046a() + c20145h.f75677x;
        } else {
            jM56046a = 0;
        }
        return new C20504y(dValueOf, Double.valueOf(jM56046a / 1000.0d), c20501v, new C20353h7(), c20353h7, str, c20145h.f75676w, EnumC20374i7.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: h */
    public final C20321e5 mo55901h(C20321e5 c20321e5, C20337g0 c20337g0) {
        return c20321e5;
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: i */
    public final C20473d0 mo55902i(C20473d0 c20473d0, C20337g0 c20337g0) {
        Map map;
        SentryAndroidOptions sentryAndroidOptions = this.f75360x;
        C20535s c20535sM56711a = this.f75361y.m56711a();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                c20535sM56711a.close();
                return c20473d0;
            }
            C20144g c20144gM56042c = C20144g.m56042c();
            boolean zM55928c = m55928c(c20473d0);
            HashMap map2 = c20473d0.f76638T;
            C20470c c20470c = c20473d0.f76884x;
            if (zM55928c) {
                if (c20144gM56042c.f75669M && ((Boolean) c20144gM56042c.f75673x.m56714a()).booleanValue()) {
                    long jM56046a = c20144gM56042c.m56043b(sentryAndroidOptions).m56046a();
                    if (jM56046a != 0) {
                        map2.put(c20144gM56042c.f75672w == EnumC20143f.COLD ? "app_start_cold" : "app_start_warm", new C20489m(EnumC20400k2.MILLISECOND.apiName(), Float.valueOf(jM56046a)));
                        m55927a(c20144gM56042c, c20473d0);
                        c20144gM56042c.f75669M = false;
                        c20144gM56042c.f75663G.clear();
                        c20144gM56042c.f75664H.clear();
                    }
                }
                C20466a c20466aMo56538d = c20470c.mo56538d();
                if (c20466aMo56538d == null) {
                    c20466aMo56538d = new C20466a();
                    c20470c.mo56547m(c20466aMo56538d);
                }
                c20466aMo56538d.f76601J = c20144gM56042c.f75672w == EnumC20143f.COLD ? "cold" : "warm";
            }
            m55929d(c20473d0);
            C20501v c20501v = c20473d0.f76883w;
            C20323e7 c20323e7Mo56543i = c20470c.mo56543i();
            if (c20501v != null && c20323e7Mo56543i != null && c20323e7Mo56543i.f76310E.contentEquals("ui.load")) {
                C20067d c20067d = this.f75359w;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c20067d.f75379d;
                C20535s c20535sM56711a2 = ((C20579a) c20067d.f75382g).m56711a();
                try {
                    if (c20067d.m55938c()) {
                        Map map3 = (Map) concurrentHashMap.get(c20501v);
                        concurrentHashMap.remove(c20501v);
                        c20535sM56711a2.close();
                        map = map3;
                    } else {
                        c20535sM56711a2.close();
                        map = null;
                    }
                    if (map != null) {
                        map2.putAll(map);
                    }
                } catch (Throwable th3) {
                    try {
                        c20535sM56711a2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            c20535sM56711a.close();
            return c20473d0;
        } catch (Throwable th5) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }
}
