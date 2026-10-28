package fu2;

import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fu2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lfu2/h;", "", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "workoutTemplate", "", "linkedActivityId", "<init>", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;)V", "a", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;)Lfu2/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "d", "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "b", "Ljava/lang/String;", "c", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14793h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WorkoutTemplate workoutTemplate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String linkedActivityId;

    public C14793h(WorkoutTemplate workoutTemplate, String str) {
        AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
        this.workoutTemplate = workoutTemplate;
        this.linkedActivityId = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14793h m42529b(C14793h c14793h, WorkoutTemplate workoutTemplate, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            workoutTemplate = c14793h.workoutTemplate;
        }
        if ((i13 & 2) != 0) {
            str = c14793h.linkedActivityId;
        }
        return c14793h.m42530a(workoutTemplate, str);
    }

    /* JADX INFO: renamed from: a */
    public final C14793h m42530a(WorkoutTemplate workoutTemplate, String linkedActivityId) {
        AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
        return new C14793h(workoutTemplate, linkedActivityId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLinkedActivityId() {
        return this.linkedActivityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final WorkoutTemplate getWorkoutTemplate() {
        return this.workoutTemplate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14793h)) {
            return false;
        }
        C14793h c14793h = (C14793h) other;
        return AbstractC22676k.m65745e(this.workoutTemplate, c14793h.workoutTemplate) && AbstractC22676k.m65745e(this.linkedActivityId, c14793h.linkedActivityId);
    }

    public int hashCode() {
        int iHashCode = this.workoutTemplate.hashCode() * 31;
        String str = this.linkedActivityId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "StrengthTrainerDomainState(workoutTemplate=" + this.workoutTemplate + ", linkedActivityId=" + this.linkedActivityId + ")";
    }
}
