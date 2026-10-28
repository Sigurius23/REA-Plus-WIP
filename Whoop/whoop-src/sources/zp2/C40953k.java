package zp2;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zp2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lzp2/k;", "", "", "currentStepIndex", "stepTotal", "Lzp2/a;", "sectionProgress", "<init>", "(IILzp2/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Lzp2/a;", "()Lzp2/a;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40953k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int currentStepIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int stepTotal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C40943a sectionProgress;

    public C40953k(int i13, int i14, C40943a c40943a) {
        this.currentStepIndex = i13;
        this.stepTotal = i14;
        this.sectionProgress = c40943a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C40943a getSectionProgress() {
        return this.sectionProgress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStepTotal() {
        return this.stepTotal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40953k)) {
            return false;
        }
        C40953k c40953k = (C40953k) other;
        return this.currentStepIndex == c40953k.currentStepIndex && this.stepTotal == c40953k.stepTotal && AbstractC22676k.m65745e(this.sectionProgress, c40953k.sectionProgress);
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.stepTotal, Integer.hashCode(this.currentStepIndex) * 31, 31);
        C40943a c40943a = this.sectionProgress;
        return iM30448b + (c40943a == null ? 0 : c40943a.hashCode());
    }

    public String toString() {
        int i13 = this.currentStepIndex;
        int i14 = this.stepTotal;
        C40943a c40943a = this.sectionProgress;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "UserJourneyProgressResult(currentStepIndex=", ", stepTotal=", ", sectionProgress=");
        sbM30465s.append(c40943a);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
