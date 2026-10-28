package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.u */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnCancelListenerC1349u implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1361y f5814w;

    public DialogInterfaceOnCancelListenerC1349u(DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y) {
        this.f5814w = dialogInterfaceOnCancelListenerC1361y;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y = this.f5814w;
        if (dialogInterfaceOnCancelListenerC1361y.mDialog != null) {
            dialogInterfaceOnCancelListenerC1361y.onCancel(dialogInterfaceOnCancelListenerC1361y.mDialog);
        }
    }
}
