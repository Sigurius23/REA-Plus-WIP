package yz0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import com.whoop.navigation.models.GenericInteraction;
import gb1.AbstractC15676d;
import i91.AbstractC18249c;
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
import p291l0.AbstractC22988p1;
import p291l0.C22976l1;
import p291l0.C22994r1;
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
import wr0.C37526f;
import x30.C37900j1;
import x81.C38072d;
import yo1.C39689b;

/* JADX INFO: renamed from: yz0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lyz0/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lyz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39905b {
    /* JADX INFO: renamed from: d */
    public static final void m128014d(Modifier modifier, C39906c viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(224337749);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3428y(modifier2, null, false, 3), AbstractC33253j.m105486b(50));
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM52565c = AbstractC18249c.m52565c(modifierM118994r, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite10()));
            boolean z4 = viewState.getInteraction() != null;
            boolean z13 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && c28655q.m87157i(viewState))) | ((i15 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C37900j1(16, viewState, onViewEvent);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM52565c, z4, (Function1) objM87133R);
            float f13 = 8;
            float f14 = ((float) 0.5d) * f13;
            Modifier modifierM3393o = AbstractC1099a.m3393o(new C22976l1(f14, f14, 2 * f13, f14), modifierM44099b);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.25d) * f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
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
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, 0, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(9 * 4, c2314t), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            AbstractC30795n.m94707h(viewState.getTitle(), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 3120, 186362);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 29, modifier2, viewState, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Modifier m128015e(C39906c c39906c, Function1 function1, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1772c1.m5391i(applyIf, false, null, new C39689b(c39906c, function1, 6), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m128016f(C39906c c39906c, Function1 function1) {
        GenericInteraction genericInteractionM128019b = c39906c.getInteraction();
        if (genericInteractionM128019b != null) {
            function1.invoke(genericInteractionM128019b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m128017g(Modifier modifier, C39906c c39906c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128014d(modifier, c39906c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
