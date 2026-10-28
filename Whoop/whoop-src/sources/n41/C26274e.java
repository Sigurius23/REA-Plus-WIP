package n41;

import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: n41.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ln41/e;", "", "", "endAtMillis", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26274e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long endAtMillis;

    public C26274e(long j7) {
        this.endAtMillis = j7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEndAtMillis() {
        return this.endAtMillis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C26274e) && this.endAtMillis == ((C26274e) other).endAtMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.endAtMillis);
    }

    public String toString() {
        return AbstractC31061c.m95636l(this.endAtMillis, "CountDownToEpoch(endAtMillis=", ")");
    }
}
