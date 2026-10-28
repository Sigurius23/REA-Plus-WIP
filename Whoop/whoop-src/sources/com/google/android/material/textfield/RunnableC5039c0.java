package com.google.android.material.textfield;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: com.google.android.material.textfield.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC5039c0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ TextInputLayout f21196w;

    public RunnableC5039c0(TextInputLayout textInputLayout) {
        this.f21196w = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckableImageButton checkableImageButton = this.f21196w.f21181y.f21243G;
        checkableImageButton.performClick();
        checkableImageButton.jumpDrawablesToCurrentState();
    }
}
