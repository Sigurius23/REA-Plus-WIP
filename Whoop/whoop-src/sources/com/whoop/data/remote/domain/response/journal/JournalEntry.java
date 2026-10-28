package com.whoop.data.remote.domain.response.journal;

import c13.AbstractC3855a;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/JournalEntry;", "", "journalEntryId", "", "notes", "", "trackedBehaviors", "", "Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getJournalEntryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNotes", "()Ljava/lang/String;", "getTrackedBehaviors", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/response/journal/JournalEntry;", "equals", "", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class JournalEntry {
    private final Integer journalEntryId;
    private final String notes;
    private final List<TrackedBehavior> trackedBehaviors;

    public JournalEntry(Integer num, String str, List<TrackedBehavior> list) {
        this.journalEntryId = num;
        this.notes = str;
        this.trackedBehaviors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalEntry copy$default(JournalEntry journalEntry, Integer num, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = journalEntry.journalEntryId;
        }
        if ((i13 & 2) != 0) {
            str = journalEntry.notes;
        }
        if ((i13 & 4) != 0) {
            list = journalEntry.trackedBehaviors;
        }
        return journalEntry.copy(num, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getJournalEntryId() {
        return this.journalEntryId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final List<TrackedBehavior> component3() {
        return this.trackedBehaviors;
    }

    public final JournalEntry copy(Integer journalEntryId, String notes, List<TrackedBehavior> trackedBehaviors) {
        return new JournalEntry(journalEntryId, notes, trackedBehaviors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalEntry)) {
            return false;
        }
        JournalEntry journalEntry = (JournalEntry) other;
        return AbstractC22676k.m65745e(this.journalEntryId, journalEntry.journalEntryId) && AbstractC22676k.m65745e(this.notes, journalEntry.notes) && AbstractC22676k.m65745e(this.trackedBehaviors, journalEntry.trackedBehaviors);
    }

    public final Integer getJournalEntryId() {
        return this.journalEntryId;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final List<TrackedBehavior> getTrackedBehaviors() {
        return this.trackedBehaviors;
    }

    public int hashCode() {
        Integer num = this.journalEntryId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.notes;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<TrackedBehavior> list = this.trackedBehaviors;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.journalEntryId;
        String str = this.notes;
        return AbstractC3855a.m11829m(AbstractC31061c.m95643s("JournalEntry(journalEntryId=", ", notes=", num, str, ", trackedBehaviors="), this.trackedBehaviors, ")");
    }
}
