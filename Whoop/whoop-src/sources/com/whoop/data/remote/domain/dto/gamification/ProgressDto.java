package com.whoop.data.remote.domain.dto.gamification;

import com.google.gson.annotations.SerializedName;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;", "", "completedCount", "", "lockedCount", "totalCount", "<init>", "(III)V", "getCompletedCount", "()I", "getLockedCount", "getTotalCount", "toTasklistProgressDomainModel", "Lcom/whoop/data/remote/domain/dto/gamification/TasklistProgress;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProgressDto {

    @SerializedName("tasks_completed_count")
    private final int completedCount;

    @SerializedName("tasks_locked_count")
    private final int lockedCount;

    @SerializedName("total_tasks_count")
    private final int totalCount;

    public ProgressDto(int i13, int i14, int i15) {
        this.completedCount = i13;
        this.lockedCount = i14;
        this.totalCount = i15;
    }

    public static /* synthetic */ ProgressDto copy$default(ProgressDto progressDto, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = progressDto.completedCount;
        }
        if ((i16 & 2) != 0) {
            i14 = progressDto.lockedCount;
        }
        if ((i16 & 4) != 0) {
            i15 = progressDto.totalCount;
        }
        return progressDto.copy(i13, i14, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCompletedCount() {
        return this.completedCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLockedCount() {
        return this.lockedCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final ProgressDto copy(int completedCount, int lockedCount, int totalCount) {
        return new ProgressDto(completedCount, lockedCount, totalCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressDto)) {
            return false;
        }
        ProgressDto progressDto = (ProgressDto) other;
        return this.completedCount == progressDto.completedCount && this.lockedCount == progressDto.lockedCount && this.totalCount == progressDto.totalCount;
    }

    public final int getCompletedCount() {
        return this.completedCount;
    }

    public final int getLockedCount() {
        return this.lockedCount;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalCount) + AbstractC11266d.m30448b(this.lockedCount, Integer.hashCode(this.completedCount) * 31, 31);
    }

    public String toString() {
        int i13 = this.completedCount;
        int i14 = this.lockedCount;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i13, i14, "ProgressDto(completedCount=", ", lockedCount=", ", totalCount="), this.totalCount, ")");
    }

    public final TasklistProgress toTasklistProgressDomainModel() {
        return new TasklistProgress(this.completedCount, this.lockedCount, this.totalCount);
    }
}
