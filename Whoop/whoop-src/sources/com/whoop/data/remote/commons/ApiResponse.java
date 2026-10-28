package com.whoop.data.remote.commons;

import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/data/remote/commons/ApiResponse;", "T", "", "<init>", "()V", "Companion", "Lcom/whoop/data/remote/commons/ApiEmptyResponse;", "Lcom/whoop/data/remote/commons/ApiErrorResponse;", "Lcom/whoop/data/remote/commons/ApiSuccessResponse;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public abstract class ApiResponse<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\t\"\u0004\b\u0001\u0010\u00062\u0006\u0010\n\u001a\u0002H\u0006¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/data/remote/commons/ApiResponse$Companion;", "", "<init>", "()V", "create", "Lcom/whoop/data/remote/commons/ApiErrorResponse;", "T", "error", "", "Lcom/whoop/data/remote/commons/ApiResponse;", "data", "(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/ApiResponse;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> ApiErrorResponse<T> create(Throwable error) {
            AbstractC22676k.m65750j(error, "error");
            String message = error.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            return new ApiErrorResponse<>(message);
        }

        private Companion() {
        }

        public final <T> ApiResponse<T> create(T data) {
            return new ApiSuccessResponse(data);
        }
    }

    public /* synthetic */ ApiResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApiResponse() {
    }
}
