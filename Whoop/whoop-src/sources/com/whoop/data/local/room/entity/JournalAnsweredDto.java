package com.whoop.data.local.room.entity;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\r\"\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/JournalAnsweredDto;", "", "cycleId", "", "isJournalShown", "", "isJournalAnswered", "<init>", "(JZZ)V", "getCycleId", "()J", "setCycleId", "(J)V", "()Z", "setJournalShown", "(Z)V", "setJournalAnswered", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class JournalAnsweredDto {
    private long cycleId;
    private boolean isJournalAnswered;
    private boolean isJournalShown;

    public JournalAnsweredDto(long j7, boolean z4, boolean z13) {
        this.cycleId = j7;
        this.isJournalShown = z4;
        this.isJournalAnswered = z13;
    }

    public static /* synthetic */ JournalAnsweredDto copy$default(JournalAnsweredDto journalAnsweredDto, long j7, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = journalAnsweredDto.cycleId;
        }
        if ((i13 & 2) != 0) {
            z4 = journalAnsweredDto.isJournalShown;
        }
        if ((i13 & 4) != 0) {
            z13 = journalAnsweredDto.isJournalAnswered;
        }
        return journalAnsweredDto.copy(j7, z4, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsJournalShown() {
        return this.isJournalShown;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsJournalAnswered() {
        return this.isJournalAnswered;
    }

    public final JournalAnsweredDto copy(long cycleId, boolean isJournalShown, boolean isJournalAnswered) {
        return new JournalAnsweredDto(cycleId, isJournalShown, isJournalAnswered);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalAnsweredDto)) {
            return false;
        }
        JournalAnsweredDto journalAnsweredDto = (JournalAnsweredDto) other;
        return this.cycleId == journalAnsweredDto.cycleId && this.isJournalShown == journalAnsweredDto.isJournalShown && this.isJournalAnswered == journalAnsweredDto.isJournalAnswered;
    }

    public final long getCycleId() {
        return this.cycleId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isJournalAnswered) + AbstractC2875y.m8289b(Long.hashCode(this.cycleId) * 31, 31, this.isJournalShown);
    }

    public final boolean isJournalAnswered() {
        return this.isJournalAnswered;
    }

    public final boolean isJournalShown() {
        return this.isJournalShown;
    }

    public final void setCycleId(long j7) {
        this.cycleId = j7;
    }

    public final void setJournalAnswered(boolean z4) {
        this.isJournalAnswered = z4;
    }

    public final void setJournalShown(boolean z4) {
        this.isJournalShown = z4;
    }

    public String toString() {
        return "JournalAnsweredDto(cycleId=" + this.cycleId + ", isJournalShown=" + this.isJournalShown + ", isJournalAnswered=" + this.isJournalAnswered + ")";
    }
}
