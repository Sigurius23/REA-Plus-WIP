package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes6.dex */
public class ApiException extends Exception {

    /* JADX INFO: renamed from: w */
    public final Status f20483w;

    public ApiException(Status status) {
        int i13 = status.f20493w;
        String str = status.f20494x;
        str = str == null ? "" : str;
        StringBuilder sb4 = new StringBuilder(String.valueOf(i13).length() + 2 + String.valueOf(str).length());
        sb4.append(i13);
        sb4.append(": ");
        sb4.append(str);
        super(sb4.toString());
        this.f20483w = status;
    }

    /* JADX INFO: renamed from: a */
    public final int m15589a() {
        return this.f20483w.f20493w;
    }
}
