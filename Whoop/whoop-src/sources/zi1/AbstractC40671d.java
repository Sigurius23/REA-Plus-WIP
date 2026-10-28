package zi1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import d11.AbstractC11471f;
import d11.C11474i;
import i91.AbstractC18249c;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import vi1.EnumC36058a;
import vv2.C36537c;
import wb3.AbstractC37056f;
import x81.C38072d;
import xi1.InterfaceC38321a;
import yi1.C39577k;
import yi1.C39578l;
import yo1.C39689b;

/* JADX INFO: renamed from: zi1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lyi1/k;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lyi1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40671d {

    /* JADX INFO: renamed from: zi1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f175590w = new a();

        /* JADX INFO: renamed from: a */
        public final long m132021a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m132021a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:52:0x0200  */
    /* JADX INFO: renamed from: c */
    public static final void m132018c(Modifier modifier, C39577k itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        Object objM87133R;
        C11474i c11474iM30808f;
        boolean z4;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-452704013);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C39578l header = itemState.getHeader();
            int i15 = TextResource.$stable;
            AbstractC40685o.m132093d(header, onViewEvent, c28655q, C9598e.f28134d | i15 | ((i14 >> 3) & 112));
            float f13 = 4 * 3;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            String strM21274h = AbstractC8693b.m21274h(itemState.getBody(), c28655q, i15);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * 8, 7);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            int i17 = i14;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            C9598e navigationAction = itemState.getCta().getNavigationAction();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (navigationAction == null) {
                c28655q.m87150e0(-2107385628);
                C11474i cta = itemState.getCta();
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = a.f175590w;
                    c28655q.m87172p0(objM87133R);
                }
                c11474iM30808f = C11474i.m30808f(cta, null, null, AbstractC33745d.m106661t(c38072d, c28655q, i16), null, null, c38072d.m121952e(c28655q, i16).getB4().getStyle(), null, null, null, null, null, false, false, null, null, null, false, false, null, AbstractC18249c.m52574l((Function1) objM87133R), null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536346587, null);
                z4 = false;
                c28655q.m87173q(false);
            } else {
                C9598e navigationAction2 = itemState.getCta().getNavigationAction();
                if ((navigationAction2 != null ? navigationAction2.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null) instanceof AppScreen.C9318g6) {
                    c28655q.m87150e0(-2107385628);
                    C11474i cta2 = itemState.getCta();
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = a.f175590w;
                        c28655q.m87172p0(objM87133R);
                    }
                    c11474iM30808f = C11474i.m30808f(cta2, null, null, AbstractC33745d.m106661t(c38072d, c28655q, i16), null, null, c38072d.m121952e(c28655q, i16).getB4().getStyle(), null, null, null, null, null, false, false, null, null, null, false, false, null, AbstractC18249c.m52574l((Function1) objM87133R), null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536346587, null);
                    z4 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2107159235);
                    c11474iM30808f = C11474i.m30808f(itemState.getCta(), null, null, c38072d.m121952e(c28655q, i16).getH4().getStyle(), null, null, c38072d.m121952e(c28655q, i16).getB4().getStyle(), null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 536870875, null);
                    z4 = false;
                    c28655q.m87173q(false);
                }
            }
            C11474i c11474i = c11474iM30808f;
            boolean zM87157i = c28655q.m87157i(itemState) | ((i17 & 896) == 256 ? true : z4);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                function1 = onViewEvent;
                objM87133R2 = new C39689b(itemState, function1, 17);
                c28655q.m87172p0(objM87133R2);
            } else {
                function1 = onViewEvent;
            }
            AbstractC11471f.m30786k(c11474i, null, null, (InterfaceC4339a) objM87133R2, c28655q, C11474i.f36854E, 6);
            c28655q.m87173q(true);
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(modifier, itemState, function1, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m132019d(C39577k c39577k, Function1 function1) {
        C9598e navigationAction = c39577k.getCta().getNavigationAction();
        if (navigationAction != null) {
            Object obj = c39577k.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.whoop.health.monitor.medical.domain.HeartHealthAnalyticsType");
            function1.invoke(new InterfaceC38321a.g((EnumC36058a) obj, navigationAction));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132020e(Modifier modifier, C39577k c39577k, Function1 function1, int i13, Composer composer, int i14) {
        m132018c(modifier, c39577k, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
