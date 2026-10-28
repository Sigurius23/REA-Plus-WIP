package p161g;

import android.os.Build;
import android.view.View;
import android.view.Window;
import bi.AbstractC3269g;
import p014aj.C0929d;
import p184h5.C16908r1;
import p184h5.C16911s1;
import p184h5.C16917u1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: g.q */
/* JADX INFO: loaded from: classes5.dex */
public class C14914q extends C14913p {
    @Override // p161g.AbstractC14912o
    /* JADX INFO: renamed from: a */
    public void mo43004a(C14901d0 statusBarStyle, C14901d0 navigationBarStyle, Window window, View view, boolean z4, boolean z13) {
        int i13;
        int i14;
        AbstractC3269g c16911s1;
        AbstractC22676k.m65750j(statusBarStyle, "statusBarStyle");
        AbstractC22676k.m65750j(navigationBarStyle, "navigationBarStyle");
        int i15 = navigationBarStyle.f55577c;
        AbstractC22676k.m65750j(window, "window");
        AbstractC22676k.m65750j(view, "view");
        AbstractC29125c.m88513V(window, false);
        if (statusBarStyle.f55577c == 0) {
            i13 = 0;
        } else {
            i13 = z4 ? statusBarStyle.f55576b : statusBarStyle.f55575a;
        }
        window.setStatusBarColor(i13);
        if (i15 == 0) {
            i14 = 0;
        } else {
            i14 = z13 ? navigationBarStyle.f55576b : navigationBarStyle.f55575a;
        }
        window.setNavigationBarColor(i14);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(i15 == 0);
        C0929d c0929d = new C0929d(view);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 35) {
            c16911s1 = new C16917u1(window, c0929d);
        } else {
            c16911s1 = i16 >= 30 ? new C16911s1(window, c0929d) : new C16908r1(window, c0929d);
        }
        c16911s1.mo9526Y(!z4);
        c16911s1.mo9525X(true ^ z13);
    }
}
