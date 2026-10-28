package bu2;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bu2.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lbu2/n;", "Lm91/u;", "Lbu2/a;", "topGoalInfoItemState", "bottomGoalInfoItemState", "", "maxPercentage", "minPercentage", "<init>", "(Lbu2/a;Lbu2/a;FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbu2/a;", "e", "()Lbu2/a;", "b", "c", "F", "()F", "d", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3653n implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C3637a topGoalInfoItemState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C3637a bottomGoalInfoItemState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float maxPercentage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float minPercentage;

    public C3653n(C3637a topGoalInfoItemState, C3637a bottomGoalInfoItemState, float f13, float f14) {
        AbstractC22676k.m65750j(topGoalInfoItemState, "topGoalInfoItemState");
        AbstractC22676k.m65750j(bottomGoalInfoItemState, "bottomGoalInfoItemState");
        this.topGoalInfoItemState = topGoalInfoItemState;
        this.bottomGoalInfoItemState = bottomGoalInfoItemState;
        this.maxPercentage = f13;
        this.minPercentage = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C3637a getBottomGoalInfoItemState() {
        return this.bottomGoalInfoItemState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getMaxPercentage() {
        return this.maxPercentage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getMinPercentage() {
        return this.minPercentage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C3637a getTopGoalInfoItemState() {
        return this.topGoalInfoItemState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3653n)) {
            return false;
        }
        C3653n c3653n = (C3653n) other;
        return AbstractC22676k.m65745e(this.topGoalInfoItemState, c3653n.topGoalInfoItemState) && AbstractC22676k.m65745e(this.bottomGoalInfoItemState, c3653n.bottomGoalInfoItemState) && Float.compare(this.maxPercentage, c3653n.maxPercentage) == 0 && Float.compare(this.minPercentage, c3653n.minPercentage) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.minPercentage) + AbstractC11266d.m30447a(this.maxPercentage, (this.bottomGoalInfoItemState.hashCode() + (this.topGoalInfoItemState.hashCode() * 31)) * 31, 31);
    }

    public String toString() {
        return "MetricSliderRangeItemState(topGoalInfoItemState=" + this.topGoalInfoItemState + ", bottomGoalInfoItemState=" + this.bottomGoalInfoItemState + ", maxPercentage=" + this.maxPercentage + ", minPercentage=" + this.minPercentage + ")";
    }
}
