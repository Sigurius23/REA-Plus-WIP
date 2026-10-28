package tl1;

import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tl1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Ltl1/a;", "", "", "shouldShowOverviewTabs", "animationComplete", "<init>", "(ZZ)V", "a", "(ZZ)Ltl1/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "getAnimationComplete", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33917a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean shouldShowOverviewTabs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean animationComplete;

    public C33917a(boolean z4, boolean z13) {
        this.shouldShowOverviewTabs = z4;
        this.animationComplete = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33917a m107287b(C33917a c33917a, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c33917a.shouldShowOverviewTabs;
        }
        if ((i13 & 2) != 0) {
            z13 = c33917a.animationComplete;
        }
        return c33917a.m107288a(z4, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C33917a m107288a(boolean shouldShowOverviewTabs, boolean animationComplete) {
        return new C33917a(shouldShowOverviewTabs, animationComplete);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShouldShowOverviewTabs() {
        return this.shouldShowOverviewTabs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33917a)) {
            return false;
        }
        C33917a c33917a = (C33917a) other;
        return this.shouldShowOverviewTabs == c33917a.shouldShowOverviewTabs && this.animationComplete == c33917a.animationComplete;
    }

    public int hashCode() {
        return Boolean.hashCode(this.animationComplete) + (Boolean.hashCode(this.shouldShowOverviewTabs) * 31);
    }

    public String toString() {
        return AbstractC30802r.m94762k("DayOneTransitionDomainState(shouldShowOverviewTabs=", ", animationComplete=", ")", this.shouldShowOverviewTabs, this.animationComplete);
    }

    public /* synthetic */ C33917a(boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13);
    }
}
