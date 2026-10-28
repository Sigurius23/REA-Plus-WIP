package yl0;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: yl0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lyl0/d;", "", "", "minTime", "maxTime", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getMinTime", "()J", "b", "getMaxTime", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39621d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long minTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long maxTime;

    public C39621d(long j7, long j13) {
        this.minTime = j7;
        this.maxTime = j13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39621d)) {
            return false;
        }
        C39621d c39621d = (C39621d) other;
        return this.minTime == c39621d.minTime && this.maxTime == c39621d.maxTime;
    }

    public int hashCode() {
        return Long.hashCode(this.maxTime) + (Long.hashCode(this.minTime) * 31);
    }

    public String toString() {
        return AbstractC11266d.m30457k(this.maxTime, ")", AbstractC39383f.m125596b(this.minTime, "JournalEntryTimeConfig(minTime=", ", maxTime="));
    }
}
