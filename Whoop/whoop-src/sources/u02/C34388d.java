package u02;

import f63.AbstractC14155c;
import i63.C18183v;
import io.ktor.client.plugins.ResponseException;
import java.io.IOException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: u02.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lu02/d;", "", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "statusCode", "c", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34388d {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Throwable exception;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer statusCode;

    /* JADX INFO: renamed from: u02.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lu02/d$a;", "", "<init>", "()V", "", "exception", "Lu02/d;", "a", "(Ljava/lang/Throwable;)Lu02/d;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C34388d m108751a(Throwable exception) throws Throwable {
            AbstractC22676k.m65750j(exception, "exception");
            if ((exception instanceof ResponseException) || (exception instanceof IOException)) {
                return new C34388d(exception);
            }
            throw exception;
        }

        private Companion() {
        }
    }

    public C34388d(Throwable exception) {
        AbstractC14155c abstractC14155c;
        C18183v c18183vMo13325e;
        AbstractC22676k.m65750j(exception, "exception");
        this.exception = exception;
        Integer numValueOf = null;
        ResponseException responseException = exception instanceof ResponseException ? (ResponseException) exception : null;
        if (responseException != null && (abstractC14155c = responseException.f74974w) != null && (c18183vMo13325e = abstractC14155c.mo13325e()) != null) {
            numValueOf = Integer.valueOf(c18183vMo13325e.f70530a);
        }
        this.statusCode = numValueOf;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C34388d) && AbstractC22676k.m65745e(this.exception, ((C34388d) other).exception);
    }

    public int hashCode() {
        return this.exception.hashCode();
    }

    public String toString() {
        String message = this.exception.getMessage();
        return message == null ? "unknown API exception" : message;
    }
}
