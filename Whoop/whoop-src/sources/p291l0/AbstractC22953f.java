package p291l0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bp0.C3529q;
import c93.InterfaceC4351m;
import f61.C14143e;
import hb3.AbstractC17104a0;
import j02.C21174w;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p027b3.AbstractC2453v1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p543v4.C35643b;
import p635y2.AbstractC39104j1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p669z2.C40005h;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22953f {

    /* JADX INFO: renamed from: a */
    public static final C22949e f90589a = new C22949e(0);

    /* JADX INFO: renamed from: b */
    public static final C22949e f90590b = new C22949e(1);

    /* JADX INFO: renamed from: c */
    public static final C22949e f90591c = new C22949e(2);

    /* JADX INFO: renamed from: d */
    public static final C40005h f90592d = new C40005h(new C21174w(17));

    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:57:0x0091  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m66714a(Modifier modifier, InterfaceC2302h interfaceC2302h, boolean z4, Function3 function3, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        InterfaceC2302h interfaceC2302h2;
        Modifier modifier2;
        boolean z15;
        C28677v1 c28677v1M87180u;
        InterfaceC2302h interfaceC2302h3;
        InterfaceC39127r0 interfaceC39127r0M66763d;
        boolean zM87153g;
        Object objM87133R;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(380139498);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(interfaceC2302h) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function3)) {
                    i16 = 2048;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    modifier = C2314t.f9131w;
                }
                if (i18 != 0) {
                    interfaceC2302h3 = C2299e.f9114w;
                } else {
                    interfaceC2302h3 = interfaceC2302h;
                }
                if (i19 != 0) {
                    z13 = false;
                }
                interfaceC39127r0M66763d = AbstractC22989q.m66763d(interfaceC2302h3, z13);
                zM87153g = c28655q.m87153g(interfaceC39127r0M66763d) | ((i15 & 7168) == 2048);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3529q(2, interfaceC39127r0M66763d, function3);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC39125q1.m124656b(modifier, (InterfaceC4351m) objM87133R, c28655q, i15 & 14, 0);
                interfaceC2302h2 = interfaceC2302h3;
            } else {
                c28655q.m87138X();
                interfaceC2302h2 = interfaceC2302h;
            }
            modifier2 = modifier;
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(i13, i14, 6, modifier2, interfaceC2302h2, function3, z15);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(function3)) {
                i16 = 2048;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                modifier = C2314t.f9131w;
            }
            if (i18 != 0) {
                interfaceC2302h3 = C2299e.f9114w;
            } else {
                interfaceC2302h3 = interfaceC2302h;
            }
            if (i19 != 0) {
                z13 = false;
            }
            interfaceC39127r0M66763d = AbstractC22989q.m66763d(interfaceC2302h3, z13);
            zM87153g = c28655q.m87153g(interfaceC39127r0M66763d) | ((i15 & 7168) == 2048);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = new C3529q(2, interfaceC39127r0M66763d, function3);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3529q(2, interfaceC39127r0M66763d, function3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39125q1.m124656b(modifier, (InterfaceC4351m) objM87133R, c28655q, i15 & 14, 0);
            interfaceC2302h2 = interfaceC2302h3;
        } else {
            c28655q.m87138X();
            interfaceC2302h2 = interfaceC2302h;
        }
        modifier2 = modifier;
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14143e(i13, i14, 6, modifier2, interfaceC2302h2, function3, z15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m66715b(Composer composer, Modifier modifier) {
        C22986p c22986p = C22986p.f90678c;
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifier);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c22986p);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        c28655q.m87173q(true);
    }

    /* JADX INFO: renamed from: c */
    public static C22966i0 m66716c(float f13) {
        return new C22966i0(f13, 0, 0, 0);
    }

    /* JADX INFO: renamed from: e */
    public static final C23011x0 m66717e(InterfaceC22940b2 interfaceC22940b2, Composer composer) {
        return new C23011x0(interfaceC22940b2, (InterfaceC39171c) ((C28655q) composer).m87161k(AbstractC2453v1.f9569h));
    }

    /* JADX INFO: renamed from: g */
    public static final C22985o1 m66718g(InterfaceC39124q0 interfaceC39124q0) {
        Object objMo454p = interfaceC39124q0.mo454p();
        if (objMo454p instanceof C22985o1) {
            return (C22985o1) objMo454p;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final float m66719h(C22985o1 c22985o1) {
        if (c22985o1 != null) {
            return c22985o1.f90674a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public static final Modifier m66720i(Modifier modifier) {
        return AbstractC37056f.m118997u(modifier, new C22952e2(0));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC39130s0 m66721j(InterfaceC22982n1 interfaceC22982n1, int i13, int i14, int i15, int i16, int i17, InterfaceC39133t0 interfaceC39133t0, List list, AbstractC39104j1[] abstractC39104j1Arr, int i18, int i19, int[] iArr, int i24) {
        int i25;
        int i26;
        float f13;
        boolean z4;
        int iMax;
        int i27;
        int i28;
        int i29;
        int i34;
        List list2 = list;
        long j7 = i17;
        int i35 = i19 - i18;
        int[] iArr2 = new int[i35];
        int i36 = i18;
        int iMax2 = 0;
        int i37 = 0;
        boolean z13 = false;
        int i38 = 0;
        int iMin = 0;
        float f14 = 0.0f;
        while (i36 < i19) {
            InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) list2.get(i36);
            long j13 = j7;
            C22985o1 c22985o1M66718g = m66718g(interfaceC39124q0);
            float fM66719h = m66719h(c22985o1M66718g);
            if (z13) {
                z13 = true;
            } else {
                AbstractC22953f abstractC22953f = c22985o1M66718g != null ? c22985o1M66718g.f90676c : null;
                if (abstractC22953f != null ? abstractC22953f instanceof C22938b0 : false) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            if (fM66719h > 0.0f) {
                f14 += fM66719h;
                i37++;
                i28 = i36;
            } else {
                int i39 = i15 - i38;
                AbstractC39104j1 abstractC39104j1Mo448T = abstractC39104j1Arr[i36];
                if (abstractC39104j1Mo448T == null) {
                    if (i15 == Integer.MAX_VALUE) {
                        i28 = i36;
                        i29 = i37;
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i28 = i36;
                        i29 = i37;
                        i34 = i39 < 0 ? 0 : i39;
                    }
                    abstractC39104j1Mo448T = interfaceC39124q0.mo448T(interfaceC22982n1.mo66754g(0, i34, i16, false));
                } else {
                    i28 = i36;
                    i29 = i37;
                }
                int iMo66755h = interfaceC22982n1.mo66755h(abstractC39104j1Mo448T);
                int iMo66753f = interfaceC22982n1.mo66753f(abstractC39104j1Mo448T);
                iArr2[i28 - i18] = iMo66755h;
                int i44 = i39 - iMo66755h;
                if (i44 < 0) {
                    i44 = 0;
                }
                iMin = Math.min(i17, i44);
                i38 += iMo66755h + iMin;
                iMax2 = Math.max(iMax2, iMo66753f);
                abstractC39104j1Arr[i28] = abstractC39104j1Mo448T;
                i37 = i29;
            }
            i36 = i28 + 1;
            j7 = j13;
        }
        long j14 = j7;
        int i45 = i37;
        boolean z14 = true;
        if (i45 == 0) {
            i38 -= iMin;
            i25 = 0;
        } else {
            long j15 = ((long) (i45 - 1)) * j14;
            long jRound = ((long) ((i15 != Integer.MAX_VALUE ? i15 : i13) - i38)) - j15;
            if (jRound < 0) {
                jRound = 0;
            }
            float f15 = jRound / f14;
            int i46 = i18;
            while (i46 < i19) {
                jRound -= (long) Math.round(m66719h(m66718g((InterfaceC39124q0) list2.get(i46))) * f15);
                i46++;
                j15 = j15;
            }
            long j16 = j15;
            int i47 = i18;
            int i48 = 0;
            while (i47 < i19) {
                if (abstractC39104j1Arr[i47] == null) {
                    InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) list2.get(i47);
                    C22985o1 c22985o1M66718g2 = m66718g(interfaceC39124q1);
                    float fM66719h2 = m66719h(c22985o1M66718g2);
                    if (!(fM66719h2 > 0.0f ? z14 : false)) {
                        AbstractC24868a.m72900b("All weights <= 0 should have placeables");
                    }
                    i26 = i47;
                    int iSignum = Long.signum(jRound);
                    f13 = f15;
                    jRound -= (long) iSignum;
                    int iMax3 = Math.max(0, Math.round(f13 * fM66719h2) + iSignum);
                    z4 = z14;
                    AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q1.mo448T(interfaceC22982n1.mo66754g((!(c22985o1M66718g2 != null ? c22985o1M66718g2.f90675b : z14) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, iMax3, i16, z4));
                    int iMo66755h2 = interfaceC22982n1.mo66755h(abstractC39104j1Mo448T2);
                    int iMo66753f2 = interfaceC22982n1.mo66753f(abstractC39104j1Mo448T2);
                    iArr2[i26 - i18] = iMo66755h2;
                    i48 += iMo66755h2;
                    int iMax4 = Math.max(iMax2, iMo66753f2);
                    abstractC39104j1Arr[i26] = abstractC39104j1Mo448T2;
                    iMax2 = iMax4;
                } else {
                    i26 = i47;
                    f13 = f15;
                    z4 = z14;
                }
                list2 = list;
                z14 = z4;
                i47 = i26 + 1;
                f15 = f13;
            }
            i25 = (int) (((long) i48) + j16);
            int i49 = i15 - i38;
            if (i25 < 0) {
                i25 = 0;
            }
            if (i25 > i49) {
                i25 = i49;
            }
        }
        if (z13) {
            int iMax5 = 0;
            iMax = 0;
            for (int i54 = i18; i54 < i19; i54++) {
                AbstractC39104j1 abstractC39104j1 = abstractC39104j1Arr[i54];
                AbstractC22676k.m65747g(abstractC39104j1);
                Object objMo454p = abstractC39104j1.mo454p();
                C22985o1 c22985o1 = objMo454p instanceof C22985o1 ? (C22985o1) objMo454p : null;
                AbstractC22953f abstractC22953f2 = c22985o1 != null ? c22985o1.f90676c : null;
                Integer numMo66708f = abstractC22953f2 != null ? abstractC22953f2.mo66708f(abstractC39104j1) : null;
                if (numMo66708f != null) {
                    int iIntValue = numMo66708f.intValue();
                    int iMo66753f3 = interfaceC22982n1.mo66753f(abstractC39104j1);
                    iMax5 = Math.max(iMax5, iIntValue != Integer.MIN_VALUE ? numMo66708f.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iMo66753f3;
                    }
                    iMax = Math.max(iMax, iMo66753f3 - iIntValue);
                }
            }
            i27 = iMax5;
        } else {
            iMax = 0;
            i27 = 0;
        }
        int i55 = i38 + i25;
        int iMax6 = Math.max(i55 < 0 ? 0 : i55, i13);
        int iMax7 = Math.max(iMax2, Math.max(i14, iMax + i27));
        int[] iArr3 = new int[i35];
        interfaceC22982n1.mo66757j(iMax6, iArr2, iArr3, interfaceC39133t0);
        return interfaceC22982n1.mo66756i(abstractC39104j1Arr, interfaceC39133t0, i27, iArr3, iMax6, iMax7, iArr, i24, i18, i19);
    }

    /* JADX INFO: renamed from: k */
    public static final Modifier m66722k(Modifier modifier) {
        return AbstractC37056f.m118997u(modifier, new C22956f2(0));
    }

    /* JADX INFO: renamed from: l */
    public static final Modifier m66723l(Modifier modifier) {
        return AbstractC37056f.m118997u(modifier, new C22952e2(1));
    }

    /* JADX INFO: renamed from: m */
    public static final Modifier m66724m(Modifier modifier) {
        return AbstractC37056f.m118997u(modifier, new C22956f2(1));
    }

    /* JADX INFO: renamed from: n */
    public static final Modifier m66725n(Modifier modifier) {
        return AbstractC37056f.m118997u(modifier, new C22952e2(2));
    }

    /* JADX INFO: renamed from: o */
    public static final C23014y0 m66726o(C35643b c35643b) {
        return new C23014y0(c35643b.f151449a, c35643b.f151450b, c35643b.f151451c, c35643b.f151452d);
    }

    /* JADX INFO: renamed from: p */
    public static final Modifier m66727p(Modifier modifier, InterfaceC22940b2 interfaceC22940b2) {
        return AbstractC37056f.m118997u(modifier, new C22948d2(interfaceC22940b2, 1));
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo66707d(int i13, EnumC39181m enumC39181m, AbstractC39104j1 abstractC39104j1, int i14);

    /* JADX INFO: renamed from: f */
    public Integer mo66708f(AbstractC39104j1 abstractC39104j1) {
        return null;
    }
}
