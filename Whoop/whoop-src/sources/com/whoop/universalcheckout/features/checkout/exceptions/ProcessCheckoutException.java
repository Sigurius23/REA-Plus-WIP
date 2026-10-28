package com.whoop.universalcheckout.features.checkout.exceptions;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/exceptions/ProcessCheckoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "errorTitle", "errorMessage", "errorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "x", "a", "y", "c", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProcessCheckoutException extends Exception {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String errorTitle;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String errorMessage;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String errorType;

    public ProcessCheckoutException(String errorTitle, String errorMessage, String errorType) {
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(errorType, "errorType");
        StringBuilder sb4 = new StringBuilder("[");
        AbstractC11266d.m30444B(sb4, errorType, "] ", errorTitle, ": ");
        sb4.append(errorMessage);
        super(sb4.toString());
        this.errorTitle = errorTitle;
        this.errorMessage = errorMessage;
        this.errorType = errorType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }
}
