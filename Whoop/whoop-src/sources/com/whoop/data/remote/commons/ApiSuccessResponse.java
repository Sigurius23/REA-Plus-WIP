package com.whoop.data.remote.commons;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/data/remote/commons/ApiSuccessResponse;", "T", "Lcom/whoop/data/remote/commons/ApiResponse;", "body", "<init>", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/ApiSuccessResponse;", "equals", "", "other", "", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ApiSuccessResponse<T> extends ApiResponse<T> {
    private final T body;

    public ApiSuccessResponse(T t14) {
        super(null);
        this.body = t14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiSuccessResponse copy$default(ApiSuccessResponse apiSuccessResponse, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = apiSuccessResponse.body;
        }
        return apiSuccessResponse.copy(obj);
    }

    public final T component1() {
        return this.body;
    }

    public final ApiSuccessResponse<T> copy(T body) {
        return new ApiSuccessResponse<>(body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiSuccessResponse) && AbstractC22676k.m65745e(this.body, ((ApiSuccessResponse) other).body);
    }

    public final T getBody() {
        return this.body;
    }

    public int hashCode() {
        T t14 = this.body;
        if (t14 == null) {
            return 0;
        }
        return t14.hashCode();
    }

    public String toString() {
        return AbstractC18489d0.m53369j(this.body, "ApiSuccessResponse(body=", ")");
    }
}
