package tt2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tt2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Ltt2/g;", "", "Ltt2/j;", "weeklyPlan", "Ltt2/b;", "presets", "<init>", "(Ltt2/j;Ltt2/b;)V", "a", "()Ltt2/j;", "b", "()Ltt2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltt2/j;", "d", "Ltt2/b;", "c", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34169g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC34172j weeklyPlan;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC34164b presets;

    public C34169g(AbstractC34172j weeklyPlan, AbstractC34164b presets) {
        AbstractC22676k.m65750j(weeklyPlan, "weeklyPlan");
        AbstractC22676k.m65750j(presets, "presets");
        this.weeklyPlan = weeklyPlan;
        this.presets = presets;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC34172j getWeeklyPlan() {
        return this.weeklyPlan;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC34164b getPresets() {
        return this.presets;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC34164b m107979c() {
        return this.presets;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC34172j m107980d() {
        return this.weeklyPlan;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34169g)) {
            return false;
        }
        C34169g c34169g = (C34169g) other;
        return AbstractC22676k.m65745e(this.weeklyPlan, c34169g.weeklyPlan) && AbstractC22676k.m65745e(this.presets, c34169g.presets);
    }

    public int hashCode() {
        return this.presets.hashCode() + (this.weeklyPlan.hashCode() * 31);
    }

    public String toString() {
        return "WeeklyPlanCombinedResult(weeklyPlan=" + this.weeklyPlan + ", presets=" + this.presets + ")";
    }
}
