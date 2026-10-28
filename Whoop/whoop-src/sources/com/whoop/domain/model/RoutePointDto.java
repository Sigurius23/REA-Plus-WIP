package com.whoop.domain.model;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u0019¨\u00064"}, m65681d2 = {"Lcom/whoop/domain/model/RoutePointDto;", "", "", "latitude", "longitude", "altitude", "horizontalAccuracy", FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/RoutePointDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/whoop/domain/model/RoutePointDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getLatitude", "getLongitude", "getAltitude", "getHorizontalAccuracy", "getHorizontalAccuracy$annotations", "()V", "getVerticalAccuracy", "getVerticalAccuracy$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RoutePointDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double altitude;
    private final Double horizontalAccuracy;
    private final Double latitude;
    private final Double longitude;
    private final Double verticalAccuracy;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/RoutePointDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/RoutePointDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RoutePointDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RoutePointDto() {
        this((Double) null, (Double) null, (Double) null, (Double) null, (Double) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RoutePointDto copy$default(RoutePointDto routePointDto, Double d3, Double d14, Double d15, Double d16, Double d17, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = routePointDto.latitude;
        }
        if ((i13 & 2) != 0) {
            d14 = routePointDto.longitude;
        }
        if ((i13 & 4) != 0) {
            d15 = routePointDto.altitude;
        }
        if ((i13 & 8) != 0) {
            d16 = routePointDto.horizontalAccuracy;
        }
        if ((i13 & 16) != 0) {
            d17 = routePointDto.verticalAccuracy;
        }
        Double d18 = d17;
        Double d19 = d15;
        return routePointDto.copy(d3, d14, d19, d16, d18);
    }

    @InterfaceC37143h("horizontal_accuracy_meters")
    public static /* synthetic */ void getHorizontalAccuracy$annotations() {
    }

    @InterfaceC37143h("vertical_accuracy_meters")
    public static /* synthetic */ void getVerticalAccuracy$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(RoutePointDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.latitude != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.latitude);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.longitude != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, DoubleSerializer.INSTANCE, self.longitude);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.altitude != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, DoubleSerializer.INSTANCE, self.altitude);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.horizontalAccuracy != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, DoubleSerializer.INSTANCE, self.horizontalAccuracy);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.verticalAccuracy == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, DoubleSerializer.INSTANCE, self.verticalAccuracy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public final RoutePointDto copy(Double latitude, Double longitude, Double altitude, Double horizontalAccuracy, Double verticalAccuracy) {
        return new RoutePointDto(latitude, longitude, altitude, horizontalAccuracy, verticalAccuracy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoutePointDto)) {
            return false;
        }
        RoutePointDto routePointDto = (RoutePointDto) other;
        return AbstractC22676k.m65745e(this.latitude, routePointDto.latitude) && AbstractC22676k.m65745e(this.longitude, routePointDto.longitude) && AbstractC22676k.m65745e(this.altitude, routePointDto.altitude) && AbstractC22676k.m65745e(this.horizontalAccuracy, routePointDto.horizontalAccuracy) && AbstractC22676k.m65745e(this.verticalAccuracy, routePointDto.verticalAccuracy);
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    public final Double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        Double d3 = this.latitude;
        int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
        Double d14 = this.longitude;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.altitude;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.horizontalAccuracy;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.verticalAccuracy;
        return iHashCode4 + (d17 != null ? d17.hashCode() : 0);
    }

    public String toString() {
        Double d3 = this.latitude;
        Double d14 = this.longitude;
        Double d15 = this.altitude;
        Double d16 = this.horizontalAccuracy;
        Double d17 = this.verticalAccuracy;
        StringBuilder sb4 = new StringBuilder("RoutePointDto(latitude=");
        sb4.append(d3);
        sb4.append(", longitude=");
        sb4.append(d14);
        sb4.append(", altitude=");
        AbstractC21702c.m61146q(sb4, d15, ", horizontalAccuracy=", d16, ", verticalAccuracy=");
        sb4.append(d17);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ RoutePointDto(int i13, Double d3, Double d14, Double d15, Double d16, Double d17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.latitude = null;
        } else {
            this.latitude = d3;
        }
        if ((i13 & 2) == 0) {
            this.longitude = null;
        } else {
            this.longitude = d14;
        }
        if ((i13 & 4) == 0) {
            this.altitude = null;
        } else {
            this.altitude = d15;
        }
        if ((i13 & 8) == 0) {
            this.horizontalAccuracy = null;
        } else {
            this.horizontalAccuracy = d16;
        }
        if ((i13 & 16) == 0) {
            this.verticalAccuracy = null;
        } else {
            this.verticalAccuracy = d17;
        }
    }

    public RoutePointDto(Double d3, Double d14, Double d15, Double d16, Double d17) {
        this.latitude = d3;
        this.longitude = d14;
        this.altitude = d15;
        this.horizontalAccuracy = d16;
        this.verticalAccuracy = d17;
    }

    public /* synthetic */ RoutePointDto(Double d3, Double d14, Double d15, Double d16, Double d17, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : d3, (i13 & 2) != 0 ? null : d14, (i13 & 4) != 0 ? null : d15, (i13 & 8) != 0 ? null : d16, (i13 & 16) != 0 ? null : d17);
    }
}
