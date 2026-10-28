package am0;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: am0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lam0/f;", "", "", "superset", "", "Lam0/g;", "workouts", "<init>", "(ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1002f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean superset;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C1003g> workouts;

    public C1002f(boolean z4, List<C1003g> workouts) {
        AbstractC22676k.m65750j(workouts, "workouts");
        this.superset = z4;
        this.workouts = workouts;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getSuperset() {
        return this.superset;
    }

    /* JADX INFO: renamed from: b */
    public final List<C1003g> m2704b() {
        return this.workouts;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1002f)) {
            return false;
        }
        C1002f c1002f = (C1002f) other;
        return this.superset == c1002f.superset && AbstractC22676k.m65745e(this.workouts, c1002f.workouts);
    }

    public int hashCode() {
        return this.workouts.hashCode() + (Boolean.hashCode(this.superset) * 31);
    }

    public String toString() {
        return "WorkoutListState(superset=" + this.superset + ", workouts=" + this.workouts + ")";
    }
}
