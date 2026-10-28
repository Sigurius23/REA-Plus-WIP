package com.whoop.profile.view.edit;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bs1.C3603v;
import c93.InterfaceC4339a;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import java.util.List;
import l83.C23454a0;
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
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import y71.AbstractC39281n;
import y71.C39282o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;", "states", "", "selectedStateCode", "Lkotlin/Function1;", "Ll83/a0;", "onStateSelected", "StateSelectionContent", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StateSelectionContentKt {
    public static final void StateSelectionContent(List<EditProfileViewState.State> states, String str, Function1 onStateSelected, Composer composer, int i13) {
        AbstractC22676k.m65750j(states, "states");
        AbstractC22676k.m65750j(onStateSelected, "onStateSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1968170634);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(states) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        int i15 = 256;
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onStateSelected) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 400, 1), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
            c28655q.m87150e0(1229837510);
            int i16 = 0;
            for (Object obj : states) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                EditProfileViewState.State state = (EditProfileViewState.State) obj;
                int i18 = i16;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C39282o c39282oM125229d = C39282o.Companion.m125229d(C39282o.INSTANCE, state.getName(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, AbstractC22676k.m65745e(str, state.getCode()), null, false, null, null, null, false, null, 8355838, null);
                boolean zM87157i = ((i14 & 896) == i15) | c28655q.m87157i(state);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3603v(26, onStateSelected, state);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC39281n.m125207c(modifierM3409f, c39282oM125229d, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                if (i18 != AbstractC37056f.m118951C(states)) {
                    c28655q.m87150e0(1468197479);
                    AbstractC25012a.m73388u((float) 1.5d, 8, c2314t, c28655q, false);
                } else {
                    c28655q.m87150e0(1468275320);
                    c28655q.m87173q(false);
                }
                i16 = i17;
                i15 = 256;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9771b(states, str, onStateSelected, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 StateSelectionContent$lambda$0$0$0$0(Function1 function1, EditProfileViewState.State state) {
        function1.invoke(state);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 StateSelectionContent$lambda$1(List list, String str, Function1 function1, int i13, Composer composer, int i14) {
        StateSelectionContent(list, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
