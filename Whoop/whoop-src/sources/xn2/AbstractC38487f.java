package xn2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import l83.C23454a0;
import nn2.AbstractC26867a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wq1.C37508b;
import x81.C38072d;

/* JADX INFO: renamed from: xn2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lxn2/g;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Lxn2/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "a", "Lxn2/g;", "d", "()Lxn2/g;", "buyNowItemPreviewViewState", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38487f {

    /* JADX INFO: renamed from: a */
    private static final C38488g f164893a = new C38488g(AbstractC8693b.m21278l("WHOOP Your Way MG"), AbstractC8693b.m21278l("Band: Evergreen, Clasp: Alloy, Hook: Atlas"), AbstractC8693b.m21278l("WHOOP Standard Shipping"), null, null, "783cf38a-8019-42ae-9fb5-42bd57e6b10a", "wyw-mg-sku", 16, null);

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x017c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0180  */
    /* JADX WARN: Code duplicated, block: B:59:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0258  */
    /* JADX WARN: Code duplicated, block: B:64:0x0262  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m123313b(C38488g viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C0209i c0209i2;
        C0209i c0209i3;
        int iHashCode3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1731225282);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                float f13 = 8;
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f13, 1.5f, C2299e.f9107J, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M53376q);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                float f14 = 4;
                float f15 = 21.25f * f14;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(f15, c2314t), 2, f14);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i17).getBrandWhite(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                c28655q.m87158i0();
                Modifier modifier5 = modifier4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i2 = c0209i;
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                c0209i3 = c0209i2;
                AbstractC26867a.m80219b(C1100b.f4583a, viewState.getImage(), viewState.m123318c(), AbstractC1102d.m3419p(f15, c2314t), null, c28655q, (AbstractC22403o.f87638a << 3) | 3078, 8);
                c28655q.m87173q(true);
                float f16 = f13 * 0.5f;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), C2299e.f9110M, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                TextResource title = viewState.getTitle();
                int i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(title, c28655q, i18);
                C2886a t14 = c38072d.m121952e(c28655q, i17).getT4();
                long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q, 0, i19, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i19, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37508b(viewState, i13, modifier3, i14, 4);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            float f17 = 8;
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(f17, 1.5f, C2299e.f9107J, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i7 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M53376q2);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            float f18 = 4;
            float f19 = 21.25f * f18;
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(f19, c2314t), 2, f18);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM53364e2, c38072d2.m121949b(c28655q, i110).getBrandWhite(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            c28655q.m87158i0();
            Modifier modifier6 = modifier4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
            c0209i3 = c0209i2;
            AbstractC26867a.m80219b(C1100b.f4583a, viewState.getImage(), viewState.m123318c(), AbstractC1102d.m3419p(f19, c2314t), null, c28655q, (AbstractC22403o.f87638a << 3) | 3078, 8);
            c28655q.m87173q(true);
            float f110 = f17 * 0.5f;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f110, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f110), C2299e.f9110M, c28655q, 6);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            TextResource title2 = viewState.getTitle();
            int i111 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(title2, c28655q, i111);
            C2886a t15 = c38072d2.m121952e(c28655q, i110).getT4();
            long brandWhite2 = c38072d2.m121949b(c28655q, i110).getBrandWhite();
            int i112 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t15, null, c28655q, 0, i112, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i111), null, c38072d2.m121949b(c28655q, i110).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getB1(), null, c28655q, 0, i112, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i111), null, c38072d2.m121949b(c28655q, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getB2(), null, c28655q, 0, i112, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(viewState, i13, modifier3, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m123314c(C38488g c38488g, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m123313b(c38488g, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static final C38488g m123315d() {
        return f164893a;
    }
}
