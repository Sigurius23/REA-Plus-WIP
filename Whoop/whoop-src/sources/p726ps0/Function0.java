package p726ps0;

import am2.C1018g;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import ny0.AbstractC27271o0;
import os0.AbstractC28312h;
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
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ps0.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onPairNewWhoopClicked", "onNeedHelpClicked", "b", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "connectivity-common-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: b */
    public static final void m90138b(InterfaceC4339a onPairNewWhoopClicked, InterfaceC4339a onNeedHelpClicked, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a;
        InterfaceC4339a interfaceC4339a2;
        AbstractC22676k.m65750j(onPairNewWhoopClicked, "onPairNewWhoopClicked");
        AbstractC22676k.m65750j(onNeedHelpClicked, "onNeedHelpClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1883101839);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(onPairNewWhoopClicked) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNeedHelpClicked) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC28312h.f114169e);
            float f13 = 8;
            float f14 = 3 * f13;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, 1 * f13, 7), "ble_choose_strap_pair_new_whoop_button");
            int i16 = (TextResource.C8688b.f25889c << 6) | 6;
            AbstractC27271o0.m82253b(modifierM3599a, false, c8688bM21277k, null, null, null, null, null, false, null, onPairNewWhoopClicked, c28655q, i16, i15 & 14, MessageListItemViewType.POLL);
            interfaceC4339a = onPairNewWhoopClicked;
            interfaceC4339a2 = onNeedHelpClicked;
            AbstractC27271o0.m82253b(AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, 5 * f13, 7), "ble_choose_strap_need_help_button"), false, AbstractC8693b.m21277k(AbstractC28312h.f114157V), null, null, null, null, null, false, null, interfaceC4339a2, c28655q, i16, (i15 >> 3) & 14, MessageListItemViewType.POLL);
            c28655q.m87173q(true);
        } else {
            interfaceC4339a = onPairNewWhoopClicked;
            interfaceC4339a2 = onNeedHelpClicked;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1018g(interfaceC4339a, interfaceC4339a2, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m90139c(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m90138b(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
