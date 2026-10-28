package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;

/* JADX INFO: renamed from: androidx.fragment.app.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C1355w implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1361y f5822w;

    public C1355w(DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y) {
        this.f5822w = dialogInterfaceOnCancelListenerC1361y;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        if (((InterfaceC1585g0) obj) != null) {
            DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y = this.f5822w;
            if (dialogInterfaceOnCancelListenerC1361y.mShowsDialog) {
                View viewRequireView = dialogInterfaceOnCancelListenerC1361y.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC1361y.mDialog != null) {
                    if (AbstractC1329o1.m4132M(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC1361y.mDialog);
                    }
                    dialogInterfaceOnCancelListenerC1361y.mDialog.setContentView(viewRequireView);
                }
            }
        }
    }
}
