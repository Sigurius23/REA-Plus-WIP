package pu2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pu2.o */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lpu2/o;", "", "Lpu2/p;", "setNumberStatState", "volumeStatState", "weightStatState", "<init>", "(Lpu2/p;Lpu2/p;Lpu2/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpu2/p;", "()Lpu2/p;", "b", "c", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29567o {

    /* JADX INFO: renamed from: d */
    public static final int f120624d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29568p setNumberStatState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C29568p volumeStatState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29568p weightStatState;

    public C29567o(C29568p setNumberStatState, C29568p volumeStatState, C29568p weightStatState) {
        AbstractC22676k.m65750j(setNumberStatState, "setNumberStatState");
        AbstractC22676k.m65750j(volumeStatState, "volumeStatState");
        AbstractC22676k.m65750j(weightStatState, "weightStatState");
        this.setNumberStatState = setNumberStatState;
        this.volumeStatState = volumeStatState;
        this.weightStatState = weightStatState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C29568p getSetNumberStatState() {
        return this.setNumberStatState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C29568p getVolumeStatState() {
        return this.volumeStatState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C29568p getWeightStatState() {
        return this.weightStatState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29567o)) {
            return false;
        }
        C29567o c29567o = (C29567o) other;
        return AbstractC22676k.m65745e(this.setNumberStatState, c29567o.setNumberStatState) && AbstractC22676k.m65745e(this.volumeStatState, c29567o.volumeStatState) && AbstractC22676k.m65745e(this.weightStatState, c29567o.weightStatState);
    }

    public int hashCode() {
        return this.weightStatState.hashCode() + ((this.volumeStatState.hashCode() + (this.setNumberStatState.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "NotificationExerciseContentState(setNumberStatState=" + this.setNumberStatState + ", volumeStatState=" + this.volumeStatState + ", weightStatState=" + this.weightStatState + ")";
    }
}
