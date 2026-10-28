package dq1;

import com.whoop.hrZones.network.ZoneID;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dq1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, m65681d2 = {"Ldq1/a;", "", "Lcom/whoop/hrZones/network/ZoneID;", "zoneID", "", "min", "max", "<init>", "(Lcom/whoop/hrZones/network/ZoneID;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hrZones/network/ZoneID;", "c", "()Lcom/whoop/hrZones/network/ZoneID;", "b", "I", "hrZones-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12288a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ZoneID zoneID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int min;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int max;

    public C12288a(ZoneID zoneID, int i13, int i14) {
        AbstractC22676k.m65750j(zoneID, "zoneID");
        this.zoneID = zoneID;
        this.min = i13;
        this.max = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneID getZoneID() {
        return this.zoneID;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12288a)) {
            return false;
        }
        C12288a c12288a = (C12288a) other;
        return this.zoneID == c12288a.zoneID && this.min == c12288a.min && this.max == c12288a.max;
    }

    public int hashCode() {
        return Integer.hashCode(this.max) + AbstractC11266d.m30448b(this.min, this.zoneID.hashCode() * 31, 31);
    }

    public String toString() {
        ZoneID zoneID = this.zoneID;
        int i13 = this.min;
        int i14 = this.max;
        StringBuilder sb4 = new StringBuilder("HrZoneDto(zoneID=");
        sb4.append(zoneID);
        sb4.append(", min=");
        sb4.append(i13);
        sb4.append(", max=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }
}
