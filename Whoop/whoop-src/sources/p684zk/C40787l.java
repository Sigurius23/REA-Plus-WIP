package p684zk;

import ad3.C0783z;
import ae3.C0803k;
import android.util.Log;
import bd3.C3130k;
import cl.ExecutorServiceC4794b;
import com.bumptech.glide.C4961c;
import com.bumptech.glide.EnumC4962d;
import io.sentry.android.core.C20067d;
import io.sentry.android.core.util.C20162a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p034bl.C3365e;
import p108e4.AbstractC12682p;
import p474s.C31983m2;
import p586wk.C37330h;
import p586wk.EnumC37323a;
import p586wk.InterfaceC37327e;
import p652yl.C39615a;
import p692zt.C41113q;
import pl.C29342e;
import tl.AbstractC33908g;
import tl.C33903b;
import z63.C40132d;

/* JADX INFO: renamed from: zk.l */
/* JADX INFO: loaded from: classes.dex */
public final class C40787l implements InterfaceC40792q, InterfaceC40794s {

    /* JADX INFO: renamed from: i */
    public static final boolean f175896i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    public final C40798w f175897a;

    /* JADX INFO: renamed from: b */
    public final C39615a f175898b;

    /* JADX INFO: renamed from: c */
    public final C3365e f175899c;

    /* JADX INFO: renamed from: d */
    public final C20067d f175900d;

    /* JADX INFO: renamed from: e */
    public final C3130k f175901e;

    /* JADX INFO: renamed from: f */
    public final C20162a f175902f;

    /* JADX INFO: renamed from: g */
    public final C0803k f175903g;

    /* JADX INFO: renamed from: h */
    public final C41113q f175904h;

    public C40787l(C3365e c3365e, C0783z c0783z, ExecutorServiceC4794b executorServiceC4794b, ExecutorServiceC4794b executorServiceC4794b2, ExecutorServiceC4794b executorServiceC4794b3, ExecutorServiceC4794b executorServiceC4794b4) throws Throwable {
        this.f175899c = c3365e;
        C20162a c20162a = new C20162a(c0783z);
        this.f175902f = c20162a;
        C41113q c41113q = new C41113q(23);
        this.f175904h = c41113q;
        synchronized (this) {
            try {
                try {
                    synchronized (c41113q) {
                        try {
                            c41113q.f177222E = this;
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    }
                    this.f175898b = new C39615a();
                    this.f175897a = new C40798w();
                    this.f175900d = new C20067d(executorServiceC4794b, executorServiceC4794b2, executorServiceC4794b3, executorServiceC4794b4, this, this);
                    this.f175903g = new C0803k(c20162a);
                    this.f175901e = new C3130k();
                    c3365e.f13109d = this;
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m132287c(String str, long j7, C40793r c40793r) {
        StringBuilder sbM35484d = AbstractC12682p.m35484d(str, " in ");
        sbM35484d.append(AbstractC33908g.m107258a(j7));
        sbM35484d.append("ms, key: ");
        sbM35484d.append(c40793r);
        Log.v("Engine", sbM35484d.toString());
    }

    /* JADX INFO: renamed from: f */
    public static void m132288f(InterfaceC40801z interfaceC40801z) {
        if (!(interfaceC40801z instanceof C40795t)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C40795t) interfaceC40801z).m132305e();
    }

    /* JADX INFO: renamed from: a */
    public final C40132d m132289a(C4961c c4961c, Object obj, InterfaceC37327e interfaceC37327e, int i13, int i14, Class cls, Class cls2, EnumC4962d enumC4962d, C40786k c40786k, C33903b c33903b, boolean z4, boolean z13, C37330h c37330h, boolean z14, boolean z15, C29342e c29342e, Executor executor) {
        long jM107259b = f175896i ? AbstractC33908g.m107259b() : 0L;
        this.f175898b.getClass();
        C40793r c40793r = new C40793r(obj, interfaceC37327e, i13, i14, c33903b, cls, cls2, c37330h);
        synchronized (this) {
            try {
                C40795t c40795tM132290b = m132290b(c40793r, z14, jM107259b);
                if (c40795tM132290b == null) {
                    return m132293g(c4961c, obj, interfaceC37327e, i13, i14, cls, cls2, enumC4962d, c40786k, c33903b, z4, z13, c37330h, z14, z15, c29342e, executor, c40793r, jM107259b);
                }
                c29342e.m89341k(c40795tM132290b, EnumC37323a.f159579E);
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C40795t m132290b(C40793r c40793r, boolean z4, long j7) throws Throwable {
        Throwable th3;
        C40795t c40795t;
        Throwable th4;
        C40787l c40787l;
        C40793r c40793r2;
        C40795t c40795t2;
        if (z4) {
            C41113q c41113q = this.f175904h;
            synchronized (c41113q) {
                try {
                    C40772a c40772a = (C40772a) ((HashMap) c41113q.f177225y).get(c40793r);
                    if (c40772a == null) {
                        c40795t = null;
                    } else {
                        c40795t = (C40795t) c40772a.get();
                        if (c40795t == null) {
                            try {
                                c41113q.m133471r(c40772a);
                            } catch (Throwable th5) {
                                th3 = th5;
                                while (true) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                    }
                                    th3 = th6;
                                }
                            }
                        }
                    }
                    if (c40795t != null) {
                        c40795t.m132303b();
                    }
                    if (c40795t != null) {
                        if (f175896i) {
                            m132287c("Loaded resource from active resources", j7, c40793r);
                        }
                        return c40795t;
                    }
                    C3365e c3365e = this.f175899c;
                    synchronized (c3365e) {
                        try {
                            Object objRemove = c3365e.f142085a.remove(c40793r);
                            if (objRemove != null) {
                                try {
                                    c3365e.f142087c -= (long) c3365e.mo9716b(objRemove);
                                } catch (Throwable th7) {
                                    th4 = th7;
                                    while (true) {
                                        try {
                                            throw th4;
                                        } catch (Throwable th8) {
                                            th4 = th8;
                                        }
                                        th4 = th8;
                                    }
                                }
                            }
                            InterfaceC40801z interfaceC40801z = (InterfaceC40801z) objRemove;
                            if (interfaceC40801z == null) {
                                c40787l = this;
                                c40793r2 = c40793r;
                                c40795t2 = null;
                            } else if (interfaceC40801z instanceof C40795t) {
                                c40795t2 = (C40795t) interfaceC40801z;
                                c40787l = this;
                                c40793r2 = c40793r;
                            } else {
                                c40787l = this;
                                c40793r2 = c40793r;
                                c40795t2 = new C40795t(interfaceC40801z, true, true, c40793r2, c40787l);
                            }
                            if (c40795t2 != null) {
                                c40795t2.m132303b();
                                c40787l.f175904h.m133462b(c40793r2, c40795t2);
                            }
                            if (c40795t2 != null) {
                                if (f175896i) {
                                    m132287c("Loaded resource from cache", j7, c40793r2);
                                }
                                return c40795t2;
                            }
                        } catch (Throwable th9) {
                            th4 = th9;
                        }
                    }
                } catch (Throwable th10) {
                    th3 = th10;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m132291d(C40791p c40791p, InterfaceC37327e interfaceC37327e, C40795t c40795t) {
        if (c40795t != null) {
            try {
                if (c40795t.m132304d()) {
                    this.f175904h.m133462b(interfaceC37327e, c40795t);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C40798w c40798w = this.f175897a;
        c40798w.getClass();
        c40791p.getClass();
        HashMap map = (HashMap) c40798w.f175951a;
        if (c40791p.equals(map.get(interfaceC37327e))) {
            map.remove(interfaceC37327e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m132292e(InterfaceC37327e interfaceC37327e, C40795t c40795t) {
        C41113q c41113q = this.f175904h;
        synchronized (c41113q) {
            C40772a c40772a = (C40772a) ((HashMap) c41113q.f177225y).remove(interfaceC37327e);
            if (c40772a != null) {
                c40772a.m132262a();
            }
        }
        if (c40795t.m132304d()) {
        } else {
            this.f175901e.m9002m(c40795t, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C40132d m132293g(C4961c c4961c, Object obj, InterfaceC37327e interfaceC37327e, int i13, int i14, Class cls, Class cls2, EnumC4962d enumC4962d, C40786k c40786k, Map map, boolean z4, boolean z13, C37330h c37330h, boolean z14, boolean z15, C29342e c29342e, Executor executor, C40793r c40793r, long j7) {
        C40798w c40798w = this.f175897a;
        C40791p c40791p = (C40791p) ((HashMap) c40798w.f175951a).get(c40793r);
        boolean z16 = f175896i;
        if (c40791p != null) {
            c40791p.m132294a(c29342e, executor);
            if (z16) {
                m132287c("Added to existing load", j7, c40793r);
            }
            return new C40132d(this, c29342e, c40791p);
        }
        C40791p c40791p2 = (C40791p) ((C31983m2) this.f175900d.f75382g).mo43684b();
        c40791p2.m132298f(c40793r, z14, z15);
        C0803k c0803k = this.f175903g;
        RunnableC40784i runnableC40784i = (RunnableC40784i) ((C31983m2) c0803k.f2966d).mo43684b();
        int i15 = c0803k.f2964b;
        c0803k.f2964b = i15 + 1;
        runnableC40784i.m132277i(c4961c, obj, c40793r, interfaceC37327e, i13, i14, cls, cls2, enumC4962d, c40786k, map, z4, z13, c37330h, c40791p2, i15);
        ((HashMap) c40798w.f175951a).put(c40793r, c40791p2);
        c40791p2.m132294a(c29342e, executor);
        c40791p2.m132302j(runnableC40784i);
        if (z16) {
            m132287c("Started new load", j7, c40793r);
        }
        return new C40132d(this, c29342e, c40791p2);
    }
}
