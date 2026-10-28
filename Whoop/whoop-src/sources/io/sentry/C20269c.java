package io.sentry;

import aa3.C0627i1;
import ae3.C0796d;
import io.sentry.protocol.C20501v;
import io.sentry.protocol.EnumC20479g0;
import io.sentry.util.C20579a;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: io.sentry.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20269c {

    /* JADX INFO: renamed from: i */
    public static final C0796d f76112i = new C0796d(6);

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f76113a;

    /* JADX INFO: renamed from: b */
    public final C20579a f76114b;

    /* JADX INFO: renamed from: c */
    public Double f76115c;

    /* JADX INFO: renamed from: d */
    public Double f76116d;

    /* JADX INFO: renamed from: e */
    public final String f76117e;

    /* JADX INFO: renamed from: f */
    public boolean f76118f;

    /* JADX INFO: renamed from: g */
    public final boolean f76119g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC20602v0 f76120h;

    public C20269c(InterfaceC20602v0 interfaceC20602v0) {
        this(new ConcurrentHashMap(), null, null, null, false, interfaceC20602v0);
    }

    /* JADX INFO: renamed from: b */
    public static String m56225b(Double d3) {
        if (AbstractC34132o.m107858C(d3, false)) {
            return ((DecimalFormat) f76112i.get()).format(d3);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m56226a(String str) {
        return (String) this.f76113a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m56227c(String str, String str2) {
        if (this.f76118f) {
            ConcurrentHashMap concurrentHashMap = this.f76113a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m56228d(C20501v c20501v, C20501v c20501v2, C20513q6 c20513q6, C0627i1 c0627i1, String str, EnumC20479g0 enumC20479g0) {
        m56227c("sentry-trace_id", c20501v.toString());
        m56227c("sentry-public_key", c20513q6.retrieveParsedDsn().f77182b);
        m56227c("sentry-release", c20513q6.getRelease());
        m56227c("sentry-environment", c20513q6.getEnvironment());
        if (enumC20479g0 == null || EnumC20479g0.URL.equals(enumC20479g0)) {
            str = null;
        }
        m56227c("sentry-transaction", str);
        if (c20501v2 != null && !C20501v.f76802x.equals(c20501v2)) {
            m56227c("sentry-replay_id", c20501v2.toString());
        }
        m56227c("sentry-org_id", c20513q6.getEffectiveOrgId());
        Double d3 = c0627i1 == null ? null : (Double) c0627i1.f2196c;
        if (this.f76118f) {
            this.f76115c = d3;
        }
        Boolean bool = c0627i1 == null ? null : (Boolean) c0627i1.f2195b;
        m56227c("sentry-sampled", bool == null ? null : bool.toString());
        Double d14 = c0627i1 != null ? (Double) c0627i1.f2197d : null;
        if (this.f76118f) {
            this.f76116d = d14;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C20405k7 m56229e() {
        String strM56226a = m56226a("sentry-trace_id");
        String strM56226a2 = m56226a("sentry-replay_id");
        String strM56226a3 = m56226a("sentry-public_key");
        if (strM56226a == null || strM56226a3 == null) {
            return null;
        }
        C20405k7 c20405k7 = new C20405k7(new C20501v(strM56226a), strM56226a3, m56226a("sentry-release"), m56226a("sentry-environment"), m56226a("sentry-user_id"), m56226a("sentry-transaction"), m56225b(this.f76115c), m56226a("sentry-sampled"), strM56226a2 != null ? new C20501v(strM56226a2) : null, m56225b(this.f76116d));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C20535s c20535sM56711a = this.f76114b.m56711a();
        try {
            for (Map.Entry entry : this.f76113a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!AbstractC20257b.f76083a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            c20535sM56711a.close();
            c20405k7.f76476K = concurrentHashMap;
            return c20405k7;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public C20269c(ConcurrentHashMap concurrentHashMap, Double d3, Double d14, String str, boolean z4, InterfaceC20602v0 interfaceC20602v0) {
        this.f76114b = new C20579a();
        this.f76113a = concurrentHashMap;
        this.f76115c = d3;
        this.f76116d = d14;
        this.f76120h = interfaceC20602v0;
        this.f76117e = str;
        this.f76118f = true;
        this.f76119g = z4;
    }
}
