package ev1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import cv1.C11147d;
import d62.C11736b;
import ej1.C13242h;
import ep1.C13406a;
import gz0.AbstractC16315n0;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import m41.AbstractC25053e;
import n41.C26271b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ev1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcv1/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lcv1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "limited-time-offer_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13691j {
    /* JADX INFO: renamed from: d */
    public static final void m38665d(C11147d viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-309342137);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if ((i14 & 2) != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C13406a(29);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            AbstractC31926e.m99375j(viewState.getModifier(), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-1595071529, c28655q, new C13242h(viewState, 5)), c28655q, 12582912, 114);
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(viewState, i13, function2, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m38666e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m38667f(C11147d c11147d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            float f14 = (float) 1.5d;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f13 * f14, 1 * f13);
            float f15 = 4;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f14, f15, C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Integer numM46376a = AbstractC16315n0.m46376a(c11147d.getIcon());
            if (numM46376a == null) {
                c28655q.m87150e0(-1636161273);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1636161272);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(numM46376a.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(3 * f15, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 432, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            String strM21275i = AbstractC8693b.m21275i(c11147d.getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM21275i, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            C26271b c26271bM30150c = c11147d.getTimerState();
            if (c26271bM30150c == null) {
                c28655q2.m87150e0(-1635620385);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1635620384);
                AbstractC25053e.m73524z(c2314t, c26271bM30150c, null, c28655q2, (C26271b.f104437f << 3) | 6, 4);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m38668g(C11147d c11147d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m38665d(c11147d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
