package p161g;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import p314m.AbstractActivityC24852m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14911n {

    /* JADX INFO: renamed from: a */
    public static final int f55592a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b */
    public static final int f55593b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: a */
    public static final void m43003a(AbstractActivityC24852m abstractActivityC24852m, C14901d0 c14901d0, C14901d0 c14901d1) {
        C14913p c14914q;
        View decorView = abstractActivityC24852m.getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView, "window.decorView");
        Function1 function1 = c14901d0.f55578d;
        Resources resources = decorView.getResources();
        AbstractC22676k.m65749i(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
        Function1 function2 = c14901d1.f55578d;
        Resources resources2 = decorView.getResources();
        AbstractC22676k.m65749i(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) function2.invoke(resources2)).booleanValue();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            c14914q = new C14915r();
        } else {
            c14914q = i13 >= 29 ? new C14914q() : new C14913p();
        }
        C14913p c14913p = c14914q;
        Window window = abstractActivityC24852m.getWindow();
        AbstractC22676k.m65749i(window, "window");
        c14913p.mo43004a(c14901d0, c14901d1, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = abstractActivityC24852m.getWindow();
        AbstractC22676k.m65749i(window2, "window");
        c14913p.mo43005b(window2);
    }
}
