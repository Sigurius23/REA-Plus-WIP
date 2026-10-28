package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: renamed from: com.google.android.gms.common.api.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C4984o extends BasePendingResult {

    /* JADX INFO: renamed from: k */
    public final Status f20518k;

    public C4984o(Status status) {
        super(null);
        this.f20518k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: X */
    public final InterfaceC4982m mo15602X(Status status) {
        return this.f20518k;
    }
}
