package com.whoop.weightlifting.data.domain;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006!"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;", "", "workoutTemplateKey", "", "name", "", "userId", "createdAt", "updatedAt", "<init>", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getWorkoutTemplateKey", "()J", "getName", "()Ljava/lang/String;", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;", "equals", "", "other", "hashCode", "", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WorkoutTemplateOverview {
    public static final int $stable = 0;
    private final String createdAt;
    private final String name;
    private final String updatedAt;
    private final Long userId;
    private final long workoutTemplateKey;

    public WorkoutTemplateOverview(long j7, String name, Long l7, String createdAt, String updatedAt) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.workoutTemplateKey = j7;
        this.name = name;
        this.userId = l7;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static /* synthetic */ WorkoutTemplateOverview copy$default(WorkoutTemplateOverview workoutTemplateOverview, long j7, String str, Long l7, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = workoutTemplateOverview.workoutTemplateKey;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            str = workoutTemplateOverview.name;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            l7 = workoutTemplateOverview.userId;
        }
        Long l12 = l7;
        if ((i13 & 8) != 0) {
            str2 = workoutTemplateOverview.createdAt;
        }
        String str5 = str2;
        if ((i13 & 16) != 0) {
            str3 = workoutTemplateOverview.updatedAt;
        }
        return workoutTemplateOverview.copy(j13, str4, l12, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final WorkoutTemplateOverview copy(long workoutTemplateKey, String name, Long userId, String createdAt, String updatedAt) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new WorkoutTemplateOverview(workoutTemplateKey, name, userId, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutTemplateOverview)) {
            return false;
        }
        WorkoutTemplateOverview workoutTemplateOverview = (WorkoutTemplateOverview) other;
        return this.workoutTemplateKey == workoutTemplateOverview.workoutTemplateKey && AbstractC22676k.m65745e(this.name, workoutTemplateOverview.name) && AbstractC22676k.m65745e(this.userId, workoutTemplateOverview.userId) && AbstractC22676k.m65745e(this.createdAt, workoutTemplateOverview.createdAt) && AbstractC22676k.m65745e(this.updatedAt, workoutTemplateOverview.updatedAt);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Long.hashCode(this.workoutTemplateKey) * 31, 31, this.name);
        Long l7 = this.userId;
        return this.updatedAt.hashCode() + AbstractC11266d.m30450d((iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.createdAt);
    }

    public String toString() {
        long j7 = this.workoutTemplateKey;
        String str = this.name;
        Long l7 = this.userId;
        String str2 = this.createdAt;
        String str3 = this.updatedAt;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("WorkoutTemplateOverview(workoutTemplateKey=", ", name=", j7, str);
        sbM114685m.append(", userId=");
        sbM114685m.append(l7);
        sbM114685m.append(", createdAt=");
        sbM114685m.append(str2);
        return AbstractC2875y.m8304q(sbM114685m, ", updatedAt=", str3, ")");
    }
}
