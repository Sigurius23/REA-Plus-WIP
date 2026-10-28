package com.whoop.data.local.room.entity;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import hc3.AbstractC17176i;
import p715kotlin.Metadata;
import p92.C29019h;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import yb0.AbstractC39383f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012JL\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010&R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010*R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010*R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010*R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010'\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010*R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010'\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010*¨\u00063"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/GpsDto;", "", "", "timeStamp", "", "latitude", "longitude", "altitude", "horizontalAccuracy", FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, "<init>", "(JDDDDD)V", "Lp92/h$a;", "toRoutePoint", "()Lp92/h$a;", "component1", "()J", "component2", "()D", "component3", "component4", "component5", "component6", "copy", "(JDDDDD)Lcom/whoop/data/local/room/entity/GpsDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimeStamp", "setTimeStamp", "(J)V", "D", "getLatitude", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getAltitude", "setAltitude", "getHorizontalAccuracy", "setHorizontalAccuracy", "getVerticalAccuracy", "setVerticalAccuracy", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class GpsDto {
    private double altitude;
    private double horizontalAccuracy;
    private double latitude;
    private double longitude;
    private long timeStamp;
    private double verticalAccuracy;

    public GpsDto(long j7, double d3, double d14, double d15, double d16, double d17) {
        this.timeStamp = j7;
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracy = d16;
        this.verticalAccuracy = d17;
    }

    public static /* synthetic */ GpsDto copy$default(GpsDto gpsDto, long j7, double d3, double d14, double d15, double d16, double d17, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = gpsDto.timeStamp;
        }
        return gpsDto.copy(j7, (i13 & 2) != 0 ? gpsDto.latitude : d3, (i13 & 4) != 0 ? gpsDto.longitude : d14, (i13 & 8) != 0 ? gpsDto.altitude : d15, (i13 & 16) != 0 ? gpsDto.horizontalAccuracy : d16, (i13 & 32) != 0 ? gpsDto.verticalAccuracy : d17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public final GpsDto copy(long timeStamp, double latitude, double longitude, double altitude, double horizontalAccuracy, double verticalAccuracy) {
        return new GpsDto(timeStamp, latitude, longitude, altitude, horizontalAccuracy, verticalAccuracy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsDto)) {
            return false;
        }
        GpsDto gpsDto = (GpsDto) other;
        return this.timeStamp == gpsDto.timeStamp && Double.compare(this.latitude, gpsDto.latitude) == 0 && Double.compare(this.longitude, gpsDto.longitude) == 0 && Double.compare(this.altitude, gpsDto.altitude) == 0 && Double.compare(this.horizontalAccuracy, gpsDto.horizontalAccuracy) == 0 && Double.compare(this.verticalAccuracy, gpsDto.verticalAccuracy) == 0;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        return Double.hashCode(this.verticalAccuracy) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Long.hashCode(this.timeStamp) * 31, 31, this.latitude), 31, this.longitude), 31, this.altitude), 31, this.horizontalAccuracy);
    }

    public final void setAltitude(double d3) {
        this.altitude = d3;
    }

    public final void setHorizontalAccuracy(double d3) {
        this.horizontalAccuracy = d3;
    }

    public final void setLatitude(double d3) {
        this.latitude = d3;
    }

    public final void setLongitude(double d3) {
        this.longitude = d3;
    }

    public final void setTimeStamp(long j7) {
        this.timeStamp = j7;
    }

    public final void setVerticalAccuracy(double d3) {
        this.verticalAccuracy = d3;
    }

    public final C29019h.a toRoutePoint() {
        Location location = new Location(GpsDtoKt.LOCATION_PROVIDER);
        location.setLatitude(this.latitude);
        location.setLongitude(this.longitude);
        location.setAltitude(this.altitude);
        location.setAccuracy((float) this.horizontalAccuracy);
        location.setVerticalAccuracyMeters((float) this.verticalAccuracy);
        return new C29019h.a(location, this.timeStamp);
    }

    public String toString() {
        long j7 = this.timeStamp;
        double d3 = this.latitude;
        double d14 = this.longitude;
        double d15 = this.altitude;
        double d16 = this.horizontalAccuracy;
        double d17 = this.verticalAccuracy;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "GpsDto(timeStamp=", ", latitude=");
        sbM125596b.append(d3);
        AbstractC31061c.m95622B(sbM125596b, ", longitude=", d14, ", altitude=");
        sbM125596b.append(d15);
        AbstractC31061c.m95622B(sbM125596b, ", horizontalAccuracy=", d16, ", verticalAccuracy=");
        return AbstractC30007c.m91836f(d17, ")", sbM125596b);
    }
}
