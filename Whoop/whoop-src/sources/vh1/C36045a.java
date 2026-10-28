package vh1;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import yb0.AbstractC39383f;
import yh1.C39540a;
import yh1.C39541b;

/* JADX INFO: renamed from: vh1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u001dBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b%\u0010$R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u001d\u0010$R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b!\u0010$R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b'\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b&\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b-\u0010\u0015¨\u0006."}, m65681d2 = {"Lvh1/a;", "", "", "timestamp", "", "latitude", "longitude", "altitude", "horizontalAccuracyMeters", "verticalAccuracyMeters", "speedValue", "", "speedUnit", "speedAccuracy", "trigger", "<init>", "(JDDDDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "Lyh1/a;", "k", "()Lyh1/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()J", "b", "D", "c", "()D", "d", "e", "f", "j", "g", "Ljava/lang/Double;", "()Ljava/lang/Double;", "Ljava/lang/String;", "i", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36045a {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

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
    private final Double speedValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String speedUnit;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Double speedAccuracy;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String trigger;

    /* JADX INFO: renamed from: vh1.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lvh1/a$a;", "", "<init>", "()V", "Lyh1/a;", "location", "Lvh1/a;", "a", "(Lyh1/a;)Lvh1/a;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C36045a m114432a(C39540a location) {
            AbstractC22676k.m65750j(location, "location");
            long timestamp = location.getTimestamp();
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            double altitude = location.getAltitude();
            double horizontalAccuracyMeters = location.getHorizontalAccuracyMeters();
            double verticalAccuracyMeters = location.getVerticalAccuracyMeters();
            C39541b speed = location.getSpeed();
            Double dValueOf = speed != null ? Double.valueOf(speed.getValue()) : null;
            C39541b speed2 = location.getSpeed();
            String unit = speed2 != null ? speed2.getUnit() : null;
            C39541b speed3 = location.getSpeed();
            return new C36045a(timestamp, latitude, longitude, altitude, horizontalAccuracyMeters, verticalAccuracyMeters, dValueOf, unit, speed3 != null ? Double.valueOf(speed3.getAccuracy()) : null, location.getTrigger());
        }

        private Companion() {
        }
    }

    public C36045a(long j7, double d3, double d14, double d15, double d16, double d17, Double d18, String str, Double d19, String str2) {
        this.timestamp = j7;
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracyMeters = d16;
        this.verticalAccuracyMeters = d17;
        this.speedValue = d18;
        this.speedUnit = str;
        this.speedAccuracy = d19;
        this.trigger = str2;
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
    public final Double getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36045a)) {
            return false;
        }
        C36045a c36045a = (C36045a) other;
        return this.timestamp == c36045a.timestamp && Double.compare(this.latitude, c36045a.latitude) == 0 && Double.compare(this.longitude, c36045a.longitude) == 0 && Double.compare(this.altitude, c36045a.altitude) == 0 && Double.compare(this.horizontalAccuracyMeters, c36045a.horizontalAccuracyMeters) == 0 && Double.compare(this.verticalAccuracyMeters, c36045a.verticalAccuracyMeters) == 0 && AbstractC22676k.m65745e(this.speedValue, c36045a.speedValue) && AbstractC22676k.m65745e(this.speedUnit, c36045a.speedUnit) && AbstractC22676k.m65745e(this.speedAccuracy, c36045a.speedAccuracy) && AbstractC22676k.m65745e(this.trigger, c36045a.trigger);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSpeedUnit() {
        return this.speedUnit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getSpeedValue() {
        return this.speedValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Long.hashCode(this.timestamp) * 31, 31, this.latitude), 31, this.longitude), 31, this.altitude), 31, this.horizontalAccuracyMeters), 31, this.verticalAccuracyMeters);
        Double d3 = this.speedValue;
        int iHashCode = (iM48499a + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.speedUnit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.speedAccuracy;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str2 = this.trigger;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTrigger() {
        return this.trigger;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters;
    }

    /* JADX INFO: renamed from: k */
    public final C39540a m114431k() {
        C39541b c39541bM126318a;
        Double d3 = this.speedValue;
        if (d3 != null) {
            C39541b.Companion companion = C39541b.INSTANCE;
            double dDoubleValue = d3.doubleValue();
            String str = this.speedUnit;
            if (str == null) {
                str = "m/s";
            }
            String str2 = str;
            Double d14 = this.speedAccuracy;
            c39541bM126318a = companion.m126318a(dDoubleValue, str2, d14 != null ? d14.doubleValue() : 0.0d);
        } else {
            c39541bM126318a = null;
        }
        return new C39540a(this.timestamp, this.latitude, this.longitude, this.altitude, this.horizontalAccuracyMeters, this.verticalAccuracyMeters, c39541bM126318a, this.trigger);
    }

    public String toString() {
        long j7 = this.timestamp;
        double d3 = this.latitude;
        double d14 = this.longitude;
        double d15 = this.altitude;
        double d16 = this.horizontalAccuracyMeters;
        double d17 = this.verticalAccuracyMeters;
        Double d18 = this.speedValue;
        String str = this.speedUnit;
        Double d19 = this.speedAccuracy;
        String str2 = this.trigger;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "GpsLocationDto(timestamp=", ", latitude=");
        sbM125596b.append(d3);
        AbstractC31061c.m95622B(sbM125596b, ", longitude=", d14, ", altitude=");
        sbM125596b.append(d15);
        AbstractC31061c.m95622B(sbM125596b, ", horizontalAccuracyMeters=", d16, ", verticalAccuracyMeters=");
        sbM125596b.append(d17);
        sbM125596b.append(", speedValue=");
        sbM125596b.append(d18);
        sbM125596b.append(", speedUnit=");
        sbM125596b.append(str);
        sbM125596b.append(", speedAccuracy=");
        sbM125596b.append(d19);
        return AbstractC2875y.m8304q(sbM125596b, ", trigger=", str2, ")");
    }
}
