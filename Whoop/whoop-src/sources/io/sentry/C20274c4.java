package io.sentry;

import com.whoop.service.network.model.UserState;
import e93.AbstractC12889b;
import io.sentry.featureflags.C20333a;
import io.sentry.featureflags.C20335c;
import io.sentry.featureflags.InterfaceC20334b;
import io.sentry.protocol.C20466a;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20482i;
import io.sentry.protocol.C20496q;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20579a;
import io.sentry.util.C20586h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import live.hms.video.utils.HMSConstantsKt;
import p000.AbstractC30802r;
import p005a3.C0237p;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p581we.C37199o;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.sentry.c4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20274c4 implements InterfaceC20259b1 {

    /* JADX INFO: renamed from: a */
    public InterfaceC20432n1 f76123a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f76124b;

    /* JADX INFO: renamed from: c */
    public C20481h0 f76125c;

    /* JADX INFO: renamed from: d */
    public String f76126d;

    /* JADX INFO: renamed from: e */
    public C20496q f76127e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f76128f;

    /* JADX INFO: renamed from: g */
    public volatile Object f76129g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f76130h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f76131i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f76132j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f76133k;

    /* JADX INFO: renamed from: l */
    public volatile C20513q6 f76134l;

    /* JADX INFO: renamed from: m */
    public volatile C20265b7 f76135m;

    /* JADX INFO: renamed from: n */
    public final C20579a f76136n;

    /* JADX INFO: renamed from: o */
    public final C20579a f76137o;

    /* JADX INFO: renamed from: p */
    public final C20579a f76138p;

    /* JADX INFO: renamed from: q */
    public final C20470c f76139q;

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArrayList f76140r;

    /* JADX INFO: renamed from: s */
    public C0237p f76141s;

    /* JADX INFO: renamed from: t */
    public C20501v f76142t;

    /* JADX INFO: renamed from: u */
    public InterfaceC20338g1 f76143u;

    /* JADX INFO: renamed from: v */
    public final Map f76144v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC20334b f76145w;

    public C20274c4(C20513q6 c20513q6) {
        InterfaceC20334b interfaceC20334b;
        this.f76124b = new WeakReference(null);
        this.f76128f = new ArrayList();
        this.f76130h = new ConcurrentHashMap();
        this.f76131i = new ConcurrentHashMap();
        this.f76132j = new ConcurrentHashMap();
        this.f76133k = new CopyOnWriteArrayList();
        this.f76136n = new C20579a();
        this.f76137o = new C20579a();
        this.f76138p = new C20579a();
        this.f76139q = new C20470c();
        this.f76140r = new CopyOnWriteArrayList();
        this.f76142t = C20501v.f76802x;
        this.f76143u = C20044a3.f75194w;
        this.f76144v = Collections.synchronizedMap(new WeakHashMap());
        AbstractC29125c.m88510S(c20513q6, "SentryOptions is required.");
        this.f76134l = c20513q6;
        this.f76129g = m56240g(this.f76134l.getMaxBreadcrumbs());
        if (c20513q6.getMaxFeatureFlags() > 0) {
            C20333a c20333a = new C20333a();
            new C20579a();
            c20333a.f76340w = new CopyOnWriteArrayList();
            interfaceC20334b = c20333a;
        } else {
            interfaceC20334b = C20335c.f76341w;
        }
        this.f76145w = interfaceC20334b;
        this.f76141s = new C0237p(9);
    }

    /* JADX INFO: renamed from: g */
    public static Queue m56240g(int i13) {
        return i13 > 0 ? new C20396j7(new C20336g(i13)) : new C20622x();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: A */
    public final String mo56179A() {
        return this.f76126d;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: B */
    public final void mo56180B(InterfaceC20432n1 interfaceC20432n1) {
        C20535s c20535sM56711a = this.f76137o.m56711a();
        try {
            this.f76123a = interfaceC20432n1;
            for (InterfaceC20271c1 interfaceC20271c1 : this.f76134l.getScopeObservers()) {
                if (interfaceC20432n1 != null) {
                    interfaceC20271c1.mo56233n(interfaceC20432n1.getName());
                    interfaceC20271c1.mo56091j(interfaceC20432n1.mo56462t(), this);
                } else {
                    interfaceC20271c1.mo56233n(null);
                    interfaceC20271c1.mo56091j(null, this);
                }
            }
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

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: C */
    public final List mo56181C() {
        return this.f76128f;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: D */
    public final String mo56182D() {
        InterfaceC20432n1 interfaceC20432n1 = this.f76123a;
        if (interfaceC20432n1 != null) {
            return interfaceC20432n1.getName();
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: E */
    public final void mo56183E() {
        C20535s c20535sM56711a = this.f76137o.m56711a();
        try {
            this.f76123a = null;
            c20535sM56711a.close();
            for (InterfaceC20271c1 interfaceC20271c1 : this.f76134l.getScopeObservers()) {
                interfaceC20271c1.mo56233n(null);
                interfaceC20271c1.mo56091j(null, this);
            }
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: F */
    public final InterfaceC20334b mo56184F() {
        return this.f76145w;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: G */
    public final C0237p mo56185G() {
        return this.f76141s;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: H */
    public final void mo56186H(String str) {
        this.f76126d = str;
        C20470c c20470c = this.f76139q;
        C20466a c20466aMo56538d = c20470c.mo56538d();
        if (c20466aMo56538d == null) {
            c20466aMo56538d = new C20466a();
            c20470c.mo56547m(c20466aMo56538d);
        }
        if (str == null) {
            c20466aMo56538d.f76600I = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c20466aMo56538d.f76600I = arrayList;
        }
        Iterator<InterfaceC20271c1> it = this.f76134l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo56231k(c20470c);
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: I */
    public final InterfaceC20338g1 mo56187I() {
        return this.f76143u;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: J */
    public final void mo56188J(Object obj, String str) {
        if (str == null) {
            return;
        }
        this.f76139q.mo56545k(obj, str);
        Iterator<InterfaceC20271c1> it = this.f76134l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo56231k(this.f76139q);
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: K */
    public final List mo56189K() {
        return new CopyOnWriteArrayList(this.f76140r);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: L */
    public final void mo56190L(C20321e5 c20321e5) {
        InterfaceC20408l1 interfaceC20408l1;
        if (!this.f76134l.isTracingEnabled() || c20321e5.m56670a() == null) {
            return;
        }
        Map map = this.f76144v;
        Throwable thM56670a = c20321e5.m56670a();
        AbstractC29125c.m88510S(thM56670a, "throwable cannot be null");
        while (thM56670a.getCause() != null && thM56670a.getCause() != thM56670a) {
            thM56670a = thM56670a.getCause();
        }
        C20586h c20586h = (C20586h) map.get(thM56670a);
        if (c20586h != null) {
            WeakReference weakReference = c20586h.f77088a;
            if (c20321e5.f76884x.mo56543i() == null && (interfaceC20408l1 = (InterfaceC20408l1) weakReference.get()) != null) {
                c20321e5.f76884x.mo56556v(interfaceC20408l1.mo56462t());
            }
            String str = (String) c20586h.f77089b;
            if (c20321e5.f76306V != null || str == null) {
                return;
            }
            c20321e5.f76306V = str;
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: M */
    public final C0237p mo56191M(InterfaceC20642z3 interfaceC20642z3) {
        C20535s c20535sM56711a = this.f76138p.m56711a();
        try {
            interfaceC20642z3.mo11180c(this.f76141s);
            C0237p c0237p = new C0237p(this.f76141s);
            c20535sM56711a.close();
            return c0237p;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: N */
    public final void mo56192N(InterfaceC20262b4 interfaceC20262b4) {
        C20535s c20535sM56711a = this.f76137o.m56711a();
        try {
            interfaceC20262b4.mo8622g(this.f76123a);
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

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: O */
    public final void mo56193O(C20501v c20501v) {
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: P */
    public final List mo56194P() {
        return AbstractC12889b.m36280j0(this.f76133k);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: a */
    public final Map mo56195a() {
        return AbstractC12350b.m34553B(this.f76130h);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: b */
    public final void mo56196b(String str) {
        if (str == null) {
            return;
        }
        this.f76130h.remove(str);
        for (InterfaceC20271c1 interfaceC20271c1 : this.f76134l.getScopeObservers()) {
            interfaceC20271c1.mo56087b(str);
            interfaceC20271c1.mo56232m(this.f76130h);
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: c */
    public final void mo56197c(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            mo56196b(str);
            return;
        }
        this.f76130h.put(str, str2);
        for (InterfaceC20271c1 interfaceC20271c1 : this.f76134l.getScopeObservers()) {
            interfaceC20271c1.mo56088c(str, str2);
            interfaceC20271c1.mo56232m(this.f76130h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    @Override // io.sentry.InterfaceC20259b1
    public final void clear() {
        this.f76125c = null;
        this.f76127e = null;
        this.f76126d = null;
        this.f76128f.clear();
        this.f76129g.clear();
        Iterator<InterfaceC20271c1> it = this.f76134l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo56230i(this.f76129g);
        }
        this.f76130h.clear();
        this.f76131i.clear();
        this.f76132j.clear();
        this.f76133k.clear();
        mo56183E();
        this.f76140r.clear();
        Iterator<InterfaceC20271c1> it3 = this.f76134l.getScopeObservers().iterator();
        while (it3.hasNext()) {
            it3.next().mo56092l();
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: clone */
    public final InterfaceC20259b1 m134238clone() {
        return new C20274c4(this);
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: d */
    public final C20496q mo56198d() {
        return this.f76127e;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: e */
    public final void mo56199e(C20481h0 c20481h0) {
        this.f76125c = c20481h0;
        Iterator<InterfaceC20271c1> it = this.f76134l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo56089e(c20481h0);
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: f */
    public final InterfaceC20408l1 mo56200f() {
        InterfaceC20408l1 interfaceC20408l1Mo56514p;
        InterfaceC20408l1 interfaceC20408l1 = (InterfaceC20408l1) this.f76124b.get();
        if (interfaceC20408l1 != null) {
            return interfaceC20408l1;
        }
        InterfaceC20432n1 interfaceC20432n1 = this.f76123a;
        return (interfaceC20432n1 == null || (interfaceC20408l1Mo56514p = interfaceC20432n1.mo56514p()) == null) ? interfaceC20432n1 : interfaceC20408l1Mo56514p;
    }

    @Override // io.sentry.InterfaceC20259b1
    public final Map getExtras() {
        return this.f76132j;
    }

    @Override // io.sentry.InterfaceC20259b1
    public final EnumC20436n5 getLevel() {
        return null;
    }

    @Override // io.sentry.InterfaceC20259b1
    public final C20481h0 getUser() {
        return this.f76125c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: i */
    public final void mo56201i(C20315e c20315e, C20337g0 c20337g0) {
        if (c20315e == null || (this.f76129g instanceof C20622x)) {
            return;
        }
        if (c20337g0 == null) {
            c20337g0 = new C20337g0();
        }
        InterfaceC20264b6 beforeBreadcrumb = this.f76134l.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            try {
                c20315e = ((C37199o) beforeBreadcrumb).m119201D(c20315e, c20337g0);
            } catch (Throwable th3) {
                this.f76134l.getLogger().mo16060j(EnumC20436n5.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th3);
                if (th3.getMessage() != null) {
                    c20315e.m56470c(th3.getMessage(), "sentry:message");
                }
            }
        }
        if (c20315e == null) {
            this.f76134l.getLogger().mo16066m(EnumC20436n5.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.f76129g.add(c20315e);
        for (InterfaceC20271c1 interfaceC20271c1 : this.f76134l.getScopeObservers()) {
            interfaceC20271c1.mo56090h(c20315e);
            interfaceC20271c1.mo56230i(this.f76129g);
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: l */
    public final C20513q6 mo56202l() {
        return this.f76134l;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: m */
    public final InterfaceC20432n1 mo56203m() {
        return this.f76123a;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: o */
    public final C20265b7 mo56204o() {
        C20535s c20535sM56711a = this.f76136n.m56711a();
        try {
            C20265b7 c20265b7 = null;
            if (this.f76135m != null) {
                C20265b7 c20265b8 = this.f76135m;
                c20265b8.getClass();
                c20265b8.m56220b(AbstractC21598x.m60659O());
                this.f76134l.getContinuousProfiler().mo55949c();
                C20265b7 c20265b7Clone = this.f76135m.clone();
                this.f76135m = null;
                c20265b7 = c20265b7Clone;
            }
            c20535sM56711a.close();
            return c20265b7;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: p */
    public final void mo56205p(Throwable th3, C20314d7 c20314d7, String str) {
        AbstractC29125c.m88510S(th3, "throwable is required");
        AbstractC29125c.m88510S(str, "transactionName is required");
        while (th3.getCause() != null && th3.getCause() != th3) {
            th3 = th3.getCause();
        }
        Map map = this.f76144v;
        if (map.containsKey(th3)) {
            return;
        }
        map.put(th3, new C20586h(new WeakReference(c20314d7), str));
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: q */
    public final C20265b7 mo56206q() {
        return this.f76135m;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: r */
    public final C20482i mo56207r() {
        return this.f76145w.mo1873r();
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: s */
    public final C20501v mo56208s() {
        return this.f76142t;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: t */
    public final void mo56209t(C20501v c20501v) {
        this.f76142t = c20501v;
        Iterator<InterfaceC20271c1> it = this.f76134l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo56234t(c20501v);
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: u */
    public final C37199o mo56210u() {
        C20535s c20535sM56711a = this.f76136n.m56711a();
        try {
            if (this.f76135m != null) {
                C20265b7 c20265b7 = this.f76135m;
                c20265b7.getClass();
                c20265b7.m56220b(AbstractC21598x.m60659O());
                this.f76134l.getContinuousProfiler().mo55949c();
            }
            C20265b7 c20265b8 = this.f76135m;
            C37199o c37199o = null;
            if (this.f76134l.getRelease() != null) {
                String distinctId = this.f76134l.getDistinctId();
                C20481h0 c20481h0 = this.f76125c;
                this.f76135m = new C20265b7(EnumC20048a7.Ok, AbstractC21598x.m60659O(), AbstractC21598x.m60659O(), 0, distinctId, AbstractC30060g.m92131v(), Boolean.TRUE, null, null, c20481h0 != null ? c20481h0.f76690z : null, null, this.f76134l.getEnvironment(), this.f76134l.getRelease(), null);
                c37199o = new C37199o(this.f76135m.clone(), c20265b8 != null ? c20265b8.clone() : null, false);
            } else {
                this.f76134l.getLogger().mo16066m(EnumC20436n5.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            c20535sM56711a.close();
            return c37199o;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: v */
    public final Queue mo56211v() {
        return this.f76129g;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: w */
    public final C20265b7 mo56212w(InterfaceC20045a4 interfaceC20045a4) {
        C20535s c20535sM56711a = this.f76136n.m56711a();
        try {
            interfaceC20045a4.mo8618a(this.f76135m);
            C20265b7 c20265b7Clone = this.f76135m != null ? this.f76135m.clone() : null;
            c20535sM56711a.close();
            return c20265b7Clone;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: x */
    public final void mo56213x(C0237p c0237p) {
        this.f76141s = c0237p;
        C20323e7 c20323e7 = new C20323e7((C20501v) c0237p.f812x, (C20353h7) c0237p.f813y, HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, null);
        c20323e7.f76314I = UserState.Sources.AUTO;
        Iterator<InterfaceC20271c1> it = this.f76134l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo56091j(c20323e7, this);
        }
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: y */
    public final List mo56214y() {
        return this.f76133k;
    }

    @Override // io.sentry.InterfaceC20259b1
    /* JADX INFO: renamed from: z */
    public final C20470c mo56215z() {
        return this.f76139q;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m134233clone() {
        return new C20274c4(this);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Collection] */
    public C20274c4(C20274c4 c20274c4) {
        C20481h0 c20481h0;
        C20496q c20496q;
        this.f76124b = new WeakReference(null);
        this.f76128f = new ArrayList();
        this.f76130h = new ConcurrentHashMap();
        this.f76131i = new ConcurrentHashMap();
        this.f76132j = new ConcurrentHashMap();
        this.f76133k = new CopyOnWriteArrayList();
        this.f76136n = new C20579a();
        this.f76137o = new C20579a();
        this.f76138p = new C20579a();
        this.f76139q = new C20470c();
        this.f76140r = new CopyOnWriteArrayList();
        this.f76142t = C20501v.f76802x;
        this.f76143u = C20044a3.f75194w;
        this.f76144v = Collections.synchronizedMap(new WeakHashMap());
        this.f76123a = c20274c4.f76123a;
        this.f76124b = c20274c4.f76124b;
        this.f76135m = c20274c4.f76135m;
        this.f76134l = c20274c4.f76134l;
        this.f76143u = c20274c4.f76143u;
        C20481h0 c20481h1 = c20274c4.f76125c;
        if (c20481h1 != null) {
            c20481h0 = new C20481h0();
            c20481h0.f76687w = c20481h1.f76687w;
            c20481h0.f76689y = c20481h1.f76689y;
            c20481h0.f76688x = c20481h1.f76688x;
            c20481h0.f76690z = c20481h1.f76690z;
            c20481h0.f76683E = c20481h1.f76683E;
            c20481h0.f76684F = c20481h1.f76684F;
            c20481h0.f76685G = AbstractC12350b.m34553B(c20481h1.f76685G);
            c20481h0.f76686H = AbstractC12350b.m34553B(c20481h1.f76686H);
        } else {
            c20481h0 = null;
        }
        this.f76125c = c20481h0;
        this.f76126d = c20274c4.f76126d;
        this.f76142t = c20274c4.f76142t;
        C20496q c20496q2 = c20274c4.f76127e;
        if (c20496q2 != null) {
            c20496q = new C20496q();
            c20496q.f76775w = c20496q2.f76775w;
            c20496q.f76767E = c20496q2.f76767E;
            c20496q.f76776x = c20496q2.f76776x;
            c20496q.f76777y = c20496q2.f76777y;
            c20496q.f76768F = AbstractC12350b.m34553B(c20496q2.f76768F);
            c20496q.f76769G = AbstractC12350b.m34553B(c20496q2.f76769G);
            c20496q.f76771I = AbstractC12350b.m34553B(c20496q2.f76771I);
            c20496q.f76774L = AbstractC12350b.m34553B(c20496q2.f76774L);
            c20496q.f76778z = c20496q2.f76778z;
            c20496q.f76772J = c20496q2.f76772J;
            c20496q.f76770H = c20496q2.f76770H;
            c20496q.f76773K = c20496q2.f76773K;
        } else {
            c20496q = null;
        }
        this.f76127e = c20496q;
        this.f76128f = new ArrayList(c20274c4.f76128f);
        this.f76133k = new CopyOnWriteArrayList(c20274c4.f76133k);
        C20315e[] c20315eArr = (C20315e[]) c20274c4.f76129g.toArray(new C20315e[0]);
        Queue queueM56240g = m56240g(c20274c4.f76134l.getMaxBreadcrumbs());
        for (C20315e c20315e : c20315eArr) {
            queueM56240g.add(new C20315e(c20315e));
        }
        this.f76129g = queueM56240g;
        ConcurrentHashMap concurrentHashMap = c20274c4.f76130h;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f76130h = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = c20274c4.f76131i;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                String str = (String) entry2.getKey();
                AbstractC30802r.m94771t(entry2.getValue());
                concurrentHashMap4.put(str, null);
            }
        }
        this.f76131i = concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5 = c20274c4.f76132j;
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        for (Map.Entry entry3 : concurrentHashMap5.entrySet()) {
            if (entry3 != null) {
                concurrentHashMap6.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        this.f76132j = concurrentHashMap6;
        this.f76139q = new C20470c(c20274c4.f76139q);
        this.f76140r = new CopyOnWriteArrayList(c20274c4.f76140r);
        this.f76145w = c20274c4.f76145w.m134234clone();
        this.f76141s = new C0237p(c20274c4.f76141s);
    }
}
