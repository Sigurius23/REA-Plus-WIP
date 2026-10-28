package com.whoop.data.remote.domain.response.journal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;", "", "behaviorTracker", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "trackerInput", "Lcom/whoop/data/remote/domain/response/journal/TrackerInput;", "<init>", "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;)V", "getBehaviorTracker", "()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "getTrackerInput", "()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TrackedBehavior {
    private final JournalBehaviorTracker behaviorTracker;
    private final TrackerInput trackerInput;

    public TrackedBehavior(JournalBehaviorTracker journalBehaviorTracker, TrackerInput trackerInput) {
        this.behaviorTracker = journalBehaviorTracker;
        this.trackerInput = trackerInput;
    }

    public static /* synthetic */ TrackedBehavior copy$default(TrackedBehavior trackedBehavior, JournalBehaviorTracker journalBehaviorTracker, TrackerInput trackerInput, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            journalBehaviorTracker = trackedBehavior.behaviorTracker;
        }
        if ((i13 & 2) != 0) {
            trackerInput = trackedBehavior.trackerInput;
        }
        return trackedBehavior.copy(journalBehaviorTracker, trackerInput);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JournalBehaviorTracker getBehaviorTracker() {
        return this.behaviorTracker;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrackerInput getTrackerInput() {
        return this.trackerInput;
    }

    public final TrackedBehavior copy(JournalBehaviorTracker behaviorTracker, TrackerInput trackerInput) {
        return new TrackedBehavior(behaviorTracker, trackerInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackedBehavior)) {
            return false;
        }
        TrackedBehavior trackedBehavior = (TrackedBehavior) other;
        return AbstractC22676k.m65745e(this.behaviorTracker, trackedBehavior.behaviorTracker) && AbstractC22676k.m65745e(this.trackerInput, trackedBehavior.trackerInput);
    }

    public final JournalBehaviorTracker getBehaviorTracker() {
        return this.behaviorTracker;
    }

    public final TrackerInput getTrackerInput() {
        return this.trackerInput;
    }

    public int hashCode() {
        JournalBehaviorTracker journalBehaviorTracker = this.behaviorTracker;
        int iHashCode = (journalBehaviorTracker == null ? 0 : journalBehaviorTracker.hashCode()) * 31;
        TrackerInput trackerInput = this.trackerInput;
        return iHashCode + (trackerInput != null ? trackerInput.hashCode() : 0);
    }

    public String toString() {
        return "TrackedBehavior(behaviorTracker=" + this.behaviorTracker + ", trackerInput=" + this.trackerInput + ")";
    }
}
