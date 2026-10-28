package kz0;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: kz0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, m65681d2 = {"Lkz0/a;", "", "", "totalSteps", "completedSteps", "<init>", "(II)V", "a", "(II)Lkz0/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22920a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int totalSteps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int completedSteps;

    public C22920a(int i13, int i14) {
        this.totalSteps = i13;
        this.completedSteps = i14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22920a m66640b(C22920a c22920a, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = c22920a.totalSteps;
        }
        if ((i15 & 2) != 0) {
            i14 = c22920a.completedSteps;
        }
        return c22920a.m66641a(i13, i14);
    }

    /* JADX INFO: renamed from: a */
    public final C22920a m66641a(int totalSteps, int completedSteps) {
        return new C22920a(totalSteps, completedSteps);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCompletedSteps() {
        return this.completedSteps;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22920a)) {
            return false;
        }
        C22920a c22920a = (C22920a) other;
        return this.totalSteps == c22920a.totalSteps && this.completedSteps == c22920a.completedSteps;
    }

    public int hashCode() {
        return Integer.hashCode(this.completedSteps) + (Integer.hashCode(this.totalSteps) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.totalSteps, this.completedSteps, "SectionProgress(totalSteps=", ", completedSteps=", ")");
    }
}
