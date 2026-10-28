package sg2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm2.C3444h;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hg2.AbstractC17260a;
import java.io.IOException;
import l83.C23454a0;
import n71.AbstractC26434o;
import org.xmlpull.v1.XmlPullParserException;
import os0.C28308d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qk2.C30453i;
import qz0.AbstractC30795n;
import rg2.AbstractC31404p;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sg2.q */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lrg2/p;", "heartRateState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "k", "(Lrg2/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "heartRate", "g", "(ILandroidx/compose/runtime/Composer;I)V", "Lrg2/p$a;", "e", "(Lrg2/p$a;Landroidx/compose/runtime/Composer;I)V", "Lrg2/p$c;", "state", "i", "(Lrg2/p$c;Landroidx/compose/runtime/Composer;I)V", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32466q {
    /* JADX INFO: renamed from: e */
    private static final void m101405e(AbstractC31404p.a aVar, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-389369739);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C27430e c27430eM107874S = AbstractC34132o.m107874S(EnumC16313m0.TINY_HEART_RATE.toWhoopIcon(), c28655q2, 6);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC26434o.m78214M(AbstractC1102d.m3419p(6 * 4, C2314t.f9131w), c27430eM107874S, null, c38072d.m121949b(c28655q2, i15).getStrain(), true, c28655q2, 24966, 0);
            TextResource textResourceM101465f = AbstractC32473x.m101465f(aVar);
            if (textResourceM101465f == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String strM21274h = AbstractC8693b.m21274h(textResourceM101465f, c28655q2, TextResource.$stable);
            C2886a c2886aM8421b = c38072d.m121952e(c28655q2, i15).getB2();
            long jM125385c1 = c38072d.m121949b(c28655q2, i15).getWhite70();
            int i16 = C2886a.f11498d << 18;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC17260a.f66347v, c28655q, 0), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH4(), null, c28655q, 0, i16, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(aVar, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m101406f(AbstractC31404p.a aVar, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m101405e(aVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m101407g(int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        int i15;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1534973157);
        if ((i14 & 6) == 0) {
            i15 = i14 | (c28655q2.m87149e(i13) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C27430e c27430eM107874S = AbstractC34132o.m107874S(EnumC16313m0.TINY_HEART_RATE.toWhoopIcon(), c28655q2, 6);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC26434o.m78214M(AbstractC1102d.m3419p(6 * 4, C2314t.f9131w), c27430eM107874S, null, c38072d.m121949b(c28655q2, i16).getStrain(), true, c28655q2, 24966, 0);
            String strValueOf = String.valueOf(i13);
            C2886a c2886aM8443x = c38072d.m121952e(c28655q2, i16).getN3();
            long jM125430y = c38072d.m121949b(c28655q2, i16).getBrandWhite();
            int i17 = C2886a.f11498d << 18;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strValueOf, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8443x, null, c28655q, 0, i17, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC17260a.f66347v, c28655q, 0), null, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH4(), null, c28655q, 0, i17, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3444h(i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m101408h(int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m101407g(i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m101409i(AbstractC31404p.c cVar, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1707224279);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(cVar) : c28655q2.m87157i(cVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C27430e c27430eM107874S = AbstractC34132o.m107874S(cVar.getIcon().toWhoopIcon(), c28655q2, 6);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, null, c38072d.m121949b(c28655q2, i15).getWhite50(), c28655q2, 48, 4);
            String strM21273g = AbstractC8693b.m21273g(AbstractC17260a.f66348w, c28655q2, 0);
            C2886a c2886aM8443x = c38072d.m121952e(c28655q2, i15).getN3();
            long jM125430y = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21273g, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8443x, null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC17260a.f66347v, c28655q, 0), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH4(), null, c28655q, 0, i16, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(cVar, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m101410j(AbstractC31404p.c cVar, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m101409i(cVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m101411k(AbstractC31404p heartRateState, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        AbstractC22676k.m65750j(heartRateState, "heartRateState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-175138504);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(heartRateState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            float f13 = 8;
            float f14 = ((float) 0.5d) * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifier, f14, 2 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            if (heartRateState instanceof AbstractC31404p.b) {
                c28655q.m87150e0(-1456046335);
                m101407g(((AbstractC31404p.b) heartRateState).getHeartRate(), c28655q, 0);
                c28655q.m87173q(false);
            } else if (heartRateState instanceof AbstractC31404p.a) {
                c28655q.m87150e0(-1456043330);
                m101405e((AbstractC31404p.a) heartRateState, c28655q, i15 & 14);
                c28655q.m87173q(false);
            } else {
                if (!(heartRateState instanceof AbstractC31404p.c)) {
                    throw AbstractC11895b.m32003v(-1456047770, c28655q, false);
                }
                c28655q.m87150e0(-1456040526);
                m101409i((AbstractC31404p.c) heartRateState, c28655q, i15 & 14);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(heartRateState, i13, modifier2, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m101412l(AbstractC31404p abstractC31404p, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m101411k(abstractC31404p, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
