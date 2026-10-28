package m80;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bp0.C3526n;
import c03.C3815c;
import c41.C4004c5;
import c41.C4069m0;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.InAppBrowserScreenModel;
import l80.AbstractC23438o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p710im1.C18680l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m80.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc03/c;", "whoopStatusViewState", "Lkotlin/Function1;", "Ll80/o;", "Ll83/a0;", "onNavigationEvent", "d", "(Landroidx/compose/ui/Modifier;Lc03/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25225g {
    /* JADX INFO: renamed from: d */
    public static final void m73941d(Modifier modifier, C3815c whoopStatusViewState, Function1 onNavigationEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(whoopStatusViewState, "whoopStatusViewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1310091775);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(whoopStatusViewState) : c28655q.m87157i(whoopStatusViewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            if (!whoopStatusViewState.getShouldDisplay() || whoopStatusViewState.getAlertTileViewState() == null) {
                c28655q.m87150e0(-575218591);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-575957600);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
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
                C4069m0 alertTileViewState = whoopStatusViewState.getAlertTileViewState();
                AbstractC22676k.m65748h(alertTileViewState, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.AlertTileState");
                C4004c5 c4004c5 = new C4004c5(5);
                boolean z4 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && c28655q.m87157i(whoopStatusViewState))) | ((i15 & 896) == 256);
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3526n(onNavigationEvent, whoopStatusViewState, 27);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(alertTileViewState, null, c4004c5, (Function1) objM87133R, c28655q, C4069m0.f16535h, 2);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18680l(modifier2, whoopStatusViewState, onNavigationEvent, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Modifier m73942e(C4069m0 it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1826924212);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * 8, 1);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m73943f(Function1 function1, C3815c c3815c, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC23438o.a(new C9598e(AppScreen.C9457y2.f28061w, new InAppBrowserScreenModel(c3815c.getStatusUrl()), null, 4, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m73944g(Modifier modifier, C3815c c3815c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m73941d(modifier, c3815c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
