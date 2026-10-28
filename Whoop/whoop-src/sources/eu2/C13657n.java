package eu2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eu2.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, m65681d2 = {"Leu2/n;", "", "", "newWeightText", "", "exerciseIndex", "setIndex", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13657n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String newWeightText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int exerciseIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int setIndex;

    public C13657n(String newWeightText, int i13, int i14) {
        AbstractC22676k.m65750j(newWeightText, "newWeightText");
        this.newWeightText = newWeightText;
        this.exerciseIndex = i13;
        this.setIndex = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getExerciseIndex() {
        return this.exerciseIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNewWeightText() {
        return this.newWeightText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSetIndex() {
        return this.setIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13657n)) {
            return false;
        }
        C13657n c13657n = (C13657n) other;
        return AbstractC22676k.m65745e(this.newWeightText, c13657n.newWeightText) && this.exerciseIndex == c13657n.exerciseIndex && this.setIndex == c13657n.setIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.setIndex) + AbstractC11266d.m30448b(this.exerciseIndex, this.newWeightText.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.newWeightText;
        int i13 = this.exerciseIndex;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(i13, "WeightChanged(newWeightText=", str, ", exerciseIndex=", ", setIndex="), this.setIndex, ")");
    }
}
