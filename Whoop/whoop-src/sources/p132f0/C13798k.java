package p132f0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import l83.C23454a0;
import p005a3.AbstractC0233o;
import p095dp.AbstractC12240d;
import p181h2.C16620e;
import p208i2.AbstractC17918w0;
import p249jc.AbstractC21598x;
import p291l0.InterfaceC22973k1;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34462h0;
import p636y3.C39185q;
import p636y3.InterfaceC39171c;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C13798k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC39171c f49233a;

    /* JADX INFO: renamed from: b */
    public long f49234b = 9205357640488583168L;

    /* JADX INFO: renamed from: c */
    public final C13787g0 f49235c;

    /* JADX INFO: renamed from: d */
    public final C28633k1 f49236d;

    /* JADX INFO: renamed from: e */
    public final boolean f49237e;

    /* JADX INFO: renamed from: f */
    public boolean f49238f;

    /* JADX INFO: renamed from: g */
    public long f49239g;

    /* JADX INFO: renamed from: h */
    public long f49240h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0233o f49241i;

    public C13798k(Context context, InterfaceC39171c interfaceC39171c, long j7, InterfaceC22973k1 interfaceC22973k1) {
        this.f49233a = interfaceC39171c;
        C13787g0 c13787g0 = new C13787g0(context, AbstractC17918w0.m51506H(j7));
        this.f49235c = c13787g0;
        this.f49236d = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
        this.f49237e = true;
        this.f49239g = 0L;
        this.f49240h = -1L;
        C34462h0 c34462h0M108902a = AbstractC34452c0.m108902a(new C13795j(this));
        this.f49241i = Build.VERSION.SDK_INT >= 31 ? new C13827t1(c34462h0M108902a, this, c13787g0) : new C13802l0(c34462h0M108902a, this, c13787g0, interfaceC22973k1);
    }

    /* JADX INFO: renamed from: a */
    public final void m39161a() {
        boolean z4;
        C13787g0 c13787g0 = this.f49235c;
        EdgeEffect edgeEffect = c13787g0.f49186d;
        boolean z13 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = !edgeEffect.isFinished();
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = c13787g0.f49187e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 = !edgeEffect2.isFinished() || z4;
        }
        EdgeEffect edgeEffect3 = c13787g0.f49188f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 = !edgeEffect3.isFinished() || z4;
        }
        EdgeEffect edgeEffect4 = c13787g0.f49189g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z4) {
                z13 = false;
            }
            z4 = z13;
        }
        if (z4) {
            m39164d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: b */
    public final Object m39162b(long j7, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C13792i c13792i;
        float fM34072i;
        float fM34072i2;
        long j13;
        if (abstractC32269c instanceof C13792i) {
            c13792i = (C13792i) abstractC32269c;
            int i13 = c13792i.f49218z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13792i.f49218z = i13 - Integer.MIN_VALUE;
            } else {
                c13792i = new C13792i(this, abstractC32269c);
            }
        } else {
            c13792i = new C13792i(this, abstractC32269c);
        }
        Object objInvoke = c13792i.f49216x;
        Object obj = EnumC31071a.f128113w;
        int i14 = c13792i.f49218z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C13787g0 c13787g0 = this.f49235c;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            if (C16620e.m47214f(this.f49239g)) {
                Object objM124810a = C39185q.m124810a(j7);
                c13792i.f49218z = 1;
                if (interfaceC4351m.invoke(objM124810a, c13792i) != obj) {
                    return c23454a0;
                }
            } else {
                boolean zM39141g = C13787g0.m39141g(c13787g0.f49188f);
                InterfaceC39171c interfaceC39171c = this.f49233a;
                if (!zM39141g || C39185q.m124813d(j7) >= 0.0f) {
                    fM34072i = (!C13787g0.m39141g(c13787g0.f49189g) || C39185q.m124813d(j7) <= 0.0f) ? 0.0f : -AbstractC12240d.m34072i(c13787g0.m39145d(), -C39185q.m124813d(j7), Float.intBitsToFloat((int) (this.f49239g >> 32)), interfaceC39171c);
                } else {
                    fM34072i = AbstractC12240d.m34072i(c13787g0.m39144c(), C39185q.m124813d(j7), Float.intBitsToFloat((int) (this.f49239g >> 32)), interfaceC39171c);
                }
                if (!C13787g0.m39141g(c13787g0.f49186d) || C39185q.m124814e(j7) >= 0.0f) {
                    fM34072i2 = (!C13787g0.m39141g(c13787g0.f49187e) || C39185q.m124814e(j7) <= 0.0f) ? 0.0f : -AbstractC12240d.m34072i(c13787g0.m39143b(), -C39185q.m124814e(j7), Float.intBitsToFloat((int) (4294967295L & this.f49239g)), interfaceC39171c);
                } else {
                    fM34072i2 = AbstractC12240d.m34072i(c13787g0.m39146e(), C39185q.m124814e(j7), Float.intBitsToFloat((int) (4294967295L & this.f49239g)), interfaceC39171c);
                }
                long jM100047a = AbstractC32128i.m100047a(fM34072i, fM34072i2);
                if (!C39185q.m124812c(jM100047a)) {
                    m39164d();
                }
                long jM124815f = C39185q.m124815f(j7, jM100047a);
                Object objM124810a2 = C39185q.m124810a(jM124815f);
                c13792i.f49215w = jM124815f;
                c13792i.f49218z = 2;
                objInvoke = interfaceC4351m.invoke(objM124810a2, c13792i);
                if (objInvoke != obj) {
                    j13 = jM124815f;
                }
            }
            return obj;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objInvoke);
            return c23454a0;
        }
        if (i14 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j13 = c13792i.f49215w;
        AbstractC34132o.m107864I(objInvoke);
        long jM124815f2 = C39185q.m124815f(j13, ((C39185q) objInvoke).m124819j());
        this.f49238f = false;
        if (C39185q.m124813d(jM124815f2) > 0.0f) {
            AbstractC12240d.m34051Q(c13787g0.m39144c(), AbstractC12889b.m36258X(C39185q.m124813d(jM124815f2)));
        } else if (C39185q.m124813d(jM124815f2) < 0.0f) {
            AbstractC12240d.m34051Q(c13787g0.m39145d(), -AbstractC12889b.m36258X(C39185q.m124813d(jM124815f2)));
        }
        if (C39185q.m124814e(jM124815f2) > 0.0f) {
            AbstractC12240d.m34051Q(c13787g0.m39146e(), AbstractC12889b.m36258X(C39185q.m124814e(jM124815f2)));
        } else if (C39185q.m124814e(jM124815f2) < 0.0f) {
            AbstractC12240d.m34051Q(c13787g0.m39143b(), -AbstractC12889b.m36258X(C39185q.m124814e(jM124815f2)));
        }
        m39161a();
        return c23454a0;
    }

    /* JADX INFO: renamed from: c */
    public final long m39163c() {
        long jM60656L = this.f49234b;
        if ((9223372034707292159L & jM60656L) == 9205357640488583168L) {
            jM60656L = AbstractC21598x.m60656L(this.f49239g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM60656L >> 32)) / Float.intBitsToFloat((int) (this.f49239g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM60656L & 4294967295L)) / Float.intBitsToFloat((int) (this.f49239g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: d */
    public final void m39164d() {
        if (this.f49237e) {
            this.f49236d.setValue(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m39165e(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m39163c() >> 32));
        int i13 = (int) (j7 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i13) / Float.intBitsToFloat((int) (this.f49239g & 4294967295L));
        EdgeEffect edgeEffectM39143b = this.f49235c.m39143b();
        return AbstractC12240d.m34041G(edgeEffectM39143b) == 0.0f ? Float.intBitsToFloat((int) (this.f49239g & 4294967295L)) * (-AbstractC12240d.m34052R(edgeEffectM39143b, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) : Float.intBitsToFloat(i13);
    }

    /* JADX INFO: renamed from: f */
    public final float m39166f(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m39163c() & 4294967295L));
        int i13 = (int) (j7 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i13) / Float.intBitsToFloat((int) (this.f49239g >> 32));
        EdgeEffect edgeEffectM39144c = this.f49235c.m39144c();
        return AbstractC12240d.m34041G(edgeEffectM39144c) == 0.0f ? Float.intBitsToFloat((int) (this.f49239g >> 32)) * AbstractC12240d.m34052R(edgeEffectM39144c, fIntBitsToFloat2, 1 - fIntBitsToFloat) : Float.intBitsToFloat(i13);
    }

    /* JADX INFO: renamed from: g */
    public final float m39167g(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m39163c() & 4294967295L));
        int i13 = (int) (j7 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i13) / Float.intBitsToFloat((int) (this.f49239g >> 32));
        EdgeEffect edgeEffectM39145d = this.f49235c.m39145d();
        return AbstractC12240d.m34041G(edgeEffectM39145d) == 0.0f ? Float.intBitsToFloat((int) (this.f49239g >> 32)) * (-AbstractC12240d.m34052R(edgeEffectM39145d, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i13);
    }

    /* JADX INFO: renamed from: h */
    public final float m39168h(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m39163c() >> 32));
        int i13 = (int) (j7 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i13) / Float.intBitsToFloat((int) (this.f49239g & 4294967295L));
        EdgeEffect edgeEffectM39146e = this.f49235c.m39146e();
        return AbstractC12240d.m34041G(edgeEffectM39146e) == 0.0f ? Float.intBitsToFloat((int) (this.f49239g & 4294967295L)) * AbstractC12240d.m34052R(edgeEffectM39146e, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i13);
    }

    /* JADX INFO: renamed from: i */
    public final void m39169i(long j7) {
        boolean zM47210b = C16620e.m47210b(this.f49239g, 0L);
        boolean zM47210b2 = C16620e.m47210b(j7, this.f49239g);
        this.f49239g = j7;
        if (!zM47210b2) {
            int iM36258X = AbstractC12889b.m36258X(Float.intBitsToFloat((int) (j7 >> 32)));
            long jM36258X = (((long) AbstractC12889b.m36258X(Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L) | (((long) iM36258X) << 32);
            C13787g0 c13787g0 = this.f49235c;
            c13787g0.f49185c = jM36258X;
            EdgeEffect edgeEffect = c13787g0.f49186d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM36258X >> 32), (int) (jM36258X & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c13787g0.f49187e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM36258X >> 32), (int) (jM36258X & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c13787g0.f49188f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM36258X & 4294967295L), (int) (jM36258X >> 32));
            }
            EdgeEffect edgeEffect4 = c13787g0.f49189g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM36258X & 4294967295L), (int) (jM36258X >> 32));
            }
            EdgeEffect edgeEffect5 = c13787g0.f49190h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM36258X >> 32), (int) (jM36258X & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c13787g0.f49191i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM36258X >> 32), (int) (jM36258X & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c13787g0.f49192j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM36258X & 4294967295L), (int) (jM36258X >> 32));
            }
            EdgeEffect edgeEffect8 = c13787g0.f49193k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM36258X), (int) (jM36258X >> 32));
            }
        }
        if (zM47210b || zM47210b2) {
            return;
        }
        m39161a();
    }
}
