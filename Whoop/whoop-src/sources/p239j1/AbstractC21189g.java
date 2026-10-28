package p239j1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p007a6.C0428i;
import p014aj.C0929d;
import p026b2.C2299e;
import p040c0.C3748i1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p088dc.AbstractC11895b;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15158u2;
import p163g1.C14970c1;
import p163g1.C15137s1;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.C17919x;
import p208i2.InterfaceC17910s0;
import p209i3.AbstractC18032n;
import p249jc.AbstractC21598x;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p710im1.C18683m0;
import p710im1.C18689p0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: j1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21189g {

    /* JADX INFO: renamed from: a */
    public static final float f80739a = 40;

    /* JADX INFO: renamed from: b */
    public static final C33252i f80740b = AbstractC33253j.f138651a;

    /* JADX INFO: renamed from: c */
    public static final float f80741c = (float) 7.5d;

    /* JADX INFO: renamed from: d */
    public static final float f80742d = (float) 2.5d;

    /* JADX INFO: renamed from: e */
    public static final float f80743e = 10;

    /* JADX INFO: renamed from: f */
    public static final float f80744f = 5;

    /* JADX INFO: renamed from: g */
    public static final float f80745g = 6;

    /* JADX INFO: renamed from: h */
    public static final C11347e2 f80746h = AbstractC11348f.m30574v(300, 0, AbstractC11333b0.f36312c, 2);

    /* JADX INFO: renamed from: a */
    public static final void m59423a(final C21194l c21194l, final long j7, Modifier modifier, Composer composer, final int i13) {
        Modifier modifier2;
        Object obj;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-486016981);
        int i14 = i13 | (c28655q.m87157i(c21194l) ? 4 : 2) | (c28655q.m87151f(j7) ? 32 : 16);
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                obj = objM87133R;
                C17891j c17891jM51478a = AbstractC17897m.m51478a();
                c17891jM51478a.m51465l(1);
                c28655q.m87172p0(c17891jM51478a);
                obj = c17891jM51478a;
            }
            obj = objM87133R;
            final InterfaceC17910s0 interfaceC17910s0 = (InterfaceC17910s0) obj;
            boolean zM87153g = c28655q.m87153g(c21194l);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87264r(new C21185c(c21194l, 0));
                c28655q.m87172p0(objM87133R2);
            }
            final InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(((Number) ((InterfaceC28670t2) objM87133R2).getValue()).floatValue(), f80746h, null, null, c28655q, 48, 28);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C18689p0(21);
                c28655q.m87172p0(objM87133R3);
            }
            modifier2 = modifier;
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifier2, false, (Function1) objM87133R3);
            boolean zM87157i = c28655q.m87157i(c21194l) | c28655q.m87153g(interfaceC28670t2M30588b) | ((i14 & 112) == 32) | c28655q.m87157i(interfaceC17910s0);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                Function1 function1 = new Function1() { // from class: j1.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) throws Throwable {
                        long j13;
                        long j14 = j7;
                        InterfaceC17910s0 interfaceC17910s1 = interfaceC17910s0;
                        InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj2;
                        C21194l c21194l2 = c21194l;
                        float fM59426a = c21194l2.m59426a() / c21194l2.f80762g.m87022x();
                        float fMax = (Math.max(Math.min(1.0f, fM59426a) - 0.4f, 0.0f) * 5) / 3;
                        float fAbs = Math.abs(fM59426a) - 1.0f;
                        float f13 = fAbs >= 0.0f ? fAbs : 0.0f;
                        if (f13 > 2.0f) {
                            f13 = 2.0f;
                        }
                        float fPow = (((0.4f * fMax) - 0.25f) + (f13 - (((float) Math.pow(f13, 2)) / 4))) * 0.5f;
                        float f14 = 360;
                        float f15 = fPow * f14;
                        float f16 = ((0.8f * fMax) + fPow) * f14;
                        C3748i1 c3748i1 = new C3748i1(fPow, f15, f16, Math.min(1.0f, fMax));
                        float fFloatValue = ((Number) interfaceC28670t2M30588b.getValue()).floatValue();
                        long jMo721B0 = interfaceC22131e.mo721B0();
                        C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
                        long jM670A = c0237pMo744t0.m670A();
                        c0237pMo744t0.m716w().mo51426q();
                        try {
                            ((C0929d) c0237pMo744t0.f812x).m2358v(fPow, jMo721B0);
                            float fMo743q0 = interfaceC22131e.mo743q0(AbstractC21189g.f80741c);
                            float f17 = AbstractC21189g.f80742d;
                            float fMo743q1 = (interfaceC22131e.mo743q0(f17) / 2.0f) + fMo743q0;
                            try {
                                C16618c c16618c = new C16618c(Float.intBitsToFloat((int) (AbstractC21598x.m60656L(interfaceC22131e.mo731d()) >> 32)) - fMo743q1, Float.intBitsToFloat((int) (AbstractC21598x.m60656L(interfaceC22131e.mo731d()) & 4294967295L)) - fMo743q1, Float.intBitsToFloat((int) (AbstractC21598x.m60656L(interfaceC22131e.mo731d()) >> 32)) + fMo743q1, Float.intBitsToFloat((int) (AbstractC21598x.m60656L(interfaceC22131e.mo731d()) & 4294967295L)) + fMo743q1);
                                try {
                                    InterfaceC22131e.m63380P(interfaceC22131e, j14, f15, f16 - f15, c16618c.m47200f(), c16618c.m47199e(), fFloatValue, new C22135i(interfaceC22131e.mo743q0(f17), 0.0f, 2, 0, null, 26), 768);
                                    AbstractC21189g.m59425c(interfaceC22131e, interfaceC17910s1, c16618c, j14, fFloatValue, c3748i1);
                                    AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                                    return C23454a0.f92919a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    j13 = jM670A;
                                    AbstractC11266d.m30472z(c0237pMo744t0, j13);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j13 = jM670A;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            j13 = jM670A;
                        }
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R4 = function1;
            }
            AbstractC21478l0.m60421a(modifierM51775c, (Function1) objM87133R4, c28655q, 0);
        } else {
            modifier2 = modifier;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final Modifier modifier3 = modifier2;
            c28677v1M87180u.f115982d = new InterfaceC4351m(j7, modifier3, i13) { // from class: j1.e

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ long f80735x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ Modifier f80736y;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM87244L = AbstractC28683x.m87244L(385);
                    AbstractC21189g.m59423a(this.f80734w, this.f80735x, this.f80736y, (Composer) obj2, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m59424b(final boolean z4, final C21194l c21194l, final Modifier modifier, long j7, long j13, Composer composer, final int i13) {
        int i14;
        final long j14;
        final long j15;
        int i15;
        long j16;
        long jM43101b;
        C17919x c17919xM31989h;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(308716636);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        int i16 = i14 | (c28655q.m87157i(c21194l) ? 32 : 16) | (c28655q.m87153g(modifier) ? 256 : 128) | 205824;
        if (c28655q.m87135U(i16 & 1, (74899 & i16) != 74898)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                long jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
                i15 = i16 & (-64513);
                j16 = jM43093h;
                jM43101b = AbstractC14981d1.m43101b(jM43093h, c28655q);
            } else {
                c28655q.m87138X();
                i15 = i16 & (-64513);
                j16 = j7;
                jM43101b = j13;
            }
            c28655q.m87175r();
            int i17 = i15 & 14;
            boolean zM87153g = (i17 == 4) | c28655q.m87153g(c21194l);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87264r(new C18683m0(z4, c21194l, 2));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            C15137s1 c15137s1 = (C15137s1) c28655q.m87161k(AbstractC15158u2.f56854a);
            if (c15137s1 == null) {
                c28655q.m87150e0(1453247536);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(323973617);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, c15137s1.m43186a(j16, f80745g, c28655q, 48));
            }
            long j17 = c17919xM31989h != null ? c17919xM31989h.f69639a : j16;
            Modifier modifierM3486a = AbstractC1127a.m3486a(AbstractC1125a.m3480c(AbstractC1102d.m3419p(f80739a, modifier), new C18689p0(22)), new C0428i(c21194l, 18));
            float f13 = ((Boolean) interfaceC28670t2.getValue()).booleanValue() ? f80745g : 0;
            C33252i c33252i = f80740b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC12889b.m36262a0(modifierM3486a, f13, c33252i, true, 0L, 0L, 24), j17, c33252i);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            long j18 = jM43101b;
            AbstractC29125c.m88520b(Boolean.valueOf(z4), null, AbstractC11348f.m30574v(100, 0, null, 6), null, AbstractC37817c.m121344e(1853731063, c28655q, new C21188f(j18, c21194l)), c28655q, i17 | 24960, 10);
            c28655q = c28655q;
            c28655q.m87173q(true);
            j15 = j18;
            j14 = j16;
        } else {
            c28655q.m87138X();
            j14 = j7;
            j15 = j13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: j1.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC21189g.m59424b(z4, c21194l, modifier, j14, j15, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m59425c(InterfaceC22131e interfaceC22131e, InterfaceC17910s0 interfaceC17910s0, C16618c c16618c, long j7, float f13, C3748i1 c3748i1) {
        C17891j c17891j = (C17891j) interfaceC17910s0;
        c17891j.m51464k();
        c17891j.m51462i(0.0f, 0.0f);
        float f14 = f80743e;
        float fMo743q0 = interfaceC22131e.mo743q0(f14);
        float f15 = c3748i1.f15325b;
        c17891j.m51461h(fMo743q0 * f15, 0.0f);
        c17891j.m51461h((interfaceC22131e.mo743q0(f14) * f15) / 2, interfaceC22131e.mo743q0(f80744f) * f15);
        c17891j.m51466m((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c16618c.m47198d() >> 32)) + (Math.min(c16618c.f63941c - c16618c.f63939a, c16618c.f63942d - c16618c.f63940b) / 2.0f)) - ((interfaceC22131e.mo743q0(f14) * f15) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits((interfaceC22131e.mo743q0(f80742d) / 2.0f) + Float.intBitsToFloat((int) (c16618c.m47198d() & 4294967295L)))) & 4294967295L));
        c17891j.m51459f();
        float f16 = c3748i1.f15324a;
        long jMo721B0 = interfaceC22131e.mo721B0();
        C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(f16, jMo721B0);
            InterfaceC22131e.m63386z(interfaceC22131e, c17891j, j7, f13, null, 56);
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }
}
