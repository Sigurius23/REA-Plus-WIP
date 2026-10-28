package uu2;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uu2.m */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Luu2/m;", "", "", "exerciseId", "exerciseName", "source", "exerciseType", "equipment", "", "emptyData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "f", "e", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35262m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String exerciseId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String exerciseName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String exerciseType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String equipment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean emptyData;

    public C35262m(String exerciseId, String exerciseName, String source, String exerciseType, String equipment, boolean z4) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(exerciseName, "exerciseName");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(exerciseType, "exerciseType");
        AbstractC22676k.m65750j(equipment, "equipment");
        this.exerciseId = exerciseId;
        this.exerciseName = exerciseName;
        this.source = source;
        this.exerciseType = exerciseType;
        this.equipment = equipment;
        this.emptyData = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEmptyData() {
        return this.emptyData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEquipment() {
        return this.equipment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getExerciseType() {
        return this.exerciseType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35262m)) {
            return false;
        }
        C35262m c35262m = (C35262m) other;
        return AbstractC22676k.m65745e(this.exerciseId, c35262m.exerciseId) && AbstractC22676k.m65745e(this.exerciseName, c35262m.exerciseName) && AbstractC22676k.m65745e(this.source, c35262m.source) && AbstractC22676k.m65745e(this.exerciseType, c35262m.exerciseType) && AbstractC22676k.m65745e(this.equipment, c35262m.equipment) && this.emptyData == c35262m.emptyData;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return Boolean.hashCode(this.emptyData) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.exerciseId.hashCode() * 31, 31, this.exerciseName), 31, this.source), 31, this.exerciseType), 31, this.equipment);
    }

    public String toString() {
        String str = this.exerciseId;
        String str2 = this.exerciseName;
        String str3 = this.source;
        String str4 = this.exerciseType;
        String str5 = this.equipment;
        boolean z4 = this.emptyData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExerciseDetailsV2AnalyticsContext(exerciseId=", str, ", exerciseName=", str2, ", source=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", exerciseType=", str4, ", equipment=");
        return AbstractC21702c.m61137h(sbM32001t, str5, ", emptyData=", z4, ")");
    }
}
