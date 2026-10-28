package com.whoop.data.remote.domain.response.journal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;", "", "journalEntry", "Lcom/whoop/data/remote/domain/response/journal/JournalEntry;", "metadata", "Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;", "<init>", "(Lcom/whoop/data/remote/domain/response/journal/JournalEntry;Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;)V", "getJournalEntry", "()Lcom/whoop/data/remote/domain/response/journal/JournalEntry;", "getMetadata", "()Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class JournalEntryWrapper {
    private final JournalEntry journalEntry;
    private final JournalMetadata metadata;

    public JournalEntryWrapper(JournalEntry journalEntry, JournalMetadata metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        this.journalEntry = journalEntry;
        this.metadata = metadata;
    }

    public static /* synthetic */ JournalEntryWrapper copy$default(JournalEntryWrapper journalEntryWrapper, JournalEntry journalEntry, JournalMetadata journalMetadata, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            journalEntry = journalEntryWrapper.journalEntry;
        }
        if ((i13 & 2) != 0) {
            journalMetadata = journalEntryWrapper.metadata;
        }
        return journalEntryWrapper.copy(journalEntry, journalMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JournalEntry getJournalEntry() {
        return this.journalEntry;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JournalMetadata getMetadata() {
        return this.metadata;
    }

    public final JournalEntryWrapper copy(JournalEntry journalEntry, JournalMetadata metadata) {
        AbstractC22676k.m65750j(metadata, "metadata");
        return new JournalEntryWrapper(journalEntry, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalEntryWrapper)) {
            return false;
        }
        JournalEntryWrapper journalEntryWrapper = (JournalEntryWrapper) other;
        return AbstractC22676k.m65745e(this.journalEntry, journalEntryWrapper.journalEntry) && AbstractC22676k.m65745e(this.metadata, journalEntryWrapper.metadata);
    }

    public final JournalEntry getJournalEntry() {
        return this.journalEntry;
    }

    public final JournalMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        JournalEntry journalEntry = this.journalEntry;
        return this.metadata.hashCode() + ((journalEntry == null ? 0 : journalEntry.hashCode()) * 31);
    }

    public String toString() {
        return "JournalEntryWrapper(journalEntry=" + this.journalEntry + ", metadata=" + this.metadata + ")";
    }
}
