package ri1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ri1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lri1/f;", "Lri1/d;", "", "manualRefresh", "Lri1/h;", "domainState", "<init>", "(ZLri1/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lri1/h;", "()Lri1/h;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31457f implements InterfaceC31455d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C31459h domainState;

    public C31457f(boolean z4, C31459h c31459h) {
        this.manualRefresh = z4;
        this.domainState = c31459h;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C31459h getDomainState() {
        return this.domainState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31457f)) {
            return false;
        }
        C31457f c31457f = (C31457f) other;
        return this.manualRefresh == c31457f.manualRefresh && AbstractC22676k.m65745e(this.domainState, c31457f.domainState);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.manualRefresh) * 31;
        C31459h c31459h = this.domainState;
        return iHashCode + (c31459h == null ? 0 : c31459h.hashCode());
    }

    public String toString() {
        return "LoadHealthTab(manualRefresh=" + this.manualRefresh + ", domainState=" + this.domainState + ")";
    }

    public /* synthetic */ C31457f(boolean z4, C31459h c31459h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : c31459h);
    }
}
