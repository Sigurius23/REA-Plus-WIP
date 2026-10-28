package p719m22;

import a22.AbstractC0173b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import l83.C23454a0;
import lt2.C24738a;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p702ch0.C4651t;
import p704dk2.C12117d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p721n22.Function0;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: m22.l, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0004\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBackClicked", "onTroubleConnectingClicked", "g", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "e", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC42787l {
    /* JADX INFO: renamed from: e */
    private static final void m73219e(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1913653746);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(interfaceC4339a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            Function0.m77800e(C24948c.f97666a.m73111b(), c28655q, 6);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC0173b.f551r);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8419Q = c38072d.m121952e(c28655q, i15).getT4();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM92103Y, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8419Q, null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC0173b.f550q), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196090);
            float f13 = 4;
            AbstractC11266d.m30469w(f13, f13, c2314t, c28655q);
            AbstractC27271o0.m82253b(null, false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC0173b.f552s)), null, null, null, null, null, false, null, interfaceC4339a, c28655q, TextResource.$stable << 6, i14 & 14, 1019);
            AbstractC25012a.m73388u(6, f13, c2314t, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 10, interfaceC4339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m73220f(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m73219e(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m73221g(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        InterfaceC4339a interfaceC4339a3;
        int i15;
        InterfaceC4339a interfaceC4339a4;
        boolean z4;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-656472007);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            interfaceC4339a3 = interfaceC4339a;
        } else if ((i13 & 6) == 0) {
            interfaceC4339a3 = interfaceC4339a;
            i15 = i13 | (c28655q.m87157i(interfaceC4339a3) ? 4 : 2);
        } else {
            interfaceC4339a3 = interfaceC4339a;
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                i15 |= c28655q.m87157i(interfaceC4339a4) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24738a(28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24738a(29);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66723l);
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
                p723o22.Function0.m82899b(interfaceC4339a7, c28655q, i15 & 14);
                m73219e(interfaceC4339a8, c28655q, (i15 >> 3) & 14);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a7;
                interfaceC4339a6 = interfaceC4339a8;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12117d(interfaceC4339a5, interfaceC4339a6, i13, i14, 4);
            }
        }
        i15 |= 48;
        interfaceC4339a4 = interfaceC4339a2;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24738a(28);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C24738a(29);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a8 = interfaceC4339a4;
            }
            Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(C2314t.f9131w)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66723l2);
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
            p723o22.Function0.m82899b(interfaceC4339a7, c28655q, i15 & 14);
            m73219e(interfaceC4339a8, c28655q, (i15 >> 3) & 14);
            c28655q.m87173q(true);
            interfaceC4339a5 = interfaceC4339a7;
            interfaceC4339a6 = interfaceC4339a8;
        } else {
            c28655q.m87138X();
            interfaceC4339a5 = interfaceC4339a3;
            interfaceC4339a6 = interfaceC4339a4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12117d(interfaceC4339a5, interfaceC4339a6, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m73222h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m73223i() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m73224j(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m73221g(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
