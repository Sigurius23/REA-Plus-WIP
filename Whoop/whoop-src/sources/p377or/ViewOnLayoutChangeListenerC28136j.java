package p377or;

import android.view.View;

/* JADX INFO: renamed from: or.j */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC28136j implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ View f113786w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28137k f113787x;

    public ViewOnLayoutChangeListenerC28136j(C28137k c28137k, View view) {
        this.f113787x = c28137k;
        this.f113786w = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        View view2 = this.f113786w;
        if (view2.getVisibility() == 0) {
            this.f113787x.m85127d(view2);
        }
    }
}
