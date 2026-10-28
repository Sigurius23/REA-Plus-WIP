package ej1;

import a11.C0140r;
import am2.C1042s;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bs1.C3590i;
import c93.InterfaceC4339a;
import cj1.C4753i;
import cj1.InterfaceC4751g;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.HealthMonitorScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.profile.view.C9813i;
import dp0.AbstractC12248d;
import ep0.C13404j;
import gb1.AbstractC15676d;
import gb1.AbstractC15689q;
import hg3.AbstractC17269i;
import j93.AbstractC21478l0;
import java.util.Iterator;
import java.util.List;
import kotlin.C1987a0;
import l83.C23454a0;
import m12.AbstractC24936d;
import m83.AbstractC25265s;
import n71.C26436q;
import n71.EnumC26437r;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.C3733d1;
import p040c0.C3739f1;
import p239j1.AbstractC21189g;
import p239j1.C21194l;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p704dk2.C12122i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ej1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcj1/i$d;", "viewState", "Lkotlin/Function1;", "Lcj1/g;", "Ll83/a0;", "onEvent", "i", "(Lcj1/i$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13252o {
    /* JADX INFO: renamed from: i */
    public static final void m37246i(C4753i.d viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        Object next;
        Object c1042s;
        int i15;
        C0209i c0209i;
        C26068u c26068u;
        List<Integer> listM78257c;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1974730493);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        int i16 = i14;
        int i17 = 0;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            int i18 = 3;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C26068u(i17, i18, i17);
                c28655q.m87172p0(objM87133R);
            }
            C26068u c26068u2 = (C26068u) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            Iterator<T> it = viewState.m14982d().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((InterfaceC25312u) next) instanceof C26436q));
            C26436q c26436q = next instanceof C26436q ? (C26436q) next : null;
            Integer num = (c26436q == null || (listM78257c = c26436q.m78257c()) == null) ? null : (Integer) AbstractC25265s.m74114R0(listM78257c);
            EnumC26437r zoneStatus = c26436q != null ? c26436q.getZoneStatus() : null;
            boolean zM14980b = viewState.getDisplayPullToRefresh();
            int i19 = i16 & 112;
            boolean z4 = i19 == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C9813i(onEvent, 23);
                c28655q.m87172p0(objM87133R3);
            }
            Integer num2 = num;
            C21194l c21194lM60416V = AbstractC21478l0.m60416V(zM14980b, (InterfaceC4339a) objM87133R3, 0.0f, c28655q, 0, 12);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM48893g0 = AbstractC17269i.m48893g0(AbstractC1102d.m3407d(1.0f, c2314t), c21194lM60416V);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM48893g0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            Modifier modifierM3411h = AbstractC1102d.m3411h(10 * 4, AbstractC1102d.m3409f(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            boolean zM14981c = viewState.getDisplayRefreshingAnimation();
            C3733d1 c3733d1M11577e = AbstractC3788w0.m11577e(null, 3);
            C3739f1 c3739f1M11578f = AbstractC3788w0.m11578f(null, 3);
            C13230b c13230b = C13230b.f45842a;
            AbstractC1090b.m3351f(zM14981c, null, c3733d1M11577e, c3739f1M11578f, "Lottie Animation", c13230b.m37145d(), c28655q, 224640, 2);
            AbstractC1090b.m3351f(!viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Toolbar Animation", c13230b.m37146e(), c28655q, 224640, 2);
            c28655q.m87173q(true);
            InterfaceC22973k1 interfaceC22973k1M34113f = AbstractC12248d.m34113f(new C13404j(null, null, true, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, false, 8388603, null), null, true, c28655q, C13404j.f46947x | 384, 2);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            boolean z13 = i19 == 32;
            Object objM87133R4 = c28655q.m87133R();
            if (z13 || objM87133R4 == c28676v0) {
                objM87133R4 = new C3590i(interfaceC28601c1, onEvent, 11);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM44145m = AbstractC15689q.m44145m(modifierM3407d, c26068u2, (InterfaceC4339a) objM87133R4);
            C2305k c2305k = C2299e.f9111N;
            boolean zM87157i = c28655q.m87157i(viewState) | c28655q.m87153g(num2) | c28655q.m87149e(zoneStatus == null ? -1 : zoneStatus.ordinal()) | (i19 == 32);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                i15 = i19;
                c0209i = c0209i3;
                c26068u = c26068u2;
                c1042s = new C1042s((Object) viewState, (Object) num2, (Object) zoneStatus, onEvent, 16);
                c28655q.m87172p0(c1042s);
            } else {
                c26068u = c26068u2;
                c1042s = objM87133R5;
                c0209i = c0209i3;
                i15 = i19;
            }
            int i24 = i15;
            C0209i c0209i6 = c0209i;
            AbstractC22674j.m65717c(modifierM44145m, c26068u, interfaceC22973k1M34113f, null, c2305k, null, false, null, (Function1) c1042s, c28655q, 196656, 472);
            c28655q.m87173q(true);
            AbstractC13250m.m37233e(viewState, onEvent, c28655q, i16 & 126);
            AbstractC21189g.m59424b(viewState.getDisplayPullToRefresh(), c21194lM60416V, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x), 0L, 0L, c28655q, 64);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            boolean z14 = i24 == 32;
            Object objM87133R6 = c28655q.m87133R();
            if (z14 || objM87133R6 == c28676v0) {
                objM87133R6 = new C12122i(onEvent, 7);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC24936d.m73080z("OVERLAY_HEALTH_TAB", null, true, (Function1) objM87133R6, null, null, null, c28655q, 384, 114);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13248k(viewState, onEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m37247j(Function1 function1) {
        function1.invoke(new InterfaceC4751g.m(true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m37248k(InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        if (!((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
            function1.invoke(InterfaceC4751g.o.f19499a);
            interfaceC28601c1.setValue(Boolean.TRUE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m37249l(C4753i.d dVar, Integer num, EnumC26437r enumC26437r, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        int i13 = 0;
        for (Object obj : dVar.m14982d()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C4753i.d dVar2 = dVar;
            Integer num2 = num;
            EnumC26437r enumC26437r2 = enumC26437r;
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C1987a0(i13, dVar2, (InterfaceC25312u) obj, num2, enumC26437r2, function1), true, 627838368), 3);
            dVar = dVar2;
            num = num2;
            enumC26437r = enumC26437r2;
            i13 = i14;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m37250m(int i13, C4753i.d dVar, InterfaceC25312u interfaceC25312u, Integer num, EnumC26437r enumC26437r, Function1 function1, InterfaceC1103a item, Composer composer, int i14) {
        boolean z4;
        boolean zIsFeatureEnabled;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            if (i13 == AbstractC37056f.m118951C(dVar.m14982d())) {
                z4 = false;
            } else {
                if (interfaceC25312u instanceof C0140r) {
                    c28655q.m87150e0(2057267970);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled("health-tab-no-hr");
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-649260690);
                    c28655q.m87173q(false);
                    zIsFeatureEnabled = true;
                }
                if (zIsFeatureEnabled) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C13251n(0);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo3471e = AbstractC15676d.m44099b(c2314t, z4, (Function1) objM87133R).mo3471e(AbstractC13254q.m37262h(c2314t, interfaceC25312u));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            boolean zM87153g = c28655q.m87153g(num) | c28655q.m87149e(enumC26437r == null ? -1 : enumC26437r.ordinal()) | c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                C1042s c1042s = new C1042s((Object) num, (Object) enumC26437r, function1, (Object) interfaceC25312u, 17);
                c28655q.m87172p0(c1042s);
                objM87133R2 = c1042s;
            }
            AbstractC13254q.m37258d(null, interfaceC25312u, (Function1) objM87133R2, c28655q, 0, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Modifier m37251n(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m37252o(Integer num, EnumC26437r enumC26437r, Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof C9598e) {
            C9598e c9598e = (C9598e) it;
            if ((c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9378o2) && (c9598e.getParameters() instanceof HealthMonitorScreenModel)) {
                String strName = enumC26437r != null ? enumC26437r.name() : null;
                NavigationScreenModel parameters = c9598e.getParameters();
                HealthMonitorScreenModel healthMonitorScreenModel = parameters instanceof HealthMonitorScreenModel ? (HealthMonitorScreenModel) parameters : null;
                function1.invoke(new InterfaceC4751g.l(C9598e.m23127b(c9598e, null, new HealthMonitorScreenModel(num, strName, healthMonitorScreenModel != null ? healthMonitorScreenModel.getSource() : null, (AiAction) null, 8, (DefaultConstructorMarker) null), null, 5, null), interfaceC25312u));
            } else {
                function1.invoke(new InterfaceC4751g.l(it, interfaceC25312u));
            }
        } else {
            function1.invoke(new InterfaceC4751g.l(it, interfaceC25312u));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m37253p(Function1 function1, boolean z4) {
        function1.invoke(new InterfaceC4751g.g(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m37254q(C4753i.d dVar, Function1 function1, int i13, Composer composer, int i14) {
        m37246i(dVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
