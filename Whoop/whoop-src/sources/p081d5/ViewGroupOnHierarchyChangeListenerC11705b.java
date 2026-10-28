package p081d5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.mapbox.maps.C5538l;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d5.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC11705b implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ MainActivity f37849w;

    public ViewGroupOnHierarchyChangeListenerC11705b(C11706c c11706c, MainActivity mainActivity) {
        this.f37849w = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (C5538l.m16707g(view2)) {
            SplashScreenView splashScreenViewM16706f = C5538l.m16706f(view2);
            WindowInsets windowInsetsBuild = AbstractC11704a.m31293b().build();
            AbstractC22676k.m65749i(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (windowInsetsBuild == splashScreenViewM16706f.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                rect.isEmpty();
            }
            ((ViewGroup) this.f37849w.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
