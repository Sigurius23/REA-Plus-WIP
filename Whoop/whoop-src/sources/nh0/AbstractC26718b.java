package nh0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2609r;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.GenericScreenModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.navigation.models.GenericInteraction;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gf1.C15786e;
import gz0.EnumC16313m0;
import java.util.Iterator;
import java.util.List;
import kotlin.C2032u;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import m31.C25002h;
import m83.AbstractC25260n;
import n72.C26439b;
import na1.C26511a;
import ny0.C27256h;
import ny0.EnumC27272p;
import oh0.C27935c;
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
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p734sl0.AbstractC32640m0;
import p736sz0.AbstractC33220t0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: nh0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a7\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lm91/u;", "p", "(Lm91/u;)Lm91/u;", "Lnh0/c;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Lnh0/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/navigation/e;", "a", "Lcom/whoop/navigation/e;", "getSummaryFinishDestination", "()Lcom/whoop/navigation/e;", "summaryFinishDestination", "b", "Lnh0/c;", "getSummaryConfirmationPreviewViewState", "()Lnh0/c;", "summaryConfirmationPreviewViewState", "", "viewImpressionFired", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26718b {

    /* JADX INFO: renamed from: a */
    private static final C9598e f106219a;

    /* JADX INFO: renamed from: b */
    private static final C26719c f106220b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        CachePolicyModel cachePolicyModel = null;
        MetricEventModel metricEventModel = null;
        GenericInteraction genericInteraction = null;
        List list = null;
        List list2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        C9598e c9598e = new C9598e(AppScreen.C9346k2.f27718w, new GenericScreenModel(new ApiRequest("onboarding-personalization-service/v1/personalization/in-progress", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), cachePolicyModel, (String) objArr2, (ScreenAnalyticEventModel) objArr3, metricEventModel, (AiAction) objArr, genericInteraction, list, list2, 510, (DefaultConstructorMarker) null), null, 4, null);
        f106219a = c9598e;
        int i13 = 0;
        boolean z4 = false;
        boolean z13 = false;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        String str = "goal-summary";
        Object[] objArr9 = 0 == true ? 1 : 0;
        f106220b = new C26719c(str, new C27935c("**Your Goal Summary**", i13, z4, z13, 0 == true ? 1 : 0, 30, objArr4), new C27935c("I want to sleep better and build healthier habits so that I can feel energetic every day and present with my family.", i13, z4, z13, AbstractC15673b0.m43972A(), 14, 0 == true ? 1 : 0), AbstractC37056f.m118958J(new C27256h(AbstractC8693b.m21278l("FINISH"), EnumC16313m0.CHECKMARK, null, null, null, null, EnumC27272p.HIGHLIGHT, c9598e, objArr6, objArr7, objArr8, null, objArr5, false, true, null, false, false, null, null, null, null, null, null, null, 33529660, null)), objArr9, 16, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m79432g(C26719c viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier2;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        AnalyticEventModel analyticEventModelM79442a;
        boolean zM87153g;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(23095156);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26439b(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                Object[] objArr = {viewState.getId()};
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C26511a(25);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 48);
                analyticEventModelM79442a = viewState.getAnalyticEvent();
                if (m79435j(interfaceC28601c1)) {
                    analyticEventModelM79442a = null;
                }
                zM87153g = c28655q.m87153g(interfaceC28601c1) | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2609r(function4, interfaceC28601c1, 25);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC33220t0.m105391c(analyticEventModelM79442a, (Function1) objM87133R2, c28655q, 0);
                float f13 = 4;
                Modifier modifier4 = modifier3;
                Function1 function5 = function4;
                AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC32640m0.m102010c()), AbstractC37817c.m121344e(-1010533324, c28655q, new C2032u((Object) modifier4, (Object) AbstractC33253j.m105489e(f13 * f13), (Object) viewState, function5, 26)), c28655q, 56);
                function3 = function5;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 9, modifier2, function3, viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26439b(9);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            Object[] objArr2 = {viewState.getId()};
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C26511a(25);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R, c28655q, 48);
            analyticEventModelM79442a = viewState.getAnalyticEvent();
            if (m79435j(interfaceC28601c1)) {
                analyticEventModelM79442a = null;
            }
            zM87153g = c28655q.m87153g(interfaceC28601c1) | ((i15 & 896) == 256);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R2 = new C2609r(function4, interfaceC28601c1, 25);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2609r(function4, interfaceC28601c1, 25);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC33220t0.m105391c(analyticEventModelM79442a, (Function1) objM87133R2, c28655q, 0);
            float f14 = 4;
            Modifier modifier5 = modifier3;
            Function1 function6 = function4;
            AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC32640m0.m102010c()), AbstractC37817c.m121344e(-1010533324, c28655q, new C2032u((Object) modifier5, (Object) AbstractC33253j.m105489e(f14 * f14), (Object) viewState, function6, 26)), c28655q, 56);
            function3 = function6;
            modifier2 = modifier5;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 9, modifier2, function3, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m79433h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC28601c1 m79434i() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: j */
    private static final boolean m79435j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    private static final void m79436k(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m79437l(Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m79436k(interfaceC28601c1, true);
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m79438m(Modifier modifier, C33252i c33252i, C26719c c26719c, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(3 * f13, AbstractC15751g.m44456i(((float) 0.5d) * 4, AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier), c33252i), AbstractC15673b0.m44002P(), null, 0.0f, 6), AbstractC15673b0.m43972A(), c33252i));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(651216140);
            Iterator it = AbstractC25260n.m74077r0(new InterfaceC25312u[]{c26719c.getTitle(), c26719c.getSummary()}).iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function1, c28655q, 0, 6);
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(651220521);
            Iterator<T> it3 = c26719c.m79443b().iterator();
            while (it3.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it3.next(), null, new C15786e(27), function1, c28655q, 0, 2);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Modifier m79439n(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1851724083);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m79440o(C26719c c26719c, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m79432g(c26719c, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC25312u m79441p(InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(interfaceC25312u, "<this>");
        return interfaceC25312u instanceof C27256h ? C27256h.m82144b((C27256h) interfaceC25312u, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null) : interfaceC25312u;
    }
}
