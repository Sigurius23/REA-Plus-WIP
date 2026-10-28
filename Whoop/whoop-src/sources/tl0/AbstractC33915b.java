package tl0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import t01.C33259e;
import t71.C33572i;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: tl0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ltl0/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Ltl0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33915b {
    /* JADX INFO: renamed from: c */
    public static final void m107279c(Modifier modifier, C33916c viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        Function1 function2;
        Function1 function3;
        C0209i c0209i;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1175413636);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            if ((i14 & 4) != 0) {
                Object objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C33572i(12);
                    c28655q2.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            C22961h c22961h = AbstractC22977m.f90654e;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            float f13 = 8;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * f13);
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
            float f14 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f14, c2314t);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(viewState.getIcon(), null, null, c28655q2, AbstractC22403o.f87638a, 3);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifier5 = modifier4;
            AbstractC15005f3.m43107a(abstractC26165aM64500i, null, modifierM3419p, c38072d.m121949b(c28655q2, i17).getWhite50(), c28655q2, 432, 0);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 0.5d, f13, c2306l, c28655q2, 54);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
            TextResource textResourceM107283b = viewState.getTitle();
            int i18 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM107283b, c28655q2, i18);
            C2886a h7 = c38072d.m121952e(c28655q2, i17).getH4();
            long brandWhite = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            C39111m c39111m = AbstractC39083d.f168140a;
            WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(c39111m);
            int i19 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, withAlignmentLineElement, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q2, 0, i19, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getValue(), c28655q2, i18), new WithAlignmentLineElement(c39111m), viewState.getValueColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getN8(), null, c28655q2, 0, i19, 196600);
            c28655q2.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q2, i18), null, c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB4(), null, c28655q2, 0, i19, 196602);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            float f15 = 3 * f14;
            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, f15, 1 * f13, f15, 0.0f, 8), null, null, null, null, 0L, 0L, null, c28655q2, 0, 254);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier5;
            function2 = function3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, viewState, function2, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m107280d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m107281e(Modifier modifier, C33916c c33916c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m107279c(modifier, c33916c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
