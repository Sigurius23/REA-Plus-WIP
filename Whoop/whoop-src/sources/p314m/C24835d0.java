package p314m;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;

/* JADX INFO: renamed from: m.d0 */
/* JADX INFO: loaded from: classes5.dex */
public class C24835d0 extends DialogInterfaceOnCancelListenerC1361y {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC24833c0(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public void setupDialog(Dialog dialog, int i13) {
        if (!(dialog instanceof DialogC24833c0)) {
            super.setupDialog(dialog, i13);
            return;
        }
        DialogC24833c0 dialogC24833c0 = (DialogC24833c0) dialog;
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC24833c0.m72840f(1);
    }
}
