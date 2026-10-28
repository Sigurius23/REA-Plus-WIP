package p524ui;

import e93.AbstractC12889b;
import p132f0.C13776c1;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import p426qi.C30387i;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: ui.i */
/* JADX INFO: loaded from: classes.dex */
public final class C34981i implements InterfaceC34971b {

    /* JADX INFO: renamed from: E */
    public final C28633k1 f148004E;

    /* JADX INFO: renamed from: F */
    public final C28633k1 f148005F;

    /* JADX INFO: renamed from: G */
    public final C28633k1 f148006G;

    /* JADX INFO: renamed from: H */
    public final C28612f0 f148007H;

    /* JADX INFO: renamed from: I */
    public final C28633k1 f148008I;

    /* JADX INFO: renamed from: J */
    public final C28633k1 f148009J;

    /* JADX INFO: renamed from: K */
    public final C28633k1 f148010K;

    /* JADX INFO: renamed from: L */
    public final C28633k1 f148011L;

    /* JADX INFO: renamed from: M */
    public final C28612f0 f148012M;

    /* JADX INFO: renamed from: N */
    public final C28612f0 f148013N;

    /* JADX INFO: renamed from: O */
    public final C13776c1 f148014O;

    /* JADX INFO: renamed from: w */
    public final C28633k1 f148015w;

    /* JADX INFO: renamed from: x */
    public final C28633k1 f148016x;

    /* JADX INFO: renamed from: y */
    public final C28633k1 f148017y;

    /* JADX INFO: renamed from: z */
    public final C28633k1 f148018z;

    public C34981i() {
        Boolean bool = Boolean.FALSE;
        this.f148015w = AbstractC28683x.m87272z(bool);
        this.f148016x = AbstractC28683x.m87272z(1);
        this.f148017y = AbstractC28683x.m87272z(1);
        this.f148018z = AbstractC28683x.m87272z(bool);
        this.f148004E = AbstractC28683x.m87272z(null);
        this.f148005F = AbstractC28683x.m87272z(Float.valueOf(1.0f));
        this.f148006G = AbstractC28683x.m87272z(bool);
        this.f148007H = AbstractC28683x.m87264r(new C34979g(this, 1));
        this.f148008I = AbstractC28683x.m87272z(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f148009J = AbstractC28683x.m87272z(fValueOf);
        this.f148010K = AbstractC28683x.m87272z(fValueOf);
        this.f148011L = AbstractC28683x.m87272z(Long.MIN_VALUE);
        this.f148012M = AbstractC28683x.m87264r(new C34979g(this, 0));
        this.f148013N = AbstractC28683x.m87264r(new C34979g(this, 2));
        this.f148014O = new C13776c1();
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m110467a(C34981i c34981i, int i13, long j7) {
        C30387i c30387iM110470e = c34981i.m110470e();
        C28633k1 c28633k1 = c34981i.f148009J;
        C28612f0 c28612f0 = c34981i.f148007H;
        C28633k1 c28633k2 = c34981i.f148011L;
        if (c30387iM110470e == null) {
            return true;
        }
        long jLongValue = ((Number) c28633k2.getValue()).longValue() == Long.MIN_VALUE ? 0L : j7 - ((Number) c28633k2.getValue()).longValue();
        c28633k2.setValue(Long.valueOf(j7));
        AbstractC34987o abstractC34987oM110469d = c34981i.m110469d();
        float fMo110478b = abstractC34987oM110469d != null ? abstractC34987oM110469d.mo110478b(c30387iM110470e) : 0.0f;
        AbstractC34987o abstractC34987oM110469d2 = c34981i.m110469d();
        float fMo110477a = abstractC34987oM110469d2 != null ? abstractC34987oM110469d2.mo110477a(c30387iM110470e) : 1.0f;
        float fFloatValue = ((Number) c28612f0.getValue()).floatValue() * ((jLongValue / ((long) DurationKt.NANOS_IN_MILLIS)) / c30387iM110470e.m92859b());
        float fFloatValue2 = ((Number) c28612f0.getValue()).floatValue() < 0.0f ? fMo110478b - (((Number) c28633k1.getValue()).floatValue() + fFloatValue) : (((Number) c28633k1.getValue()).floatValue() + fFloatValue) - fMo110477a;
        if (fFloatValue2 < 0.0f) {
            c34981i.m110476n(AbstractC12889b.m36283m(((Number) c28633k1.getValue()).floatValue(), fMo110478b, fMo110477a) + fFloatValue);
            return true;
        }
        float f13 = fMo110477a - fMo110478b;
        int i14 = (int) (fFloatValue2 / f13);
        int i15 = i14 + 1;
        if (c34981i.m110472j() + i15 > i13) {
            c34981i.m110476n(c34981i.m110471g());
            c34981i.m110475m(i13);
            return false;
        }
        c34981i.m110475m(c34981i.m110472j() + i15);
        float f14 = fFloatValue2 - (i14 * f13);
        c34981i.m110476n(((Number) c28612f0.getValue()).floatValue() < 0.0f ? fMo110477a - f14 : fMo110478b + f14);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static final void m110468c(C34981i c34981i, boolean z4) {
        c34981i.f148015w.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC34987o m110469d() {
        return (AbstractC34987o) this.f148004E.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final C30387i m110470e() {
        return (C30387i) this.f148008I.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final float m110471g() {
        return ((Number) this.f148012M.getValue()).floatValue();
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return Float.valueOf(m110473k());
    }

    /* JADX INFO: renamed from: j */
    public final int m110472j() {
        return ((Number) this.f148016x.getValue()).intValue();
    }

    /* JADX INFO: renamed from: k */
    public final float m110473k() {
        return ((Number) this.f148010K.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: l */
    public final float m110474l() {
        return ((Number) this.f148005F.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m110475m(int i13) {
        this.f148016x.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: n */
    public final void m110476n(float f13) {
        C30387i c30387iM110470e;
        this.f148009J.setValue(Float.valueOf(f13));
        if (((Boolean) this.f148006G.getValue()).booleanValue() && (c30387iM110470e = m110470e()) != null) {
            f13 -= f13 % (1 / c30387iM110470e.f124694n);
        }
        this.f148010K.setValue(Float.valueOf(f13));
    }
}
