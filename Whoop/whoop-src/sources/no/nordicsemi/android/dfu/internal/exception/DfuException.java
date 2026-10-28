package no.nordicsemi.android.dfu.internal.exception;

import ih0.AbstractC18489d0;

/* JADX INFO: loaded from: classes3.dex */
public class DfuException extends Exception {
    private static final long serialVersionUID = -6901728550661937942L;
    private final int mError;

    public DfuException(String str, int i13) {
        super(str);
        this.mError = i13;
    }

    public int getErrorNumber() {
        return this.mError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.getMessage());
        sb4.append(" (error ");
        return AbstractC18489d0.m53371l(sb4, this.mError & (-16385), ")");
    }
}
