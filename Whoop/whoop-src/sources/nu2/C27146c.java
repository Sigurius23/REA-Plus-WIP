package nu2;

import c13.AbstractC3855a;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import dq1.C12288a;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nu2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, m65681d2 = {"Lnu2/c;", "", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "workoutState", "", "currentSetTimeInSeconds", "currentHeartRate", "", "workoutCompleted", "", "Ldq1/a;", "hrZonesState", "<init>", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "e", "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "d", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27146c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActiveWorkout workoutState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer currentSetTimeInSeconds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer currentHeartRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean workoutCompleted;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C12288a> hrZonesState;

    public C27146c(ActiveWorkout activeWorkout, Integer num, Integer num2, boolean z4, List<C12288a> list) {
        this.workoutState = activeWorkout;
        this.currentSetTimeInSeconds = num;
        this.currentHeartRate = num2;
        this.workoutCompleted = z4;
        this.hrZonesState = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCurrentHeartRate() {
        return this.currentHeartRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getCurrentSetTimeInSeconds() {
        return this.currentSetTimeInSeconds;
    }

    /* JADX INFO: renamed from: c */
    public final List<C12288a> m81634c() {
        return this.hrZonesState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getWorkoutCompleted() {
        return this.workoutCompleted;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ActiveWorkout getWorkoutState() {
        return this.workoutState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27146c)) {
            return false;
        }
        C27146c c27146c = (C27146c) other;
        return AbstractC22676k.m65745e(this.workoutState, c27146c.workoutState) && AbstractC22676k.m65745e(this.currentSetTimeInSeconds, c27146c.currentSetTimeInSeconds) && AbstractC22676k.m65745e(this.currentHeartRate, c27146c.currentHeartRate) && this.workoutCompleted == c27146c.workoutCompleted && AbstractC22676k.m65745e(this.hrZonesState, c27146c.hrZonesState);
    }

    public int hashCode() {
        ActiveWorkout activeWorkout = this.workoutState;
        int iHashCode = (activeWorkout == null ? 0 : activeWorkout.hashCode()) * 31;
        Integer num = this.currentSetTimeInSeconds;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.currentHeartRate;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.workoutCompleted);
        List<C12288a> list = this.hrZonesState;
        return iM8289b + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        ActiveWorkout activeWorkout = this.workoutState;
        Integer num = this.currentSetTimeInSeconds;
        Integer num2 = this.currentHeartRate;
        boolean z4 = this.workoutCompleted;
        List<C12288a> list = this.hrZonesState;
        StringBuilder sb4 = new StringBuilder("ActiveWorkoutDomainState(workoutState=");
        sb4.append(activeWorkout);
        sb4.append(", currentSetTimeInSeconds=");
        sb4.append(num);
        sb4.append(", currentHeartRate=");
        sb4.append(num2);
        sb4.append(", workoutCompleted=");
        sb4.append(z4);
        sb4.append(", hrZonesState=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
