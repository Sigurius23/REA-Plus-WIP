package lf0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import j21.C21245d;
import jp1.C21851c;
import l01.C23045q;
import l72.C23401h;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: lf0.q2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/r2;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Llf0/r2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23961q2 {
    /* JADX INFO: renamed from: e */
    public static final void m70613e(Modifier modifier, C23965r2 state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(535570478);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            boolean zM87157i = c28655q2.m87157i(state) | ((i15 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C23045q(onViewEvent, state, 14);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 0L, AbstractC33253j.m105489e(8), null, null, 0, AbstractC37817c.m121344e(-627622978, c28655q2, new C21245d(15, state, onViewEvent)), c28655q, 14155776, 54);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 21, (Object) modifier3, (Object) state, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m70614f(Function1 function1, C23965r2 c23965r2) {
        function1.invoke(c23965r2.getSecondaryButton().getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m70615g(C23965r2 c23965r2, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            float f14 = 2 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f14, f14, f14, ((float) 2.5d) * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
            String strM70625c = c23965r2.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM70625c, null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            C28655q c28655q2 = c28655q;
            c28655q2.m87150e0(967143803);
            for (C23969s2 c23969s2 : c23965r2.m70623a()) {
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * f13), C2299e.f9108K, c28655q2, 54);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                C17731c2 trend = c23969s2.getTrend();
                float f15 = 4;
                float f16 = f13;
                AbstractC17808z1.m51175c(trend.m50800a((28671 & 1) != 0 ? trend.text : null, (28671 & 2) != 0 ? trend.includeBackground : false, (28671 & 4) != 0 ? trend.trendTypeState : null, (28671 & 8) != 0 ? trend.isPressed : false, (28671 & 16) != 0 ? trend.icon : null, (28671 & 32) != 0 ? trend.removeSideRadius : null, (28671 & 64) != 0 ? trend.withIcon : false, (28671 & 128) != 0 ? trend.showBorder : false, (28671 & 256) != 0 ? trend.overflow : 0, (28671 & 512) != 0 ? trend.maxLines : 0, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? trend.iconSize : f16, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? trend.destination : null, (28671 & 4096) != 0 ? trend.maxFontScaling : null, (28671 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? trend.radius : 0.0f, (28671 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? trend.backgroundPaddingValues : new C22976l1(f15, f15, f15, f15)), c28655q2, C17731c2.f68917p);
                String text = c23969s2.getText();
                C38072d c38072d2 = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                C2886a b6 = c38072d2.m121952e(c28655q2, i15).getB2();
                long brandWhite = c38072d2.m121949b(c28655q2, i15).getBrandWhite();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(text, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q3, 0, C2886a.f11498d << 18, 196600);
                c28655q2 = c28655q3;
                c28655q2.m87173q(true);
                f13 = f16;
            }
            c28655q2.m87173q(false);
            C28655q c28655q4 = c28655q2;
            AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q4, 0, 255);
            TextResource text2 = c23965r2.getSecondaryButton().getText();
            C39274g c39274g = new C39274g(EnumC16313m0.ARROW_FORWARD.toWhoopIcon(), null, 2, null);
            boolean zM87153g = c28655q4.m87153g(function1) | c28655q4.m87157i(c23965r2);
            Object objM87133R = c28655q4.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C21851c(27, function1, c23965r2);
                c28655q4.m87172p0(objM87133R);
            }
            AbstractC27265l0.m82217i(null, null, text2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q4, (TextResource.$stable << 6) | 100663296 | (C39274g.f168929c << 12), 0, 3819);
            c28655q4.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m70616h(Function1 function1, C23965r2 c23965r2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c23965r2.getSecondaryButton().getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m70617i(Modifier modifier, C23965r2 c23965r2, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70613e(modifier, c23965r2, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
