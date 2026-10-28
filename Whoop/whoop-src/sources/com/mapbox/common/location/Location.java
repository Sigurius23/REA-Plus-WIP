package com.mapbox.common.location;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Location implements Serializable {
    private Double altitude;
    private Double bearing;
    private Double bearingAccuracy;
    private final Value extra;
    private Long floor;
    private Double horizontalAccuracy;
    private final double latitude;
    private final double longitude;
    private Long monotonicTimestamp;
    private String source;
    private Double speed;
    private Double speedAccuracy;
    private final long timestamp;
    private Double verticalAccuracy;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private Double altitude;
        private Double bearing;
        private Double bearingAccuracy;
        private Value extra;
        private Long floor;
        private Double horizontalAccuracy;
        private double latitude;
        private double longitude;
        private Long monotonicTimestamp;
        private String source;
        private Double speed;
        private Double speedAccuracy;
        private long timestamp;
        private Double verticalAccuracy;

        public Builder altitude(Double d3) {
            this.altitude = d3;
            return this;
        }

        public Builder bearing(Double d3) {
            this.bearing = d3;
            return this;
        }

        public Builder bearingAccuracy(Double d3) {
            this.bearingAccuracy = d3;
            return this;
        }

        public Location build() {
            return new Location(this.latitude, this.longitude, this.timestamp, this.monotonicTimestamp, this.altitude, this.horizontalAccuracy, this.verticalAccuracy, this.speed, this.speedAccuracy, this.bearing, this.bearingAccuracy, this.floor, this.source, this.extra);
        }

        public Builder extra(Value value) {
            this.extra = value;
            return this;
        }

        public Builder floor(Long l7) {
            this.floor = l7;
            return this;
        }

        public Builder horizontalAccuracy(Double d3) {
            this.horizontalAccuracy = d3;
            return this;
        }

        public Builder latitude(double d3) {
            this.latitude = d3;
            return this;
        }

        public Builder longitude(double d3) {
            this.longitude = d3;
            return this;
        }

        public Builder monotonicTimestamp(Long l7) {
            this.monotonicTimestamp = l7;
            return this;
        }

        public Builder source(String str) {
            this.source = str;
            return this;
        }

        public Builder speed(Double d3) {
            this.speed = d3;
            return this;
        }

        public Builder speedAccuracy(Double d3) {
            this.speedAccuracy = d3;
            return this;
        }

        public Builder timestamp(long j7) {
            this.timestamp = j7;
            return this;
        }

        public Builder verticalAccuracy(Double d3) {
            this.verticalAccuracy = d3;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Location location = (Location) obj;
        return PartialEq.compare(this.latitude, location.latitude) && PartialEq.compare(this.longitude, location.longitude) && this.timestamp == location.timestamp && Objects.equals(this.monotonicTimestamp, location.monotonicTimestamp) && Objects.equals(this.altitude, location.altitude) && Objects.equals(this.horizontalAccuracy, location.horizontalAccuracy) && Objects.equals(this.verticalAccuracy, location.verticalAccuracy) && Objects.equals(this.speed, location.speed) && Objects.equals(this.speedAccuracy, location.speedAccuracy) && Objects.equals(this.bearing, location.bearing) && Objects.equals(this.bearingAccuracy, location.bearingAccuracy) && Objects.equals(this.floor, location.floor) && Objects.equals(this.source, location.source) && Objects.equals(this.extra, location.extra);
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getBearing() {
        return this.bearing;
    }

    public Double getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    public Value getExtra() {
        return this.extra;
    }

    public Long getFloor() {
        return this.floor;
    }

    public Double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public Long getMonotonicTimestamp() {
        return this.monotonicTimestamp;
    }

    public String getSource() {
        return this.source;
    }

    public Double getSpeed() {
        return this.speed;
    }

    public Double getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public Double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.latitude), Double.valueOf(this.longitude), Long.valueOf(this.timestamp), this.monotonicTimestamp, this.altitude, this.horizontalAccuracy, this.verticalAccuracy, this.speed, this.speedAccuracy, this.bearing, this.bearingAccuracy, this.floor, this.source, this.extra);
    }

    public void setAltitude(Double d3) {
        this.altitude = d3;
    }

    public void setBearing(Double d3) {
        this.bearing = d3;
    }

    public void setBearingAccuracy(Double d3) {
        this.bearingAccuracy = d3;
    }

    public void setFloor(Long l7) {
        this.floor = l7;
    }

    public void setHorizontalAccuracy(Double d3) {
        this.horizontalAccuracy = d3;
    }

    public void setMonotonicTimestamp(Long l7) {
        this.monotonicTimestamp = l7;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSpeed(Double d3) {
        this.speed = d3;
    }

    public void setSpeedAccuracy(Double d3) {
        this.speedAccuracy = d3;
    }

    public void setVerticalAccuracy(Double d3) {
        this.verticalAccuracy = d3;
    }

    public Builder toBuilder() {
        return new Builder().latitude(this.latitude).longitude(this.longitude).timestamp(this.timestamp).monotonicTimestamp(this.monotonicTimestamp).altitude(this.altitude).horizontalAccuracy(this.horizontalAccuracy).verticalAccuracy(this.verticalAccuracy).speed(this.speed).speedAccuracy(this.speedAccuracy).bearing(this.bearing).bearingAccuracy(this.bearingAccuracy).floor(this.floor).source(this.source).extra(this.extra);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[latitude: ");
        AbstractC3855a.m11835s(this.latitude, ", longitude: ", sb4);
        AbstractC3855a.m11835s(this.longitude, ", timestamp: ", sb4);
        AbstractC3855a.m11836t(this.timestamp, ", monotonicTimestamp: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.monotonicTimestamp));
        sb4.append(", altitude: ");
        sb4.append(RecordUtils.fieldToString(this.altitude));
        sb4.append(", horizontalAccuracy: ");
        sb4.append(RecordUtils.fieldToString(this.horizontalAccuracy));
        sb4.append(", verticalAccuracy: ");
        sb4.append(RecordUtils.fieldToString(this.verticalAccuracy));
        sb4.append(", speed: ");
        sb4.append(RecordUtils.fieldToString(this.speed));
        sb4.append(", speedAccuracy: ");
        sb4.append(RecordUtils.fieldToString(this.speedAccuracy));
        sb4.append(", bearing: ");
        sb4.append(RecordUtils.fieldToString(this.bearing));
        sb4.append(", bearingAccuracy: ");
        sb4.append(RecordUtils.fieldToString(this.bearingAccuracy));
        sb4.append(", floor: ");
        sb4.append(RecordUtils.fieldToString(this.floor));
        sb4.append(", source: ");
        AbstractC3855a.m11838v(this.source, ", extra: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.extra));
        sb4.append("]");
        return sb4.toString();
    }

    private Location(double d3, double d14, long j7, Long l7, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Long l12, String str, Value value) {
        this.latitude = d3;
        this.longitude = d14;
        this.timestamp = j7;
        this.monotonicTimestamp = l7;
        this.altitude = d15;
        this.horizontalAccuracy = d16;
        this.verticalAccuracy = d17;
        this.speed = d18;
        this.speedAccuracy = d19;
        this.bearing = d24;
        this.bearingAccuracy = d25;
        this.floor = l12;
        this.source = str;
        this.extra = value;
    }
}
