package p444r;

import android.view.ActionProvider;
import q30.C29934u0;

/* JADX INFO: renamed from: r.o */
/* JADX INFO: loaded from: classes5.dex */
public final class ActionProviderVisibilityListenerC30821o implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public C29934u0 f127111a;

    /* JADX INFO: renamed from: b */
    public final ActionProvider f127112b;

    public ActionProviderVisibilityListenerC30821o(MenuItemC30825s menuItemC30825s, ActionProvider actionProvider) {
        this.f127112b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        C29934u0 c29934u0 = this.f127111a;
        if (c29934u0 != null) {
            MenuC30818l menuC30818l = ((C30820n) c29934u0.f122249x).f127099o;
            menuC30818l.f127062i = true;
            menuC30818l.m94820q(true);
        }
    }
}
