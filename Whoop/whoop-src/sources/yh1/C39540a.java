package yh1;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: yh1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b$\u0010\u0011¨\u0006("}, m65681d2 = {"Lyh1/a;", "", "", "timestamp", "", "latitude", "longitude", "altitude", "horizontalAccuracyMeters", "verticalAccuracyMeters", "Lyh1/b;", "speed", "", "trigger", "<init>", "(JDDDDDLyh1/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "f", "()J", "b", "D", "c", "()D", "d", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lyh1/b;", "()Lyh1/b;", "Ljava/lang/String;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39540a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double latitude;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double longitude;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double altitude;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double horizontalAccuracyMeters;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final double verticalAccuracyMeters;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C39541b speed;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String trigger;

    public C39540a(long j7, double d3, double d14, double d15, double d16, double d17, C39541b c39541b, String str) {
        this.timestamp = j7;
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracyMeters = d16;
        this.verticalAccuracyMeters = d17;
        this.speed = c39541b;
        this.trigger = str;
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
    public final C39541b getSpeed() {
        return this.speed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39540a)) {
            return false;
        }
        C39540a c39540a = (C39540a) other;
        return this.timestamp == c39540a.timestamp && Double.compare(this.latitude, c39540a.latitude) == 0 && Double.compare(this.longitude, c39540a.longitude) == 0 && Double.compare(this.altitude, c39540a.altitude) == 0 && Double.compare(this.horizontalAccuracyMeters, c39540a.horizontalAccuracyMeters) == 0 && Double.compare(this.verticalAccuracyMeters, c39540a.verticalAccuracyMeters) == 0 && AbstractC22676k.m65745e(this.speed, c39540a.speed) && AbstractC22676k.m65745e(this.trigger, c39540a.trigger);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTrigger() {
        return this.trigger;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Long.hashCode(this.timestamp) * 31, 31, this.latitude), 31, this.longitude), 31, this.altitude), 31, this.horizontalAccuracyMeters), 31, this.verticalAccuracyMeters);
        C39541b c39541b = this.speed;
        int iHashCode = (iM48499a + (c39541b == null ? 0 : c39541b.hashCode())) * 31;
        String str = this.trigger;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        long j7 = this.timestamp;
        double d3 = this.latitude;
        double d14 = this.longitude;
        double d15 = this.altitude;
        double d16 = this.horizontalAccuracyMeters;
        double d17 = this.verticalAccuracyMeters;
        C39541b c39541b = this.speed;
        String str = this.trigger;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "GpsLocation(timestamp=", ", latitude=");
        sbM125596b.append(d3);
        AbstractC31061c.m95622B(sbM125596b, ", longitude=", d14, ", altitude=");
        sbM125596b.append(d15);
        AbstractC31061c.m95622B(sbM125596b, ", horizontalAccuracyMeters=", d16, ", verticalAccuracyMeters=");
        sbM125596b.append(d17);
        sbM125596b.append(", speed=");
        sbM125596b.append(c39541b);
        return AbstractC2875y.m8304q(sbM125596b, ", trigger=", str, ")");
    }
}
