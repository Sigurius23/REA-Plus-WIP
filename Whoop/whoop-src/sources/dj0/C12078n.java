package dj0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dj0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Ldj0/n;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "message", "", "statusCode", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "c", "I", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12078n implements InterfaceC12081q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Exception exception;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int statusCode;

    public C12078n(Exception exception, String message, int i13) {
        AbstractC22676k.m65750j(exception, "exception");
        AbstractC22676k.m65750j(message, "message");
        this.exception = exception;
        this.message = message;
        this.statusCode = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12078n)) {
            return false;
        }
        C12078n c12078n = (C12078n) other;
        return AbstractC22676k.m65745e(this.exception, c12078n.exception) && AbstractC22676k.m65745e(this.message, c12078n.message) && this.statusCode == c12078n.statusCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.statusCode) + AbstractC11266d.m30450d(this.exception.hashCode() * 31, 31, this.message);
    }

    public String toString() {
        Exception exc = this.exception;
        String str = this.message;
        int i13 = this.statusCode;
        StringBuilder sb4 = new StringBuilder("Http(exception=");
        sb4.append(exc);
        sb4.append(", message=");
        sb4.append(str);
        sb4.append(", statusCode=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }
}
