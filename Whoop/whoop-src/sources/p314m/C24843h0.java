package p314m;

import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import p444r.InterfaceC30816j;
import p444r.MenuC30818l;
import p474s.InterfaceC31999q2;

/* JADX INFO: renamed from: m.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C24843h0 implements InterfaceC31999q2, InterfaceC30816j {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C24845i0 f97323w;

    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: a */
    public boolean mo3333a(MenuC30818l menuC30818l, MenuItem menuItem) {
        return false;
    }

    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: b */
    public void mo3334b(MenuC30818l menuC30818l) {
        C24845i0 c24845i0 = this.f97323w;
        Window.Callback callback = c24845i0.f97327b;
        if (c24845i0.f97326a.f132828a.m3329x()) {
            callback.onPanelClosed(108, menuC30818l);
        } else if (callback.onPreparePanel(0, null, menuC30818l)) {
            callback.onMenuOpened(108, menuC30818l);
        }
    }

    /* JADX INFO: renamed from: c */
    public View m72846c(int i13) {
        if (i13 == 0) {
            return new View(this.f97323w.f97326a.f132828a.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m72847d(int i13) {
        if (i13 == 0) {
            C24845i0 c24845i0 = this.f97323w;
            if (c24845i0.f97329d) {
                return;
            }
            c24845i0.f97326a.f132839l = true;
            c24845i0.f97329d = true;
        }
    }
}
