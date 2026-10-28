package f52;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: f52.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, m65681d2 = {"Lf52/j;", "", "", "secondsSinceBoot", "bootCount", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14112j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int secondsSinceBoot;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int bootCount;

    public C14112j(int i13, int i14) {
        this.secondsSinceBoot = i13;
        this.bootCount = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBootCount() {
        return this.bootCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSecondsSinceBoot() {
        return this.secondsSinceBoot;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14112j)) {
            return false;
        }
        C14112j c14112j = (C14112j) other;
        return this.secondsSinceBoot == c14112j.secondsSinceBoot && this.bootCount == c14112j.bootCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.bootCount) + (Integer.hashCode(this.secondsSinceBoot) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.secondsSinceBoot, this.bootCount, "RelativeTimestampPair(secondsSinceBoot=", ", bootCount=", ")");
    }
}
