package mk2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: mk2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lmk2/e;", "", "Lyg2/d;", "live", "", "averageBpm", "<init>", "(Lyg2/d;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyg2/d;", "b", "()Lyg2/d;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25638e {

    /* JADX INFO: renamed from: c */
    public static final int f100586c = AbstractC39529d.f169988a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC39529d live;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Double averageBpm;

    public C25638e(AbstractC39529d abstractC39529d, Double d3) {
        this.live = abstractC39529d;
        this.averageBpm = d3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAverageBpm() {
        return this.averageBpm;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC39529d getLive() {
        return this.live;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25638e)) {
            return false;
        }
        C25638e c25638e = (C25638e) other;
        return AbstractC22676k.m65745e(this.live, c25638e.live) && AbstractC22676k.m65745e(this.averageBpm, c25638e.averageBpm);
    }

    public int hashCode() {
        AbstractC39529d abstractC39529d = this.live;
        int iHashCode = (abstractC39529d == null ? 0 : abstractC39529d.hashCode()) * 31;
        Double d3 = this.averageBpm;
        return iHashCode + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        return "HeartRateState(live=" + this.live + ", averageBpm=" + this.averageBpm + ")";
    }

    public /* synthetic */ C25638e(AbstractC39529d abstractC39529d, Double d3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : abstractC39529d, (i13 & 2) != 0 ? null : d3);
    }
}
