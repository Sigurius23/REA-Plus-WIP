package sy2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import iz0.AbstractC21048g;
import iz0.C21054m;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kz2.AbstractC22927d;
import l83.C23454a0;
import l83.InterfaceC23459e;
import mh.C25540h;
import ny2.AbstractC27299a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p341nh.C26714h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31917f;
import p733ry2.AbstractC31920i;
import p734sl0.C32618h3;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import s01.C32049e;
import ty2.AbstractC34268a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sy2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lty2/a$a$g;", "viewState", "Lkotlin/Function1;", "Lny2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "d", "(Lty2/a$a$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33103f {
    /* JADX INFO: renamed from: d */
    public static final void m104898d(AbstractC34268a.a.g viewState, Function1 function1, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C2314t c2314t;
        float f13;
        boolean z4;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(437999315);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(c2314t2);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t2));
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
            c28655q2.m87158i0();
            int i15 = i14;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            int i16 = i15 & 112;
            AbstractC31917f.m99349g(viewState, onViewEvent, c28655q2, i15 & 126);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(C1100b.f4583a.mo3400a(c2314t2, C2299e.f9105H), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q2, 48);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String strM108475f = viewState.getContent();
            if (strM108475f == null) {
                c28655q2.m87150e0(642578101);
                c28655q2.m87173q(false);
                c2314t = c2314t2;
                z4 = false;
                c28655q = c28655q2;
                f13 = 1.0f;
            } else {
                c28655q2.m87150e0(642578102);
                float f14 = 8;
                float f15 = ((float) 2.5d) * f14;
                c28655q = c28655q2;
                c2314t = c2314t2;
                f13 = 1.0f;
                z4 = false;
                AbstractC21048g.m58807M(AbstractC8693b.m21275i(strM108475f, c28655q2, 0), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), f15, ((float) 0.5d) * f14, f15, 0.0f, 8), false, AbstractC22927d.m66688a(c28655q2, 0), null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 500);
                c28655q.m87173q(false);
            }
            String strM108477h = viewState.getImageUrl();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (strM108477h == null) {
                c28655q.m87150e0(643185267);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(643185268);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(f13, c2314t)), "basicStepImage");
                AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(strM108477h);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32618h3(27);
                    c28655q.m87172p0(objM87133R);
                }
                C28655q c28655q3 = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM64503l, null, (Function1) objM87133R, c28655q, AbstractC22403o.f87638a | 384, 1), viewState.getImageAlt(), modifierM3599a, null, C39102j.f168202d, 0.0f, null, c28655q3, 24960, 104);
                c28655q = c28655q3;
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            TextResource textResourceM108478i = viewState.getPrimaryButton();
            boolean zM108479j = viewState.getIsPrimaryButtonEnabled();
            boolean z13 = i16 == 32 ? true : z4;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                onViewEvent = function1;
                objM87133R2 = new C33098a(onViewEvent, 2);
                c28655q.m87172p0(objM87133R2);
            } else {
                onViewEvent = function1;
            }
            AbstractC31920i.m99360c(textResourceM108478i, zM108479j, null, (InterfaceC4339a) objM87133R2, c28655q, TextResource.$stable, 4);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) viewState, onViewEvent, (InterfaceC23459e) onNavEvent, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104899e(C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75118b();
        rememberImagePainter.m75119c(300);
        rememberImagePainter.m75121e(C26714h.f106216c);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m104900f(Function1 function1) {
        function1.invoke(AbstractC27299a.o.f109339a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104901g(AbstractC34268a.a.g gVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m104898d(gVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
