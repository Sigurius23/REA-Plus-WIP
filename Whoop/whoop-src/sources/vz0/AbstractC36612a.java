package vz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.C22994r1;
import p294l3.C23285v0;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.C35015q;
import v90.C35813e;
import vs2.C36478d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: vz0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lvz0/b;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/navigation/e;", "Ll83/a0;", "onNavigationEvents", "d", "(Lvz0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36612a {
    /* JADX INFO: renamed from: d */
    public static final void m117607d(C36613b viewState, Function1 onNavigationEvents, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavigationEvents, "onNavigationEvents");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2070579999);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvents) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, ((float) 2.5d) * f13, 0.0f, 2 * f13, 0.0f, 10);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, f13, C2299e.f9108K, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            EnumC16313m0 icon = viewState.getIcon();
            if (icon == null) {
                c28655q2.m87150e0(64500987);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                i15 = 6;
            } else {
                C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q2, 64500988, icon, c28655q2, 6);
                float f14 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f14 * f14, c2314t);
                long white50 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite50();
                c28655q = c28655q2;
                i15 = 6;
                AbstractC15005f3.m43108b(c27430eM53378s, null, modifierM3419p, white50, c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            String strM21274h = AbstractC8693b.m21274h(viewState.getText(), c28655q, 0);
            boolean z4 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C35015q(viewState, onNavigationEvents, 20);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C21053l c21053l = C21053l.f79834a;
            C38072d c38072d = C38072d.f163053a;
            C23285v0 style = c38072d.m121952e(c28655q, i15).getB4().getStyle();
            long white70 = c38072d.m121949b(c28655q, i15).getWhite70();
            long white71 = c38072d.m121949b(c28655q, i15).getWhite70();
            C28655q c28655q3 = c28655q;
            C21054m c21054mM58880a = c21053l.m58880a(style, white70, white71, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760);
            c28655q2 = c28655q3;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C36478d(27);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC21048g.m58807M(strM21274h, modifierM3362g, false, c21054mM58880a, (Function1) objM87133R2, 0, 0, 0, false, c28655q2, 24576, 484);
            c28655q2.m87173q(true);
        } else {
            c28655q2.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(viewState, onNavigationEvents, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m117608e(C36613b c36613b, Function1 function1) {
        C9598e navigation = c36613b.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
        if (navigation != null) {
            function1.invoke(navigation);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m117609f(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m117610g(C36613b c36613b, Function1 function1, int i13, Composer composer, int i14) {
        m117607d(c36613b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
