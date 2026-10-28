package sj1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ev2.C13698g;
import gb1.AbstractC15673b0;
import gj1.AbstractC15918a;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.C25272z;
import mi2.C25587j;
import mj1.AbstractC25618a;
import nj1.AbstractC26751a;
import nj1.AbstractC26753c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.C39102j;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import s01.C32049e;
import sg2.C32451b;
import sg2.C32458i;
import tj1.AbstractC33866a;
import tj1.AbstractC33867b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sj1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lnj1/c;", "viewState", "Lkotlin/Function1;", "Lnj1/a;", "Ll83/a0;", "onViewEvent", "Lmj1/a;", "onNavigationEvent", "f", "(Lnj1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Ly3/f;", "padding", "j", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "health-connect_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32563a {
    /* JADX INFO: renamed from: f */
    public static final void m101594f(AbstractC26753c viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        C28655q c28655q;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-622808329);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            function1 = onNavigationEvent;
            c28655q = c28655q2;
            function2 = onViewEvent;
            c28655q.m87138X();
        } else if ((viewState instanceof AbstractC26753c.b) || viewState.equals(AbstractC26753c.a.f106471a)) {
            c28655q2.m87150e0(176120098);
            boolean zEquals = viewState.equals(AbstractC26753c.a.f106471a);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            int i15 = i14;
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC15918a.f60209a, c28655q2, 0), null, AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168202d, 0.0f, null, c28655q2, 25008, 104);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
            c28655q2.m87158i0();
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
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM92116f0, true, 1.0f);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM31988g);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            AbstractC6721d.c cVar = new AbstractC6721d.c(null, AbstractC8693b.m21267a(), null, AbstractC13673n.m38561h(C38072d.f163053a), "Back button", null, null, null, null, null, null, null, null, 8165, null);
            Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
            boolean z4 = (i15 & 896) == 256;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                function1 = onNavigationEvent;
                objM87133R = new C32458i(function1, 1);
                c28655q2.m87172p0(objM87133R);
            } else {
                function1 = onNavigationEvent;
            }
            AbstractC6719b.m20143d(modifierM66723l, cVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.c.f25657p << 3, 52);
            c28655q = c28655q2;
            int i16 = i15 & 112;
            function2 = onViewEvent;
            AbstractC33867b.m107092c(zEquals, function2, function1, c28655q, i15 & MessageListItemViewType.GIPHY);
            c28655q.m87173q(true);
            boolean z13 = i16 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C32451b(function2, 3);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC33866a.m107087c(zEquals, (Function1) objM87133R2, c28655q, 0);
            AbstractC25012a.m73392y(c28655q, true, true, false);
        } else {
            if (!(viewState instanceof AbstractC26753c.c)) {
                throw AbstractC11895b.m32003v(-1518342194, c28655q2, false);
            }
            c28655q2.m87150e0(177716691);
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q = c28655q2;
            c28655q.m87173q(false);
            function1 = onNavigationEvent;
            function2 = onViewEvent;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) viewState, function2, (InterfaceC23459e) function1, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m101595g(Function1 function1) {
        function1.invoke(AbstractC25618a.a.f100495a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m101596h(Function1 function1, AbstractC26751a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m101597i(AbstractC26753c abstractC26753c, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m101594f(abstractC26753c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final Modifier m101598j(Modifier removeParentPadding, float f13) {
        AbstractC22676k.m65750j(removeParentPadding, "$this$removeParentPadding");
        return AbstractC1131a.m3498b(removeParentPadding, new C13698g(f13, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC39130s0 m101599k(float f13, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        long j7 = c39169a.f168407a;
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(C39169a.m124758b(j7, 0, layout.mo724F(f13) + C39169a.m124765i(j7), 0, 0, 13));
        return layout.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C25587j(abstractC39104j1Mo448T, f13, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m101600l(AbstractC39104j1 abstractC39104j1, float f13, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        layout.m124632f(abstractC39104j1, -layout.mo724F(f13), 0, 0.0f);
        return C23454a0.f92919a;
    }
}
