package com.whoop.data.remote.domain.response.journal;

import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;", "", "behaviorTrackerId", "", "userId", "yesCount", "noCount", "trackerValue", "Lcom/whoop/data/remote/domain/response/journal/TrackerValue;", "<init>", "(IIIILcom/whoop/data/remote/domain/response/journal/TrackerValue;)V", "getBehaviorTrackerId", "()I", "getUserId", "getYesCount", "getNoCount", "getTrackerValue", "()Lcom/whoop/data/remote/domain/response/journal/TrackerValue;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class JournalBehaviourTrackerHistory {
    private final int behaviorTrackerId;
    private final int noCount;
    private final TrackerValue trackerValue;
    private final int userId;
    private final int yesCount;

    public JournalBehaviourTrackerHistory(int i13, int i14, int i15, int i16, TrackerValue trackerValue) {
        this.behaviorTrackerId = i13;
        this.userId = i14;
        this.yesCount = i15;
        this.noCount = i16;
        this.trackerValue = trackerValue;
    }

    public static /* synthetic */ JournalBehaviourTrackerHistory copy$default(JournalBehaviourTrackerHistory journalBehaviourTrackerHistory, int i13, int i14, int i15, int i16, TrackerValue trackerValue, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = journalBehaviourTrackerHistory.behaviorTrackerId;
        }
        if ((i17 & 2) != 0) {
            i14 = journalBehaviourTrackerHistory.userId;
        }
        if ((i17 & 4) != 0) {
            i15 = journalBehaviourTrackerHistory.yesCount;
        }
        if ((i17 & 8) != 0) {
            i16 = journalBehaviourTrackerHistory.noCount;
        }
        if ((i17 & 16) != 0) {
            trackerValue = journalBehaviourTrackerHistory.trackerValue;
        }
        TrackerValue trackerValue2 = trackerValue;
        int i18 = i15;
        return journalBehaviourTrackerHistory.copy(i13, i14, i18, i16, trackerValue2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getYesCount() {
        return this.yesCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getNoCount() {
        return this.noCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TrackerValue getTrackerValue() {
        return this.trackerValue;
    }

    public final JournalBehaviourTrackerHistory copy(int behaviorTrackerId, int userId, int yesCount, int noCount, TrackerValue trackerValue) {
        return new JournalBehaviourTrackerHistory(behaviorTrackerId, userId, yesCount, noCount, trackerValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalBehaviourTrackerHistory)) {
            return false;
        }
        JournalBehaviourTrackerHistory journalBehaviourTrackerHistory = (JournalBehaviourTrackerHistory) other;
        return this.behaviorTrackerId == journalBehaviourTrackerHistory.behaviorTrackerId && this.userId == journalBehaviourTrackerHistory.userId && this.yesCount == journalBehaviourTrackerHistory.yesCount && this.noCount == journalBehaviourTrackerHistory.noCount && AbstractC22676k.m65745e(this.trackerValue, journalBehaviourTrackerHistory.trackerValue);
    }

    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    public final int getNoCount() {
        return this.noCount;
    }

    public final TrackerValue getTrackerValue() {
        return this.trackerValue;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getYesCount() {
        return this.yesCount;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.noCount, AbstractC11266d.m30448b(this.yesCount, AbstractC11266d.m30448b(this.userId, Integer.hashCode(this.behaviorTrackerId) * 31, 31), 31), 31);
        TrackerValue trackerValue = this.trackerValue;
        return iM30448b + (trackerValue == null ? 0 : trackerValue.hashCode());
    }

    public String toString() {
        int i13 = this.behaviorTrackerId;
        int i14 = this.userId;
        int i15 = this.yesCount;
        int i16 = this.noCount;
        TrackerValue trackerValue = this.trackerValue;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "JournalBehaviourTrackerHistory(behaviorTrackerId=", ", userId=", ", yesCount=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", noCount=", i16, ", trackerValue=");
        sbM30465s.append(trackerValue);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
