package am1;

import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: am1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lam1/b;", "", "", "hasSeenNewHome", "hasSeenFabOnboarding", "<init>", "(ZZ)V", "a", "(ZZ)Lam1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "c", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1005b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean hasSeenNewHome;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean hasSeenFabOnboarding;

    public C1005b(boolean z4, boolean z13) {
        this.hasSeenNewHome = z4;
        this.hasSeenFabOnboarding = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C1005b m2716b(C1005b c1005b, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c1005b.hasSeenNewHome;
        }
        if ((i13 & 2) != 0) {
            z13 = c1005b.hasSeenFabOnboarding;
        }
        return c1005b.m2717a(z4, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C1005b m2717a(boolean hasSeenNewHome, boolean hasSeenFabOnboarding) {
        return new C1005b(hasSeenNewHome, hasSeenFabOnboarding);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasSeenFabOnboarding() {
        return this.hasSeenFabOnboarding;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasSeenNewHome() {
        return this.hasSeenNewHome;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1005b)) {
            return false;
        }
        C1005b c1005b = (C1005b) other;
        return this.hasSeenNewHome == c1005b.hasSeenNewHome && this.hasSeenFabOnboarding == c1005b.hasSeenFabOnboarding;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasSeenFabOnboarding) + (Boolean.hashCode(this.hasSeenNewHome) * 31);
    }

    public String toString() {
        return AbstractC30802r.m94762k("OnboardingDomainState(hasSeenNewHome=", ", hasSeenFabOnboarding=", ")", this.hasSeenNewHome, this.hasSeenFabOnboarding);
    }

    public /* synthetic */ C1005b(boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? true : z13);
    }
}
