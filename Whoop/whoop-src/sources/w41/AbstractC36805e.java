package w41;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pp2.C29451o;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import vv2.C36537c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w41.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lw41/o;", "activityMapState", "Ll83/a0;", "f", "(Lw41/o;Landroidx/compose/runtime/Composer;I)V", "j", "Lcom/whoop/design/util/TextResource;", "stat", "metric", "label", "l", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36805e {
    /* JADX INFO: renamed from: f */
    public static final void m117952f(C36815o activityMapState, Composer composer, int i13) {
        int i14;
        C28677v1 c28677v1M87180u;
        C36804d c36804d;
        AbstractC22676k.m65750j(activityMapState, "activityMapState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(263833596);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(activityMapState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC36826z mapState = activityMapState.getMapState();
            if (mapState == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c36804d = new C36804d(activityMapState, i13, 0);
                }
            } else {
                AbstractC31926e.m99375j(null, null, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-2039337364, c28655q, new C29451o(21, mapState, activityMapState)), c28655q, 12582912, 115);
            }
            c28677v1M87180u.f115982d = c36804d;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c36804d = new C36804d(activityMapState, i13, 1);
            c28677v1M87180u.f115982d = c36804d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m117953g(C36815o c36815o, int i13, Composer composer, int i14) {
        m117952f(c36815o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m117954h(AbstractC36826z abstractC36826z, C36815o c36815o, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            AbstractC36811k.m117998l(abstractC36826z, null, false, null, false, c28655q, 0, 30);
            m117956j(c36815o, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m117955i(C36815o c36815o, int i13, Composer composer, int i14) {
        m117952f(c36815o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m117956j(C36815o activityMapState, Composer composer, int i13) {
        AbstractC22676k.m65750j(activityMapState, "activityMapState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-24715);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(activityMapState) ? 4 : 2) | i13 : i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(3 * 8, C2314t.f9131w));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            c28655q.m87150e0(1399888195);
            for (C36818r c36818r : activityMapState.m118028e()) {
                m117958l(c36818r.getValueDisplay(), c36818r.getUnitDisplay(), c36818r.getTitleDisplay(), c28655q, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36804d(activityMapState, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m117957k(C36815o c36815o, int i13, Composer composer, int i14) {
        m117956j(c36815o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m117958l(TextResource textResource, TextResource textResource2, TextResource textResource3, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(301679603);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(textResource3) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 0 * f13, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            int i15 = i14;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i15 & 14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN5(), null, c28655q2, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q2, (i15 >> 3) & 14), AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f13, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q2, 48, 0, 196600);
            c28655q2.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q2, (i15 >> 6) & 14), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getSh5(), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(textResource, textResource2, textResource3, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m117959m(TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, Composer composer, int i14) {
        m117958l(textResource, textResource2, textResource3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
