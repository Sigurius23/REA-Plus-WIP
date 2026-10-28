package io.getstream.chat.android.p226ui.utils;

import android.view.View;
import mr.C25908n;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.utils.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19903b implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74832w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25908n f74833x;

    public /* synthetic */ ViewOnClickListenerC19903b(C25908n c25908n, int i13) {
        this.f74832w = i13;
        this.f74833x = c25908n;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74832w) {
            case 0:
                PermissionChecker.showPermissionDeniedSnackbar$lambda$14$lambda$13(this.f74833x, view);
                break;
            default:
                this.f74833x.m76610a(3);
                break;
        }
    }
}
