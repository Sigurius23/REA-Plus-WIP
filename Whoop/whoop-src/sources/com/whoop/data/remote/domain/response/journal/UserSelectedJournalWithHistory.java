package com.whoop.data.remote.domain.response.journal;

import java.util.List;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalWithHistory;", "", "trackerList", "", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "trackerHistoryList", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getTrackerList", "()Ljava/util/List;", "getTrackerHistoryList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class UserSelectedJournalWithHistory {
    private final List<JournalBehaviourTrackerHistory> trackerHistoryList;
    private final List<JournalBehaviorTracker> trackerList;

    public UserSelectedJournalWithHistory(List<JournalBehaviorTracker> trackerList, List<JournalBehaviourTrackerHistory> trackerHistoryList) {
        AbstractC22676k.m65750j(trackerList, "trackerList");
        AbstractC22676k.m65750j(trackerHistoryList, "trackerHistoryList");
        this.trackerList = trackerList;
        this.trackerHistoryList = trackerHistoryList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSelectedJournalWithHistory copy$default(UserSelectedJournalWithHistory userSelectedJournalWithHistory, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = userSelectedJournalWithHistory.trackerList;
        }
        if ((i13 & 2) != 0) {
            list2 = userSelectedJournalWithHistory.trackerHistoryList;
        }
        return userSelectedJournalWithHistory.copy(list, list2);
    }

    public final List<JournalBehaviorTracker> component1() {
        return this.trackerList;
    }

    public final List<JournalBehaviourTrackerHistory> component2() {
        return this.trackerHistoryList;
    }

    public final UserSelectedJournalWithHistory copy(List<JournalBehaviorTracker> trackerList, List<JournalBehaviourTrackerHistory> trackerHistoryList) {
        AbstractC22676k.m65750j(trackerList, "trackerList");
        AbstractC22676k.m65750j(trackerHistoryList, "trackerHistoryList");
        return new UserSelectedJournalWithHistory(trackerList, trackerHistoryList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSelectedJournalWithHistory)) {
            return false;
        }
        UserSelectedJournalWithHistory userSelectedJournalWithHistory = (UserSelectedJournalWithHistory) other;
        return AbstractC22676k.m65745e(this.trackerList, userSelectedJournalWithHistory.trackerList) && AbstractC22676k.m65745e(this.trackerHistoryList, userSelectedJournalWithHistory.trackerHistoryList);
    }

    public final List<JournalBehaviourTrackerHistory> getTrackerHistoryList() {
        return this.trackerHistoryList;
    }

    public final List<JournalBehaviorTracker> getTrackerList() {
        return this.trackerList;
    }

    public int hashCode() {
        return this.trackerHistoryList.hashCode() + (this.trackerList.hashCode() * 31);
    }

    public String toString() {
        return AbstractC13673n.m38562i("UserSelectedJournalWithHistory(trackerList=", ", trackerHistoryList=", this.trackerList, ")", this.trackerHistoryList);
    }
}
