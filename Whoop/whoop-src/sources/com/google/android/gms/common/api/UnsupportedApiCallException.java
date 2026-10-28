package com.google.android.gms.common.api;

import com.google.android.gms.common.C4986c;

/* JADX INFO: loaded from: classes6.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: w */
    public final C4986c f20497w;

    public UnsupportedApiCallException(C4986c c4986c) {
        this.f20497w = c4986c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f20497w));
    }
}
