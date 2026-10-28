package bi1;

import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import r80.AbstractC31061c;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: bi1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010\u001f¨\u0006\""}, m65681d2 = {"Lbi1/a;", "", "", "sessionStartTimeMs", "timestamp", "", "latitude", "longitude", "altitude", "horizontalAccuracyMeters", "verticalAccuracyMeters", "<init>", "(JJDDDDD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "f", "c", "D", "()D", "d", "g", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3284a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long sessionStartTimeMs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double latitude;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double longitude;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double altitude;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final double horizontalAccuracyMeters;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final double verticalAccuracyMeters;

    public C3284a(long j7, long j13, double d3, double d14, double d15, double d16, double d17) {
        this.sessionStartTimeMs = j7;
        this.timestamp = j13;
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracyMeters = d16;
        this.verticalAccuracyMeters = d17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getHorizontalAccuracyMeters() {
        return this.horizontalAccuracyMeters;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSessionStartTimeMs() {
        return this.sessionStartTimeMs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3284a)) {
            return false;
        }
        C3284a c3284a = (C3284a) other;
        return this.sessionStartTimeMs == c3284a.sessionStartTimeMs && this.timestamp == c3284a.timestamp && Double.compare(this.latitude, c3284a.latitude) == 0 && Double.compare(this.longitude, c3284a.longitude) == 0 && Double.compare(this.altitude, c3284a.altitude) == 0 && Double.compare(this.horizontalAccuracyMeters, c3284a.horizontalAccuracyMeters) == 0 && Double.compare(this.verticalAccuracyMeters, c3284a.verticalAccuracyMeters) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters;
    }

    public int hashCode() {
        return Double.hashCode(this.verticalAccuracyMeters) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30451e(Long.hashCode(this.sessionStartTimeMs) * 31, this.timestamp, 31), 31, this.latitude), 31, this.longitude), 31, this.altitude), 31, this.horizontalAccuracyMeters);
    }

    public String toString() {
        long j7 = this.sessionStartTimeMs;
        long j13 = this.timestamp;
        double d3 = this.latitude;
        double d14 = this.longitude;
        double d15 = this.altitude;
        double d16 = this.horizontalAccuracyMeters;
        double d17 = this.verticalAccuracyMeters;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "ForegroundGpsRoutePointEntity(sessionStartTimeMs=", ", timestamp=");
        sbM125596b.append(j13);
        AbstractC31061c.m95622B(sbM125596b, ", latitude=", d3, ", longitude=");
        sbM125596b.append(d14);
        AbstractC31061c.m95622B(sbM125596b, ", altitude=", d15, ", horizontalAccuracyMeters=");
        sbM125596b.append(d16);
        sbM125596b.append(", verticalAccuracyMeters=");
        sbM125596b.append(d17);
        sbM125596b.append(")");
        return sbM125596b.toString();
    }
}
