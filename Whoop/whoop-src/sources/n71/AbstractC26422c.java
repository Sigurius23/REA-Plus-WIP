package n71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fz0.C14889d;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24671c;
import p736sz0.AbstractC33200m1;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: n71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ln71/d;", "itemState", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Ln71/d;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26422c {
    /* JADX INFO: renamed from: b */
    public static final void m78177b(Modifier modifier, C26423d itemState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        TextResource textResourceM21277k;
        long jM53363d;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C2314t c2314t;
        int i16;
        int i17;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-49066671);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i18 != 0 ? c2314t2 : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            if (itemState.getStat() == null) {
                c28655q.m87150e0(469718785);
                c28655q.m87173q(false);
                c0209i2 = c0209i5;
                c2314t = c2314t2;
                c0209i = c0209i7;
                c0209i3 = c0209i6;
                i16 = 6;
                i17 = 2;
            } else {
                c28655q.m87150e0(469718786);
                Integer numValueOf = Integer.valueOf(AbstractC16319p0.m46430a().getTinyIcons().getTinyHeartRate());
                if (!itemState.getStat().getShowIcon()) {
                    numValueOf = null;
                }
                InterfaceC26425f type = itemState.getType();
                if (type instanceof InterfaceC26425f.a) {
                    textResourceM21277k = AbstractC8693b.m21278l(String.valueOf(((InterfaceC26425f.a) itemState.getType()).getCurrentHr()));
                } else {
                    if (!(type instanceof InterfaceC26425f.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textResourceM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62230E0);
                }
                TextResource title = itemState.getStat().getTitle();
                if (title == null) {
                    title = itemState.getType().getDefaultStatTitle();
                }
                InterfaceC26425f type2 = itemState.getType();
                if (type2 instanceof InterfaceC26425f.a) {
                    c28655q.m87150e0(1994966032);
                    jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    if (!(type2 instanceof InterfaceC26425f.b)) {
                        throw AbstractC11895b.m32003v(1994963339, c28655q, false);
                    }
                    c28655q.m87150e0(1994968653);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, 6, false);
                }
                c0209i = c0209i7;
                c0209i2 = c0209i5;
                c0209i3 = c0209i6;
                c2314t = c2314t2;
                i16 = 6;
                AbstractC33200m1.m105252b(null, numValueOf, textResourceM21277k, null, title, false, jM53363d, c28655q, 3072, 33);
                i17 = 2;
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(2 * 4, c2314t));
                c28655q.m87173q(false);
            }
            C22971k c22971kM66746i = AbstractC22977m.m66746i(i17);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, c28655q, i16);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
            c28655q.m87150e0(-128364855);
            for (C14889d c14889d : itemState.getType().mo78184b()) {
                if (!(((double) 1.0f) > 0.0d)) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC26427h.m78192e(new LayoutWeightElement(1.0f, true), c14889d, c28655q, 0, 0);
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(modifier3, itemState, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m78178c(Modifier modifier, C26423d c26423d, int i13, int i14, Composer composer, int i15) {
        m78177b(modifier, c26423d, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
