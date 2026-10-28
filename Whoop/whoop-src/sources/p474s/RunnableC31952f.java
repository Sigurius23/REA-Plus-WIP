package p474s;

import android.view.View;
import p444r.InterfaceC30816j;
import p444r.MenuC30818l;

/* JADX INFO: renamed from: s.f */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC31952f implements Runnable {

    /* JADX INFO: renamed from: w */
    public final C31944d f132671w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31960h f132672x;

    public RunnableC31952f(C31960h c31960h, C31944d c31944d) {
        this.f132672x = c31960h;
        this.f132671w = c31944d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC30816j interfaceC30816j;
        C31960h c31960h = this.f132672x;
        MenuC30818l menuC30818l = c31960h.f132703y;
        if (menuC30818l != null && (interfaceC30816j = menuC30818l.f127059f) != null) {
            interfaceC30816j.mo3334b(menuC30818l);
        }
        View view = (View) c31960h.f132685H;
        if (view != null && view.getWindowToken() != null) {
            C31944d c31944d = this.f132671w;
            if (c31944d.m94835b()) {
                c31960h.f132696S = c31944d;
            } else if (c31944d.f127126e != null) {
                c31944d.m94837d(0, 0, false, false);
                c31960h.f132696S = c31944d;
            }
        }
        c31960h.f132698U = null;
    }
}
