package lf0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import iy0.C21026a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kk1.C22541b;
import l72.C23399f;
import l72.C23401h;
import l83.C23454a0;
import ld0.C23842a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lld0/a;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "e", "(Lld0/a;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23898b {
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m70200e(C23842a state, Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-33161681);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23399f(14);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    long jM125370W0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10();
                    z13 = (i15 & 896) == 256;
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C21026a(interfaceC4339a4, 27);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM125370W0, null, null, null, 0.0f, AbstractC37817c.m121344e(-310421345, c28655q, new C22541b(state, 16)), c28655q, 12582912, 122);
                    modifier3 = modifier4;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23401h(i13, i14, 5, state, modifier3, interfaceC4339a3);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23399f(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                long jM125370W1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10();
                if ((i15 & 896) == 256) {
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C21026a(interfaceC4339a4, 27);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21026a(interfaceC4339a4, 27);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM125370W1, null, null, null, 0.0f, AbstractC37817c.m121344e(-310421345, c28655q, new C22541b(state, 16)), c28655q, 12582912, 122);
                modifier3 = modifier4;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 5, state, modifier3, interfaceC4339a3);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23399f(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                long jM125370W2 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10();
                if ((i15 & 896) == 256) {
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C21026a(interfaceC4339a4, 27);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21026a(interfaceC4339a4, 27);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM125370W2, null, null, null, 0.0f, AbstractC37817c.m121344e(-310421345, c28655q, new C22541b(state, 16)), c28655q, 12582912, 122);
                modifier3 = modifier4;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 5, state, modifier3, interfaceC4339a3);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23399f(14);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            long jM125370W3 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10();
            if ((i15 & 896) == 256) {
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C21026a(interfaceC4339a4, 27);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21026a(interfaceC4339a4, 27);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15), null, jM125370W3, null, null, null, 0.0f, AbstractC37817c.m121344e(-310421345, c28655q, new C22541b(state, 16)), c28655q, 12582912, 122);
            modifier3 = modifier4;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 5, state, modifier3, interfaceC4339a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m70201f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m70202g(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m70203h(C23842a c23842a, Composer composer, int i13) {
        int i14;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0213j c0213j;
        C23454a0 c23454a0;
        C0213j c0213j2;
        C0209i c0209i4;
        C0209i c0209i5;
        C0209i c0209i6;
        C0209i c0209i7;
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a1 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a1;
        }
        C2314t c2314t = C2314t.f9131w;
        float f13 = 8;
        Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * f13, AbstractC1102d.m3409f(1.0f, c2314t));
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j3 = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j3);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i8 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a);
        C0209i c0209i9 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m);
        C0209i c0209i10 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i10);
        }
        C0209i c0209i11 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j3);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a);
        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i10);
        }
        AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N2);
        if (c23842a.getImageUrl() == null) {
            c28655q.m87150e0(1111036874);
            c28655q.m87173q(false);
            i14 = 6;
            c0213j = c0213j3;
            c0209i2 = c0209i9;
            c0209i3 = c0209i10;
            c23454a0 = null;
            c0209i = c0209i11;
        } else {
            c28655q.m87150e0(1111036875);
            i14 = 6;
            c0209i = c0209i11;
            c0209i2 = c0209i9;
            c0209i3 = c0209i10;
            c0213j = c0213j3;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c23842a.getImageUrl(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * f13, c2314t), AbstractC33253j.m105489e(6)), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            c28655q.m87173q(false);
            c23454a0 = c23454a1;
        }
        if (c23454a0 == null) {
            c28655q = c28655q;
            c28655q.m87150e0(-102694268);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f14 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * f14, AbstractC1092a.m3358c(c2314t, c38072d.m121949b(c28655q, i15).getWhite5(), AbstractC33253j.m105489e(i14)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3419p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j2 = c0213j;
                c28655q.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                c28655q.m87178s0();
            }
            c0209i4 = c0209i8;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
            c0209i5 = c0209i2;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i7 = c0209i3;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i7);
            } else {
                c0209i7 = c0209i3;
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
            C28655q c28655q2 = c28655q;
            c0209i6 = c0209i7;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c23842a.getIcon().toWhoopIcon(), c28655q, i14), null, AbstractC1102d.m3419p(5 * f14, c2314t), c38072d.m121949b(c28655q, i15).getWhite50(), c28655q2, 432, 0);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q;
            c0213j2 = c0213j;
            c0209i4 = c0209i8;
            c0209i5 = c0209i2;
            c0209i6 = c0209i3;
            c28655q.m87150e0(-102707350);
            c28655q.m87173q(false);
        }
        float f15 = 4;
        AbstractC18489d0.m53380u(3, f15, c2314t, c28655q);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 54);
        int iHashCode4 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j2);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m4);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i6);
        }
        AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N4);
        String strM70049g = c23842a.getValue();
        C38072d c38072d2 = C38072d.f163053a;
        int i16 = C38072d.f163054b;
        C2886a c2886aM8406D = c38072d2.m121952e(c28655q, i16).getN7();
        long jM125430y = c38072d2.m121949b(c28655q, i16).getBrandWhite();
        int i17 = C2886a.f11498d << 18;
        C28655q c28655q3 = c28655q;
        AbstractC30795n.m94707h(strM70049g, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8406D, null, c28655q3, 0, i17, 196602);
        AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(1 * f15, c2314t));
        String strM70048f = c23842a.getUnit();
        if (strM70048f == null) {
            strM70048f = "";
        }
        AbstractC30795n.m94707h(strM70048f, null, c38072d2.m121949b(c28655q3, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i16).getB3(), null, c28655q3, 0, i17, 196602);
        c28655q3.m87173q(true);
        AbstractC30795n.m94707h(c23842a.getFormattedDateTime(), null, c38072d2.m121949b(c28655q3, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i16).getB3(), null, c28655q3, 0, i17, 196602);
        c28655q3.m87173q(true);
        C17750h1 c17750h1M70047e = c23842a.getTag();
        if (c17750h1M70047e == null) {
            c28655q3.m87150e0(60162053);
            c28655q3.m87173q(false);
        } else {
            AbstractC22953f.m66715b(c28655q3, AbstractC18489d0.m53365f(c28655q3, 60162054, f15, f15, c2314t));
            AbstractC17746g1.m50872h(c17750h1M70047e, null, null, c28655q3, C17750h1.f69012w | 384, 2);
            c28655q3.m87173q(false);
        }
        c28655q3.m87173q(true);
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m70204i(C23842a c23842a, Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m70200e(c23842a, modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
