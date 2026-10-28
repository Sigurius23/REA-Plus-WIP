package wk2;

import com.whoop.hrZones.network.ZoneID;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wk2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lwk2/k;", "", "", "Lcom/whoop/hrZones/network/ZoneID;", "Ljava/time/Duration;", "zoneDurations", "lastZone", "Ljava/time/Instant;", "lastTimestamp", "<init>", "(Ljava/util/Map;Lcom/whoop/hrZones/network/ZoneID;Ljava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "b", "Lcom/whoop/hrZones/network/ZoneID;", "()Lcom/whoop/hrZones/network/ZoneID;", "Ljava/time/Instant;", "()Ljava/time/Instant;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37350k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<ZoneID, Duration> zoneDurations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ZoneID lastZone;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Instant lastTimestamp;

    public C37350k(Map<ZoneID, Duration> zoneDurations, ZoneID zoneID, Instant instant) {
        AbstractC22676k.m65750j(zoneDurations, "zoneDurations");
        this.zoneDurations = zoneDurations;
        this.lastZone = zoneID;
        this.lastTimestamp = instant;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Instant getLastTimestamp() {
        return this.lastTimestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ZoneID getLastZone() {
        return this.lastZone;
    }

    /* JADX INFO: renamed from: c */
    public final Map<ZoneID, Duration> m119604c() {
        return this.zoneDurations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37350k)) {
            return false;
        }
        C37350k c37350k = (C37350k) other;
        return AbstractC22676k.m65745e(this.zoneDurations, c37350k.zoneDurations) && this.lastZone == c37350k.lastZone && AbstractC22676k.m65745e(this.lastTimestamp, c37350k.lastTimestamp);
    }

    public int hashCode() {
        int iHashCode = this.zoneDurations.hashCode() * 31;
        ZoneID zoneID = this.lastZone;
        int iHashCode2 = (iHashCode + (zoneID == null ? 0 : zoneID.hashCode())) * 31;
        Instant instant = this.lastTimestamp;
        return iHashCode2 + (instant != null ? instant.hashCode() : 0);
    }

    public String toString() {
        return "ZoneAccumulation(zoneDurations=" + this.zoneDurations + ", lastZone=" + this.lastZone + ", lastTimestamp=" + this.lastTimestamp + ")";
    }

    public /* synthetic */ C37350k(Map map, ZoneID zoneID, Instant instant, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? null : zoneID, (i13 & 4) != 0 ? null : instant);
    }
}
