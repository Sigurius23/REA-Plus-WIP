package ky0;

import a11.C0132j;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ky0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "topLabel", "bottomLabel", "Li2/x;", "rangeColor", "Ll83/a0;", "e", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)V", "j", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "g", "(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22890b {
    /* JADX INFO: renamed from: e */
    public static final void m66525e(TextResource topLabel, TextResource bottomLabel, long j7, Composer composer, int i13) {
        int i14;
        long j13;
        AbstractC22676k.m65750j(topLabel, "topLabel");
        AbstractC22676k.m65750j(bottomLabel, "bottomLabel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(544924316);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(topLabel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(bottomLabel) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            j13 = j7;
            i14 |= c28655q.m87151f(j13) ? 256 : 128;
        } else {
            j13 = j7;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3388j = AbstractC1099a.m3388j(C2314t.f9131w, EnumC22935a1.f90538x);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 4), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
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
            m66530j(topLabel, bottomLabel, c28655q, i14 & 126);
            int i15 = (i14 >> 6) & 14;
            int i16 = i14 << 3;
            m66527g(j13, topLabel, bottomLabel, c28655q, i15 | (i16 & 112) | (i16 & 896));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22889a(topLabel, bottomLabel, j7, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m66526f(TextResource textResource, TextResource textResource2, long j7, int i13, Composer composer, int i14) {
        m66525e(textResource, textResource2, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m66527g(long j7, TextResource textResource, TextResource textResource2, Composer composer, int i13) {
        int i14;
        TextResource textResource3;
        TextResource textResource4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(740801114);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            textResource3 = textResource;
            i14 |= c28655q.m87153g(textResource3) ? 32 : 16;
        } else {
            textResource3 = textResource;
        }
        if ((i13 & 384) == 0) {
            textResource4 = textResource2;
            i14 |= c28655q.m87153g(textResource4) ? 256 : 128;
        } else {
            textResource4 = textResource2;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else {
            if (AbstractC8693b.m21269c(textResource3) && AbstractC8693b.m21269c(textResource4)) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22889a(j7, textResource3, textResource4, i13, 1);
                    return;
                }
                return;
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
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
            float f13 = 1 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C33252i c33252i = AbstractC33253j.f138651a;
            float f14 = 2;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f14, AbstractC37056f.m118994r(c2314t, c33252i));
            C38072d c38072d = C38072d.f163053a;
            long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3419p, brandWhite, c17916v0), c28655q, 0);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22989q.m66760a(AbstractC1102d.m3424u(f14, AbstractC1102d.m3406c(1.0f, AbstractC1092a.m3358c(new LayoutWeightElement(1.0f, true), j7, c17916v0))), c28655q, 0);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(f14, AbstractC37056f.m118994r(c2314t, c33252i)), c38072d.m121949b(c28655q, 6).getBrandWhite(), c17916v0), c28655q, 0);
            AbstractC25012a.m73389v(c2314t, f13, c28655q, true);
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            c28677v1M87180u2.f115982d = new C22889a(j7, textResource, textResource2, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m66528h(long j7, TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m66527g(j7, textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m66529i(long j7, TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m66527g(j7, textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m66530j(TextResource textResource, TextResource textResource2, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(504846241);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(textResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(textResource2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3399u = AbstractC1099a.m3399u(AbstractC1102d.m3406c(1.0f, c2314t), EnumC22935a1.f90538x);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90656g, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3399u);
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
            String strM21274h = AbstractC8693b.m21274h(textResource2, c28655q, (i15 >> 3) & 14);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierM3409f, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN9(), null, c28655q, 48, 0, 196088);
            AbstractC18489d0.m53380u(1, 4, c2314t, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i15 & 14), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN9(), null, c28655q, 48, 0, 196088);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(textResource, textResource2, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m66531k(TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m66530j(textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
