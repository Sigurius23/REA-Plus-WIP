package pg3;

import com.iterable.iterableapi.C5378v;
import g40.C15331c1;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import ne3.C26616h;
import p000.AbstractC11266d;
import p249jc.AbstractC21598x;
import p389p0.C28539n0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import q30.C29938w0;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34810e0;
import ud3.C34818h0;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34848w0;
import ud3.C34850x0;
import ud3.C34854z0;
import ud3.InterfaceC34819i;
import ud3.InterfaceC34821j;
import zd3.C40571o;

/* JADX INFO: renamed from: pg3.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29174b0 implements InterfaceC29182e {

    /* JADX INFO: renamed from: E */
    public final InterfaceC29201n f118137E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f118138F;

    /* JADX INFO: renamed from: G */
    public C40571o f118139G;

    /* JADX INFO: renamed from: H */
    public Throwable f118140H;

    /* JADX INFO: renamed from: I */
    public boolean f118141I;

    /* JADX INFO: renamed from: w */
    public final C29216u0 f118142w;

    /* JADX INFO: renamed from: x */
    public final Object f118143x;

    /* JADX INFO: renamed from: y */
    public final Object[] f118144y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC34819i f118145z;

    public C29174b0(C29216u0 c29216u0, Object obj, Object[] objArr, InterfaceC34819i interfaceC34819i, InterfaceC29201n interfaceC29201n) {
        this.f118142w = c29216u0;
        this.f118143x = obj;
        this.f118144y = objArr;
        this.f118145z = interfaceC34819i;
        this.f118137E = interfaceC29201n;
    }

    @Override // pg3.InterfaceC29182e
    /* JADX INFO: renamed from: F0 */
    public final boolean mo88672F0() {
        boolean z4 = true;
        if (this.f118138F) {
            return true;
        }
        synchronized (this) {
            try {
                C40571o c40571o = this.f118139G;
                if (c40571o == null || !c40571o.f174718R) {
                    z4 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z4;
    }

    @Override // pg3.InterfaceC29182e
    /* JADX INFO: renamed from: R0 */
    public final void mo88673R0(InterfaceC29189h interfaceC29189h) {
        C40571o c40571o;
        Throwable th3;
        synchronized (this) {
            try {
                if (this.f118141I) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f118141I = true;
                c40571o = this.f118139G;
                th3 = this.f118140H;
                if (c40571o == null && th3 == null) {
                    try {
                        C40571o c40571oM88674a = m88674a();
                        this.f118139G = c40571oM88674a;
                        c40571o = c40571oM88674a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        AbstractC29184e1.m88696r(th3);
                        this.f118140H = th3;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        if (th3 != null) {
            interfaceC29189h.mo2329r(this, th3);
            return;
        }
        if (this.f118138F) {
            c40571o.cancel();
        }
        c40571o.m131548d(new C28539n0(this, interfaceC29189h));
    }

    /* JADX INFO: renamed from: a */
    public final C40571o m88674a() {
        C34810e0 c34810e0M16526b;
        C29216u0 c29216u0 = this.f118142w;
        AbstractC29184e1[] abstractC29184e1Arr = c29216u0.f118264k;
        Object[] objArr = this.f118144y;
        int length = objArr.length;
        if (length != abstractC29184e1Arr.length) {
            throw new IllegalArgumentException(AbstractC18489d0.m53371l(AbstractC11266d.m30466t(length, "Argument count (", ") doesn't match expected count ("), abstractC29184e1Arr.length, ")"));
        }
        C29212s0 c29212s0 = new C29212s0(c29216u0.f118257d, c29216u0.f118256c, c29216u0.f118258e, c29216u0.f118259f, c29216u0.f118260g, c29216u0.f118261h, c29216u0.f118262i, c29216u0.f118263j);
        if (c29216u0.f118265l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i13 = 0; i13 < length; i13++) {
            arrayList.add(objArr[i13]);
            abstractC29184e1Arr[i13].mo88679a(c29212s0, objArr[i13]);
        }
        C5378v c5378v = c29212s0.f118217d;
        if (c5378v != null) {
            c34810e0M16526b = c5378v.m16526b();
        } else {
            String link = c29212s0.f118216c;
            C34810e0 c34810e0 = c29212s0.f118215b;
            c34810e0.getClass();
            AbstractC22676k.m65750j(link, "link");
            C5378v c5378vM109879h = c34810e0.m109879h(link);
            c34810e0M16526b = c5378vM109879h != null ? c5378vM109879h.m16526b() : null;
            if (c34810e0M16526b == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c34810e0 + ", Relative: " + c29212s0.f118216c);
            }
        }
        AbstractC34846v0 c29210r0 = c29212s0.f118224k;
        if (c29210r0 == null) {
            C15331c1 c15331c1 = c29212s0.f118223j;
            if (c15331c1 != null) {
                c29210r0 = c15331c1.m43543c();
            } else {
                C29938w0 c29938w0 = c29212s0.f118222i;
                if (c29938w0 != null) {
                    c29210r0 = c29938w0.m91563i();
                } else if (c29212s0.f118221h) {
                    c29210r0 = AbstractC34846v0.create((C34818h0) null, new byte[0]);
                }
            }
        }
        C34818h0 c34818h0 = c29212s0.f118220g;
        C22677k0 c22677k0 = c29212s0.f118219f;
        if (c34818h0 != null) {
            if (c29210r0 != null) {
                c29210r0 = new C29210r0(c29210r0, c34818h0);
            } else {
                c22677k0.m65761b("Content-Type", c34818h0.f146591a);
            }
        }
        C34830n0 c34830n0 = c29212s0.f118218e;
        c34830n0.getClass();
        c34830n0.f146687a = c34810e0M16526b;
        c34830n0.m109903d(c22677k0.m65766g());
        c34830n0.m109904e(c29212s0.f118214a, c29210r0);
        C29219w c29219w = new C29219w(c29216u0.f118254a, this.f118143x, c29216u0.f118255b, arrayList);
        InterfaceC21461d type = AbstractC21598x.m60666V(C29219w.class);
        AbstractC22676k.m65750j(type, "type");
        c34830n0.f146691e = c34830n0.f146691e.mo113254k(type, c29219w);
        return ((C34826l0) this.f118145z).m109898b(new C34832o0(c34830n0));
    }

    /* JADX INFO: renamed from: b */
    public final C29218v0 m88675b() {
        InterfaceC34821j interfaceC34821jM88676c;
        synchronized (this) {
            if (this.f118141I) {
                throw new IllegalStateException("Already executed.");
            }
            this.f118141I = true;
            interfaceC34821jM88676c = m88676c();
        }
        if (this.f118138F) {
            ((C40571o) interfaceC34821jM88676c).cancel();
        }
        return m88677d(((C40571o) interfaceC34821jM88676c).m131549e());
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC34821j m88676c() throws IOException {
        C40571o c40571o = this.f118139G;
        if (c40571o != null) {
            return c40571o;
        }
        Throwable th3 = this.f118140H;
        if (th3 != null) {
            if (th3 instanceof IOException) {
                throw ((IOException) th3);
            }
            if (th3 instanceof RuntimeException) {
                throw ((RuntimeException) th3);
            }
            throw ((Error) th3);
        }
        try {
            C40571o c40571oM88674a = m88674a();
            this.f118139G = c40571oM88674a;
            return c40571oM88674a;
        } catch (IOException | Error | RuntimeException e5) {
            AbstractC29184e1.m88696r(e5);
            this.f118140H = e5;
            throw e5;
        }
    }

    @Override // pg3.InterfaceC29182e
    public final void cancel() {
        C40571o c40571o;
        this.f118138F = true;
        synchronized (this) {
            c40571o = this.f118139G;
        }
        if (c40571o != null) {
            c40571o.cancel();
        }
    }

    public final Object clone() {
        return new C29174b0(this.f118142w, this.f118143x, this.f118144y, this.f118145z, this.f118137E);
    }

    /* JADX INFO: renamed from: d */
    public final C29218v0 m88677d(C34850x0 c34850x0) throws IOException {
        AbstractC34799a1 abstractC34799a1 = c34850x0.f146778G;
        C34848w0 c34848w0M109933h = c34850x0.m109933h();
        c34848w0M109933h.f146767g = new C29171a0(abstractC34799a1.mo1942k(), abstractC34799a1.mo1941i());
        C34850x0 c34850x0M109930a = c34848w0M109933h.m109930a();
        int i13 = c34850x0M109930a.f146792z;
        if (i13 < 200 || i13 >= 300) {
            try {
                C26616h c26616h = new C26616h();
                abstractC34799a1.mo1940d1().mo79190P0(c26616h);
                C34818h0 c34818h0Mo1942k = abstractC34799a1.mo1942k();
                long jMo1941i = abstractC34799a1.mo1941i();
                C34854z0 c34854z0 = AbstractC34799a1.f146522x;
                return C29218v0.m88724b(new C34854z0(c34818h0Mo1942k, jMo1941i, c26616h), c34850x0M109930a);
            } finally {
                abstractC34799a1.close();
            }
        }
        if (i13 == 204 || i13 == 205) {
            abstractC34799a1.close();
            return C29218v0.m88726d(null, c34850x0M109930a);
        }
        C29225z c29225z = new C29225z(abstractC34799a1);
        try {
            return C29218v0.m88726d(this.f118137E.convert(c29225z), c34850x0M109930a);
        } catch (RuntimeException e5) {
            IOException iOException = c29225z.f118296E;
            if (iOException == null) {
                throw e5;
            }
            throw iOException;
        }
    }

    @Override // pg3.InterfaceC29182e
    /* JADX INFO: renamed from: m */
    public final synchronized C34832o0 mo88678m() {
        try {
        } catch (IOException e5) {
            throw new RuntimeException("Unable to create request.", e5);
        }
        return ((C40571o) m88676c()).f174722x;
    }

    @Override // pg3.InterfaceC29182e
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final InterfaceC29182e mo134471clone() {
        return new C29174b0(this.f118142w, this.f118143x, this.f118144y, this.f118145z, this.f118137E);
    }
}
