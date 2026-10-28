package com.whoop.data.remote.commons;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0004HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/data/remote/commons/ApiErrorResponse;", "T", "Lcom/whoop/data/remote/commons/ApiResponse;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ApiErrorResponse<T> extends ApiResponse<T> {
    private final String errorMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiErrorResponse(String errorMessage) {
        super(null);
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ ApiErrorResponse copy$default(ApiErrorResponse apiErrorResponse, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = apiErrorResponse.errorMessage;
        }
        return apiErrorResponse.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final ApiErrorResponse<T> copy(String errorMessage) {
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        return new ApiErrorResponse<>(errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiErrorResponse) && AbstractC22676k.m65745e(this.errorMessage, ((ApiErrorResponse) other).errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return this.errorMessage.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("ApiErrorResponse(errorMessage=", this.errorMessage, ")");
    }
}
