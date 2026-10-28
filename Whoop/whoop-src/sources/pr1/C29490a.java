package pr1;

import com.whoop.journal.model.CurrentCycle;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: pr1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lpr1/a;", "", "", "cycleId", "previousDayCycleStartTime", "previousDayCycleEndTime", "Lcom/whoop/journal/model/CurrentCycle;", "currentCycle", "", "requestDate", "<init>", "(JJJLcom/whoop/journal/model/CurrentCycle;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "d", "c", "Lcom/whoop/journal/model/CurrentCycle;", "()Lcom/whoop/journal/model/CurrentCycle;", "e", "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29490a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long cycleId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long previousDayCycleStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long previousDayCycleEndTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final CurrentCycle currentCycle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String requestDate;

    public C29490a(long j7, long j13, long j14, CurrentCycle currentCycle, String requestDate) {
        AbstractC22676k.m65750j(currentCycle, "currentCycle");
        AbstractC22676k.m65750j(requestDate, "requestDate");
        this.cycleId = j7;
        this.previousDayCycleStartTime = j13;
        this.previousDayCycleEndTime = j14;
        this.currentCycle = currentCycle;
        this.requestDate = requestDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CurrentCycle getCurrentCycle() {
        return this.currentCycle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPreviousDayCycleEndTime() {
        return this.previousDayCycleEndTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getPreviousDayCycleStartTime() {
        return this.previousDayCycleStartTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRequestDate() {
        return this.requestDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29490a)) {
            return false;
        }
        C29490a c29490a = (C29490a) other;
        return this.cycleId == c29490a.cycleId && this.previousDayCycleStartTime == c29490a.previousDayCycleStartTime && this.previousDayCycleEndTime == c29490a.previousDayCycleEndTime && AbstractC22676k.m65745e(this.currentCycle, c29490a.currentCycle) && AbstractC22676k.m65745e(this.requestDate, c29490a.requestDate);
    }

    public int hashCode() {
        return this.requestDate.hashCode() + ((this.currentCycle.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.cycleId) * 31, this.previousDayCycleStartTime, 31), this.previousDayCycleEndTime, 31)) * 31);
    }

    public String toString() {
        long j7 = this.cycleId;
        long j13 = this.previousDayCycleStartTime;
        long j14 = this.previousDayCycleEndTime;
        CurrentCycle currentCycle = this.currentCycle;
        String str = this.requestDate;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "JournalNavArgs(cycleId=", ", previousDayCycleStartTime=");
        sbM125596b.append(j13);
        AbstractC2875y.m8285A(sbM125596b, ", previousDayCycleEndTime=", j14, ", currentCycle=");
        sbM125596b.append(currentCycle);
        sbM125596b.append(", requestDate=");
        sbM125596b.append(str);
        sbM125596b.append(")");
        return sbM125596b.toString();
    }
}
