package ws2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ws2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lws2/g;", "", "", "currentStepIndex", "stepTotal", "", "isAtEnd", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37615g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int currentStepIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int stepTotal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isAtEnd;

    public C37615g(int i13, int i14, boolean z4) {
        this.currentStepIndex = i13;
        this.stepTotal = i14;
        this.isAtEnd = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStepTotal() {
        return this.stepTotal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAtEnd() {
        return this.isAtEnd;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37615g)) {
            return false;
        }
        C37615g c37615g = (C37615g) other;
        return this.currentStepIndex == c37615g.currentStepIndex && this.stepTotal == c37615g.stepTotal && this.isAtEnd == c37615g.isAtEnd;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAtEnd) + AbstractC11266d.m30448b(this.stepTotal, Integer.hashCode(this.currentStepIndex) * 31, 31);
    }

    public String toString() {
        int i13 = this.currentStepIndex;
        int i14 = this.stepTotal;
        return AbstractC18489d0.m53372m(AbstractC11266d.m30465s(i13, i14, "CustomizePlanProgressResult(currentStepIndex=", ", stepTotal=", ", isAtEnd="), this.isAtEnd, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C37615g(int i13, int i14, boolean z4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        i13 = (i15 & 1) != 0 ? 0 : i13;
        i14 = (i15 & 2) != 0 ? 0 : i14;
        this(i13, i14, (i15 & 4) != 0 ? i13 == i14 + (-1) : z4);
    }
}
