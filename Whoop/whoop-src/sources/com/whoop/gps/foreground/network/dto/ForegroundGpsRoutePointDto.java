package com.whoop.gps.foreground.network.dto;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, m65681d2 = {"Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRoutePointDto;", "", "", "latitude", "longitude", "altitude", "horizontalAccuracyMeters", "verticalAccuracyMeters", "<init>", "(DDDDD)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$gps_tracking_release", "(Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRoutePointDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "component3", "component4", "component5", "copy", "(DDDDD)Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRoutePointDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLatitude", "getLongitude", "getAltitude", "getHorizontalAccuracyMeters", "getVerticalAccuracyMeters", "Companion", "$serializer", "a", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ForegroundGpsRoutePointDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double altitude;
    private final double horizontalAccuracyMeters;
    private final double latitude;
    private final double longitude;
    private final double verticalAccuracyMeters;

    /* JADX INFO: renamed from: com.whoop.gps.foreground.network.dto.ForegroundGpsRoutePointDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRoutePointDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRoutePointDto;", "serializer", "()Lwc3/c;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ForegroundGpsRoutePointDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ForegroundGpsRoutePointDto(double d3, double d14, double d15, double d16, double d17) {
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracyMeters = d16;
        this.verticalAccuracyMeters = d17;
    }

    public static /* synthetic */ ForegroundGpsRoutePointDto copy$default(ForegroundGpsRoutePointDto foregroundGpsRoutePointDto, double d3, double d14, double d15, double d16, double d17, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = foregroundGpsRoutePointDto.latitude;
        }
        double d18 = d3;
        if ((i13 & 2) != 0) {
            d14 = foregroundGpsRoutePointDto.longitude;
        }
        return foregroundGpsRoutePointDto.copy(d18, d14, (i13 & 4) != 0 ? foregroundGpsRoutePointDto.altitude : d15, (i13 & 8) != 0 ? foregroundGpsRoutePointDto.horizontalAccuracyMeters : d16, (i13 & 16) != 0 ? foregroundGpsRoutePointDto.verticalAccuracyMeters : d17);
    }

    public static final /* synthetic */ void write$Self$gps_tracking_release(ForegroundGpsRoutePointDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.latitude);
        output.encodeDoubleElement(serialDesc, 1, self.longitude);
        output.encodeDoubleElement(serialDesc, 2, self.altitude);
        output.encodeDoubleElement(serialDesc, 3, self.horizontalAccuracyMeters);
        output.encodeDoubleElement(serialDesc, 4, self.verticalAccuracyMeters);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getHorizontalAccuracyMeters() {
        return this.horizontalAccuracyMeters;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters;
    }

    public final ForegroundGpsRoutePointDto copy(double latitude, double longitude, double altitude, double horizontalAccuracyMeters, double verticalAccuracyMeters) {
        return new ForegroundGpsRoutePointDto(latitude, longitude, altitude, horizontalAccuracyMeters, verticalAccuracyMeters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForegroundGpsRoutePointDto)) {
            return false;
        }
        ForegroundGpsRoutePointDto foregroundGpsRoutePointDto = (ForegroundGpsRoutePointDto) other;
        return Double.compare(this.latitude, foregroundGpsRoutePointDto.latitude) == 0 && Double.compare(this.longitude, foregroundGpsRoutePointDto.longitude) == 0 && Double.compare(this.altitude, foregroundGpsRoutePointDto.altitude) == 0 && Double.compare(this.horizontalAccuracyMeters, foregroundGpsRoutePointDto.horizontalAccuracyMeters) == 0 && Double.compare(this.verticalAccuracyMeters, foregroundGpsRoutePointDto.verticalAccuracyMeters) == 0;
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

    public final double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters;
    }

    public int hashCode() {
        return Double.hashCode(this.verticalAccuracyMeters) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.latitude) * 31, 31, this.longitude), 31, this.altitude), 31, this.horizontalAccuracyMeters);
    }

    public String toString() {
        double d3 = this.latitude;
        double d14 = this.longitude;
        double d15 = this.altitude;
        double d16 = this.horizontalAccuracyMeters;
        double d17 = this.verticalAccuracyMeters;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("ForegroundGpsRoutePointDto(latitude=", d3, ", longitude=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", altitude=", d15, ", horizontalAccuracyMeters=");
        sbM8306s.append(d16);
        sbM8306s.append(", verticalAccuracyMeters=");
        sbM8306s.append(d17);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }

    public /* synthetic */ ForegroundGpsRoutePointDto(int i13, double d3, double d14, double d15, double d16, double d17, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ForegroundGpsRoutePointDto$$serializer.INSTANCE.getDescriptor());
        }
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracyMeters = d16;
        this.verticalAccuracyMeters = d17;
    }
}
