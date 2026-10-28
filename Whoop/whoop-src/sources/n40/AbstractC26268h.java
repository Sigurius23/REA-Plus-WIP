package n40;

import android.app.Activity;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import aq1.C1909c;
import c93.InterfaceC4351m;
import cy.C11181b;
import ec3.InterfaceC13087t1;
import no.nordicsemi.android.dfu.DfuBaseService;
import p023ay.C2147u;
import p078d1.C11457j;
import p114eb.C12982q;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n40.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC26268h {

    /* JADX INFO: renamed from: a */
    public static final C11181b f104432a = new C11181b(18);

    /* JADX INFO: renamed from: a */
    public static final void m77945a(InterfaceC13087t1 navigationChannel, C12991u0 c12991u0, C11457j c11457j, Function1 function1, Function1 onBackStackEntryUpdated, Composer composer, int i13) {
        int i14;
        Object c2147u;
        C12991u0 c12991u1;
        Activity activity;
        Object c26263c;
        C12991u0 navHostController = c12991u0;
        AbstractC22676k.m65750j(navigationChannel, "navigationChannel");
        AbstractC22676k.m65750j(navHostController, "navHostController");
        AbstractC22676k.m65750j(onBackStackEntryUpdated, "onBackStackEntryUpdated");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-814812707);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(navigationChannel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(navHostController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(c11457j) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onBackStackEntryUpdated) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i14 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Object objM87161k = c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Activity activity2 = objM87161k instanceof Activity ? (Activity) objM87161k : null;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(navHostController.f44679F, null, null, c28655q, 48, 2);
            C12982q c12982q = (C12982q) interfaceC28601c1M87260n.getValue();
            c28655q.m87150e0(-1864788666);
            boolean zM87157i = ((57344 & i14) == 16384) | c28655q.m87157i(navHostController) | c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                c12991u1 = c12991u0;
                activity = activity2;
                c2147u = new C2147u(c12991u1, onBackStackEntryUpdated, interfaceC28601c1M87260n, null, 13);
                c28655q.m87172p0(c2147u);
            } else {
                c12991u1 = navHostController;
                activity = activity2;
                c2147u = objM87133R;
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) c2147u, c12982q);
            c28655q.m87150e0(-1864777936);
            boolean zM87157i2 = c28655q.m87157i(navigationChannel) | c28655q.m87157i(activity) | ((i14 & 896) == 256) | c28655q.m87157i(c12991u1) | ((i14 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C12991u0 c12991u2 = c12991u1;
                c26263c = new C26263c(navigationChannel, activity, c11457j, c12991u2, function1, null);
                navHostController = c12991u2;
                c28655q.m87172p0(c26263c);
            } else {
                c26263c = objM87133R2;
                navHostController = c12991u1;
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87255i(activity, navHostController, navigationChannel, (InterfaceC4351m) c26263c, c28655q);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(navigationChannel, navHostController, c11457j, function1, onBackStackEntryUpdated, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m77946b(C26267g c26267g, String route) {
        c26267g.getClass();
        AbstractC22676k.m65750j(route, "route");
        c26267g.f104430a.mo36564a(new C26265e(route, null, true));
    }
}
