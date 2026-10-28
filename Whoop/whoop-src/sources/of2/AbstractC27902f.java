package of2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.view.C9812h;
import ih0.AbstractC18489d0;
import l41.AbstractC23332d;
import l83.C23454a0;
import lf2.C24020m;
import nw0.C27207n;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf2.AbstractC29154d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: of2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Llf2/m;", "wakeTimeState", "Lkotlin/Function1;", "Lpf2/d;", "Ll83/a0;", "wakeTimeListener", "d", "(Llf2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27902f {
    /* JADX INFO: renamed from: d */
    public static final void m84212d(C24020m wakeTimeState, Function1 wakeTimeListener, Composer composer, int i13) {
        int i14;
        Function1 function1;
        AbstractC22676k.m65750j(wakeTimeState, "wakeTimeState");
        AbstractC22676k.m65750j(wakeTimeListener, "wakeTimeListener");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-982329775);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(wakeTimeState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(wakeTimeListener) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2305k c2305k = C2299e.f9111N;
            C22961h c22961h = AbstractC22977m.f90656g;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            Modifier modifierM3406c = AbstractC1102d.m3406c(0.7f, c2314t);
            LocalTime localTimeM70876d = wakeTimeState.getLatestWakeTime();
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C9812h(wakeTimeListener, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23332d.m67560g(null, false, localTimeM70876d, false, null, 0L, modifierM3406c, false, (InterfaceC4351m) objM87133R, c28655q, 14158848, 51);
            float f13 = 4;
            float f14 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f14, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1099a.m3396r(c2314t, 2 * f14, 0.0f, 2));
            String strM70873a = wakeTimeState.getAlarmToWakeTimeDescription();
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM70873a, modifierM38560g, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB3(), null, c28655q, 0, C2886a.f11498d << 18, 196088);
            c28655q = c28655q;
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM70878f = wakeTimeState.getWakeTimeSaveButton();
            long jMo134584toComposableColorWaAFU9c = wakeTimeState.getWakeTimeButtonColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            boolean z13 = i15 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C27207n(wakeTimeListener, 14);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            function1 = wakeTimeListener;
            AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM70878f, false, jMo134584toComposableColorWaAFU9c, null, false, interfaceC4339a, c28655q, 54, 104);
            AbstractC31061c.m95650z(10, f13, c2314t, c28655q, true);
            c28655q.m87173q(true);
        } else {
            function1 = wakeTimeListener;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(wakeTimeState, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m84213e(Function1 function1, int i13, int i14) {
        function1.invoke(new AbstractC29154d.b(new LocalTime(i13, i14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m84214f(Function1 function1) {
        function1.invoke(AbstractC29154d.a.f118014a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m84215g(C24020m c24020m, Function1 function1, int i13, Composer composer, int i14) {
        m84212d(c24020m, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
