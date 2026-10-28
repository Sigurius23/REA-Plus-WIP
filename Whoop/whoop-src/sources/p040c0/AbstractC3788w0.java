package p040c0;

import java.util.LinkedHashMap;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.InterfaceC2302h;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.C11351f2;
import p077d0.C11362i1;
import p077d0.InterfaceC11337c0;
import p208i2.C17881e1;
import p636y3.C39178j;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c0.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3788w0 {

    /* JADX INFO: renamed from: a */
    public static final C11351f2 f15443a = new C11351f2(C3731d.f15253F, C3731d.f15254G);

    /* JADX INFO: renamed from: b */
    public static final C11362i1 f15444b = AbstractC11348f.m30573u(0.0f, 400.0f, 5, null);

    /* JADX INFO: renamed from: c */
    public static final C11362i1 f15445c;

    /* JADX INFO: renamed from: d */
    public static final C11362i1 f15446d;

    static {
        long j7 = 1;
        long j13 = (j7 & 4294967295L) | (j7 << 32);
        f15445c = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39178j(j13));
        f15446d = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39180l(j13));
    }

    /* JADX INFO: renamed from: a */
    public static C3733d1 m11573a(C11362i1 c11362i1, C2305k c2305k, int i13) {
        C2307m c2307m;
        C2305k c2305k2 = C2299e.f9112O;
        int i14 = 1;
        if ((i13 & 1) != 0) {
            long j7 = 1;
            c11362i1 = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39180l((j7 & 4294967295L) | (j7 << 32)));
        }
        if ((i13 & 2) != 0) {
            c2305k = c2305k2;
        }
        if (AbstractC22676k.m65745e(c2305k, C2299e.f9110M)) {
            c2307m = C2299e.f9117z;
        } else {
            c2307m = AbstractC22676k.m65745e(c2305k, c2305k2) ? C2299e.f9103F : C2299e.f9102E;
        }
        return m11574b(c2307m, c11362i1, new C3731d(i14, 10), true);
    }

    /* JADX INFO: renamed from: b */
    public static final C3733d1 m11574b(InterfaceC2302h interfaceC2302h, InterfaceC11337c0 interfaceC11337c0, Function1 function1, boolean z4) {
        return new C3733d1(new C3784u1((C3742g1) null, (C3778s1) null, new C3753k0(interfaceC2302h, interfaceC11337c0, function1, z4), (C3757l1) null, (LinkedHashMap) null, 59));
    }

    /* JADX INFO: renamed from: c */
    public static C3733d1 m11575c(C11347e2 c11347e2, int i13) {
        C2307m c2307m = C2299e.f9102E;
        InterfaceC11337c0 interfaceC11337c0M30573u = c11347e2;
        if ((i13 & 1) != 0) {
            long j7 = 1;
            interfaceC11337c0M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39180l((j7 & 4294967295L) | (j7 << 32)));
        }
        if ((i13 & 2) != 0) {
            c2307m = C2299e.f9106I;
        }
        return m11574b(c2307m, interfaceC11337c0M30573u, C3728c.f15235I, (i13 & 4) != 0);
    }

    /* JADX INFO: renamed from: d */
    public static C3733d1 m11576d(InterfaceC11337c0 interfaceC11337c0, Function1 function1, int i13) {
        C2307m c2307m;
        C2306l c2306l = C2299e.f9109L;
        C2306l c2306l2 = C2299e.f9107J;
        if ((i13 & 1) != 0) {
            long j7 = 1;
            interfaceC11337c0 = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39180l((j7 & 4294967295L) | (j7 << 32)));
        }
        C2306l c2306l3 = (i13 & 2) != 0 ? c2306l : c2306l2;
        if ((i13 & 8) != 0) {
            function1 = C3731d.f15255H;
        }
        if (AbstractC22676k.m65745e(c2306l3, c2306l2)) {
            c2307m = C2299e.f9115x;
        } else {
            c2307m = AbstractC22676k.m65745e(c2306l3, c2306l) ? C2299e.f9105H : C2299e.f9102E;
        }
        return m11574b(c2307m, interfaceC11337c0, new C3786v0(function1, 0), true);
    }

    /* JADX INFO: renamed from: e */
    public static C3733d1 m11577e(InterfaceC11337c0 interfaceC11337c0, int i13) {
        if ((i13 & 1) != 0) {
            interfaceC11337c0 = AbstractC11348f.m30573u(0.0f, 400.0f, 5, null);
        }
        return new C3733d1(new C3784u1(new C3742g1((i13 & 2) == 0 ? 0.3f : 0.0f, interfaceC11337c0), (C3778s1) null, (C3753k0) null, (C3757l1) null, (LinkedHashMap) null, 62));
    }

    /* JADX INFO: renamed from: f */
    public static C3739f1 m11578f(InterfaceC11337c0 interfaceC11337c0, int i13) {
        if ((i13 & 1) != 0) {
            interfaceC11337c0 = AbstractC11348f.m30573u(0.0f, 400.0f, 5, null);
        }
        return new C3739f1(new C3784u1(new C3742g1(0.0f, interfaceC11337c0), (C3778s1) null, (C3753k0) null, (C3757l1) null, (LinkedHashMap) null, 62));
    }

    /* JADX INFO: renamed from: g */
    public static C3733d1 m11579g(C11347e2 c11347e2, float f13, int i13) {
        if ((i13 & 2) != 0) {
            f13 = 0.0f;
        }
        return new C3733d1(new C3784u1((C3742g1) null, (C3778s1) null, (C3753k0) null, new C3757l1(f13, C17881e1.f69566b, c11347e2), (LinkedHashMap) null, 55));
    }

    /* JADX INFO: renamed from: h */
    public static C3739f1 m11580h(C11347e2 c11347e2, long j7, int i13) {
        InterfaceC11337c0 interfaceC11337c0M30573u = c11347e2;
        if ((i13 & 1) != 0) {
            interfaceC11337c0M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 5, null);
        }
        float f13 = (i13 & 2) == 0 ? 0.95f : 0.0f;
        if ((i13 & 4) != 0) {
            j7 = C17881e1.f69566b;
        }
        return new C3739f1(new C3784u1((C3742g1) null, (C3778s1) null, (C3753k0) null, new C3757l1(f13, j7, interfaceC11337c0M30573u), (LinkedHashMap) null, 55));
    }

    /* JADX INFO: renamed from: i */
    public static C3739f1 m11581i() {
        C2307m c2307m;
        int i13 = 1;
        long j7 = 1;
        C11362i1 c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39180l((j7 & 4294967295L) | (j7 << 32)));
        C2305k c2305k = C2299e.f9112O;
        if (AbstractC22676k.m65745e(c2305k, C2299e.f9110M)) {
            c2307m = C2299e.f9117z;
        } else {
            c2307m = AbstractC22676k.m65745e(c2305k, c2305k) ? C2299e.f9103F : C2299e.f9102E;
        }
        return m11582j(c2307m, c11362i1M30573u, new C3731d(i13, 11), true);
    }

    /* JADX INFO: renamed from: j */
    public static final C3739f1 m11582j(InterfaceC2302h interfaceC2302h, InterfaceC11337c0 interfaceC11337c0, Function1 function1, boolean z4) {
        return new C3739f1(new C3784u1((C3742g1) null, (C3778s1) null, new C3753k0(interfaceC2302h, interfaceC11337c0, function1, z4), (C3757l1) null, (LinkedHashMap) null, 59));
    }

    /* JADX INFO: renamed from: k */
    public static C3739f1 m11583k(C11347e2 c11347e2, int i13) {
        C2307m c2307m = C2299e.f9102E;
        InterfaceC11337c0 interfaceC11337c0M30573u = c11347e2;
        if ((i13 & 1) != 0) {
            long j7 = 1;
            interfaceC11337c0M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39180l((j7 & 4294967295L) | (j7 << 32)));
        }
        if ((i13 & 2) != 0) {
            c2307m = C2299e.f9106I;
        }
        return m11582j(c2307m, interfaceC11337c0M30573u, C3728c.f15236J, (i13 & 4) != 0);
    }

    /* JADX INFO: renamed from: l */
    public static C3739f1 m11584l(InterfaceC11337c0 interfaceC11337c0, C2306l c2306l, Function1 function1, int i13) {
        C2307m c2307m;
        C2306l c2306l2 = C2299e.f9109L;
        if ((i13 & 1) != 0) {
            long j7 = 1;
            interfaceC11337c0 = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39180l((j7 & 4294967295L) | (j7 << 32)));
        }
        if ((i13 & 2) != 0) {
            c2306l = c2306l2;
        }
        if ((i13 & 8) != 0) {
            function1 = C3731d.f15256I;
        }
        if (AbstractC22676k.m65745e(c2306l, C2299e.f9107J)) {
            c2307m = C2299e.f9115x;
        } else {
            c2307m = AbstractC22676k.m65745e(c2306l, c2306l2) ? C2299e.f9105H : C2299e.f9102E;
        }
        return m11582j(c2307m, interfaceC11337c0, new C3786v0(function1, 1), true);
    }

    /* JADX INFO: renamed from: m */
    public static final C3733d1 m11585m(InterfaceC11337c0 interfaceC11337c0, Function1 function1) {
        return new C3733d1(new C3784u1((C3742g1) null, new C3778s1(interfaceC11337c0, new C3786v0(function1, 2)), (C3753k0) null, (C3757l1) null, (LinkedHashMap) null, 61));
    }

    /* JADX INFO: renamed from: n */
    public static C3733d1 m11586n(int i13, Function1 function1) {
        long j7 = 1;
        C11362i1 c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39178j((j7 & 4294967295L) | (j7 << 32)));
        if ((i13 & 2) != 0) {
            function1 = C3731d.f15257J;
        }
        return m11585m(c11362i1M30573u, function1);
    }

    /* JADX INFO: renamed from: o */
    public static final C3733d1 m11587o(InterfaceC11337c0 interfaceC11337c0, Function1 function1) {
        return new C3733d1(new C3784u1((C3742g1) null, new C3778s1(interfaceC11337c0, new C3786v0(function1, 3)), (C3753k0) null, (C3757l1) null, (LinkedHashMap) null, 61));
    }

    /* JADX INFO: renamed from: p */
    public static C3733d1 m11588p(C11347e2 c11347e2, Function1 function1, int i13) {
        InterfaceC11337c0 interfaceC11337c0M30573u = c11347e2;
        if ((i13 & 1) != 0) {
            long j7 = 1;
            interfaceC11337c0M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39178j((j7 & 4294967295L) | (j7 << 32)));
        }
        if ((i13 & 2) != 0) {
            function1 = C3728c.f15237K;
        }
        return m11587o(interfaceC11337c0M30573u, function1);
    }

    /* JADX INFO: renamed from: q */
    public static final C3739f1 m11589q(InterfaceC11337c0 interfaceC11337c0, Function1 function1) {
        return new C3739f1(new C3784u1((C3742g1) null, new C3778s1(interfaceC11337c0, new C3786v0(function1, 4)), (C3753k0) null, (C3757l1) null, (LinkedHashMap) null, 61));
    }

    /* JADX INFO: renamed from: r */
    public static C3739f1 m11590r(Function1 function1) {
        long j7 = 1;
        return m11589q(AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39178j((j7 & 4294967295L) | (j7 << 32))), function1);
    }

    /* JADX INFO: renamed from: s */
    public static final C3739f1 m11591s(InterfaceC11337c0 interfaceC11337c0, Function1 function1) {
        return new C3739f1(new C3784u1((C3742g1) null, new C3778s1(interfaceC11337c0, new C3786v0(function1, 5)), (C3753k0) null, (C3757l1) null, (LinkedHashMap) null, 61));
    }

    /* JADX INFO: renamed from: t */
    public static C3739f1 m11592t(int i13, Function1 function1) {
        long j7 = 1;
        C11362i1 c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39178j((j7 & 4294967295L) | (j7 << 32)));
        if ((i13 & 2) != 0) {
            function1 = C3731d.f15258K;
        }
        return m11591s(c11362i1M30573u, function1);
    }
}
