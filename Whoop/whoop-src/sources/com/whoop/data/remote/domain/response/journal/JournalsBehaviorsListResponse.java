package com.whoop.data.remote.domain.response.journal;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/JournalsBehaviorsListResponse;", "", "totalCount", "", "records", "", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "<init>", "(ILjava/util/List;)V", "getTotalCount", "()I", "setTotalCount", "(I)V", "getRecords", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class JournalsBehaviorsListResponse {
    private final List<JournalBehaviorTracker> records;
    private int totalCount;

    public JournalsBehaviorsListResponse(int i13, List<JournalBehaviorTracker> records) {
        AbstractC22676k.m65750j(records, "records");
        this.totalCount = i13;
        this.records = records;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalsBehaviorsListResponse copy$default(JournalsBehaviorsListResponse journalsBehaviorsListResponse, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = journalsBehaviorsListResponse.totalCount;
        }
        if ((i14 & 2) != 0) {
            list = journalsBehaviorsListResponse.records;
        }
        return journalsBehaviorsListResponse.copy(i13, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<JournalBehaviorTracker> component2() {
        return this.records;
    }

    public final JournalsBehaviorsListResponse copy(int totalCount, List<JournalBehaviorTracker> records) {
        AbstractC22676k.m65750j(records, "records");
        return new JournalsBehaviorsListResponse(totalCount, records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalsBehaviorsListResponse)) {
            return false;
        }
        JournalsBehaviorsListResponse journalsBehaviorsListResponse = (JournalsBehaviorsListResponse) other;
        return this.totalCount == journalsBehaviorsListResponse.totalCount && AbstractC22676k.m65745e(this.records, journalsBehaviorsListResponse.records);
    }

    public final List<JournalBehaviorTracker> getRecords() {
        return this.records;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return this.records.hashCode() + (Integer.hashCode(this.totalCount) * 31);
    }

    public final void setTotalCount(int i13) {
        this.totalCount = i13;
    }

    public String toString() {
        return "JournalsBehaviorsListResponse(totalCount=" + this.totalCount + ", records=" + this.records + ")";
    }
}
