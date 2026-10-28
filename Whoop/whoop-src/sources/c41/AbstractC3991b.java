package c41;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b01.C2192m;
import bg0.C3226h;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C21061j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "description", "", "initialExpandedState", "Ll83/a0;", "d", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V", "expanded", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3991b {
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m12065d(TextResource title, TextResource description, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        int iM46234l;
        long jM95628d;
        Object objM87133R2;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-250662113);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(description) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m12066e(interfaceC28601c1)) {
                    iM46234l = C38072d.f163053a.m121951d().getTinyIcons().getUpArrow();
                } else {
                    iM46234l = C38072d.f163053a.m121951d().getTinyIcons().getDownArrow();
                }
                if (m12066e(interfaceC28601c1)) {
                    c28655q.m87150e0(1473491611);
                    jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1473537274);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                long j7 = jM95628d;
                Modifier modifierM3355a = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, 3);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C2192m(6, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3355a, false, null, null, (InterfaceC4339a) objM87133R2, 15), null, j7, null, null, null, 0.0f, AbstractC37817c.m121344e(1578960271, c28655q, new C21061j(description, title, iM46234l, interfaceC28601c1)), c28655q, 12582912, 122);
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(title, description, z15, i13, i14, 3);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(z16, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (m12066e(interfaceC28601c1)) {
                iM46234l = C38072d.f163053a.m121951d().getTinyIcons().getUpArrow();
            } else {
                iM46234l = C38072d.f163053a.m121951d().getTinyIcons().getDownArrow();
            }
            if (m12066e(interfaceC28601c1)) {
                c28655q.m87150e0(1473491611);
                jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1473537274);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            long j13 = jM95628d;
            Modifier modifierM3355a2 = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, 3);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C2192m(6, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3355a2, false, null, null, (InterfaceC4339a) objM87133R2, 15), null, j13, null, null, null, 0.0f, AbstractC37817c.m121344e(1578960271, c28655q, new C21061j(description, title, iM46234l, interfaceC28601c1)), c28655q, 12582912, 122);
            z15 = z16;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(title, description, z15, i13, i14, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m12066e(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    private static final void m12067f(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m12068g(InterfaceC28601c1 interfaceC28601c1) {
        m12067f(interfaceC28601c1, !m12066e(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m12069h(TextResource textResource, TextResource textResource2, int i13, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = f13 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * 4), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, f14, 0.0f, 11);
            String strM21274h = AbstractC8693b.m21274h(textResource2, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
            C28655q c28655q2 = c28655q;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q2, 6), null, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 4);
            c28655q2.m87173q(true);
            if (m12066e(interfaceC28601c1)) {
                c28655q2.m87150e0(-341724373);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 0, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-341527895);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12070i(TextResource textResource, TextResource textResource2, boolean z4, int i13, int i14, Composer composer, int i15) {
        m12065d(textResource, textResource2, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
