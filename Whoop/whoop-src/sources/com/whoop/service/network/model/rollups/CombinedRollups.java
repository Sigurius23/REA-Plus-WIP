package com.whoop.service.network.model.rollups;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\tJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\tHÖ\u0081\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006("}, m65681d2 = {"Lcom/whoop/service/network/model/rollups/CombinedRollups;", "", "recoveryRollups", "Lcom/whoop/service/network/model/rollups/RecoveryRollups;", "sleepRollups", "Lcom/whoop/service/network/model/rollups/SleepRollups;", "strainRollups", "Lcom/whoop/service/network/model/rollups/StrainRollups;", "userId", "", "workoutRollups", "", "Lcom/whoop/service/network/model/rollups/WorkoutRollup;", "<init>", "(Lcom/whoop/service/network/model/rollups/RecoveryRollups;Lcom/whoop/service/network/model/rollups/SleepRollups;Lcom/whoop/service/network/model/rollups/StrainRollups;ILjava/util/List;)V", "getRecoveryRollups", "()Lcom/whoop/service/network/model/rollups/RecoveryRollups;", "getSleepRollups", "()Lcom/whoop/service/network/model/rollups/SleepRollups;", "getStrainRollups", "()Lcom/whoop/service/network/model/rollups/StrainRollups;", "getUserId", "()I", "getWorkoutRollups", "()Ljava/util/List;", "setWorkoutRollups", "(Ljava/util/List;)V", "totalActivityCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CombinedRollups {

    @SerializedName("recovery_rollups")
    private final RecoveryRollups recoveryRollups;

    @SerializedName("sleep_rollups")
    private final SleepRollups sleepRollups;

    @SerializedName("strain_rollups")
    private final StrainRollups strainRollups;

    @SerializedName("user_id")
    private final int userId;

    @SerializedName("workout_rollups")
    private List<WorkoutRollup> workoutRollups;

    public CombinedRollups(RecoveryRollups recoveryRollups, SleepRollups sleepRollups, StrainRollups strainRollups, int i13, List<WorkoutRollup> workoutRollups) {
        AbstractC22676k.m65750j(recoveryRollups, "recoveryRollups");
        AbstractC22676k.m65750j(sleepRollups, "sleepRollups");
        AbstractC22676k.m65750j(strainRollups, "strainRollups");
        AbstractC22676k.m65750j(workoutRollups, "workoutRollups");
        this.recoveryRollups = recoveryRollups;
        this.sleepRollups = sleepRollups;
        this.strainRollups = strainRollups;
        this.userId = i13;
        this.workoutRollups = workoutRollups;
        ArrayList arrayList = new ArrayList();
        for (Object obj : workoutRollups) {
            if (((WorkoutRollup) obj).getSportId() == 69) {
                arrayList.add(obj);
            }
        }
        this.workoutRollups = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CombinedRollups copy$default(CombinedRollups combinedRollups, RecoveryRollups recoveryRollups, SleepRollups sleepRollups, StrainRollups strainRollups, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            recoveryRollups = combinedRollups.recoveryRollups;
        }
        if ((i14 & 2) != 0) {
            sleepRollups = combinedRollups.sleepRollups;
        }
        if ((i14 & 4) != 0) {
            strainRollups = combinedRollups.strainRollups;
        }
        if ((i14 & 8) != 0) {
            i13 = combinedRollups.userId;
        }
        if ((i14 & 16) != 0) {
            list = combinedRollups.workoutRollups;
        }
        List list2 = list;
        StrainRollups strainRollups2 = strainRollups;
        return combinedRollups.copy(recoveryRollups, sleepRollups, strainRollups2, i13, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecoveryRollups getRecoveryRollups() {
        return this.recoveryRollups;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SleepRollups getSleepRollups() {
        return this.sleepRollups;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StrainRollups getStrainRollups() {
        return this.strainRollups;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    public final List<WorkoutRollup> component5() {
        return this.workoutRollups;
    }

    public final CombinedRollups copy(RecoveryRollups recoveryRollups, SleepRollups sleepRollups, StrainRollups strainRollups, int userId, List<WorkoutRollup> workoutRollups) {
        AbstractC22676k.m65750j(recoveryRollups, "recoveryRollups");
        AbstractC22676k.m65750j(sleepRollups, "sleepRollups");
        AbstractC22676k.m65750j(strainRollups, "strainRollups");
        AbstractC22676k.m65750j(workoutRollups, "workoutRollups");
        return new CombinedRollups(recoveryRollups, sleepRollups, strainRollups, userId, workoutRollups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CombinedRollups)) {
            return false;
        }
        CombinedRollups combinedRollups = (CombinedRollups) other;
        return AbstractC22676k.m65745e(this.recoveryRollups, combinedRollups.recoveryRollups) && AbstractC22676k.m65745e(this.sleepRollups, combinedRollups.sleepRollups) && AbstractC22676k.m65745e(this.strainRollups, combinedRollups.strainRollups) && this.userId == combinedRollups.userId && AbstractC22676k.m65745e(this.workoutRollups, combinedRollups.workoutRollups);
    }

    public final RecoveryRollups getRecoveryRollups() {
        return this.recoveryRollups;
    }

    public final SleepRollups getSleepRollups() {
        return this.sleepRollups;
    }

    public final StrainRollups getStrainRollups() {
        return this.strainRollups;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final List<WorkoutRollup> getWorkoutRollups() {
        return this.workoutRollups;
    }

    public int hashCode() {
        return this.workoutRollups.hashCode() + AbstractC11266d.m30448b(this.userId, (this.strainRollups.hashCode() + ((this.sleepRollups.hashCode() + (this.recoveryRollups.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final void setWorkoutRollups(List<WorkoutRollup> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.workoutRollups = list;
    }

    public String toString() {
        RecoveryRollups recoveryRollups = this.recoveryRollups;
        SleepRollups sleepRollups = this.sleepRollups;
        StrainRollups strainRollups = this.strainRollups;
        int i13 = this.userId;
        List<WorkoutRollup> list = this.workoutRollups;
        StringBuilder sb4 = new StringBuilder("CombinedRollups(recoveryRollups=");
        sb4.append(recoveryRollups);
        sb4.append(", sleepRollups=");
        sb4.append(sleepRollups);
        sb4.append(", strainRollups=");
        sb4.append(strainRollups);
        sb4.append(", userId=");
        sb4.append(i13);
        sb4.append(", workoutRollups=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public final int totalActivityCount() {
        Iterator<T> it = this.workoutRollups.iterator();
        int workoutCount = 0;
        while (it.hasNext()) {
            workoutCount += ((WorkoutRollup) it.next()).getWorkoutCount();
        }
        return workoutCount;
    }
}
