package zk2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import tk2.C33889g;

/* JADX INFO: renamed from: zk2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lzk2/l;", "", "Ltk2/g;", "metrics", "Lm91/u;", "footer", "<init>", "(Ltk2/g;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltk2/g;", "b", "()Ltk2/g;", "Lm91/u;", "()Lm91/u;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40851l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33889g metrics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u footer;

    public C40851l(C33889g metrics, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(metrics, "metrics");
        this.metrics = metrics;
        this.footer = interfaceC25312u;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C33889g getMetrics() {
        return this.metrics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40851l)) {
            return false;
        }
        C40851l c40851l = (C40851l) other;
        return AbstractC22676k.m65745e(this.metrics, c40851l.metrics) && AbstractC22676k.m65745e(this.footer, c40851l.footer);
    }

    public int hashCode() {
        int iHashCode = this.metrics.hashCode() * 31;
        InterfaceC25312u interfaceC25312u = this.footer;
        return iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode());
    }

    public String toString() {
        return "TrackSessionLiveBottomContentViewState(metrics=" + this.metrics + ", footer=" + this.footer + ")";
    }
}
