package of2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2588o1;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f31.AbstractC14046c;
import f31.C14044a;
import java.util.List;
import l83.C23454a0;
import lf2.C24013f;
import lf2.C24014g;
import m83.AbstractC25265s;
import mx1.C26003i;
import nw0.C27207n;
import ny0.AbstractC27248d1;
import ny0.AbstractC27282u;
import ny0.EnumC27250e0;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf2.AbstractC29152b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: of2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Llf2/g;", "viewState", "Lkotlin/Function1;", "Lpf2/b;", "Ll83/a0;", "sleepGoalViewEventListener", "e", "(Llf2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27899c {
    /* JADX INFO: renamed from: e */
    public static final void m84197e(C24014g viewState, Function1 sleepGoalViewEventListener, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(sleepGoalViewEventListener, "sleepGoalViewEventListener");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(463399590);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(sleepGoalViewEventListener) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            List<C24013f> listM70837d = viewState.m70837d();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Integer.valueOf(viewState.getInitialSelection()));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C2305k c2305k = C2299e.f9110M;
            C22961h c22961h = AbstractC22977m.f90655f;
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3396r(c2314t, 8 * f13, 0.0f, 2)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            AbstractC14046c.m39968h(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(listM70837d)), interfaceC28601c1.getValue(), null, null, AbstractC22977m.m66746i(2 * f13), AbstractC37817c.m121344e(1583294950, c28655q, new C27898b(listM70837d, sleepGoalViewEventListener, interfaceC28601c1)), c28655q, 221184, 12);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            long jM125400j = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentPositiveTrend();
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C27207n(sleepGoalViewEventListener, 13);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q = c28655q;
            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v, "NEXT", false, jM125400j, null, false, (InterfaceC4339a) objM87133R2, c28655q, 438, 104);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(viewState, sleepGoalViewEventListener, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m84198f(List list, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a RadioGroupVertical, int i13, C14044a state, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(RadioGroupVertical, "$this$RadioGroupVertical");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 48) == 0) {
            i15 = (((C28655q) composer).m87149e(i13) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? ((C28655q) composer).m87153g(state) : ((C28655q) composer).m87157i(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 1169) != 1168)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(((C24013f) list.get(i13)).getSleepGoalText());
            EnumC27250e0 enumC27250e0 = EnumC27250e0.TEXT;
            boolean zM39960c = state.getIsSelected();
            long jM125400j = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentPositiveTrend();
            boolean zM87153g = c28655q.m87153g(function1) | ((i15 & 112) == 32) | c28655q.m87157i(list);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2588o1(interfaceC28601c1, i13, function1, list);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27248d1.m82113e(null, textResourceM21278l, enumC27250e0, jM125400j, zM39960c, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 3) | 384, 225);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m84199g(InterfaceC28601c1 interfaceC28601c1, int i13, Function1 function1, List list, boolean z4) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        function1.invoke(new AbstractC29152b.b(((C24013f) list.get(i13)).getSleepGoal()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m84200h(Function1 function1) {
        function1.invoke(AbstractC29152b.a.f117999a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m84201i(C24014g c24014g, Function1 function1, int i13, Composer composer, int i14) {
        m84197e(c24014g, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
