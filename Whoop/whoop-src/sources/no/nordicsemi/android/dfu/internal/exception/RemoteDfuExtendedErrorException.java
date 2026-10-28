package no.nordicsemi.android.dfu.internal.exception;

import ih0.AbstractC18489d0;

/* JADX INFO: loaded from: classes3.dex */
public class RemoteDfuExtendedErrorException extends RemoteDfuException {
    private static final long serialVersionUID = -6901728550661937942L;
    private final int mError;

    public RemoteDfuExtendedErrorException(String str, int i13) {
        super(str, 11);
        this.mError = i13;
    }

    public int getExtendedErrorNumber() {
        return this.mError;
    }

    @Override // no.nordicsemi.android.dfu.internal.exception.RemoteDfuException, java.lang.Throwable
    public String getMessage() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.getMessage());
        sb4.append(" (extended error ");
        return AbstractC18489d0.m53371l(sb4, this.mError, ")");
    }
}
