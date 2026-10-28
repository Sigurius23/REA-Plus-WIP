package io.sentry.protocol;

import io.sentry.C20323e7;
import io.sentry.C20510q3;
import io.sentry.C20535s;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.C20579a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import p098dt.AbstractC12350b;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.protocol.c */
/* JADX INFO: loaded from: classes5.dex */
public class C20470c implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final ConcurrentHashMap f76618w = new ConcurrentHashMap();

    /* JADX INFO: renamed from: x */
    public final C20579a f76619x = new C20579a();

    public C20470c() {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo56535a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f76618w.containsKey(obj);
    }

    /* JADX INFO: renamed from: b */
    public Set mo56536b() {
        return this.f76618w.entrySet();
    }

    /* JADX INFO: renamed from: c */
    public Object mo56537c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f76618w.get(obj);
    }

    /* JADX INFO: renamed from: d */
    public C20466a mo56538d() {
        return (C20466a) m56653w(C20466a.class, "app");
    }

    /* JADX INFO: renamed from: e */
    public C20476f mo56539e() {
        return (C20476f) m56653w(C20476f.class, "device");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C20470c)) {
            return false;
        }
        return this.f76618w.equals(((C20470c) obj).f76618w);
    }

    /* JADX INFO: renamed from: f */
    public C20482i mo56540f() {
        return (C20482i) m56653w(C20482i.class, "flags");
    }

    /* JADX INFO: renamed from: g */
    public C20492p mo56541g() {
        return (C20492p) m56653w(C20492p.class, "os");
    }

    /* JADX INFO: renamed from: h */
    public C20503x mo56542h() {
        return (C20503x) m56653w(C20503x.class, "runtime");
    }

    public final int hashCode() {
        return this.f76618w.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public C20323e7 mo56543i() {
        return (C20323e7) m56653w(C20323e7.class, "trace");
    }

    /* JADX INFO: renamed from: j */
    public Enumeration mo56544j() {
        return this.f76618w.keys();
    }

    /* JADX INFO: renamed from: k */
    public Object mo56545k(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f76618w;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    /* JADX INFO: renamed from: l */
    public void mo56546l(C20470c c20470c) {
        if (c20470c == null) {
            return;
        }
        this.f76618w.putAll(c20470c.f76618w);
    }

    /* JADX INFO: renamed from: m */
    public void mo56547m(C20466a c20466a) {
        mo56545k(c20466a, "app");
    }

    /* JADX INFO: renamed from: n */
    public void mo56548n(C20468b c20468b) {
        mo56545k(c20468b, "browser");
    }

    /* JADX INFO: renamed from: o */
    public void mo56549o(C20476f c20476f) {
        mo56545k(c20476f, "device");
    }

    /* JADX INFO: renamed from: p */
    public void mo56550p(C20482i c20482i) {
        mo56545k(c20482i, "flags");
    }

    /* JADX INFO: renamed from: q */
    public void mo56551q(C20488l c20488l) {
        mo56545k(c20488l, "gpu");
    }

    /* JADX INFO: renamed from: r */
    public void mo56552r(C20492p c20492p) {
        mo56545k(c20492p, "os");
    }

    /* JADX INFO: renamed from: s */
    public void mo56553s(C20497r c20497r) {
        C20535s c20535sM56711a = this.f76619x.m56711a();
        try {
            mo56545k(c20497r, "response");
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        ArrayList<String> list = Collections.list(mo56544j());
        Collections.sort(list);
        for (String str : list) {
            Object objMo56537c = mo56537c(str);
            if (objMo56537c != null) {
                c37199o.m119207K(str);
                c37199o.m119219Y(interfaceC20602v0, objMo56537c);
            }
        }
        c37199o.m119200C();
    }

    /* JADX INFO: renamed from: t */
    public void mo56554t(C20503x c20503x) {
        mo56545k(c20503x, "runtime");
    }

    /* JADX INFO: renamed from: u */
    public void mo56555u(C20475e0 c20475e0) {
        mo56545k(c20475e0, "spring");
    }

    /* JADX INFO: renamed from: v */
    public void mo56556v(C20323e7 c20323e7) {
        AbstractC29125c.m88510S(c20323e7, "traceContext is required");
        mo56545k(c20323e7, "trace");
    }

    /* JADX INFO: renamed from: w */
    public final Object m56653w(Class cls, String str) {
        Object objMo56537c = mo56537c(str);
        if (cls.isInstance(objMo56537c)) {
            return cls.cast(objMo56537c);
        }
        return null;
    }

    public C20470c(C20470c c20470c) {
        for (Map.Entry entry : c20470c.mo56536b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C20466a)) {
                    C20466a c20466a = (C20466a) value;
                    C20466a c20466a2 = new C20466a();
                    c20466a2.f76598G = c20466a.f76598G;
                    c20466a2.f76606w = c20466a.f76606w;
                    c20466a2.f76596E = c20466a.f76596E;
                    c20466a2.f76607x = c20466a.f76607x;
                    c20466a2.f76597F = c20466a.f76597F;
                    c20466a2.f76609z = c20466a.f76609z;
                    c20466a2.f76608y = c20466a.f76608y;
                    c20466a2.f76599H = AbstractC12350b.m34553B(c20466a.f76599H);
                    c20466a2.f76602K = c20466a.f76602K;
                    List list = c20466a.f76600I;
                    c20466a2.f76600I = list != null ? new ArrayList(list) : null;
                    c20466a2.f76601J = c20466a.f76601J;
                    c20466a2.f76603L = c20466a.f76603L;
                    c20466a2.f76604M = c20466a.f76604M;
                    c20466a2.f76605N = AbstractC12350b.m34553B(c20466a.f76605N);
                    mo56547m(c20466a2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof C20468b)) {
                    C20468b c20468b = (C20468b) value;
                    C20468b c20468b2 = new C20468b();
                    c20468b2.f76610w = c20468b.f76610w;
                    c20468b2.f76611x = c20468b.f76611x;
                    c20468b2.f76612y = AbstractC12350b.m34553B(c20468b.f76612y);
                    mo56548n(c20468b2);
                } else if ("device".equals(entry.getKey()) && (value instanceof C20476f)) {
                    C20476f c20476f = (C20476f) value;
                    C20476f c20476f2 = new C20476f();
                    c20476f2.f76674w = c20476f.f76674w;
                    c20476f2.f76675x = c20476f.f76675x;
                    c20476f2.f76676y = c20476f.f76676y;
                    c20476f2.f76677z = c20476f.f76677z;
                    c20476f2.f76643E = c20476f.f76643E;
                    c20476f2.f76644F = c20476f.f76644F;
                    c20476f2.f76647I = c20476f.f76647I;
                    c20476f2.f76648J = c20476f.f76648J;
                    c20476f2.f76649K = c20476f.f76649K;
                    c20476f2.f76650L = c20476f.f76650L;
                    c20476f2.f76651M = c20476f.f76651M;
                    c20476f2.f76652N = c20476f.f76652N;
                    c20476f2.f76653O = c20476f.f76653O;
                    c20476f2.f76654P = c20476f.f76654P;
                    c20476f2.f76655Q = c20476f.f76655Q;
                    c20476f2.f76656R = c20476f.f76656R;
                    c20476f2.f76657S = c20476f.f76657S;
                    c20476f2.f76658T = c20476f.f76658T;
                    c20476f2.f76659U = c20476f.f76659U;
                    c20476f2.f76660V = c20476f.f76660V;
                    c20476f2.f76661W = c20476f.f76661W;
                    c20476f2.f76662X = c20476f.f76662X;
                    c20476f2.f76663Y = c20476f.f76663Y;
                    c20476f2.f76665a0 = c20476f.f76665a0;
                    c20476f2.f76667c0 = c20476f.f76667c0;
                    c20476f2.f76668d0 = c20476f.f76668d0;
                    c20476f2.f76646H = c20476f.f76646H;
                    String[] strArr = c20476f.f76645G;
                    c20476f2.f76645G = strArr != null ? (String[]) strArr.clone() : null;
                    c20476f2.f76666b0 = c20476f.f76666b0;
                    TimeZone timeZone = c20476f.f76664Z;
                    c20476f2.f76664Z = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    c20476f2.f76669e0 = c20476f.f76669e0;
                    c20476f2.f76670f0 = c20476f.f76670f0;
                    c20476f2.f76671g0 = c20476f.f76671g0;
                    c20476f2.f76672h0 = c20476f.f76672h0;
                    c20476f2.f76673i0 = AbstractC12350b.m34553B(c20476f.f76673i0);
                    mo56549o(c20476f2);
                } else if ("os".equals(entry.getKey()) && (value instanceof C20492p)) {
                    C20492p c20492p = (C20492p) value;
                    C20492p c20492p2 = new C20492p();
                    c20492p2.f76751w = c20492p.f76751w;
                    c20492p2.f76752x = c20492p.f76752x;
                    c20492p2.f76753y = c20492p.f76753y;
                    c20492p2.f76754z = c20492p.f76754z;
                    c20492p2.f76748E = c20492p.f76748E;
                    c20492p2.f76749F = c20492p.f76749F;
                    c20492p2.f76750G = AbstractC12350b.m34553B(c20492p.f76750G);
                    mo56552r(c20492p2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof C20503x)) {
                    C20503x c20503x = (C20503x) value;
                    C20503x c20503x2 = new C20503x();
                    c20503x2.f76807w = c20503x.f76807w;
                    c20503x2.f76808x = c20503x.f76808x;
                    c20503x2.f76809y = c20503x.f76809y;
                    c20503x2.f76810z = AbstractC12350b.m34553B(c20503x.f76810z);
                    mo56554t(c20503x2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof C20484j)) {
                    C20484j c20484j = (C20484j) value;
                    C20484j c20484j2 = new C20484j();
                    c20484j2.f76697w = c20484j.f76697w;
                    c20484j2.f76698x = c20484j.f76698x;
                    c20484j2.f76699y = c20484j.f76699y;
                    c20484j2.f76700z = c20484j.f76700z;
                    c20484j2.f76694E = c20484j.f76694E;
                    c20484j2.f76695F = c20484j.f76695F;
                    c20484j2.f76696G = AbstractC12350b.m34553B(c20484j.f76696G);
                    mo56545k(c20484j2, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C20488l)) {
                    C20488l c20488l = (C20488l) value;
                    C20488l c20488l2 = new C20488l();
                    c20488l2.f76726w = c20488l.f76726w;
                    c20488l2.f76727x = c20488l.f76727x;
                    c20488l2.f76728y = c20488l.f76728y;
                    c20488l2.f76729z = c20488l.f76729z;
                    c20488l2.f76720E = c20488l.f76720E;
                    c20488l2.f76721F = c20488l.f76721F;
                    c20488l2.f76722G = c20488l.f76722G;
                    c20488l2.f76723H = c20488l.f76723H;
                    c20488l2.f76724I = c20488l.f76724I;
                    c20488l2.f76725J = AbstractC12350b.m34553B(c20488l.f76725J);
                    mo56551q(c20488l2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof C20323e7)) {
                    mo56556v(new C20323e7((C20323e7) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof C20510q3)) {
                    C20510q3 c20510q3 = (C20510q3) value;
                    C20510q3 c20510q4 = new C20510q3();
                    c20510q4.f76851w = c20510q3.f76851w;
                    ConcurrentHashMap concurrentHashMapM34553B = AbstractC12350b.m34553B(c20510q3.f76852x);
                    if (concurrentHashMapM34553B != null) {
                        c20510q4.f76852x = concurrentHashMapM34553B;
                    }
                    mo56545k(c20510q4, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof C20497r)) {
                    mo56553s(new C20497r((C20497r) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof C20475e0)) {
                    mo56555u(new C20475e0((C20475e0) value));
                } else {
                    mo56545k(value, (String) entry.getKey());
                }
            }
        }
    }
}
