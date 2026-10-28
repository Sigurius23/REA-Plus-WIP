package ky2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2588o1;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import gb1.AbstractC15673b0;
import h02.C16576i;
import hy2.AbstractC17810a;
import iz0.AbstractC21048g;
import iz0.C21054m;
import kz2.AbstractC22927d;
import l83.C23454a0;
import ny0.AbstractC27248d1;
import ny0.EnumC27250e0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31920i;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ky2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lky2/g$a$b;", "viewState", "Lkotlin/Function1;", "Lhy2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "f", "(Lky2/g$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22894c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m66550f(InterfaceC22898g.a.b viewState, Function1 function1, Function1 onNavEvent, Composer composer, int i13) {
        C28655q c28655q;
        Object obj;
        C0209i c0209i;
        int i14;
        float f13;
        InterfaceC4339a interfaceC4339a;
        C28655q c28655q2;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-390791537);
        int i15 = (i13 & 6) == 0 ? (c28655q3.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(onNavEvent) ? 256 : 128;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(c2314t);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a2);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM66722k);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a2);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N2);
            TextResource textResourceM66599l = viewState.getToolbarTitle();
            TextResource textResourceM66598k = viewState.getToolbarSubTitle();
            int i16 = i15 & 896;
            boolean z4 = i16 == 256;
            Object objM87133R = c28655q3.m87133R();
            boolean z13 = z4;
            Object obj2 = C28635l.f115821a;
            if (z13 || objM87133R == obj2) {
                Object c22892a = new C22892a(onNavEvent, 3);
                c28655q3.m87172p0(c22892a);
                obj = c22892a;
            } else {
                obj = objM87133R;
            }
            int i17 = TextResource.$stable;
            AbstractC22897f.m66575c(textResourceM66599l, textResourceM66598k, (InterfaceC4339a) obj, c28655q3, i17 | (i17 << 3));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            Object obj3 = obj2;
            int iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a2);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N3);
            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1102d.m3407d(1.0f, AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q3, 1), 14)), C2299e.f9105H);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q3, 48);
            int iHashCode4 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierMo3400a);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a2);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String strM66593f = viewState.getContent();
            if (strM66593f == null) {
                c28655q3.m87150e0(228571599);
                c28655q3.m87173q(false);
                i14 = 0;
                interfaceC4339a = interfaceC4339a2;
                c0209i = c0209i3;
                f13 = 1.0f;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(228571600);
                float f14 = 8;
                float f15 = 2 * f14;
                c0209i = c0209i3;
                i14 = 0;
                f13 = 1.0f;
                interfaceC4339a = interfaceC4339a2;
                AbstractC21048g.m58807M(AbstractC8693b.m21275i(strM66593f, c28655q3, 0), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f15, 1 * f14, f15, 0.0f, 8), false, AbstractC22927d.m66688a(c28655q3, 0), null, 0, 0, 0, false, c28655q3, C21054m.f79836p << 9, 500);
                C28655q c28655q4 = c28655q3;
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            float f16 = 2;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(4 * f16);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(f13, c2314t);
            float f17 = 8;
            float f18 = f16 * f17;
            int i18 = 1;
            Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3409f2, f18, 1 * f17, f18, 0.0f, 8);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q2, 6);
            int iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N5);
            c28655q2.m87150e0(-108807663);
            int i19 = i14;
            C28655q c28655q5 = c28655q2;
            for (Object obj4 : viewState.m66595h()) {
                int i24 = i19 + 1;
                if (i19 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C22900i c22900i = (C22900i) obj4;
                TextResource textResourceM66625b = c22900i.getText();
                EnumC27250e0 enumC27250e0 = EnumC27250e0.TEXT;
                Integer numM66597j = viewState.getSelectedOptionIndex();
                boolean z14 = (numM66597j != null && numM66597j.intValue() == i19) ? i18 : i14;
                boolean z15 = ((((i15 & 112) == 32 ? i18 : i14) | (c28655q5.m87157i(viewState) ? 1 : 0)) == true ? 1 : 0) | (c28655q5.m87149e(i19) ? 1 : 0) | (c28655q5.m87157i(c22900i) ? 1 : 0);
                Object objM87133R2 = c28655q5.m87133R();
                Object obj5 = obj3;
                if (z15 || objM87133R2 == obj5) {
                    Object c2588o1 = new C2588o1(function1, viewState, i19, c22900i, 5);
                    c28655q5.m87172p0(c2588o1);
                    objM87133R2 = c2588o1;
                }
                C28655q c28655q6 = c28655q5;
                obj3 = obj5;
                AbstractC27248d1.m82113e(null, textResourceM66625b, enumC27250e0, 0L, z14, false, null, null, (Function1) objM87133R2, c28655q6, (TextResource.$stable << 3) | 384, 233);
                i14 = i14;
                i18 = i18;
                c28655q5 = c28655q6;
                i19 = i24;
            }
            onViewEvent = function1;
            boolean z16 = i14;
            boolean z17 = i18;
            Object obj6 = obj3;
            c28655q5.m87173q(z16);
            c28655q5.m87173q(z17);
            TextResource textResourceM66596i = viewState.getPositiveButton();
            boolean zM66600m = viewState.getIsPositiveButtonEnabled();
            boolean z18 = (i15 & 112) == 32 ? z17 ? 1 : 0 : z16 ? 1 : 0;
            Object objM87133R3 = c28655q5.m87133R();
            Object obj7 = objM87133R3;
            if (z18 || objM87133R3 == obj6) {
                Object c22892a2 = new C22892a(onViewEvent, 4);
                c28655q5.m87172p0(c22892a2);
                obj7 = c22892a2;
            }
            int i25 = TextResource.$stable;
            AbstractC31920i.m99360c(textResourceM66596i, zM66600m, null, (InterfaceC4339a) obj7, c28655q5, i25, 4);
            if (viewState.getNegativeButton() == null) {
                c28655q5.m87150e0(230659356);
                c28655q5.m87173q(z16);
            } else {
                c28655q5.m87150e0(230659357);
                TextResource textResourceM66594g = viewState.getNegativeButton();
                boolean z19 = i16 == 256 ? z17 ? 1 : 0 : z16 ? 1 : 0;
                Object objM87133R4 = c28655q5.m87133R();
                Object obj8 = objM87133R4;
                if (z19 || objM87133R4 == obj6) {
                    Object c22892a3 = new C22892a(onNavEvent, 5);
                    c28655q5.m87172p0(c22892a3);
                    obj8 = c22892a3;
                }
                AbstractC22899h.m66621c(textResourceM66594g, (InterfaceC4339a) obj8, c28655q5, i25);
                c28655q5.m87173q(z16);
            }
            AbstractC2875y.m8286B(c28655q5, z17, z17, z17, z17);
            c28655q = c28655q5;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(i13, 25, viewState, onNavEvent, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m66551g(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m66552h(Function1 function1, InterfaceC22898g.a.b bVar, int i13, C22900i c22900i, boolean z4) {
        function1.invoke(new AbstractC17810a.d(bVar.getQuestionId(), i13, c22900i.getKey()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m66553i(Function1 function1) {
        function1.invoke(AbstractC17810a.c.f69267a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m66554j(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m66555k(InterfaceC22898g.a.b bVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m66550f(bVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
