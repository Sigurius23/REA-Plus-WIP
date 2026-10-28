package c41;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c41.n1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lc41/n1;", "", "", "startAt", "", "sportId", "", "gpsEnabled", "<init>", "(Ljava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4077n1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String startAt;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int sportId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean gpsEnabled;

    public C4077n1(String startAt, int i13, boolean z4) {
        AbstractC22676k.m65750j(startAt, "startAt");
        this.startAt = startAt;
        this.sportId = i13;
        this.gpsEnabled = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getGpsEnabled() {
        return this.gpsEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStartAt() {
        return this.startAt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4077n1)) {
            return false;
        }
        C4077n1 c4077n1 = (C4077n1) other;
        return AbstractC22676k.m65745e(this.startAt, c4077n1.startAt) && this.sportId == c4077n1.sportId && this.gpsEnabled == c4077n1.gpsEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.gpsEnabled) + AbstractC11266d.m30448b(this.sportId, this.startAt.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.startAt;
        int i13 = this.sportId;
        return AbstractC18489d0.m53372m(AbstractC11266d.m30467u(i13, "DetectedActivityState(startAt=", str, ", sportId=", ", gpsEnabled="), this.gpsEnabled, ")");
    }
}
