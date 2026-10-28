package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.v */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC1352v implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1361y f5815w;

    public DialogInterfaceOnDismissListenerC1352v(DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y) {
        this.f5815w = dialogInterfaceOnCancelListenerC1361y;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y = this.f5815w;
        if (dialogInterfaceOnCancelListenerC1361y.mDialog != null) {
            dialogInterfaceOnCancelListenerC1361y.onDismiss(dialogInterfaceOnCancelListenerC1361y.mDialog);
        }
    }
}
