package io.sentry;

import io.sentry.android.core.C20149q1;
import io.sentry.util.C20579a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC11266d;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C20514r implements InterfaceC20406l {

    /* JADX INFO: renamed from: d */
    public final ArrayList f76865d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f76866e;

    /* JADX INFO: renamed from: f */
    public final boolean f76867f;

    /* JADX INFO: renamed from: g */
    public final C20513q6 f76868g;

    /* JADX INFO: renamed from: a */
    public final C20579a f76862a = new C20579a();

    /* JADX INFO: renamed from: b */
    public volatile Timer f76863b = null;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f76864c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f76869h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public long f76870i = 0;

    public C20514r(C20513q6 c20513q6) {
        boolean z4 = false;
        AbstractC29125c.m88510S(c20513q6, "The options object is required.");
        this.f76868g = c20513q6;
        this.f76865d = new ArrayList();
        this.f76866e = new ArrayList();
        for (InterfaceC20623x0 interfaceC20623x0 : c20513q6.getPerformanceCollectors()) {
            if (interfaceC20623x0 instanceof InterfaceC20639z0) {
                this.f76865d.add((InterfaceC20639z0) interfaceC20623x0);
            }
            if (interfaceC20623x0 instanceof InterfaceC20631y0) {
                this.f76866e.add((InterfaceC20631y0) interfaceC20623x0);
            }
        }
        if (this.f76865d.isEmpty() && this.f76866e.isEmpty()) {
            z4 = true;
        }
        this.f76867f = z4;
    }

    @Override // io.sentry.InterfaceC20406l
    /* JADX INFO: renamed from: a */
    public final void mo56615a(C20314d7 c20314d7) {
        Iterator it = this.f76866e.iterator();
        while (it.hasNext()) {
            ((C20149q1) ((InterfaceC20631y0) it.next())).m56052e(c20314d7);
        }
    }

    @Override // io.sentry.InterfaceC20406l
    /* JADX INFO: renamed from: b */
    public final List mo56616b(String str) {
        ConcurrentHashMap concurrentHashMap = this.f76864c;
        C20506q c20506q = (C20506q) concurrentHashMap.remove(str);
        this.f76868g.getLogger().mo16066m(EnumC20436n5.DEBUG, AbstractC11266d.m30461o("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (c20506q != null) {
            return c20506q.f76846a;
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20406l
    /* JADX INFO: renamed from: c */
    public final void mo56617c(C20314d7 c20314d7) {
        Iterator it = this.f76866e.iterator();
        while (it.hasNext()) {
            ((C20149q1) ((InterfaceC20631y0) it.next())).m56053f(c20314d7);
        }
    }

    @Override // io.sentry.InterfaceC20406l
    public final void close() {
        this.f76868g.getLogger().mo16066m(EnumC20436n5.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f76864c.clear();
        Iterator it = this.f76866e.iterator();
        while (it.hasNext()) {
            ((C20149q1) ((InterfaceC20631y0) it.next())).m56051d();
        }
        if (this.f76869h.getAndSet(false)) {
            C20535s c20535sM56711a = this.f76862a.m56711a();
            try {
                if (this.f76863b != null) {
                    this.f76863b.cancel();
                    this.f76863b = null;
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
    }

    @Override // io.sentry.InterfaceC20406l
    /* JADX INFO: renamed from: d */
    public final void mo56618d(C20645z6 c20645z6) {
        if (this.f76867f) {
            this.f76868g.getLogger().mo16066m(EnumC20436n5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f76866e.iterator();
        while (it.hasNext()) {
            ((C20149q1) ((InterfaceC20631y0) it.next())).m56053f(c20645z6);
        }
        String string = c20645z6.f77201a.toString();
        ConcurrentHashMap concurrentHashMap = this.f76864c;
        if (!concurrentHashMap.containsKey(string)) {
            concurrentHashMap.put(string, new C20506q(this, c20645z6));
        }
        mo56620f(string);
    }

    @Override // io.sentry.InterfaceC20406l
    /* JADX INFO: renamed from: e */
    public final List mo56619e(InterfaceC20432n1 interfaceC20432n1) {
        this.f76868g.getLogger().mo16066m(EnumC20436n5.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC20432n1.getName(), interfaceC20432n1.mo56462t().f76321w.toString());
        Iterator it = this.f76866e.iterator();
        while (it.hasNext()) {
            ((C20149q1) ((InterfaceC20631y0) it.next())).m56052e(interfaceC20432n1);
        }
        return mo56616b(interfaceC20432n1.mo56512h().toString());
    }

    @Override // io.sentry.InterfaceC20406l
    /* JADX INFO: renamed from: f */
    public final void mo56620f(String str) {
        if (this.f76867f) {
            this.f76868g.getLogger().mo16066m(EnumC20436n5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f76864c.containsKey(str)) {
            this.f76864c.put(str, new C20506q(this, null));
        }
        if (this.f76869h.getAndSet(true)) {
            return;
        }
        C20535s c20535sM56711a = this.f76862a.m56711a();
        try {
            if (this.f76863b == null) {
                this.f76863b = new Timer(true);
            }
            this.f76863b.schedule(new C20440o(this, 0), 0L);
            this.f76863b.scheduleAtFixedRate(new C20453p(this, new ArrayList()), 100L, 100L);
            c20535sM56711a.close();
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
}
