package vp1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.Set;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.C35015q;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import sg2.C32464o;
import tp1.C34065e;
import tp1.C34066f;
import v11.C35546d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: vp1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ltp1/f;", "drawer", "", "", "selectedValues", "Lkotlin/Function1;", "Ll83/a0;", "onSelectGoal", "Lkotlin/Function0;", "onSave", "g", "(Ltp1/f;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Ltp1/e;", "viewState", "", "isSelected", "onClick", "e", "(Ltp1/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36268d {
    /* JADX INFO: renamed from: e */
    public static final void m115726e(C34065e viewState, boolean z4, InterfaceC4339a onClick, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long jM95628d;
        long jM73366B;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1765188067);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onClick) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 3 * 4;
            Modifier modifierM118994r = AbstractC37056f.m118994r(C2314t.f9131w, AbstractC33253j.m105489e(f13));
            if (z4) {
                c28655q2.m87150e0(-166340947);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            } else {
                c28655q2.m87150e0(-166339862);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3362g(AbstractC1092a.m3358c(modifierM118994r, jM95628d, AbstractC17918w0.f69621a), false, null, null, onClick, 15), f13, 1 * 8);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q2, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a b6 = c38072d.m121952e(c28655q2, i15).getB1();
            if (z4) {
                c28655q2.m87150e0(-1025002969);
                jM73366B = c38072d.m121949b(c28655q2, i15).getBrandBlack();
            } else {
                jM73366B = AbstractC25012a.m73366B(c28655q2, -1025001881, c38072d, c28655q2, i15);
            }
            c28655q2.m87173q(false);
            AbstractC30795n.m94707h(strM21274h, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(viewState, z4, onClick, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m115727f(C34065e c34065e, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m115726e(c34065e, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m115728g(C34066f drawer, Set<String> selectedValues, Function1 onSelectGoal, InterfaceC4339a onSave, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(drawer, "drawer");
        AbstractC22676k.m65750j(selectedValues, "selectedValues");
        AbstractC22676k.m65750j(onSelectGoal, "onSelectGoal");
        AbstractC22676k.m65750j(onSave, "onSave");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-788302969);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(drawer) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(selectedValues) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onSelectGoal) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onSave) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 1;
            float f14 = 4;
            float f15 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f14, f13 * f15);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            TextResource textResourceM107678d = drawer.getTitleDisplay();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM107678d, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a t14 = c38072d.m121952e(c28655q, i16).getT2();
            long brandWhite = c38072d.m121949b(c28655q, i16).getBrandWhite();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q, 0, i17, 196602);
            float f16 = 2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(drawer.getDescriptionDisplay(), c28655q, i15), AbstractC1099a.m3398t(c2314t, 0.0f, f16 * f15, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, i17, 196600);
            float f17 = f16 * f14;
            AbstractC22960g2.m66729a(AbstractC1099a.m3398t(c2314t, 0.0f, f14 * f15, 0.0f, 0.0f, 13), AbstractC22977m.m66746i(f17), AbstractC22977m.m66746i(f17), null, 0, 0, AbstractC37817c.m121344e(-815415838, c28655q, new C26949h(drawer, selectedValues, onSelectGoal, 22)), c28655q, 1573302, 56);
            AbstractC27292z.m82343j(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 6 * f15, 0.0f, 0.0f, 13), !selectedValues.isEmpty(), false, null, null, null, drawer.getButtonText(), null, null, null, 0.0f, null, null, onSave, c28655q, (i15 << 18) | 6, i14 & 7168, 8124);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35546d(drawer, selectedValues, onSelectGoal, onSave, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m115729h(C34066f c34066f, Set set, Function1 function1, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (C34065e c34065e : c34066f.m107677c()) {
                boolean zContains = set.contains(c34065e.getValue());
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c34065e);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C35015q(18, function1, c34065e);
                    c28655q.m87172p0(objM87133R);
                }
                m115726e(c34065e, zContains, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m115730i(Function1 function1, C34065e c34065e) {
        function1.invoke(c34065e.getValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m115731j(C34066f c34066f, Set set, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m115728g(c34066f, set, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
