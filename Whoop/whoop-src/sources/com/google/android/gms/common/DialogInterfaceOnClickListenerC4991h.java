package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.IntentSender;
import p236j.AbstractC21065d;
import p236j.C21073l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.google.android.gms.common.h */
/* JADX INFO: loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC4991h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Activity f20535w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f20536x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC21065d f20537y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ GoogleApiAvailability f20538z;

    public DialogInterfaceOnClickListenerC4991h(GoogleApiAvailability googleApiAvailability, Activity activity, int i13, AbstractC21065d abstractC21065d) {
        this.f20535w = activity;
        this.f20536x = i13;
        this.f20537y = abstractC21065d;
        this.f20538z = googleApiAvailability;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.f20538z.getErrorResolutionPendingIntent(this.f20535w, this.f20536x, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        IntentSender intentSender = errorResolutionPendingIntent.getIntentSender();
        AbstractC22676k.m65750j(intentSender, "intentSender");
        this.f20537y.mo4052a(new C21073l(intentSender, null, 0, 0), null);
    }
}
