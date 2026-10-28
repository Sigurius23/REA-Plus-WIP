package sy2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import iz0.AbstractC21048g;
import iz0.C21054m;
import kz2.AbstractC22927d;
import l41.AbstractC23332d;
import l83.C23454a0;
import ny2.AbstractC27299a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31917f;
import p733ry2.AbstractC31920i;
import q83.AbstractC30060g;
import so2.C32848f;
import ty2.AbstractC34268a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sy2.q */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lty2/a$a$h;", "viewState", "Lkotlin/Function1;", "Lny2/a;", "Ll83/a0;", "onViewEvent", "d", "(Lty2/a$a$h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33114q {
    /* JADX INFO: renamed from: d */
    public static final void m104976d(AbstractC34268a.a.h viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        boolean z4;
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1869090938);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            int i16 = i14 & 112;
            AbstractC31917f.m99349g(viewState, onViewEvent, c28655q, i14 & 126);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC11895b.m31988g(modifierM3409f, true, 1.0f), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM108480f = viewState.getContent();
            if (strM108480f == null) {
                c28655q.m87150e0(-1983727746);
                c28655q.m87173q(false);
                c2314t = c2314t2;
                z4 = false;
                i15 = i16;
            } else {
                c28655q.m87150e0(-1983727745);
                float f13 = 8;
                float f14 = ((float) 2.5d) * f13;
                c2314t = c2314t2;
                z4 = false;
                i15 = i16;
                AbstractC21048g.m58807M(AbstractC8693b.m21275i(strM108480f, c28655q, 0), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), f14, ((float) 0.5d) * f13, f14, 0.0f, 8), false, AbstractC22927d.m66688a(c28655q, 0), null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 500);
                c28655q.m87173q(false);
            }
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "TimePicker");
            boolean z13 = i15 == 32 ? true : z4;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C33109l(onViewEvent, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23332d.m67560g(null, false, null, false, null, 0L, modifierM3599a, false, (InterfaceC4351m) objM87133R, c28655q, 1575936, 183);
            c28655q = c28655q;
            c28655q.m87173q(true);
            TextResource textResourceM108481g = viewState.getPrimaryButton();
            boolean zM108482h = viewState.getIsPrimaryButtonEnabled();
            boolean z14 = i15 == 32 ? true : z4;
            Object objM87133R2 = c28655q.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = new C33098a(onViewEvent, 7);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC31920i.m99360c(textResourceM108481g, zM108482h, null, (InterfaceC4339a) objM87133R2, c28655q, TextResource.$stable, 4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(viewState, onViewEvent, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104977e(Function1 function1, int i13, int i14) {
        function1.invoke(new AbstractC27299a.a0(i13, i14));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m104978f(Function1 function1) {
        function1.invoke(AbstractC27299a.o.f109339a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104979g(AbstractC34268a.a.h hVar, Function1 function1, int i13, Composer composer, int i14) {
        m104976d(hVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
