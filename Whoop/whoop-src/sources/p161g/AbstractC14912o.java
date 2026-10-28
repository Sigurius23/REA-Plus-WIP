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

/* JADX INFO: renamed from: g.o */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14912o {
    /* JADX INFO: renamed from: a */
    public void mo43004a(C14901d0 statusBarStyle, C14901d0 navigationBarStyle, Window window, View view, boolean z4, boolean z13) {
        AbstractC3269g c16911s1;
        AbstractC22676k.m65750j(statusBarStyle, "statusBarStyle");
        AbstractC22676k.m65750j(navigationBarStyle, "navigationBarStyle");
        AbstractC22676k.m65750j(window, "window");
        AbstractC22676k.m65750j(view, "view");
        AbstractC29125c.m88513V(window, false);
        window.setStatusBarColor(z4 ? statusBarStyle.f55576b : statusBarStyle.f55575a);
        window.setNavigationBarColor(z13 ? navigationBarStyle.f55576b : navigationBarStyle.f55575a);
        C0929d c0929d = new C0929d(view);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 35) {
            c16911s1 = new C16917u1(window, c0929d);
        } else {
            c16911s1 = i13 >= 30 ? new C16911s1(window, c0929d) : new C16908r1(window, c0929d);
        }
        c16911s1.mo9526Y(!z4);
        c16911s1.mo9525X(!z13);
    }
}
