package com.whoop.gps.upload.dto;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yb0.AbstractC39383f;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jd\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010)J\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b9\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b:\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/gps/upload/dto/GpsUploadModel;", "", "", "timestamp", "", "latitude", "longitude", "altitude", "horizontalAccuracyMeters", "verticalAccuracyMeters", "Lcom/whoop/gps/upload/dto/SpeedDataModel;", "speed", "", "trigger", "<init>", "(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$gps_tracking_release", "(Lcom/whoop/gps/upload/dto/GpsUploadModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "()D", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/gps/upload/dto/SpeedDataModel;", "component8", "()Ljava/lang/String;", "copy", "(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)Lcom/whoop/gps/upload/dto/GpsUploadModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "D", "getLatitude", "getLongitude", "getAltitude", "getHorizontalAccuracyMeters", "getVerticalAccuracyMeters", "Lcom/whoop/gps/upload/dto/SpeedDataModel;", "getSpeed", "Ljava/lang/String;", "getTrigger", "Companion", "$serializer", "a", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GpsUploadModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double altitude;
    private final double horizontalAccuracyMeters;
    private final double latitude;
    private final double longitude;
    private final SpeedDataModel speed;
    private final long timestamp;
    private final String trigger;
    private final double verticalAccuracyMeters;

    /* JADX INFO: renamed from: com.whoop.gps.upload.dto.GpsUploadModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/gps/upload/dto/GpsUploadModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/gps/upload/dto/GpsUploadModel;", "serializer", "()Lwc3/c;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GpsUploadModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GpsUploadModel(int i13, long j7, double d3, double d14, double d15, double d16, double d17, SpeedDataModel speedDataModel, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, GpsUploadModel$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = j7;
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracyMeters = d16;
        this.verticalAccuracyMeters = d17;
        if ((i13 & 64) == 0) {
            this.speed = null;
        } else {
            this.speed = speedDataModel;
        }
        if ((i13 & 128) == 0) {
            this.trigger = null;
        } else {
            this.trigger = str;
        }
    }

    public static final /* synthetic */ void write$Self$gps_tracking_release(GpsUploadModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.timestamp);
        output.encodeDoubleElement(serialDesc, 1, self.latitude);
        output.encodeDoubleElement(serialDesc, 2, self.longitude);
        output.encodeDoubleElement(serialDesc, 3, self.altitude);
        output.encodeDoubleElement(serialDesc, 4, self.horizontalAccuracyMeters);
        output.encodeDoubleElement(serialDesc, 5, self.verticalAccuracyMeters);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.speed != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, SpeedDataModel$$serializer.INSTANCE, self.speed);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.trigger == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.trigger);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
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
    public final double getHorizontalAccuracyMeters() {
        return this.horizontalAccuracyMeters;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SpeedDataModel getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTrigger() {
        return this.trigger;
    }

    public final GpsUploadModel copy(long timestamp, double latitude, double longitude, double altitude, double horizontalAccuracyMeters, double verticalAccuracyMeters, SpeedDataModel speed, String trigger) {
        return new GpsUploadModel(timestamp, latitude, longitude, altitude, horizontalAccuracyMeters, verticalAccuracyMeters, speed, trigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsUploadModel)) {
            return false;
        }
        GpsUploadModel gpsUploadModel = (GpsUploadModel) other;
        return this.timestamp == gpsUploadModel.timestamp && Double.compare(this.latitude, gpsUploadModel.latitude) == 0 && Double.compare(this.longitude, gpsUploadModel.longitude) == 0 && Double.compare(this.altitude, gpsUploadModel.altitude) == 0 && Double.compare(this.horizontalAccuracyMeters, gpsUploadModel.horizontalAccuracyMeters) == 0 && Double.compare(this.verticalAccuracyMeters, gpsUploadModel.verticalAccuracyMeters) == 0 && AbstractC22676k.m65745e(this.speed, gpsUploadModel.speed) && AbstractC22676k.m65745e(this.trigger, gpsUploadModel.trigger);
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final double getHorizontalAccuracyMeters() {
        return this.horizontalAccuracyMeters;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final SpeedDataModel getSpeed() {
        return this.speed;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public final double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Long.hashCode(this.timestamp) * 31, 31, this.latitude), 31, this.longitude), 31, this.altitude), 31, this.horizontalAccuracyMeters), 31, this.verticalAccuracyMeters);
        SpeedDataModel speedDataModel = this.speed;
        int iHashCode = (iM48499a + (speedDataModel == null ? 0 : speedDataModel.hashCode())) * 31;
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
        SpeedDataModel speedDataModel = this.speed;
        String str = this.trigger;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "GpsUploadModel(timestamp=", ", latitude=");
        sbM125596b.append(d3);
        AbstractC31061c.m95622B(sbM125596b, ", longitude=", d14, ", altitude=");
        sbM125596b.append(d15);
        AbstractC31061c.m95622B(sbM125596b, ", horizontalAccuracyMeters=", d16, ", verticalAccuracyMeters=");
        sbM125596b.append(d17);
        sbM125596b.append(", speed=");
        sbM125596b.append(speedDataModel);
        return AbstractC2875y.m8304q(sbM125596b, ", trigger=", str, ")");
    }

    public GpsUploadModel(long j7, double d3, double d14, double d15, double d16, double d17, SpeedDataModel speedDataModel, String str) {
        this.timestamp = j7;
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracyMeters = d16;
        this.verticalAccuracyMeters = d17;
        this.speed = speedDataModel;
        this.trigger = str;
    }

    public /* synthetic */ GpsUploadModel(long j7, double d3, double d14, double d15, double d16, double d17, SpeedDataModel speedDataModel, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, d3, d14, d15, d16, d17, (i13 & 64) != 0 ? null : speedDataModel, (i13 & 128) != 0 ? null : str);
    }
}
