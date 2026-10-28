package io.sentry;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.whoop.service.network.model.UserState;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C20315e implements InterfaceC20348h2, Comparable {

    /* JADX INFO: renamed from: E */
    public String f76286E;

    /* JADX INFO: renamed from: F */
    public ConcurrentHashMap f76287F;

    /* JADX INFO: renamed from: G */
    public String f76288G;

    /* JADX INFO: renamed from: H */
    public String f76289H;

    /* JADX INFO: renamed from: I */
    public EnumC20436n5 f76290I;

    /* JADX INFO: renamed from: J */
    public ConcurrentHashMap f76291J;

    /* JADX INFO: renamed from: w */
    public final Long f76292w;

    /* JADX INFO: renamed from: x */
    public Date f76293x;

    /* JADX INFO: renamed from: y */
    public final Long f76294y;

    /* JADX INFO: renamed from: z */
    public String f76295z;

    public C20315e(Date date) {
        this.f76287F = new ConcurrentHashMap();
        this.f76294y = Long.valueOf(System.nanoTime());
        this.f76293x = date;
        this.f76292w = null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m56467a(C20315e c20315e, C20315e c20315e2) {
        return c20315e.m56469b().getTime() == c20315e2.m56469b().getTime() && AbstractC29125c.m88542s(c20315e.f76295z, c20315e2.f76295z) && AbstractC29125c.m88542s(c20315e.f76286E, c20315e2.f76286E) && AbstractC29125c.m88542s(c20315e.f76288G, c20315e2.f76288G) && AbstractC29125c.m88542s(c20315e.f76289H, c20315e2.f76289H) && c20315e.f76290I == c20315e2.f76290I;
    }

    /* JADX INFO: renamed from: d */
    public static C20315e m56468d(String str, String str2, String str3, String str4, Map map) {
        C20315e c20315e = new C20315e();
        c20315e.f76286E = UserState.Sources.USER;
        c20315e.f76288G = "ui.".concat(str);
        if (str2 != null) {
            c20315e.m56470c(str2, "view.id");
        }
        if (str3 != null) {
            c20315e.m56470c(str3, "view.class");
        }
        if (str4 != null) {
            c20315e.m56470c(str4, "view.tag");
        }
        for (Map.Entry entry : map.entrySet()) {
            c20315e.f76287F.put((String) entry.getKey(), entry.getValue());
        }
        c20315e.f76290I = EnumC20436n5.INFO;
        return c20315e;
    }

    /* JADX INFO: renamed from: b */
    public final Date m56469b() {
        Date date = this.f76293x;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l7 = this.f76292w;
        if (l7 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateM60660P = AbstractC21598x.m60660P(l7.longValue());
        this.f76293x = dateM60660P;
        return dateM60660P;
    }

    /* JADX INFO: renamed from: c */
    public final void m56470c(Object obj, String str) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f76287F.remove(str);
        } else {
            this.f76287F.put(str, obj);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f76294y.compareTo(((C20315e) obj).f76294y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20315e.class != obj.getClass()) {
            return false;
        }
        C20315e c20315e = (C20315e) obj;
        if ("http".equals(this.f76286E)) {
            return m56467a(this, c20315e) && AbstractC29125c.m88542s(this.f76287F.get("status_code"), c20315e.f76287F.get("status_code")) && AbstractC29125c.m88542s(this.f76287F.get(QueryParams.URL), c20315e.f76287F.get(QueryParams.URL)) && AbstractC29125c.m88542s(this.f76287F.get("method"), c20315e.f76287F.get("method")) && AbstractC29125c.m88542s(this.f76287F.get("http.fragment"), c20315e.f76287F.get("http.fragment")) && AbstractC29125c.m88542s(this.f76287F.get("http.query"), c20315e.f76287F.get("http.query"));
        }
        return m56467a(this, c20315e);
    }

    public final int hashCode() {
        return "http".equals(this.f76286E) ? Arrays.hashCode(new Object[]{Long.valueOf(m56469b().getTime()), this.f76295z, this.f76286E, this.f76288G, this.f76289H, this.f76290I, this.f76287F.get("status_code"), this.f76287F.get(QueryParams.URL), this.f76287F.get("method"), this.f76287F.get("http.fragment"), this.f76287F.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(m56469b().getTime()), this.f76295z, this.f76286E, this.f76288G, this.f76289H, this.f76290I});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, m56469b());
        if (this.f76295z != null) {
            c37199o.m119207K("message");
            c37199o.m119222b0(this.f76295z);
        }
        if (this.f76286E != null) {
            c37199o.m119207K("type");
            c37199o.m119222b0(this.f76286E);
        }
        c37199o.m119207K("data");
        c37199o.m119219Y(interfaceC20602v0, this.f76287F);
        if (this.f76288G != null) {
            c37199o.m119207K("category");
            c37199o.m119222b0(this.f76288G);
        }
        if (this.f76289H != null) {
            c37199o.m119207K(AnalyticsRequestV2.HEADER_ORIGIN);
            c37199o.m119222b0(this.f76289H);
        }
        if (this.f76290I != null) {
            c37199o.m119207K("level");
            c37199o.m119219Y(interfaceC20602v0, this.f76290I);
        }
        ConcurrentHashMap concurrentHashMap = this.f76291J;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76291J, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }

    public C20315e(long j7) {
        this.f76287F = new ConcurrentHashMap();
        this.f76294y = Long.valueOf(System.nanoTime());
        this.f76292w = Long.valueOf(j7);
        this.f76293x = null;
    }

    public C20315e(C20315e c20315e) {
        this.f76287F = new ConcurrentHashMap();
        this.f76294y = Long.valueOf(System.nanoTime());
        this.f76293x = c20315e.f76293x;
        this.f76292w = c20315e.f76292w;
        this.f76295z = c20315e.f76295z;
        this.f76286E = c20315e.f76286E;
        this.f76288G = c20315e.f76288G;
        this.f76289H = c20315e.f76289H;
        ConcurrentHashMap concurrentHashMapM34553B = AbstractC12350b.m34553B(c20315e.f76287F);
        if (concurrentHashMapM34553B != null) {
            this.f76287F = concurrentHashMapM34553B;
        }
        this.f76291J = AbstractC12350b.m34553B(c20315e.f76291J);
        this.f76290I = c20315e.f76290I;
    }

    public C20315e() {
        this(System.currentTimeMillis());
    }
}
