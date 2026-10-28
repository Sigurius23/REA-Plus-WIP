package androidx.compose.foundation.layout;

import androidx.compose.p018ui.Modifier;
import b11.C2275b;
import cp0.C11005v0;
import jp1.C21862n;
import k71.C22249f;
import l83.C23454a0;
import p007a6.C0428i;
import p027b3.C2404l2;
import p291l0.C22955f1;
import p291l0.C22976l1;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC22973k1;
import p636y3.C39169a;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1099a {
    /* JADX INFO: renamed from: a */
    public static C22976l1 m3379a(float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        return new C22976l1(f13, f14, f13, f14);
    }

    /* JADX INFO: renamed from: b */
    public static final C22976l1 m3380b(float f13, float f14, float f15, float f16) {
        return new C22976l1(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: c */
    public static C22976l1 m3381c(float f13, float f14, float f15, float f16, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        if ((i13 & 4) != 0) {
            f15 = 0;
        }
        if ((i13 & 8) != 0) {
            f16 = 0;
        }
        return new C22976l1(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m3382d(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new OffsetPxElement(function1, new C21862n(function1, 24), false));
    }

    /* JADX INFO: renamed from: e */
    public static final Modifier m3383e(Modifier modifier, float f13, float f14) {
        return modifier.mo3471e(new OffsetElement(f13, f14, false, new C11005v0(f13, f14, 2)));
    }

    /* JADX INFO: renamed from: f */
    public static final Modifier m3384f(Modifier modifier, boolean z4, float f13) {
        return modifier.mo3471e(new AspectRatioElement(f13, z4));
    }

    /* JADX INFO: renamed from: h */
    public static final float m3386h(InterfaceC22973k1 interfaceC22973k1, EnumC39181m enumC39181m) {
        return enumC39181m == EnumC39181m.f168423w ? interfaceC22973k1.mo43111c(enumC39181m) : interfaceC22973k1.mo43110b(enumC39181m);
    }

    /* JADX INFO: renamed from: i */
    public static final float m3387i(InterfaceC22973k1 interfaceC22973k1, EnumC39181m enumC39181m) {
        return enumC39181m == EnumC39181m.f168423w ? interfaceC22973k1.mo43110b(enumC39181m) : interfaceC22973k1.mo43111c(enumC39181m);
    }

    /* JADX INFO: renamed from: j */
    public static final Modifier m3388j(Modifier modifier, EnumC22935a1 enumC22935a1) {
        return modifier.mo3471e(new IntrinsicHeightElement(enumC22935a1));
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m3389k(int i13, long j7, int i14) {
        int iM124767k = C39169a.m124767k(j7);
        if (i13 > C39169a.m124765i(j7) || iM124767k > i13) {
            return false;
        }
        return i14 <= C39169a.m124764h(j7) && C39169a.m124766j(j7) <= i14;
    }

    /* JADX INFO: renamed from: l */
    public static final Modifier m3390l(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new OffsetPxElement(function1, new C2275b(function1, 12), true));
    }

    /* JADX INFO: renamed from: m */
    public static final Modifier m3391m(Modifier modifier, float f13, float f14) {
        return modifier.mo3471e(new OffsetElement(f13, f14, true, new C22955f1(f13, f14, 0)));
    }

    /* JADX INFO: renamed from: n */
    public static Modifier m3392n(Modifier modifier, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        return m3391m(modifier, f13, f14);
    }

    /* JADX INFO: renamed from: o */
    public static final Modifier m3393o(InterfaceC22973k1 interfaceC22973k1, Modifier modifier) {
        return modifier.mo3471e(new PaddingValuesElement(interfaceC22973k1, new C0428i(interfaceC22973k1, 22)));
    }

    /* JADX INFO: renamed from: p */
    public static final Modifier m3394p(float f13, Modifier modifier) {
        return modifier.mo3471e(new PaddingElement(f13, f13, f13, f13, new C22249f(f13, 1)));
    }

    /* JADX INFO: renamed from: q */
    public static final Modifier m3395q(Modifier modifier, float f13, float f14) {
        return modifier.mo3471e(new PaddingElement(f13, f14, f13, f14, new C22955f1(f13, f14, 1)));
    }

    /* JADX INFO: renamed from: r */
    public static Modifier m3396r(Modifier modifier, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        return m3395q(modifier, f13, f14);
    }

    /* JADX INFO: renamed from: s */
    public static final Modifier m3397s(Modifier modifier, final float f13, final float f14, final float f15, final float f16) {
        return modifier.mo3471e(new PaddingElement(f13, f14, f15, f16, new Function1() { // from class: l0.i1
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C2404l2 c2404l2 = (C2404l2) obj;
                c2404l2.m7401c("padding");
                c2404l2.m7400b().m7292c(new C39174f(f13), "start");
                c2404l2.m7400b().m7292c(new C39174f(f14), "top");
                c2404l2.m7400b().m7292c(new C39174f(f15), "end");
                c2404l2.m7400b().m7292c(new C39174f(f16), "bottom");
                return C23454a0.f92919a;
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public static Modifier m3398t(Modifier modifier, float f13, float f14, float f15, float f16, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0;
        }
        if ((i13 & 2) != 0) {
            f14 = 0;
        }
        if ((i13 & 4) != 0) {
            f15 = 0;
        }
        if ((i13 & 8) != 0) {
            f16 = 0;
        }
        return m3397s(modifier, f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: u */
    public static final Modifier m3399u(Modifier modifier, EnumC22935a1 enumC22935a1) {
        return modifier.mo3471e(new IntrinsicWidthElement(enumC22935a1));
    }
}
