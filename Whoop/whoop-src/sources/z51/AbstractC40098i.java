package z51;

import am0.C0999c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import i91.AbstractC18249c;
import l83.C23454a0;
import m41.C25050b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import w71.C36891k;
import wb3.AbstractC37056f;
import wy0.AbstractC37692c;
import x81.C38072d;
import yk2.C39602b;

/* JADX INFO: renamed from: z51.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "firstKeyStatText", "secondKeyStatText", "Ll83/a0;", "e", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "mainStatText", "keyStatText", "Lb2/f;", "columnAlignment", "k", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lb2/f;Landroidx/compose/runtime/Composer;II)V", "Lw3/k;", "m", "(Lb2/f;)I", "Ly3/f;", "height", "width", "cornerRadius", "Li2/x;", "color", "g", "(FFFJLandroidx/compose/runtime/Composer;I)V", "i", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40098i {
    /* JADX INFO: renamed from: e */
    public static final void m128599e(TextResource firstKeyStatText, TextResource secondKeyStatText, Composer composer, int i13) {
        int i14;
        TextResource textResource;
        TextResource textResource2;
        AbstractC22676k.m65750j(firstKeyStatText, "firstKeyStatText");
        AbstractC22676k.m65750j(secondKeyStatText, "secondKeyStatText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1040742094);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(firstKeyStatText) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(secondKeyStatText) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 1 * 8, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m128605k(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62223C1), firstKeyStatText, C2299e.f9112O, c28655q, ((i15 << 6) & 896) | 3072, 0);
            m128603i(null, c28655q, 0, 1);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            textResource2 = secondKeyStatText;
            textResource = firstKeyStatText;
            m128605k(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62404z1), textResource2, C2299e.f9110M, c28655q, ((i15 << 3) & 896) | 3072, 0);
            c28655q.m87173q(true);
        } else {
            textResource = firstKeyStatText;
            textResource2 = secondKeyStatText;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0999c(textResource, textResource2, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m128600f(TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m128599e(textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m128601g(float f13, float f14, float f15, long j7, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1775115086);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f15) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            AbstractC22989q.m66760a(AbstractC1102d.m3424u(f14, AbstractC1102d.m3411h(f13, AbstractC1092a.m3358c(C2314t.f9131w, j7, AbstractC33253j.m105489e(f15)))), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25050b(f13, f14, f15, j7, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m128602h(float f13, float f14, float f15, long j7, int i13, Composer composer, int i14) {
        m128601g(f13, f14, f15, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m128603i(Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1020472266);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierMo3471e = AbstractC1136a.m3599a(AbstractC1102d.m3419p(AbstractC40097h.m128564N(), c2314t), AbstractC40097h.m128566P()).mo3471e(modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            Modifier modifierM3419p = AbstractC1102d.m3419p(5 * 4, c2314t);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getLogo().getWhoop(), c28655q, 6), null, modifierM3419p, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
            AbstractC37692c.m121117c(null, AbstractC40097h.m128567Q(), 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite10()), AbstractC40097h.m128565O(), false, 0.0f, 0, null, c28655q, 25008, 481);
            AbstractC37692c.m121117c(null, AbstractC40097h.m128568R(), 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite10()), AbstractC40097h.m128565O(), false, 0.0f, 0, null, c28655q, 25008, 481);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39602b(i13, i14, 2, modifier2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m128604j(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m128603i(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m128605k(Modifier modifier, String mainStatText, TextResource keyStatText, InterfaceC2300f columnAlignment, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        TextResource textResource;
        Modifier modifier3;
        AbstractC22676k.m65750j(mainStatText, "mainStatText");
        AbstractC22676k.m65750j(keyStatText, "keyStatText");
        AbstractC22676k.m65750j(columnAlignment, "columnAlignment");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1149808773);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(mainStatText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(keyStatText) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(columnAlignment) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            int i18 = i17 >> 3;
            int i19 = i18 & 896;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, columnAlignment, c28655q, (((i17 & 14) | i19) >> 3) & 112);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
            float f13 = 4;
            float f14 = ((float) 9.5d) * f13;
            float f15 = ((float) 0.5d) * f13;
            C38072d c38072d = C38072d.f163053a;
            Modifier modifier5 = modifier4;
            m128601g(3 * f13, f14, f15, c38072d.m121949b(c28655q, 6).getWhite10(), c28655q, 438);
            float f16 = 1;
            float f17 = f16 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
            AbstractC30795n.m94707h(mainStatText, null, c38072d.m121949b(c28655q, 6).getWhite20(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, i18 & 14, 0, 196602);
            float f18 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t));
            Modifier modifierM3394p = AbstractC1099a.m3394p(f16 * 8, AbstractC1092a.m3358c(c2314t, C17919x.m51541c(0.15f, c38072d.m121949b(c28655q, 6).getRecovery()), AbstractC33253j.m105489e(f17)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, columnAlignment, c28655q, (i19 >> 3) & 112);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            m128601g(f18, f14, f15, c38072d.m121949b(c28655q, 6).getRecovery(), c28655q, 438);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
            textResource = keyStatText;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, (i17 >> 6) & 14), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(m128607m(columnAlignment)), 0L, 2, false, 2, 0, null, c38072d.m121952e(c28655q, 6).getH6(), null, c28655q, 0, 3120, 185850);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            textResource = keyStatText;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier3, mainStatText, textResource, columnAlignment, i13, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m128606l(Modifier modifier, String str, TextResource textResource, InterfaceC2300f interfaceC2300f, int i13, int i14, Composer composer, int i15) {
        m128605k(modifier, str, textResource, interfaceC2300f, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final int m128607m(InterfaceC2300f interfaceC2300f) {
        return AbstractC22676k.m65745e(interfaceC2300f, C2299e.f9112O) ? 2 : 1;
    }
}
