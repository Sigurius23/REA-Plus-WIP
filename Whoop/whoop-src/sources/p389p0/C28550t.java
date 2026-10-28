package p389p0;

import a30.C0327u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import n43.C26285a;
import nr0.C27072e;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.InterfaceC11337c0;
import p132f0.C13774c;
import p208i2.InterfaceC17883f0;
import p293l2.C23226c;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p636y3.C39178j;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: p0.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C28550t {

    /* JADX INFO: renamed from: s */
    public static final long f115499s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f115500t = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC2994c0 f115501a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17883f0 f115502b;

    /* JADX INFO: renamed from: c */
    public final C27072e f115503c;

    /* JADX INFO: renamed from: d */
    public InterfaceC11337c0 f115504d;

    /* JADX INFO: renamed from: e */
    public InterfaceC11337c0 f115505e;

    /* JADX INFO: renamed from: f */
    public InterfaceC11337c0 f115506f;

    /* JADX INFO: renamed from: g */
    public boolean f115507g;

    /* JADX INFO: renamed from: h */
    public final C28633k1 f115508h;

    /* JADX INFO: renamed from: i */
    public final C28633k1 f115509i;

    /* JADX INFO: renamed from: j */
    public final C28633k1 f115510j;

    /* JADX INFO: renamed from: k */
    public final C28633k1 f115511k;

    /* JADX INFO: renamed from: l */
    public long f115512l;

    /* JADX INFO: renamed from: m */
    public long f115513m;

    /* JADX INFO: renamed from: n */
    public C23226c f115514n;

    /* JADX INFO: renamed from: o */
    public final C11344e f115515o;

    /* JADX INFO: renamed from: p */
    public final C11344e f115516p;

    /* JADX INFO: renamed from: q */
    public final C28633k1 f115517q;

    /* JADX INFO: renamed from: r */
    public long f115518r;

    static {
        long j7 = Integer.MAX_VALUE;
        f115499s = (j7 & 4294967295L) | (j7 << 32);
    }

    public C28550t(InterfaceC2994c0 interfaceC2994c0, InterfaceC17883f0 interfaceC17883f0, C27072e c27072e) {
        this.f115501a = interfaceC2994c0;
        this.f115502b = interfaceC17883f0;
        this.f115503c = c27072e;
        Boolean bool = Boolean.FALSE;
        this.f115508h = AbstractC28683x.m87272z(bool);
        this.f115509i = AbstractC28683x.m87272z(bool);
        this.f115510j = AbstractC28683x.m87272z(bool);
        this.f115511k = AbstractC28683x.m87272z(bool);
        long j7 = f115499s;
        this.f115512l = j7;
        this.f115513m = 0L;
        this.f115514n = interfaceC17883f0 != null ? interfaceC17883f0.mo51440a() : null;
        this.f115515o = new C11344e(new C39178j(0L), AbstractC11348f.f36373o, null, 12);
        this.f115516p = new C11344e(Float.valueOf(1.0f), AbstractC11348f.f36367i, null, 12);
        this.f115517q = AbstractC28683x.m87272z(new C39178j(0L));
        this.f115518r = j7;
    }

    /* JADX INFO: renamed from: a */
    public final void m86847a() {
        C23226c c23226c = this.f115514n;
        InterfaceC11337c0 interfaceC11337c0 = this.f115504d;
        boolean zBooleanValue = ((Boolean) this.f115509i.getValue()).booleanValue();
        InterfaceC2994c0 interfaceC2994c0 = this.f115501a;
        InterfaceC30057d interfaceC30057d = null;
        if (zBooleanValue || interfaceC11337c0 == null || c23226c == null) {
            if (m86853g()) {
                if (c23226c != null) {
                    c23226c.m67212e(1.0f);
                }
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C28546r(this, interfaceC30057d, 0), 3);
                return;
            }
            return;
        }
        m86856j(true);
        boolean zM86853g = m86853g();
        boolean z4 = !zM86853g;
        if (!zM86853g) {
            c23226c.m67212e(0.0f);
        }
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C0327u(z4, this, interfaceC11337c0, c23226c, (InterfaceC30057d) null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m86848b() {
        C23226c c23226c = this.f115514n;
        InterfaceC11337c0 interfaceC11337c0 = this.f115506f;
        if (c23226c == null || m86853g() || interfaceC11337c0 == null) {
            return;
        }
        m86857k(true);
        AbstractC3006f0.m8732z(this.f115501a, null, null, new C26285a(this, interfaceC11337c0, c23226c, (InterfaceC30057d) null, 6), 3);
    }

    /* JADX INFO: renamed from: c */
    public final void m86849c(long j7, boolean z4) {
        InterfaceC11337c0 interfaceC11337c0 = this.f115505e;
        if (interfaceC11337c0 == null) {
            return;
        }
        long jM124793c = C39178j.m124793c(((C39178j) this.f115517q.getValue()).f168416a, j7);
        m86859m(jM124793c);
        m86858l(true);
        this.f115507g = z4;
        AbstractC3006f0.m8732z(this.f115501a, null, null, new C13774c(this, interfaceC11337c0, jM124793c, (InterfaceC30057d) null, 4), 3);
    }

    /* JADX INFO: renamed from: d */
    public final C23226c m86850d() {
        return this.f115514n;
    }

    /* JADX INFO: renamed from: e */
    public final long m86851e() {
        return this.f115512l;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m86852f() {
        return ((Boolean) this.f115511k.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m86853g() {
        return ((Boolean) this.f115510j.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m86854h() {
        return ((Boolean) this.f115508h.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m86855i() {
        InterfaceC17883f0 interfaceC17883f0;
        boolean zM86854h = m86854h();
        InterfaceC2994c0 interfaceC2994c0 = this.f115501a;
        InterfaceC30057d interfaceC30057d = null;
        if (zM86854h) {
            m86858l(false);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C28546r(this, interfaceC30057d, 2), 3);
        }
        if (((Boolean) this.f115509i.getValue()).booleanValue()) {
            m86856j(false);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C28546r(this, interfaceC30057d, 3), 3);
        }
        if (m86853g()) {
            m86857k(false);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C28546r(this, interfaceC30057d, 4), 3);
        }
        this.f115507g = false;
        m86859m(0L);
        this.f115512l = f115499s;
        C23226c c23226c = this.f115514n;
        if (c23226c != null && (interfaceC17883f0 = this.f115502b) != null) {
            interfaceC17883f0.mo51441b(c23226c);
        }
        this.f115514n = null;
        this.f115504d = null;
        this.f115506f = null;
        this.f115505e = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m86856j(boolean z4) {
        this.f115509i.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: k */
    public final void m86857k(boolean z4) {
        this.f115510j.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: l */
    public final void m86858l(boolean z4) {
        this.f115508h.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: m */
    public final void m86859m(long j7) {
        this.f115517q.setValue(new C39178j(j7));
    }

    /* JADX INFO: renamed from: n */
    public final void m86860n(long j7) {
        this.f115512l = j7;
    }
}
