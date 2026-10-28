package tj1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gj1.AbstractC15918a;
import gj1.AbstractC15919b;
import ih0.AbstractC18489d0;
import java.util.Locale;
import l83.C23454a0;
import mj1.AbstractC25618a;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import sg2.C32451b;
import sg2.C32464o;
import sj1.AbstractC32563a;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: tj1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "isConnected", "Lkotlin/Function1;", "Lnj1/a;", "Ll83/a0;", "onViewEvent", "Lmj1/a;", "onNavigationEvent", "c", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "health-connect_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33867b {
    /* JADX INFO: renamed from: c */
    public static final void m107092c(boolean z4, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C2314t c2314t;
        float f13;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-97941477);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 131) != 130)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 8;
            float f15 = 2 * f14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t2), f15, 0.0f, f15, 4 * f14, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q2, 6);
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
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(AbstractC15918a.f60211c, c28655q2, 6), null, null, null, c28655q2, 48, 124);
            String strM21273g = AbstractC8693b.m21273g(AbstractC15919b.f60219h, c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long brandWhite = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            C2886a t14 = c38072d.m121952e(c28655q2, i15).getT1();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21273g, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q2, 0, i16, 196602);
            if (z4) {
                c28655q2.m87150e0(604012130);
                AbstractC33868c.m107096b(c28655q2, 0);
                c28655q2.m87173q(false);
                c2314t = c2314t2;
                f13 = f14;
            } else {
                c28655q2.m87150e0(604013268);
                c2314t = c2314t2;
                f13 = f14;
                AbstractC25012a.m73388u(1, f13, c2314t, c28655q2, false);
            }
            float f16 = f13;
            C2314t c2314t3 = c2314t;
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC15919b.f60215d, c28655q2, 0), null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, i16, 196602);
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC15919b.f60216e);
            C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, null);
            Modifier modifierM101598j = AbstractC32563a.m101598j(c2314t3, ((float) 1.5d) * f16);
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R = c28655q2.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C32451b(onNavigationEvent, 12);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27265l0.m82217i(modifierM101598j, enumC27269n0, c8688bM21277k, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q2, (TextResource.C8688b.f25889c << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
            AbstractC11266d.m30469w((float) 0.5d, f16, c2314t3, c28655q2);
            String upperCase = AbstractC8693b.m21273g(AbstractC15919b.f60218g, c28655q2, 0).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AbstractC30795n.m94707h(upperCase, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getSh5(), null, c28655q2, 0, i16, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC15919b.f60217f, c28655q2, 0), null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, i16, 196602);
            AbstractC11266d.m30469w(1, f16, c2314t3, c28655q2);
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC15918a.f60210b, c28655q2, 0), null, AbstractC1102d.m3409f(1.0f, c2314t3), null, C39102j.f168202d, 0.0f, null, c28655q2, 25008, 104);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(z4, onViewEvent, onNavigationEvent, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m107093d(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(AbstractC25618a.e.f100499a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m107094e(boolean z4, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m107092c(z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
