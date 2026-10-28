package gf1;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gf1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lgf1/a;", "", "", "exerciseName", "exerciseType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15782a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    private static final C15782a f59479d = new C15782a("", "");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String exerciseName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String exerciseType;

    /* JADX INFO: renamed from: gf1.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lgf1/a$a;", "", "<init>", "()V", "Lgf1/a;", "Empty", "Lgf1/a;", "a", "()Lgf1/a;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C15782a m44488a() {
            return C15782a.f59479d;
        }

        private Companion() {
        }
    }

    public C15782a(String exerciseName, String exerciseType) {
        AbstractC22676k.m65750j(exerciseName, "exerciseName");
        AbstractC22676k.m65750j(exerciseType, "exerciseType");
        this.exerciseName = exerciseName;
        this.exerciseType = exerciseType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExerciseType() {
        return this.exerciseType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15782a)) {
            return false;
        }
        C15782a c15782a = (C15782a) other;
        return AbstractC22676k.m65745e(this.exerciseName, c15782a.exerciseName) && AbstractC22676k.m65745e(this.exerciseType, c15782a.exerciseType);
    }

    public int hashCode() {
        return this.exerciseType.hashCode() + (this.exerciseName.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("ExerciseProgressAnalyticsContext(exerciseName=", this.exerciseName, ", exerciseType=", this.exerciseType, ")");
    }
}
