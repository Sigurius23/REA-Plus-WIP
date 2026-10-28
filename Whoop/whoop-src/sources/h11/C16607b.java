package h11;

import com.mapbox.common.HttpHeaders;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h11.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lh11/b;", "", "", HttpHeaders.DATE, "", "cycleId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16607b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Long cycleId;

    public C16607b(String date, Long l7) {
        AbstractC22676k.m65750j(date, "date");
        this.date = date;
        this.cycleId = l7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16607b)) {
            return false;
        }
        C16607b c16607b = (C16607b) other;
        return AbstractC22676k.m65745e(this.date, c16607b.date) && AbstractC22676k.m65745e(this.cycleId, c16607b.cycleId);
    }

    public int hashCode() {
        int iHashCode = this.date.hashCode() * 31;
        Long l7 = this.cycleId;
        return iHashCode + (l7 == null ? 0 : l7.hashCode());
    }

    public String toString() {
        return "DatePillClick(date=" + this.date + ", cycleId=" + this.cycleId + ")";
    }
}
