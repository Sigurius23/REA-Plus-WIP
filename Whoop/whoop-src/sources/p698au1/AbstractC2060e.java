package p698au1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import kotlin.C2012k;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17903p;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rs1.AbstractC31794f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: au1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2060e {
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x019f  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m6486d(Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC4339a interfaceC4339a5;
        boolean z13;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a6;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-910862887);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C2012k(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(c38072d.m121951d().getTinyIcons().getTinyInformation(), c28655q, 0);
                int i19 = C38072d.f163054b;
                interfaceC4339a5 = interfaceC4339a4;
                AbstractC29125c.m88522c(abstractC26165aM88500I, null, null, null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q, i19).getWhite50(), 5), c28655q, 48, 60);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC31794f.f131635Q);
                C2886a c2886aM8436q = c38072d.m121952e(c28655q, i19).getH3();
                long jM125430y = c38072d.m121949b(c28655q, i19).getBrandWhite();
                int i24 = C2886a.f11498d << 18;
                Modifier modifier4 = modifier3;
                AbstractC30795n.m94707h(strM92103Y, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q, 0, i24, 196602);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC31794f.f131634P), null, c38072d.m121949b(c28655q, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getH3(), null, c28655q, 0, i24, 196602);
                EnumC27284v enumC27284v = EnumC27284v.TextSmall;
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC31794f.f131657g);
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (!z13 || objM87133R == c28676v0) {
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R = new C2073r(interfaceC4339a6, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                }
                AbstractC27282u.m82292h(null, enumC27284v, strM92103Y2, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 121);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a6;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2059d(modifier2, interfaceC4339a3, i13, i14, 0);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i15;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C2012k(1);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9111N, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(c38072d2.m121951d().getTinyIcons().getTinyInformation(), c28655q, 0);
            int i110 = C38072d.f163054b;
            interfaceC4339a5 = interfaceC4339a4;
            AbstractC29125c.m88522c(abstractC26165aM88500I2, null, null, null, null, 0.0f, new C17903p(c38072d2.m121949b(c28655q, i110).getWhite50(), 5), c28655q, 48, 60);
            String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC31794f.f131635Q);
            C2886a c2886aM8436q2 = c38072d2.m121952e(c28655q, i110).getH3();
            long jM125430y2 = c38072d2.m121949b(c28655q, i110).getBrandWhite();
            int i25 = C2886a.f11498d << 18;
            Modifier modifier5 = modifier3;
            AbstractC30795n.m94707h(strM92103Y3, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q2, null, c28655q, 0, i25, 196602);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC31794f.f131634P), null, c38072d2.m121949b(c28655q, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getH3(), null, c28655q, 0, i25, 196602);
            EnumC27284v enumC27284v2 = EnumC27284v.TextSmall;
            String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC31794f.f131657g);
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                interfaceC4339a6 = interfaceC4339a5;
                objM87133R = new C2073r(interfaceC4339a6, 1);
                c28655q.m87172p0(objM87133R);
            } else {
                interfaceC4339a6 = interfaceC4339a5;
                objM87133R = new C2073r(interfaceC4339a6, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(null, enumC27284v2, strM92103Y4, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 121);
            c28655q = c28655q;
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a6;
            modifier2 = modifier5;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2059d(modifier2, interfaceC4339a3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m6487e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m6488f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m6489g(Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m6486d(modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
