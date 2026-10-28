package bf0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gz0.EnumC16313m0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.Iterator;
import kf0.C22436k;
import l83.C23454a0;
import md0.AbstractC25448c;
import ny0.AbstractC27271o0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p000.C21061j;
import p000.C22079k;
import p000.C27314o;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import ze0.AbstractC40584c;
import ze0.InterfaceC40582a;

/* JADX INFO: renamed from: bf0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lze0/c$e$c;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onTagClick", "Lkotlin/Function1;", "Lze0/a;", "onEvent", "f", "(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "i", "(Lze0/c$e$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3190b {
    /* JADX INFO: renamed from: f */
    public static final void m9180f(AbstractC40584c.e.c viewState, InterfaceC4339a onTagClick, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onTagClick, "onTagClick");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-809638534);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onTagClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
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
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f13, 0.0f, 1 * f13, 5);
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, viewState.getNavigationBar().getTag(), null, 49146, null);
            boolean z4 = (i15 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C27314o(onEvent, 29);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, onTagClick, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 12) & 458752), 20);
            m9183i(viewState, onEvent, c28655q, (i15 & 14) | ((i15 >> 3) & 112));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(viewState, onTagClick, onEvent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m9181g(Function1 function1) {
        function1.invoke(InterfaceC40582a.b.f174784a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m9182h(AbstractC40584c.e.c cVar, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m9180f(cVar, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m9183i(AbstractC40584c.e.c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-550607615);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
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
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 4 * f13, f14, 0.0f, 8);
            int i15 = i14;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            C2306l c2306l = null;
            Modifier modifierM44089m = AbstractC15674c.m44089m(AbstractC30060g.m92116f0(AbstractC11895b.m31988g(modifierM3398t, true, 1.0f), AbstractC30060g.m92099U(0, c28655q, 1), 14), 0.0f, 1, null);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(new C22971k(f14, false, null), c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44089m);
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
            c28655q.m87150e0(-419799169);
            Iterator<T> it = viewState.m131611f().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((C22436k) it.next(), AbstractC25448c.m74678B0(), null, null, c28655q, C25307p.f99300b << 3, 12);
                c2306l = c2306l;
            }
            C2306l c2306l2 = c2306l;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            float f15 = ((float) 2.5d) * f13;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), c2306l2, 3), f15, f14, f15, 0.0f, 8);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getFileSelectButton().getText());
            int i16 = i15 & 112;
            boolean z4 = i16 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C3189a(onEvent, 0);
                c28655q.m87172p0(objM87133R);
            }
            int i17 = TextResource.$stable;
            AbstractC27292z.m82343j(modifierM3398t2, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, i17 << 18, 0, 8126);
            c28655q = c28655q;
            float f16 = ((float) 1.5d) * f13;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), c2306l2, 3), f15, f16, f15, f16);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getImageSelectButton().getText());
            boolean z13 = i16 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                function1 = onEvent;
                objM87133R2 = new C3189a(function1, 1);
                c28655q.m87172p0(objM87133R2);
            } else {
                function1 = onEvent;
            }
            AbstractC27271o0.m82253b(modifierM3397s, false, textResourceM21278l2, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q, i17 << 6, 0, MessageListItemViewType.POLL);
            c28655q.m87173q(true);
        } else {
            function1 = onEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(viewState, function1, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m9184j(Function1 function1) {
        function1.invoke(InterfaceC40582a.j.f174792a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m9185k(Function1 function1) {
        function1.invoke(InterfaceC40582a.k.f174793a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m9186l(AbstractC40584c.e.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m9183i(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
