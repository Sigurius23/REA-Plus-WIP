package uu2;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: uu2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Luu2/e;", "", "", "exerciseName", "exerciseType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35247e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String exerciseName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String exerciseType;

    public C35247e(String exerciseName, String exerciseType) {
        AbstractC22676k.m65750j(exerciseName, "exerciseName");
        AbstractC22676k.m65750j(exerciseType, "exerciseType");
        this.exerciseName = exerciseName;
        this.exerciseType = exerciseType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExerciseType() {
        return this.exerciseType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35247e)) {
            return false;
        }
        C35247e c35247e = (C35247e) other;
        return AbstractC22676k.m65745e(this.exerciseName, c35247e.exerciseName) && AbstractC22676k.m65745e(this.exerciseType, c35247e.exerciseType);
    }

    public int hashCode() {
        return this.exerciseType.hashCode() + (this.exerciseName.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("ExerciseDetailsMiniArchAnalyticsContext(exerciseName=", this.exerciseName, ", exerciseType=", this.exerciseType, ")");
    }

    public /* synthetic */ C35247e(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2);
    }
}
