package dj0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dj0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Ldj0/c;", "", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "message", "", "statusCode", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "c", "I", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12067c implements InterfaceC12069e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Exception exception;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int statusCode;

    public C12067c(Exception exception, String message, int i13) {
        AbstractC22676k.m65750j(exception, "exception");
        AbstractC22676k.m65750j(message, "message");
        this.exception = exception;
        this.message = message;
        this.statusCode = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Exception getException() {
        return this.exception;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12067c)) {
            return false;
        }
        C12067c c12067c = (C12067c) other;
        return AbstractC22676k.m65745e(this.exception, c12067c.exception) && AbstractC22676k.m65745e(this.message, c12067c.message) && this.statusCode == c12067c.statusCode;
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
