package p404pq;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p314m.C24835d0;

/* JADX INFO: renamed from: pq.l */
/* JADX INFO: loaded from: classes6.dex */
public class C29464l extends C24835d0 {
    private boolean waitingForDismissAllowingStateLoss;

    public static void access$100(C29464l c29464l) {
        if (c29464l.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public void dismiss() {
        if (m89941z(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public void dismissAllowingStateLoss() {
        if (m89941z(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // p314m.C24835d0, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC29463k(getContext(), getTheme());
    }

    /* JADX INFO: renamed from: z */
    public final boolean m89941z(boolean z4) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof DialogC29463k)) {
            return false;
        }
        DialogC29463k dialogC29463k = (DialogC29463k) dialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM89936l = dialogC29463k.m89936l();
        if (!bottomSheetBehaviorM89936l.f20781I || !dialogC29463k.m89937m()) {
            return false;
        }
        this.waitingForDismissAllowingStateLoss = z4;
        if (bottomSheetBehaviorM89936l.f20784L == 5) {
            if (z4) {
                super.dismissAllowingStateLoss();
                return true;
            }
            super.dismiss();
            return true;
        }
        if (getDialog() instanceof DialogC29463k) {
            ((DialogC29463k) getDialog()).m89938n();
        }
        bottomSheetBehaviorM89936l.m15690I(new C29461i(this, 1));
        bottomSheetBehaviorM89936l.m15701W(5);
        return true;
    }
}
