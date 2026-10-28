package dj0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dj0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, m65681d2 = {"Ldj0/d;", "", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "message", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12068d implements InterfaceC12069e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Exception exception;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String message;

    public C12068d(Exception exception, String message) {
        AbstractC22676k.m65750j(exception, "exception");
        AbstractC22676k.m65750j(message, "message");
        this.exception = exception;
        this.message = message;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Exception getException() {
        return this.exception;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12068d)) {
            return false;
        }
        C12068d c12068d = (C12068d) other;
        return AbstractC22676k.m65745e(this.exception, c12068d.exception) && AbstractC22676k.m65745e(this.message, c12068d.message);
    }

    public int hashCode() {
        return this.message.hashCode() + (this.exception.hashCode() * 31);
    }

    public String toString() {
        return "Network(exception=" + this.exception + ", message=" + this.message + ")";
    }
}
