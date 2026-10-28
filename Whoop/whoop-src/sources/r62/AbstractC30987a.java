package r62;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import f62.AbstractC14151a;
import h62.C16982b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l62.AbstractC23380a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m62.C25120k;
import nx1.C27225g;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p329n0.C26057j;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: r62.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lm62/k;", "viewState", "", "codeNumber", "Lkotlin/Function1;", "Ll62/a;", "Ll83/a0;", "onNavigationEvent", "c", "(Lm62/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "refer-a-friend_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30987a {
    /* JADX INFO: renamed from: c */
    public static final void m95515c(C25120k viewState, String codeNumber, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C25120k c25120k;
        String str;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(codeNumber, "codeNumber");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-529856873);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(codeNumber) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 8;
            float f14 = 1 * f13;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            String strM73670a = viewState.getCode();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8429j = c38072d.m121952e(c28655q, i15).getBtM();
            long jM125385c1 = c38072d.m121949b(c28655q, i15).getWhite70();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM73670a, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8429j, null, c28655q, 0, i16, 196602);
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.f138651a);
            float f15 = 22 * 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC14151a.f50978e), null, null, c28655q, AbstractC22403o.a.f87639c, 3), null, AbstractC1099a.m3394p(((float) 1.5d) * f13, AbstractC1092a.m3358c(AbstractC1102d.m3421r(modifierM118994r, f15, f15), c38072d.m121949b(c28655q, i15).getWhite20(), AbstractC17918w0.f69621a)), null, C39102j.f168200b, 0.0f, null, c28655q, 24624, 104);
            if (viewState.getIsShared()) {
                c28655q.m87150e0(1682370765);
                z4 = true;
                AbstractC30795n.m94707h(viewState.getSharedText(), AbstractC1099a.m3396r(c2314t, 0.0f, f14, 1), c38072d.m121949b(c28655q, i15).getAccentAction(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getBtM(), null, c28655q, 48, i16, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
                c25120k = viewState;
                str = codeNumber;
            } else {
                z4 = true;
                c28655q.m87150e0(1682629863);
                EnumC27284v enumC27284v = EnumC27284v.TextSmall;
                String strM73671b = viewState.getShareCtaText();
                boolean z13 = ((i14 & 14) == 4) | ((i14 & 896) == 256) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    c25120k = viewState;
                    str = codeNumber;
                    objM87133R = new C26057j(onNavigationEvent, c25120k, str, 26);
                    c28655q.m87172p0(objM87133R);
                } else {
                    c25120k = viewState;
                    str = codeNumber;
                }
                AbstractC27282u.m82292h(null, enumC27284v, strM73671b, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 121);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            c25120k = viewState;
            str = codeNumber;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) c25120k, str, (InterfaceC23459e) onNavigationEvent, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m95516d(Function1 function1, C25120k c25120k, String str) {
        function1.invoke(new AbstractC23380a.c(c25120k.getShareMessage(), c25120k.getCode(), C16982b.Companion.EnumC41682a.ITEM_CTA, str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m95517e(C25120k c25120k, String str, Function1 function1, int i13, Composer composer, int i14) {
        m95515c(c25120k, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
