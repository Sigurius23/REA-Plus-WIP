package qn0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import nq2.C27060c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p132f0.C13821r1;
import p134f2.C14015d;
import p134f2.C14018g;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q51.C29979a;
import qe0.C30301b;
import qz0.AbstractC30795n;
import rn0.AbstractC31609b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qn0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lkd1/o;", "headerImage", "Lcom/whoop/design/util/TextResource;", "challengeTitle", "ineligibleText", "Lf0/r1;", "scrollState", "Ll83/a0;", "d", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf0/r1;Landroidx/compose/runtime/Composer;I)V", "challenge-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30513h {
    /* JADX INFO: renamed from: d */
    public static final void m93457d(AbstractC22403o headerImage, TextResource challengeTitle, TextResource textResource, C13821r1 scrollState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(headerImage, "headerImage");
        AbstractC22676k.m65750j(challengeTitle, "challengeTitle");
        AbstractC22676k.m65750j(scrollState, "scrollState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-809158513);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(headerImage) : c28655q.m87157i(headerImage) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(challengeTitle) : c28655q.m87157i(challengeTitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(scrollState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            int i15 = i14;
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
            Modifier modifierM3411h = AbstractC1102d.m3411h(76 * 4, AbstractC1102d.m3409f(1.0f, c2314t));
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C30301b(13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(headerImage, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3), null, AbstractC31609b.m97640c(AbstractC1125a.m3479b(modifierM3411h, (Function1) objM87133R), scrollState, 0.0f, 0.0f, 6, null), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, c2307m);
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(modifierMo3400a, 0.0f, 13 * f13, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            float f14 = ((float) 2.5d) * f13;
            Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f14, 19 * f13, f14, 2 * f13);
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(challengeTitle, c28655q, ((i15 >> 3) & 14) | i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierM3397s, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            if (textResource == null) {
                c28655q.m87150e0(1778518520);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1778518521);
                AbstractC30514i.m93462b(textResource, c28655q, i16);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29979a(headerImage, challengeTitle, textResource, scrollState, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C14018g m93458e(C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C27060c(C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(0)), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4279244056L)))), 0L, 0L, 14), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m93459f(AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m93460g(AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, C13821r1 c13821r1, int i13, Composer composer, int i14) {
        m93457d(abstractC22403o, textResource, textResource2, c13821r1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
