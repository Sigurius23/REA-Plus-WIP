package com.whoop.data.remote.domain.dto.gamification;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/gamification/MilestoneMetaData;", "", "achievementEarnedDateTime", "", "minimumProgressStartCount", "", "maximumProgressCompleteCount", "milestoneIndex", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAchievementEarnedDateTime", "()Ljava/lang/String;", "getMinimumProgressStartCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaximumProgressCompleteCount", "getMilestoneIndex", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/data/remote/domain/dto/gamification/MilestoneMetaData;", "equals", "", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MilestoneMetaData {

    @SerializedName("unlocked_at")
    private final String achievementEarnedDateTime;

    @SerializedName("maximum")
    private final Integer maximumProgressCompleteCount;

    @SerializedName("marker")
    private final Integer milestoneIndex;

    @SerializedName("minimum")
    private final Integer minimumProgressStartCount;

    public MilestoneMetaData(String str, Integer num, Integer num2, Integer num3) {
        this.achievementEarnedDateTime = str;
        this.minimumProgressStartCount = num;
        this.maximumProgressCompleteCount = num2;
        this.milestoneIndex = num3;
    }

    public static /* synthetic */ MilestoneMetaData copy$default(MilestoneMetaData milestoneMetaData, String str, Integer num, Integer num2, Integer num3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = milestoneMetaData.achievementEarnedDateTime;
        }
        if ((i13 & 2) != 0) {
            num = milestoneMetaData.minimumProgressStartCount;
        }
        if ((i13 & 4) != 0) {
            num2 = milestoneMetaData.maximumProgressCompleteCount;
        }
        if ((i13 & 8) != 0) {
            num3 = milestoneMetaData.milestoneIndex;
        }
        return milestoneMetaData.copy(str, num, num2, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAchievementEarnedDateTime() {
        return this.achievementEarnedDateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMinimumProgressStartCount() {
        return this.minimumProgressStartCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaximumProgressCompleteCount() {
        return this.maximumProgressCompleteCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMilestoneIndex() {
        return this.milestoneIndex;
    }

    public final MilestoneMetaData copy(String achievementEarnedDateTime, Integer minimumProgressStartCount, Integer maximumProgressCompleteCount, Integer milestoneIndex) {
        return new MilestoneMetaData(achievementEarnedDateTime, minimumProgressStartCount, maximumProgressCompleteCount, milestoneIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilestoneMetaData)) {
            return false;
        }
        MilestoneMetaData milestoneMetaData = (MilestoneMetaData) other;
        return AbstractC22676k.m65745e(this.achievementEarnedDateTime, milestoneMetaData.achievementEarnedDateTime) && AbstractC22676k.m65745e(this.minimumProgressStartCount, milestoneMetaData.minimumProgressStartCount) && AbstractC22676k.m65745e(this.maximumProgressCompleteCount, milestoneMetaData.maximumProgressCompleteCount) && AbstractC22676k.m65745e(this.milestoneIndex, milestoneMetaData.milestoneIndex);
    }

    public final String getAchievementEarnedDateTime() {
        return this.achievementEarnedDateTime;
    }

    public final Integer getMaximumProgressCompleteCount() {
        return this.maximumProgressCompleteCount;
    }

    public final Integer getMilestoneIndex() {
        return this.milestoneIndex;
    }

    public final Integer getMinimumProgressStartCount() {
        return this.minimumProgressStartCount;
    }

    public int hashCode() {
        String str = this.achievementEarnedDateTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.minimumProgressStartCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maximumProgressCompleteCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.milestoneIndex;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "MilestoneMetaData(achievementEarnedDateTime=" + this.achievementEarnedDateTime + ", minimumProgressStartCount=" + this.minimumProgressStartCount + ", maximumProgressCompleteCount=" + this.maximumProgressCompleteCount + ", milestoneIndex=" + this.milestoneIndex + ")";
    }
}
