package fv1;

import com.google.android.gms.location.FusedLocationProviderClient;
import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: fv1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001f¨\u0006 "}, m65681d2 = {"Lfv1/b;", "", "", "latitude", "longitude", "altitude", "horizontalAccuracy", FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, "", "timestamp", "<init>", "(DDDDDJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "c", "()D", "b", "d", "e", "f", "J", "()J", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14814b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double latitude;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double longitude;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double altitude;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double horizontalAccuracy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double verticalAccuracy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long timestamp;

    public C14814b(double d3, double d14, double d15, double d16, double d17, long j7) {
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracy = d16;
        this.verticalAccuracy = d17;
        this.timestamp = j7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
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
    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14814b)) {
            return false;
        }
        C14814b c14814b = (C14814b) other;
        return Double.compare(this.latitude, c14814b.latitude) == 0 && Double.compare(this.longitude, c14814b.longitude) == 0 && Double.compare(this.altitude, c14814b.altitude) == 0 && Double.compare(this.horizontalAccuracy, c14814b.horizontalAccuracy) == 0 && Double.compare(this.verticalAccuracy, c14814b.verticalAccuracy) == 0 && this.timestamp == c14814b.timestamp;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.latitude) * 31, 31, this.longitude), 31, this.altitude), 31, this.horizontalAccuracy), 31, this.verticalAccuracy);
    }

    public String toString() {
        double d3 = this.latitude;
        double d14 = this.longitude;
        double d15 = this.altitude;
        double d16 = this.horizontalAccuracy;
        double d17 = this.verticalAccuracy;
        long j7 = this.timestamp;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("LocationData(latitude=", d3, ", longitude=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", altitude=", d15, ", horizontalAccuracy=");
        sbM8306s.append(d16);
        AbstractC31061c.m95622B(sbM8306s, ", verticalAccuracy=", d17, ", timestamp=");
        return AbstractC11266d.m30457k(j7, ")", sbM8306s);
    }
}
