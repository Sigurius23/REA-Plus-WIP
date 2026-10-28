package p444r;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p314m.DialogInterfaceC24846j;

/* JADX INFO: renamed from: r.m */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnKeyListenerC30819m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC30829w {

    /* JADX INFO: renamed from: w */
    public SubMenuC30810d0 f127079w;

    /* JADX INFO: renamed from: x */
    public DialogInterfaceC24846j f127080x;

    /* JADX INFO: renamed from: y */
    public C30814h f127081y;

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: g */
    public final void mo16445g(MenuC30818l menuC30818l, boolean z4) {
        DialogInterfaceC24846j dialogInterfaceC24846j;
        if ((z4 || menuC30818l == this.f127079w) && (dialogInterfaceC24846j = this.f127080x) != null) {
            dialogInterfaceC24846j.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        this.f127079w.m94821r(this.f127081y.m94808a().getItem(i13), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f127081y.mo3339g(this.f127079w, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i13, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC30810d0 subMenuC30810d0 = this.f127079w;
        if (i13 == 82 || i13 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f127080x.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f127080x.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC30810d0.m94815d(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC30810d0.performShortcut(i13, keyEvent, 0);
    }

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: s */
    public final boolean mo16448s(MenuC30818l menuC30818l) {
        return false;
    }
}
