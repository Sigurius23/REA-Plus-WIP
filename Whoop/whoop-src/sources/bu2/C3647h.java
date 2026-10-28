package bu2;

import p000.AbstractC11266d;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bu2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lbu2/h;", "Lm91/u;", "Lbu2/a;", "goalInfoItemState", "", "percentage", "Li2/x;", "lineColor", "<init>", "(Lbu2/a;FJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbu2/a;", "()Lbu2/a;", "b", "F", "c", "()F", "J", "()J", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3647h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C3637a goalInfoItemState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float percentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long lineColor;

    public /* synthetic */ C3647h(C3637a c3637a, float f13, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3637a, f13, j7);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C3637a getGoalInfoItemState() {
        return this.goalInfoItemState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLineColor() {
        return this.lineColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3647h)) {
            return false;
        }
        C3647h c3647h = (C3647h) other;
        return AbstractC22676k.m65745e(this.goalInfoItemState, c3647h.goalInfoItemState) && Float.compare(this.percentage, c3647h.percentage) == 0 && C17919x.m51542d(this.lineColor, c3647h.lineColor);
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.percentage, this.goalInfoItemState.hashCode() * 31, 31);
        long j7 = this.lineColor;
        int i13 = C17919x.f69638o;
        return Long.hashCode(j7) + iM30447a;
    }

    public String toString() {
        C3637a c3637a = this.goalInfoItemState;
        float f13 = this.percentage;
        String strM51548j = C17919x.m51548j(this.lineColor);
        StringBuilder sb4 = new StringBuilder("MetricSliderLevelItemState(goalInfoItemState=");
        sb4.append(c3637a);
        sb4.append(", percentage=");
        sb4.append(f13);
        sb4.append(", lineColor=");
        return AbstractC25012a.m73376i(strM51548j, ")", sb4);
    }

    private C3647h(C3637a goalInfoItemState, float f13, long j7) {
        AbstractC22676k.m65750j(goalInfoItemState, "goalInfoItemState");
        this.goalInfoItemState = goalInfoItemState;
        this.percentage = f13;
        this.lineColor = j7;
    }
}
