package com.whoop.labradorService.domain.exception;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/labradorService/domain/exception/LabradorServiceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "StrapIncompatible", "StrapNotConnected", "LabradorCommandFailure", "Lcom/whoop/labradorService/domain/exception/LabradorServiceException$LabradorCommandFailure;", "Lcom/whoop/labradorService/domain/exception/LabradorServiceException$StrapIncompatible;", "Lcom/whoop/labradorService/domain/exception/LabradorServiceException$StrapNotConnected;", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class LabradorServiceException extends Exception {

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/labradorService/domain/exception/LabradorServiceException$LabradorCommandFailure;", "Lcom/whoop/labradorService/domain/exception/LabradorServiceException;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getMessage", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class LabradorCommandFailure extends LabradorServiceException {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public LabradorCommandFailure() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LabradorCommandFailure) && AbstractC22676k.m65745e(this.message, ((LabradorCommandFailure) other).message);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return AbstractC11895b.m31996o("LabradorCommandFailure(message=", this.message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabradorCommandFailure(String message) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
        }

        public /* synthetic */ LabradorCommandFailure(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Failed to execute ecg command" : str);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/labradorService/domain/exception/LabradorServiceException$StrapIncompatible;", "Lcom/whoop/labradorService/domain/exception/LabradorServiceException;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getMessage", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class StrapIncompatible extends LabradorServiceException {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public StrapIncompatible() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StrapIncompatible) && AbstractC22676k.m65745e(this.message, ((StrapIncompatible) other).message);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return AbstractC11895b.m31996o("StrapIncompatible(message=", this.message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StrapIncompatible(String message) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
        }

        public /* synthetic */ StrapIncompatible(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Strap Gen not supported" : str);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/labradorService/domain/exception/LabradorServiceException$StrapNotConnected;", "Lcom/whoop/labradorService/domain/exception/LabradorServiceException;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getMessage", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class StrapNotConnected extends LabradorServiceException {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public StrapNotConnected() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StrapNotConnected) && AbstractC22676k.m65745e(this.message, ((StrapNotConnected) other).message);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return AbstractC11895b.m31996o("StrapNotConnected(message=", this.message, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StrapNotConnected(String message) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
        }

        public /* synthetic */ StrapNotConnected(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Strap Not Connected" : str);
        }
    }

    public /* synthetic */ LabradorServiceException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LabradorServiceException() {
    }
}
