package com.whoop.data.remote.commons;

import androidx.core.app.NotificationCompat;
import com.whoop.network.exception.DomainException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 )*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001)B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003JN\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010'\u001a\u00020\tHÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006*"}, m65681d2 = {"Lcom/whoop/data/remote/commons/Resource;", "T", "", NotificationCompat.CATEGORY_STATUS, "Lcom/whoop/data/remote/commons/Status;", "data", "errorMessage", "", "errorCode", "", "exception", "Lcom/whoop/network/exception/DomainException;", "<init>", "(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)V", "getStatus", "()Lcom/whoop/data/remote/commons/Status;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorMessage", "()Ljava/lang/String;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getException", "()Lcom/whoop/network/exception/DomainException;", "success", "", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)Lcom/whoop/data/remote/commons/Resource;", "equals", "other", "hashCode", "toString", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class Resource<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final T data;
    private final Integer errorCode;
    private final String errorMessage;
    private final DomainException exception;
    private final Status status;
    private final boolean success;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\bJC\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/data/remote/commons/Resource$Companion;", "", "<init>", "()V", "success", "Lcom/whoop/data/remote/commons/Resource;", "T", "data", "(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;", "error", "errorMessage", "", "errorCode", "", "exception", "Lcom/whoop/network/exception/DomainException;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;)Lcom/whoop/data/remote/commons/Resource;", "loading", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resource error$default(Companion companion, String str, Integer num, Object obj, DomainException domainException, int i13, Object obj2) {
            if ((i13 & 2) != 0) {
                num = null;
            }
            if ((i13 & 4) != 0) {
                obj = null;
            }
            if ((i13 & 8) != 0) {
                domainException = null;
            }
            return companion.error(str, num, obj, domainException);
        }

        public final <T> Resource<T> error(String errorMessage, Integer errorCode, T data, DomainException exception) {
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            return new Resource<>(Status.ERROR, data, errorMessage, errorCode, exception);
        }

        public final <T> Resource<T> loading(T data) {
            return new Resource<>(Status.LOADING, data, null, null, null, 24, null);
        }

        public final <T> Resource<T> success(T data) {
            return new Resource<>(Status.SUCCESS, data, null, null, null, 24, null);
        }

        private Companion() {
        }
    }

    public Resource(Status status, T t14, String str, Integer num, DomainException domainException) {
        AbstractC22676k.m65750j(status, "status");
        this.status = status;
        this.data = t14;
        this.errorMessage = str;
        this.errorCode = num;
        this.exception = domainException;
        this.success = status == Status.SUCCESS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Resource copy$default(Resource resource, Status status, Object obj, String str, Integer num, DomainException domainException, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            status = resource.status;
        }
        if ((i13 & 2) != 0) {
            obj = resource.data;
        }
        if ((i13 & 4) != 0) {
            str = resource.errorMessage;
        }
        if ((i13 & 8) != 0) {
            num = resource.errorCode;
        }
        if ((i13 & 16) != 0) {
            domainException = resource.exception;
        }
        DomainException domainException2 = domainException;
        String str2 = str;
        return resource.copy(status, obj, str2, num, domainException2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DomainException getException() {
        return this.exception;
    }

    public final Resource<T> copy(Status status, T data, String errorMessage, Integer errorCode, DomainException exception) {
        AbstractC22676k.m65750j(status, "status");
        return new Resource<>(status, data, errorMessage, errorCode, exception);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) other;
        return this.status == resource.status && AbstractC22676k.m65745e(this.data, resource.data) && AbstractC22676k.m65745e(this.errorMessage, resource.errorMessage) && AbstractC22676k.m65745e(this.errorCode, resource.errorCode) && AbstractC22676k.m65745e(this.exception, resource.exception);
    }

    public final T getData() {
        return this.data;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final DomainException getException() {
        return this.exception;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        T t14 = this.data;
        int iHashCode2 = (iHashCode + (t14 == null ? 0 : t14.hashCode())) * 31;
        String str = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.errorCode;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        DomainException domainException = this.exception;
        return iHashCode4 + (domainException != null ? domainException.hashCode() : 0);
    }

    public String toString() {
        Status status = this.status;
        T t14 = this.data;
        String str = this.errorMessage;
        Integer num = this.errorCode;
        DomainException domainException = this.exception;
        StringBuilder sb4 = new StringBuilder("Resource(status=");
        sb4.append(status);
        sb4.append(", data=");
        sb4.append(t14);
        sb4.append(", errorMessage=");
        AbstractC30007c.m91853w(num, str, ", errorCode=", ", exception=", sb4);
        sb4.append(domainException);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ Resource(Status status, Object obj, String str, Integer num, DomainException domainException, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, obj, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : domainException);
    }
}
