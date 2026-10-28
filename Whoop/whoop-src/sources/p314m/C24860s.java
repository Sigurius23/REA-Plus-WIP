package p314m;

import android.view.Window;
import p444r.InterfaceC30829w;
import p444r.MenuC30818l;

/* JADX INFO: renamed from: m.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C24860s implements InterfaceC30829w {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97388w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ LayoutInflaterFactory2C24829a0 f97389x;

    public /* synthetic */ C24860s(LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0, int i13) {
        this.f97388w = i13;
        this.f97389x = layoutInflaterFactory2C24829a0;
    }

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: g */
    public final void mo16445g(MenuC30818l menuC30818l, boolean z4) {
        C24867z c24867z;
        switch (this.f97388w) {
            case 0:
                this.f97389x.m72809w(menuC30818l);
                break;
            default:
                MenuC30818l menuC30818lMo94800l = menuC30818l.mo94800l();
                int i13 = 0;
                boolean z13 = menuC30818lMo94800l != menuC30818l;
                if (z13) {
                    menuC30818l = menuC30818lMo94800l;
                }
                LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = this.f97389x;
                C24867z[] c24867zArr = layoutInflaterFactory2C24829a0.f97236l0;
                int length = c24867zArr != null ? c24867zArr.length : 0;
                while (true) {
                    if (i13 >= length) {
                        c24867z = null;
                    } else {
                        c24867z = c24867zArr[i13];
                        if (c24867z == null || c24867z.f97407h != menuC30818l) {
                            i13++;
                        }
                    }
                }
                if (c24867z != null) {
                    if (!z13) {
                        layoutInflaterFactory2C24829a0.m72810x(c24867z, z4);
                    } else {
                        layoutInflaterFactory2C24829a0.m72808v(c24867z.f97400a, c24867z, menuC30818lMo94800l);
                        layoutInflaterFactory2C24829a0.m72810x(c24867z, true);
                    }
                }
                break;
        }
    }

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: s */
    public final boolean mo16448s(MenuC30818l menuC30818l) {
        Window.Callback callback;
        switch (this.f97388w) {
            case 0:
                Window.Callback callback2 = this.f97389x.f97210L.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC30818l);
                }
                break;
            default:
                if (menuC30818l == menuC30818l.mo94800l()) {
                    LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = this.f97389x;
                    if (layoutInflaterFactory2C24829a0.f97230f0 && (callback = layoutInflaterFactory2C24829a0.f97210L.getCallback()) != null && !layoutInflaterFactory2C24829a0.f97241q0) {
                        callback.onMenuOpened(108, menuC30818l);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
