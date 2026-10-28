package ny1;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ny1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lny1/c;", "", "", "name", "", "sizeBytes", "walSizeBytes", "<init>", "(Ljava/lang/String;JJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "c", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27296c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long sizeBytes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long walSizeBytes;

    public C27296c(String name, long j7, long j13) {
        AbstractC22676k.m65750j(name, "name");
        this.name = name;
        this.sizeBytes = j7;
        this.walSizeBytes = j13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getWalSizeBytes() {
        return this.walSizeBytes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27296c)) {
            return false;
        }
        C27296c c27296c = (C27296c) other;
        return AbstractC22676k.m65745e(this.name, c27296c.name) && this.sizeBytes == c27296c.sizeBytes && this.walSizeBytes == c27296c.walSizeBytes;
    }

    public int hashCode() {
        return Long.hashCode(this.walSizeBytes) + AbstractC11266d.m30451e(this.name.hashCode() * 31, this.sizeBytes, 31);
    }

    public String toString() {
        String str = this.name;
        long j7 = this.sizeBytes;
        long j13 = this.walSizeBytes;
        StringBuilder sbM32000s = AbstractC11895b.m32000s("DatabaseSize(name=", str, j7, ", sizeBytes=");
        sbM32000s.append(", walSizeBytes=");
        sbM32000s.append(j13);
        sbM32000s.append(")");
        return sbM32000s.toString();
    }
}
