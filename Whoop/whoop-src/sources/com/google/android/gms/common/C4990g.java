package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: com.google.android.gms.common.g */
/* JADX INFO: loaded from: classes6.dex */
public class C4990g extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: w */
    public Dialog f20532w;

    /* JADX INFO: renamed from: x */
    public DialogInterface.OnCancelListener f20533x;

    /* JADX INFO: renamed from: y */
    public AlertDialog f20534y;

    /* JADX INFO: renamed from: z */
    public static C4990g m15618z(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C4990g c4990g = new C4990g();
        AbstractC35135w.m111095g(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c4990g.f20532w = dialog;
        if (onCancelListener != null) {
            c4990g.f20533x = onCancelListener;
        }
        return c4990g;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f20533x;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f20532w;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f20534y == null) {
            Context context = getContext();
            AbstractC35135w.m111094f(context);
            this.f20534y = new AlertDialog.Builder(context).create();
        }
        return this.f20534y;
    }
}
