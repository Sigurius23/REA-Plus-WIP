package p748zc1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm2.C3472s;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9772c;
import hy0.AbstractC17763k2;
import i93.C18279e;
import ih0.AbstractC18489d0;
import j11.AbstractC21211n;
import kd1.AbstractC22399k;
import l31.C23312f;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p700bd1.AbstractC42782p;
import p705ea2.C12906g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import uz1.C35429g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.z1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ll83/a0;", "t", "(Landroidx/compose/runtime/Composer;I)V", "O", "", "showDialog", "Lzc1/a2;", "dialogType", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40529z1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m131259A(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m131260B(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m131272N(interfaceC28601c1, EnumC40267a2.TWO_BUTTONS_CHECKBOX_DIALOG);
        m131270L(interfaceC28601c2, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m131261C(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m131270L(interfaceC28601c1, true);
        m131272N(interfaceC28601c2, EnumC40267a2.ONE_BUTTON_CHECKBOX_DIALOG);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m131262D(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m131270L(interfaceC28601c1, true);
        m131272N(interfaceC28601c2, EnumC40267a2.TWO_BUTTONS_DIALOG);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m131263E(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m131270L(interfaceC28601c1, true);
        m131272N(interfaceC28601c2, EnumC40267a2.ONE_BUTTON_DIALOG);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m131264F(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        m131270L(interfaceC28601c1, true);
        m131272N(interfaceC28601c2, EnumC40267a2.ONE_BUTTON_IMAGE_DIALOG);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m131265G(InterfaceC28601c1 interfaceC28601c1) {
        m131270L(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m131266H(InterfaceC28601c1 interfaceC28601c1) {
        m131270L(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m131267I(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m131268J(InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                c28655q.m87150e0(1314994387);
                m131273O(c28655q, 0);
            } else {
                c28655q.m87150e0(2110131867);
            }
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m131269K(int i13, Composer composer, int i14) {
        m131296t(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final void m131270L(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: M */
    private static final EnumC40267a2 m131271M(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC40267a2) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: N */
    private static final void m131272N(InterfaceC28601c1 interfaceC28601c1, EnumC40267a2 enumC40267a2) {
        interfaceC28601c1.setValue(enumC40267a2);
    }

    /* JADX INFO: renamed from: O */
    public static final void m131273O(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-634885822);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC3855a.m11831o(0.0f, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            float f13 = 2;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f13 * 8, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8421b = c38072d.m121952e(c28655q, i14).getB2();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C36775k c36775k = new C36775k(5);
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h("Title Here", layoutWeightElement, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 6, i15, 196088);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(((Number) interfaceC28601c1.getValue()).floatValue() == 0.0f ? "--" : String.valueOf((int) ((Number) interfaceC28601c1.getValue()).floatValue()), new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c38072d.m121949b(c28655q, i14).getAccentPositiveTrend(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getN8(), null, c28655q, 0, i15, 196088);
            c28655q = c28655q;
            c28655q.m87173q(true);
            AbstractC18489d0.m53380u(f13, 4, c2314t, c28655q);
            AbstractC39330c.m125320b(c38072d.m121949b(c28655q, i14).getAccentPositiveTrend(), 0L, 0L, 0L, AbstractC37817c.m121344e(1548365919, c28655q, new C9772c(7, interfaceC28601c1)), c28655q, 24576, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m131274P(InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float fFloatValue = ((Number) interfaceC28601c1.getValue()).floatValue();
            C18279e c18279e = new C18279e(1.0f, 10.0f);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40408n0(9, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17763k2.m50956d(null, false, fFloatValue, c18279e, 0, null, (Function1) objM87133R, c28655q, 1572864, 51);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m131275Q(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m131276R(int i13, Composer composer, int i14) {
        m131273O(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final void m131296t(Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        InterfaceC28601c1 interfaceC28601c5;
        boolean z4;
        Modifier modifierMo3400a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(778853274);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(EnumC40267a2.TWO_BUTTONS_CHECKBOX_DIALOG);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R5;
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R6;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C2307m c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC42782p.m8885c(AbstractC37817c.m121344e(-1193140879, c28655q, new C12906g(8, interfaceC28601c9)), c28655q, 6);
            AbstractC42782p.m8885c(AbstractC37817c.m121344e(-1363284262, c28655q, new C12906g(9, interfaceC28601c10)), c28655q, 6);
            AbstractC42782p.m8885c(AbstractC37817c.m121344e(1894566457, c28655q, new C12906g(10, interfaceC28601c11)), c28655q, 6);
            AbstractC22399k.m64473c("With Checkbox", c28655q, 6);
            float f13 = 4;
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c6;
                objM87133R7 = new C3472s(4, interfaceC28601c7, interfaceC28601c1);
                c28655q.m87172p0(objM87133R7);
            } else {
                interfaceC28601c1 = interfaceC28601c6;
            }
            C40277b1 c40277b1 = C40277b1.f174178a;
            InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c1;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R7, null, false, null, null, null, null, null, c40277b1.m129354i(), c28655q, 805306374, 510);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                interfaceC28601c2 = interfaceC28601c7;
                objM87133R8 = new C3472s(5, interfaceC28601c12, interfaceC28601c2);
                c28655q.m87172p0(objM87133R8);
            } else {
                interfaceC28601c2 = interfaceC28601c7;
            }
            InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c2;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R8, null, false, null, null, null, null, null, c40277b1.m129352g(), c28655q, 805306374, 510);
            AbstractC18489d0.m53380u(5, f13, c2314t, c28655q);
            AbstractC22399k.m64473c("Without Checkbox", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                interfaceC28601c3 = interfaceC28601c13;
                objM87133R9 = new C3472s(6, interfaceC28601c12, interfaceC28601c3);
                c28655q.m87172p0(objM87133R9);
            } else {
                interfaceC28601c3 = interfaceC28601c13;
            }
            InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c3;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R9, null, false, null, null, null, null, null, c40277b1.m129351f(), c28655q, 805306374, 510);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            Object objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                interfaceC28601c4 = interfaceC28601c14;
                objM87133R10 = new C3472s(7, interfaceC28601c12, interfaceC28601c4);
                c28655q.m87172p0(objM87133R10);
            } else {
                interfaceC28601c4 = interfaceC28601c14;
            }
            InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c4;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R10, null, false, null, null, null, null, null, c40277b1.m129355j(), c28655q, 805306374, 510);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("With Image", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            Object objM87133R11 = c28655q.m87133R();
            if (objM87133R11 == c28676v0) {
                interfaceC28601c5 = interfaceC28601c15;
                objM87133R11 = new C3472s(3, interfaceC28601c12, interfaceC28601c5);
                c28655q.m87172p0(objM87133R11);
            } else {
                interfaceC28601c5 = interfaceC28601c15;
            }
            InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c5;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R11, null, false, null, null, null, null, null, c40277b1.m129353h(), c28655q, 805306374, 510);
            AbstractC25012a.m73389v(c2314t, f14, c28655q, true);
            if (m131297u(interfaceC28601c12)) {
                c28655q.m87150e0(143947790);
                EnumC40267a2 enumC40267a2M131271M = m131271M(interfaceC28601c16);
                EnumC40267a2 enumC40267a2 = EnumC40267a2.ONE_BUTTON_IMAGE_DIALOG;
                if (enumC40267a2M131271M == enumC40267a2) {
                    c28655q.m87150e0(143974140);
                    modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1092a.m3358c(AbstractC1102d.m3424u(200, AbstractC1102d.m3411h(100, c2314t)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), AbstractC17918w0.f69621a), c2307m);
                    z4 = false;
                    c28655q.m87173q(false);
                } else {
                    z4 = false;
                    c28655q.m87150e0(144214142);
                    c28655q.m87173q(false);
                    modifierMo3400a = c2314t;
                }
                C23312f c23312f = C23312f.f92372a;
                TextResource.C8691e c8691eM67431e = c23312f.m67431e();
                TextResource.C8691e c8691eM67429c = c23312f.m67429c();
                TextResource.C8691e c8691eM67428b = c23312f.m67428b();
                EnumC40267a2 enumC40267a2M131271M2 = m131271M(interfaceC28601c16);
                EnumC40267a2 enumC40267a3 = EnumC40267a2.TWO_BUTTONS_CHECKBOX_DIALOG;
                TextResource.C8691e c8691eM67430d = (enumC40267a2M131271M2 == enumC40267a3 || m131271M(interfaceC28601c16) == EnumC40267a2.TWO_BUTTONS_DIALOG) ? c23312f.m67430d() : null;
                TextResource.C8691e c8691eM67427a = (m131271M(interfaceC28601c16) == enumC40267a3 || m131271M(interfaceC28601c16) == EnumC40267a2.ONE_BUTTON_CHECKBOX_DIALOG) ? c23312f.m67427a() : null;
                String str = m131271M(interfaceC28601c16) == enumC40267a2 ? "https://www.whoop.com/uploads/2022/03/sloane-stephens-womens-history-month-whoop-768x427.png" : null;
                boolean zBooleanValue = ((Boolean) interfaceC28601c8.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) interfaceC28601c10.getValue()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) interfaceC28601c9.getValue()).booleanValue();
                Object objM87133R12 = c28655q.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = new C35429g(25, interfaceC28601c12);
                    c28655q.m87172p0(objM87133R12);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R12;
                Object objM87133R13 = c28655q.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = new C35429g(26, interfaceC28601c12);
                    c28655q.m87172p0(objM87133R13);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R13;
                Object objM87133R14 = c28655q.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = new C40408n0(10, interfaceC28601c8);
                    c28655q.m87172p0(objM87133R14);
                }
                C37816b c37816bM121344e = AbstractC37817c.m121344e(944384071, c28655q, new C9772c(8, interfaceC28601c11));
                int i14 = TextResource.C8691e.f25898b;
                AbstractC21211n.m59497o(modifierMo3400a, c8691eM67431e, c8691eM67428b, c8691eM67429c, false, null, null, null, null, c8691eM67430d, c8691eM67427a, zBooleanValue, zBooleanValue2, null, null, false, 0, null, null, null, zBooleanValue3, str, interfaceC4339a, null, interfaceC4339a2, (Function1) objM87133R14, null, c37816bM121344e, c28655q, (i14 << 3) | (i14 << 6) | (i14 << 9) | (i14 << 27), i14, 12804480, 76538352);
                c28655q = c28655q;
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(145772078);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 19);
        }
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m131297u(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m131298v(InterfaceC28601c1 interfaceC28601c1, InterfaceC22997s1 GalleryRowCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(GalleryRowCard, "$this$GalleryRowCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40408n0(6, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zBooleanValue, false, 0L, null, null, (Function1) objM87133R, c28655q, 1572864, 61);
            AbstractC15011f9.m43114b("setCancelable", null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m131299w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m131300x(InterfaceC28601c1 interfaceC28601c1, InterfaceC22997s1 GalleryRowCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(GalleryRowCard, "$this$GalleryRowCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40408n0(7, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zBooleanValue, false, 0L, null, null, (Function1) objM87133R, c28655q, 1572864, 61);
            AbstractC15011f9.m43114b("showCrossIcon", null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m131301y(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m131302z(InterfaceC28601c1 interfaceC28601c1, InterfaceC22997s1 GalleryRowCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(GalleryRowCard, "$this$GalleryRowCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40408n0(8, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zBooleanValue, false, 0L, null, null, (Function1) objM87133R, c28655q, 1572864, 61);
            AbstractC15011f9.m43114b("showSlider", null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
