package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: com.google.android.gms.common.b */
/* JADX INFO: loaded from: classes6.dex */
public class DialogFragmentC4985b extends DialogFragment {

    /* JADX INFO: renamed from: w */
    public Dialog f20519w;

    /* JADX INFO: renamed from: x */
    public DialogInterface.OnCancelListener f20520x;

    /* JADX INFO: renamed from: y */
    public AlertDialog f20521y;

    /* JADX INFO: renamed from: a */
    public static DialogFragmentC4985b m15610a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC4985b dialogFragmentC4985b = new DialogFragmentC4985b();
        AbstractC35135w.m111095g(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        dialogFragmentC4985b.f20519w = dialog;
        if (onCancelListener != null) {
            dialogFragmentC4985b.f20520x = onCancelListener;
        }
        return dialogFragmentC4985b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f20520x;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f20519w;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f20521y == null) {
            Activity activity = getActivity();
            AbstractC35135w.m111094f(activity);
            this.f20521y = new AlertDialog.Builder(activity).create();
        }
        return this.f20521y;
    }
}
