package androidx.appcompat.widget;

import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.fragment.app.C1289e1;
import java.util.Iterator;
import p184h5.InterfaceC16897o;
import p314m.C24843h0;
import p444r.InterfaceC30816j;
import p444r.MenuC30818l;
import p474s.C31960h;
import p474s.InterfaceC31972k;
import p474s.InterfaceC31999q2;
import q30.C29934u0;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C1087a implements InterfaceC30816j {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4446w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ViewGroup f4447x;

    public /* synthetic */ C1087a(ViewGroup viewGroup, int i13) {
        this.f4446w = i13;
        this.f4447x = viewGroup;
    }

    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: a */
    public final boolean mo3333a(MenuC30818l menuC30818l, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        switch (this.f4446w) {
            case 0:
                InterfaceC31972k interfaceC31972k = ((ActionMenuView) this.f4447x).f4316L;
                if (interfaceC31972k == null) {
                    return false;
                }
                Toolbar toolbar = (Toolbar) ((C29934u0) interfaceC31972k).f122249x;
                if (toolbar.f4424j0.m47563a(menuItem)) {
                    zOnMenuItemSelected = true;
                } else {
                    InterfaceC31999q2 interfaceC31999q2 = toolbar.f4426l0;
                    zOnMenuItemSelected = interfaceC31999q2 != null ? ((C24843h0) interfaceC31999q2).f97323w.f97327b.onMenuItemSelected(0, menuItem) : false;
                }
                return zOnMenuItemSelected;
            default:
                InterfaceC30816j interfaceC30816j = ((Toolbar) this.f4447x).f4432r0;
                return interfaceC30816j != null && interfaceC30816j.mo3333a(menuC30818l, menuItem);
        }
    }

    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: b */
    public final void mo3334b(MenuC30818l menuC30818l) {
        switch (this.f4446w) {
            case 0:
                InterfaceC30816j interfaceC30816j = ((ActionMenuView) this.f4447x).f4311G;
                if (interfaceC30816j != null) {
                    interfaceC30816j.mo3334b(menuC30818l);
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.f4447x;
                C31960h c31960h = toolbar.f4437w.f4309E;
                if (c31960h == null || !c31960h.m99450k()) {
                    Iterator it = toolbar.f4424j0.f64846b.iterator();
                    while (it.hasNext()) {
                        ((C1289e1) ((InterfaceC16897o) it.next())).f5593a.m4189t(menuC30818l);
                    }
                }
                InterfaceC30816j interfaceC30816j2 = toolbar.f4432r0;
                if (interfaceC30816j2 != null) {
                    interfaceC30816j2.mo3334b(menuC30818l);
                }
                break;
        }
    }
}
