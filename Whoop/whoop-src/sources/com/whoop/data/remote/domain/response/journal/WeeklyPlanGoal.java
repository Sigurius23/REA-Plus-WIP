package com.whoop.data.remote.domain.response.journal;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;", "", "circularProgressIndicator", "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "isAvoided", "", "<init>", "(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Z)V", "getCircularProgressIndicator", "()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WeeklyPlanGoal {
    private final CircularProgressIndicator circularProgressIndicator;
    private final boolean isAvoided;

    public WeeklyPlanGoal(CircularProgressIndicator circularProgressIndicator, boolean z4) {
        this.circularProgressIndicator = circularProgressIndicator;
        this.isAvoided = z4;
    }

    public static /* synthetic */ WeeklyPlanGoal copy$default(WeeklyPlanGoal weeklyPlanGoal, CircularProgressIndicator circularProgressIndicator, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            circularProgressIndicator = weeklyPlanGoal.circularProgressIndicator;
        }
        if ((i13 & 2) != 0) {
            z4 = weeklyPlanGoal.isAvoided;
        }
        return weeklyPlanGoal.copy(circularProgressIndicator, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAvoided() {
        return this.isAvoided;
    }

    public final WeeklyPlanGoal copy(CircularProgressIndicator circularProgressIndicator, boolean isAvoided) {
        return new WeeklyPlanGoal(circularProgressIndicator, isAvoided);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyPlanGoal)) {
            return false;
        }
        WeeklyPlanGoal weeklyPlanGoal = (WeeklyPlanGoal) other;
        return AbstractC22676k.m65745e(this.circularProgressIndicator, weeklyPlanGoal.circularProgressIndicator) && this.isAvoided == weeklyPlanGoal.isAvoided;
    }

    public final CircularProgressIndicator getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public int hashCode() {
        CircularProgressIndicator circularProgressIndicator = this.circularProgressIndicator;
        return Boolean.hashCode(this.isAvoided) + ((circularProgressIndicator == null ? 0 : circularProgressIndicator.hashCode()) * 31);
    }

    public final boolean isAvoided() {
        return this.isAvoided;
    }

    public String toString() {
        return "WeeklyPlanGoal(circularProgressIndicator=" + this.circularProgressIndicator + ", isAvoided=" + this.isAvoided + ")";
    }
}
