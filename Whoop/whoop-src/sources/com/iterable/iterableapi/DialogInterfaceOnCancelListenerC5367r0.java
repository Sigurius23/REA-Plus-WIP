package com.iterable.iterableapi;

import android.content.DialogInterface;
import qg3.C30352d;

/* JADX INFO: renamed from: com.iterable.iterableapi.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC5367r0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C5379v0 f21813w;

    public DialogInterfaceOnCancelListenerC5367r0(C5379v0 c5379v0) {
        this.f21813w = c5379v0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C30352d c30352d;
        if (!this.f21813w.f21874z || (c30352d = C5379v0.f21860O) == null) {
            return;
        }
        c30352d.m92816p(null);
    }
}
