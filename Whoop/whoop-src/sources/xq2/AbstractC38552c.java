package xq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16300g;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
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
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qq2.AbstractC30553b;
import wb3.AbstractC37056f;
import wq1.C37508b;
import x81.C38072d;

/* JADX INFO: renamed from: xq2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lxq2/d;", "viewState", "Ll83/a0;", "c", "(Lxq2/d;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "e", "(Lxq2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38552c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m123535c(C38555d c38555d, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1906555088);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c38555d) : c28655q.m87157i(c38555d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (0.4f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true));
            if (0.6f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m123537e(c38555d, new LayoutWeightElement(0.6f <= Float.MAX_VALUE ? 0.6f : Float.MAX_VALUE, true), c28655q, (i14 & 14) | TextResource.$stable, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38549b(c38555d, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m123536d(C38555d c38555d, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m123535c(c38555d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final void m123537e(C38555d c38555d, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        C28655q c28655q;
        Modifier modifier2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1549700566);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c38555d) : c28655q2.m87157i(c38555d) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier3);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (c38555d.getWhoopIcon() == null) {
                c28655q2.m87150e0(-2079729251);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-2079729250);
                c28655q = c28655q2;
                AbstractC16300g.m46209n(null, C2299e.f9117z, AbstractC34132o.m107874S(c38555d.getWhoopIcon().intValue(), c28655q2, 6), 5 * 4, 0.0f, false, null, null, c28655q, 3120, 241);
                c28655q.m87173q(false);
            }
            AbstractC30553b.m93693f(c38555d.getAnimatableText(), C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT2(), null, c28655q, TextResource.$stable | (C2886a.f11498d << 3), 4);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(c38555d, i13, modifier2, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m123538f(C38555d c38555d, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m123537e(c38555d, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
