package j92;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j92.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0011\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lj92/o;", "", "", "rateLimit", "", "rateLimitRemaining", "rateLimitReset", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRateLimit", "b", "I", "getRateLimitRemaining", "c", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C21447o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String rateLimit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int rateLimitRemaining;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int rateLimitReset;

    public C21447o(String rateLimit, int i13, int i14) {
        AbstractC22676k.m65750j(rateLimit, "rateLimit");
        this.rateLimit = rateLimit;
        this.rateLimitRemaining = i13;
        this.rateLimitReset = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getRateLimitReset() {
        return this.rateLimitReset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21447o)) {
            return false;
        }
        C21447o c21447o = (C21447o) other;
        return AbstractC22676k.m65745e(this.rateLimit, c21447o.rateLimit) && this.rateLimitRemaining == c21447o.rateLimitRemaining && this.rateLimitReset == c21447o.rateLimitReset;
    }

    public int hashCode() {
        return Integer.hashCode(this.rateLimitReset) + AbstractC11266d.m30448b(this.rateLimitRemaining, this.rateLimit.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.rateLimit;
        int i13 = this.rateLimitRemaining;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(i13, "RateLimitingResponseHeaders(rateLimit='", str, "', rateLimitRemaining='", "', rateLimitReset='"), this.rateLimitReset, "')");
    }
}
