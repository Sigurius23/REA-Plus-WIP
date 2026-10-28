package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.l */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC4995l extends AbstractBinderC4994k {

    /* JADX INFO: renamed from: g */
    public final byte[] f20546g;

    public BinderC4995l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f20546g = bArr;
    }

    @Override // com.google.android.gms.common.AbstractBinderC4994k
    /* JADX INFO: renamed from: X */
    public final byte[] mo15619X() {
        return this.f20546g;
    }
}
