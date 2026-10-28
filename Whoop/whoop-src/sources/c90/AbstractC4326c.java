package c90;

import a01.C0089i;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c62.C4273a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
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
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lc90/b;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Lc90/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4326c {
    /* JADX INFO: renamed from: c */
    public static final void m13642c(C4325b viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(103621061);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if ((i14 & 2) != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C4273a(2);
                    c28655q.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
            } else {
                function2 = function1;
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
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
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9104G));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            float f13 = 8;
            float f14 = ((float) 2.5d) * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 0.0f, f14, 0.0f, 10);
            TextResource textResourceM13638b = viewState.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM13638b, c28655q, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a t14 = c38072d.m121952e(c28655q, i17).getT2();
            long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            function1 = function2;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q, 48, i18, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i16), AbstractC1099a.m3397s(c2314t, f14, ((float) 0.5d) * f13, f14, 9 * f13), c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Function1 function3 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(viewState, i13, function3, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m13643d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m13644e(C4325b c4325b, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m13642c(c4325b, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
