package yh0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yh0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lyh0/e;", "", "", "paceOfAging", "yearsDifference", "", "isOnboarding", "<init>", "(FFZ)V", "a", "(FFZ)Lyh0/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "c", "()F", "b", "d", "Z", "e", "()Z", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39539e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float paceOfAging;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float yearsDifference;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isOnboarding;

    public C39539e(float f13, float f14, boolean z4) {
        this.paceOfAging = f13;
        this.yearsDifference = f14;
        this.isOnboarding = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39539e m126301b(C39539e c39539e, float f13, float f14, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c39539e.paceOfAging;
        }
        if ((i13 & 2) != 0) {
            f14 = c39539e.yearsDifference;
        }
        if ((i13 & 4) != 0) {
            z4 = c39539e.isOnboarding;
        }
        return c39539e.m126302a(f13, f14, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C39539e m126302a(float paceOfAging, float yearsDifference, boolean isOnboarding) {
        return new C39539e(paceOfAging, yearsDifference, isOnboarding);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getPaceOfAging() {
        return this.paceOfAging;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getYearsDifference() {
        return this.yearsDifference;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsOnboarding() {
        return this.isOnboarding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39539e)) {
            return false;
        }
        C39539e c39539e = (C39539e) other;
        return Float.compare(this.paceOfAging, c39539e.paceOfAging) == 0 && Float.compare(this.yearsDifference, c39539e.yearsDifference) == 0 && this.isOnboarding == c39539e.isOnboarding;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOnboarding) + AbstractC11266d.m30447a(this.yearsDifference, Float.hashCode(this.paceOfAging) * 31, 31);
    }

    public String toString() {
        float f13 = this.paceOfAging;
        float f14 = this.yearsDifference;
        return AbstractC18489d0.m53372m(AbstractC2875y.m8307t("HealthspanState(paceOfAging=", f13, ", yearsDifference=", f14, ", isOnboarding="), this.isOnboarding, ")");
    }

    public /* synthetic */ C39539e(float f13, float f14, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 0.0f : f14, (i13 & 4) != 0 ? false : z4);
    }
}
