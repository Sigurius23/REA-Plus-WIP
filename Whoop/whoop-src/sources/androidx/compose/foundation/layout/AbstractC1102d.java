package androidx.compose.foundation.layout;

import androidx.compose.p018ui.Modifier;
import c41.C4065l3;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.InterfaceC2300f;
import p026b2.InterfaceC2301g;
import p291l0.C22941c;
import p291l0.C22945d;
import p291l0.EnumC22954f0;
import p636y3.C39176h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1102d {

    /* JADX INFO: renamed from: a */
    public static final FillElement f4586a;

    /* JADX INFO: renamed from: b */
    public static final FillElement f4587b;

    /* JADX INFO: renamed from: c */
    public static final FillElement f4588c;

    /* JADX INFO: renamed from: d */
    public static final WrapContentElement f4589d;

    /* JADX INFO: renamed from: e */
    public static final WrapContentElement f4590e;

    /* JADX INFO: renamed from: f */
    public static final WrapContentElement f4591f;

    /* JADX INFO: renamed from: g */
    public static final WrapContentElement f4592g;

    /* JADX INFO: renamed from: h */
    public static final WrapContentElement f4593h;

    /* JADX INFO: renamed from: i */
    public static final WrapContentElement f4594i;

    static {
        EnumC22954f0 enumC22954f0 = EnumC22954f0.f90594x;
        f4586a = new FillElement(enumC22954f0, 1.0f, "fillMaxWidth");
        EnumC22954f0 enumC22954f1 = EnumC22954f0.f90593w;
        f4587b = new FillElement(enumC22954f1, 1.0f, "fillMaxHeight");
        EnumC22954f0 enumC22954f2 = EnumC22954f0.f90595y;
        f4588c = new FillElement(enumC22954f2, 1.0f, "fillMaxSize");
        C2305k c2305k = C2299e.f9111N;
        int i13 = 1;
        f4589d = new WrapContentElement(enumC22954f0, false, new C22941c(c2305k, i13), c2305k, "wrapContentWidth");
        C2305k c2305k2 = C2299e.f9110M;
        f4590e = new WrapContentElement(enumC22954f0, false, new C22941c(c2305k2, i13), c2305k2, "wrapContentWidth");
        C2306l c2306l = C2299e.f9108K;
        f4591f = new WrapContentElement(enumC22954f1, false, new C22945d(c2306l, i13), c2306l, "wrapContentHeight");
        C2306l c2306l2 = C2299e.f9107J;
        f4592g = new WrapContentElement(enumC22954f1, false, new C22945d(c2306l2, i13), c2306l2, "wrapContentHeight");
        C2307m c2307m = C2299e.f9102E;
        int i14 = 8;
        f4593h = new WrapContentElement(enumC22954f2, false, new C4065l3(c2307m, i14), c2307m, "wrapContentSize");
        C2307m c2307m2 = C2299e.f9114w;
        f4594i = new WrapContentElement(enumC22954f2, false, new C4065l3(c2307m2, i14), c2307m2, "wrapContentSize");
    }

    /* JADX INFO: renamed from: a */
    public static final Modifier m3404a(Modifier modifier, float f13, float f14) {
        return modifier.mo3471e(new UnspecifiedConstraintsElement(f13, f14));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Modifier m3405b(Modifier modifier, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = Float.NaN;
        }
        if ((i13 & 2) != 0) {
            f14 = Float.NaN;
        }
        return m3404a(modifier, f13, f14);
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m3406c(float f13, Modifier modifier) {
        return modifier.mo3471e(f13 == 1.0f ? f4587b : new FillElement(EnumC22954f0.f90593w, f13, "fillMaxHeight"));
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m3407d(float f13, Modifier modifier) {
        return modifier.mo3471e(f13 == 1.0f ? f4588c : new FillElement(EnumC22954f0.f90595y, f13, "fillMaxSize"));
    }

    /* JADX INFO: renamed from: f */
    public static final Modifier m3409f(float f13, Modifier modifier) {
        return modifier.mo3471e(f13 == 1.0f ? f4586a : new FillElement(EnumC22954f0.f90594x, f13, "fillMaxWidth"));
    }

    /* JADX INFO: renamed from: h */
    public static final Modifier m3411h(float f13, Modifier modifier) {
        return modifier.mo3471e(new SizeElement(0.0f, f13, 0.0f, f13, 5, true));
    }

    /* JADX INFO: renamed from: i */
    public static final Modifier m3412i(Modifier modifier, float f13, float f14) {
        return modifier.mo3471e(new SizeElement(0.0f, f13, 0.0f, f14, 5, true));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Modifier m3413j(Modifier modifier, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = Float.NaN;
        }
        if ((i13 & 2) != 0) {
            f14 = Float.NaN;
        }
        return m3412i(modifier, f13, f14);
    }

    /* JADX INFO: renamed from: k */
    public static final Modifier m3414k(float f13, Modifier modifier) {
        return modifier.mo3471e(new SizeElement(0.0f, f13, 0.0f, f13, 5, false));
    }

    /* JADX INFO: renamed from: l */
    public static final Modifier m3415l(float f13, Modifier modifier) {
        return modifier.mo3471e(new SizeElement(f13, f13, f13, f13, false));
    }

    /* JADX INFO: renamed from: m */
    public static final Modifier m3416m(Modifier modifier, float f13, float f14) {
        return modifier.mo3471e(new SizeElement(f13, f14, f13, f14, false));
    }

    /* JADX INFO: renamed from: n */
    public static Modifier m3417n(Modifier modifier, float f13, float f14, float f15, float f16, int i13) {
        return modifier.mo3471e(new SizeElement((i13 & 1) != 0 ? Float.NaN : f13, (i13 & 2) != 0 ? Float.NaN : f14, (i13 & 4) != 0 ? Float.NaN : f15, (i13 & 8) != 0 ? Float.NaN : f16, false));
    }

    /* JADX INFO: renamed from: o */
    public static final Modifier m3418o(float f13, Modifier modifier) {
        return modifier.mo3471e(new SizeElement(f13, 0.0f, f13, 0.0f, 10, false));
    }

    /* JADX INFO: renamed from: p */
    public static final Modifier m3419p(float f13, Modifier modifier) {
        return modifier.mo3471e(new SizeElement(f13, f13, f13, f13, true));
    }

    /* JADX INFO: renamed from: q */
    public static final Modifier m3420q(long j7, Modifier modifier) {
        return m3421r(modifier, C39176h.m124787c(j7), C39176h.m124786b(j7));
    }

    /* JADX INFO: renamed from: r */
    public static final Modifier m3421r(Modifier modifier, float f13, float f14) {
        return modifier.mo3471e(new SizeElement(f13, f14, f13, f14, true));
    }

    /* JADX INFO: renamed from: s */
    public static final Modifier m3422s(Modifier modifier, float f13, float f14, float f15, float f16) {
        return modifier.mo3471e(new SizeElement(f13, f14, f15, f16, true));
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Modifier m3423t(Modifier modifier, float f13, float f14, float f15, float f16, int i13) {
        if ((i13 & 1) != 0) {
            f13 = Float.NaN;
        }
        if ((i13 & 2) != 0) {
            f14 = Float.NaN;
        }
        if ((i13 & 4) != 0) {
            f15 = Float.NaN;
        }
        if ((i13 & 8) != 0) {
            f16 = Float.NaN;
        }
        return m3422s(modifier, f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: u */
    public static final Modifier m3424u(float f13, Modifier modifier) {
        return modifier.mo3471e(new SizeElement(f13, 0.0f, f13, 0.0f, 10, true));
    }

    /* JADX INFO: renamed from: v */
    public static Modifier m3425v(Modifier modifier, float f13, float f14, int i13) {
        return modifier.mo3471e(new SizeElement((i13 & 1) != 0 ? Float.NaN : f13, 0.0f, (i13 & 2) != 0 ? Float.NaN : f14, 0.0f, 10, true));
    }

    /* JADX INFO: renamed from: w */
    public static final Modifier m3426w(Modifier modifier, InterfaceC2301g interfaceC2301g, boolean z4) {
        WrapContentElement wrapContentElement;
        if (!AbstractC22676k.m65745e(interfaceC2301g, C2299e.f9108K) || z4) {
            wrapContentElement = (!AbstractC22676k.m65745e(interfaceC2301g, C2299e.f9107J) || z4) ? new WrapContentElement(EnumC22954f0.f90593w, z4, new C22945d(interfaceC2301g, 1), interfaceC2301g, "wrapContentHeight") : f4592g;
        } else {
            wrapContentElement = f4591f;
        }
        return modifier.mo3471e(wrapContentElement);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Modifier m3427x(Modifier modifier, C2306l c2306l, int i13) {
        if ((i13 & 1) != 0) {
            c2306l = C2299e.f9108K;
        }
        return m3426w(modifier, c2306l, false);
    }

    /* JADX INFO: renamed from: y */
    public static Modifier m3428y(Modifier modifier, C2307m c2307m, boolean z4, int i13) {
        WrapContentElement wrapContentElement;
        C2307m c2307m2 = C2299e.f9102E;
        C2307m c2307m3 = (i13 & 1) != 0 ? c2307m2 : c2307m;
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        boolean z13 = z4;
        if (!c2307m3.equals(c2307m2) || z13) {
            wrapContentElement = (!c2307m3.equals(C2299e.f9114w) || z13) ? new WrapContentElement(EnumC22954f0.f90595y, z13, new C4065l3(c2307m3, 8), c2307m3, "wrapContentSize") : f4594i;
        } else {
            wrapContentElement = f4593h;
        }
        return modifier.mo3471e(wrapContentElement);
    }

    /* JADX INFO: renamed from: z */
    public static Modifier m3429z(Modifier modifier, InterfaceC2300f interfaceC2300f, int i13) {
        WrapContentElement wrapContentElement;
        C2305k c2305k = C2299e.f9111N;
        InterfaceC2300f interfaceC2300f2 = (i13 & 1) != 0 ? c2305k : interfaceC2300f;
        boolean z4 = (i13 & 2) == 0;
        if (!AbstractC22676k.m65745e(interfaceC2300f2, c2305k) || z4) {
            wrapContentElement = (!AbstractC22676k.m65745e(interfaceC2300f2, C2299e.f9110M) || z4) ? new WrapContentElement(EnumC22954f0.f90594x, z4, new C22941c(interfaceC2300f2, 1), interfaceC2300f2, "wrapContentWidth") : f4590e;
        } else {
            wrapContentElement = f4589d;
        }
        return modifier.mo3471e(wrapContentElement);
    }
}
