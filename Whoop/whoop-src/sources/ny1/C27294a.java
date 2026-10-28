package ny1;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ny1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lny1/a;", "", "", "source", "", "sizeBytes", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27294a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long sizeBytes;

    public C27294a(String source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        this.source = source;
        this.sizeBytes = j7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27294a)) {
            return false;
        }
        C27294a c27294a = (C27294a) other;
        return AbstractC22676k.m65745e(this.source, c27294a.source) && this.sizeBytes == c27294a.sizeBytes;
    }

    public int hashCode() {
        return Long.hashCode(this.sizeBytes) + (this.source.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM32000s = AbstractC11895b.m32000s("CacheSize(source=", this.source, this.sizeBytes, ", sizeBytes=");
        sbM32000s.append(")");
        return sbM32000s.toString();
    }
}
