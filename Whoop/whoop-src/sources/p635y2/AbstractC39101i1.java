package p635y2;

import p005a3.InterfaceC0211i1;
import p636y3.C39178j;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.i1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39101i1 implements InterfaceC39171c {

    /* JADX INFO: renamed from: w */
    public boolean f168198w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m124621a(AbstractC39104j1 abstractC39104j1, AbstractC39101i1 abstractC39101i1) {
        abstractC39101i1.getClass();
        if (abstractC39104j1 instanceof InterfaceC0211i1) {
            ((InterfaceC0211i1) abstractC39104j1).mo456s(abstractC39101i1.f168198w);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m124623k(AbstractC39101i1 abstractC39101i1, AbstractC39104j1 abstractC39104j1, long j7) {
        abstractC39101i1.getClass();
        m124621a(abstractC39104j1, abstractC39101i1);
        abstractC39104j1.mo453o0(C39178j.m124794d(j7, abstractC39104j1.f168210E), 0.0f, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m124624n(AbstractC39104j1 abstractC39104j1, int i13, int i14, AbstractC39101i1 abstractC39101i1) {
        long j7 = (((long) i13) << 32) | (((long) i14) & 4294967295L);
        if (abstractC39101i1.mo124630c() == EnumC39181m.f168423w || abstractC39101i1.mo124631e() == 0) {
            m124621a(abstractC39104j1, abstractC39101i1);
            abstractC39104j1.mo453o0(C39178j.m124794d(j7, abstractC39104j1.f168210E), 0.0f, null);
        } else {
            int iMo124631e = (abstractC39101i1.mo124631e() - abstractC39104j1.f168211w) - ((int) (j7 >> 32));
            m124621a(abstractC39104j1, abstractC39101i1);
            abstractC39104j1.mo453o0(C39178j.m124794d((((long) iMo124631e) << 32) | (((long) ((int) (j7 & 4294967295L))) & 4294967295L), abstractC39104j1.f168210E), 0.0f, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m124625o(AbstractC39104j1 abstractC39104j1, int i13, int i14, AbstractC39101i1 abstractC39101i1) {
        int i15 = AbstractC39110l1.f168222b;
        C39107k1 c39107k1 = C39107k1.f168217x;
        long j7 = (((long) i13) << 32) | (((long) i14) & 4294967295L);
        if (abstractC39101i1.mo124630c() == EnumC39181m.f168423w || abstractC39101i1.mo124631e() == 0) {
            m124621a(abstractC39104j1, abstractC39101i1);
            abstractC39104j1.mo453o0(C39178j.m124794d(j7, abstractC39104j1.f168210E), 0.0f, c39107k1);
        } else {
            int iMo124631e = (abstractC39101i1.mo124631e() - abstractC39104j1.f168211w) - ((int) (j7 >> 32));
            m124621a(abstractC39104j1, abstractC39101i1);
            abstractC39104j1.mo453o0(C39178j.m124794d((((long) iMo124631e) << 32) | (((long) ((int) (j7 & 4294967295L))) & 4294967295L), abstractC39104j1.f168210E), 0.0f, c39107k1);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m124626p(AbstractC39101i1 abstractC39101i1, AbstractC39104j1 abstractC39104j1, long j7) {
        int i13 = AbstractC39110l1.f168222b;
        C39107k1 c39107k1 = C39107k1.f168217x;
        if (abstractC39101i1.mo124630c() == EnumC39181m.f168423w || abstractC39101i1.mo124631e() == 0) {
            m124621a(abstractC39104j1, abstractC39101i1);
            abstractC39104j1.mo453o0(C39178j.m124794d(j7, abstractC39104j1.f168210E), 0.0f, c39107k1);
        } else {
            int iMo124631e = (abstractC39101i1.mo124631e() - abstractC39104j1.f168211w) - ((int) (j7 >> 32));
            m124621a(abstractC39104j1, abstractC39101i1);
            abstractC39104j1.mo453o0(C39178j.m124794d((((long) ((int) (j7 & 4294967295L))) & 4294967295L) | (((long) iMo124631e) << 32), abstractC39104j1.f168210E), 0.0f, c39107k1);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m124627s(AbstractC39101i1 abstractC39101i1, AbstractC39104j1 abstractC39104j1, int i13, int i14, Function1 function1, int i15) {
        if ((i15 & 8) != 0) {
            int i16 = AbstractC39110l1.f168222b;
            function1 = C39107k1.f168217x;
        }
        abstractC39101i1.m124633r(abstractC39104j1, i13, i14, 0.0f, function1);
    }

    /* JADX INFO: renamed from: t */
    public static void m124628t(AbstractC39101i1 abstractC39101i1, AbstractC39104j1 abstractC39104j1, long j7) {
        int i13 = AbstractC39110l1.f168222b;
        C39107k1 c39107k1 = C39107k1.f168217x;
        abstractC39101i1.getClass();
        m124621a(abstractC39104j1, abstractC39101i1);
        abstractC39104j1.mo453o0(C39178j.m124794d(j7, abstractC39104j1.f168210E), 0.0f, c39107k1);
    }

    /* JADX INFO: renamed from: b */
    public float mo124629b(C39117o c39117o) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: c */
    public abstract EnumC39181m mo124630c();

    /* JADX INFO: renamed from: e */
    public abstract int mo124631e();

    /* JADX INFO: renamed from: f */
    public final void m124632f(AbstractC39104j1 abstractC39104j1, int i13, int i14, float f13) {
        m124621a(abstractC39104j1, this);
        abstractC39104j1.mo453o0(C39178j.m124794d((((long) i14) & 4294967295L) | (((long) i13) << 32), abstractC39104j1.f168210E), f13, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m124633r(AbstractC39104j1 abstractC39104j1, int i13, int i14, float f13, Function1 function1) {
        m124621a(abstractC39104j1, this);
        abstractC39104j1.mo453o0(C39178j.m124794d((((long) i14) & 4294967295L) | (((long) i13) << 32), abstractC39104j1.f168210E), f13, function1);
    }
}
