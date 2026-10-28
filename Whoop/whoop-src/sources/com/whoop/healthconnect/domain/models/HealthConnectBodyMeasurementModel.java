package com.whoop.healthconnect.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJN\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001c¨\u00068"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "", "", "type", "", "value", "timestamp", "zoneOffset", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "metadata", "deviceZoneId", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "component5", "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "component6", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "D", "getValue", "getTimestamp", "getZoneOffset", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "getMetadata", "getDeviceZoneId", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectBodyMeasurementModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("device_zone_id")
    private final String deviceZoneId;

    @SerializedName("metadata")
    private final HealthConnectMetadataModel metadata;

    @SerializedName("timestamp")
    private final String timestamp;

    @SerializedName("type")
    private final String type;

    @SerializedName("value")
    private final double value;

    @SerializedName("zone_offset")
    private final String zoneOffset;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectBodyMeasurementModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthConnectBodyMeasurementModel(int i13, String str, double d3, String str2, String str3, HealthConnectMetadataModel healthConnectMetadataModel, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, HealthConnectBodyMeasurementModel$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.value = d3;
        this.timestamp = str2;
        this.zoneOffset = str3;
        this.metadata = healthConnectMetadataModel;
        this.deviceZoneId = str4;
    }

    public static /* synthetic */ HealthConnectBodyMeasurementModel copy$default(HealthConnectBodyMeasurementModel healthConnectBodyMeasurementModel, String str, double d3, String str2, String str3, HealthConnectMetadataModel healthConnectMetadataModel, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthConnectBodyMeasurementModel.type;
        }
        if ((i13 & 2) != 0) {
            d3 = healthConnectBodyMeasurementModel.value;
        }
        if ((i13 & 4) != 0) {
            str2 = healthConnectBodyMeasurementModel.timestamp;
        }
        if ((i13 & 8) != 0) {
            str3 = healthConnectBodyMeasurementModel.zoneOffset;
        }
        if ((i13 & 16) != 0) {
            healthConnectMetadataModel = healthConnectBodyMeasurementModel.metadata;
        }
        if ((i13 & 32) != 0) {
            str4 = healthConnectBodyMeasurementModel.deviceZoneId;
        }
        return healthConnectBodyMeasurementModel.copy(str, d3, str2, str3, healthConnectMetadataModel, str4);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectBodyMeasurementModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeDoubleElement(serialDesc, 1, self.value);
        output.encodeStringElement(serialDesc, 2, self.timestamp);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.zoneOffset);
        output.encodeSerializableElement(serialDesc, 4, HealthConnectMetadataModel$$serializer.INSTANCE, self.metadata);
        output.encodeStringElement(serialDesc, 5, self.deviceZoneId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getZoneOffset() {
        return this.zoneOffset;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceZoneId() {
        return this.deviceZoneId;
    }

    public final HealthConnectBodyMeasurementModel copy(String type, double value, String timestamp, String zoneOffset, HealthConnectMetadataModel metadata, String deviceZoneId) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(deviceZoneId, "deviceZoneId");
        return new HealthConnectBodyMeasurementModel(type, value, timestamp, zoneOffset, metadata, deviceZoneId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectBodyMeasurementModel)) {
            return false;
        }
        HealthConnectBodyMeasurementModel healthConnectBodyMeasurementModel = (HealthConnectBodyMeasurementModel) other;
        return AbstractC22676k.m65745e(this.type, healthConnectBodyMeasurementModel.type) && Double.compare(this.value, healthConnectBodyMeasurementModel.value) == 0 && AbstractC22676k.m65745e(this.timestamp, healthConnectBodyMeasurementModel.timestamp) && AbstractC22676k.m65745e(this.zoneOffset, healthConnectBodyMeasurementModel.zoneOffset) && AbstractC22676k.m65745e(this.metadata, healthConnectBodyMeasurementModel.metadata) && AbstractC22676k.m65745e(this.deviceZoneId, healthConnectBodyMeasurementModel.deviceZoneId);
    }

    public final String getDeviceZoneId() {
        return this.deviceZoneId;
    }

    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final double getValue() {
        return this.value;
    }

    public final String getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC17176i.m48499a(this.type.hashCode() * 31, 31, this.value), 31, this.timestamp);
        String str = this.zoneOffset;
        return this.deviceZoneId.hashCode() + ((this.metadata.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        String str = this.type;
        double d3 = this.value;
        String str2 = this.timestamp;
        String str3 = this.zoneOffset;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        String str4 = this.deviceZoneId;
        StringBuilder sb4 = new StringBuilder("HealthConnectBodyMeasurementModel(type=");
        sb4.append(str);
        sb4.append(", value=");
        sb4.append(d3);
        AbstractC11266d.m30444B(sb4, ", timestamp=", str2, ", zoneOffset=", str3);
        sb4.append(", metadata=");
        sb4.append(healthConnectMetadataModel);
        sb4.append(", deviceZoneId=");
        sb4.append(str4);
        sb4.append(")");
        return sb4.toString();
    }

    public HealthConnectBodyMeasurementModel(String type, double d3, String timestamp, String str, HealthConnectMetadataModel metadata, String deviceZoneId) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(deviceZoneId, "deviceZoneId");
        this.type = type;
        this.value = d3;
        this.timestamp = timestamp;
        this.zoneOffset = str;
        this.metadata = metadata;
        this.deviceZoneId = deviceZoneId;
    }
}
