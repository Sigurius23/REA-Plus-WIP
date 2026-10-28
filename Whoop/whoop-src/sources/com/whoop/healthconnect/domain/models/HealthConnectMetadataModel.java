package com.whoop.healthconnect.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p336n7.C26413c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 JV\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u0010 ¨\u0006>"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "", "", "id", "clientRecordId", "", "clientRecordVersion", "Lcom/whoop/healthconnect/domain/models/DeviceModel;", "device", "Lcom/whoop/healthconnect/domain/models/DataOriginModel;", "dataOrigin", "lastModifiedTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ln7/c;", "toHealthConnectMetadata", "()Ln7/c;", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "()Lcom/whoop/healthconnect/domain/models/DeviceModel;", "component5", "()Lcom/whoop/healthconnect/domain/models/DataOriginModel;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getClientRecordId", "J", "getClientRecordVersion", "Lcom/whoop/healthconnect/domain/models/DeviceModel;", "getDevice", "Lcom/whoop/healthconnect/domain/models/DataOriginModel;", "getDataOrigin", "getLastModifiedTime", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectMetadataModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("client_record_id")
    private final String clientRecordId;

    @SerializedName("client_record_version")
    private final long clientRecordVersion;

    @SerializedName("data_origin")
    private final DataOriginModel dataOrigin;

    @SerializedName("device")
    private final DeviceModel device;

    @SerializedName("id")
    private final String id;

    @SerializedName("last_modified_time")
    private final String lastModifiedTime;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectMetadataModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthConnectMetadataModel(int i13, String str, String str2, long j7, DeviceModel deviceModel, DataOriginModel dataOriginModel, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, HealthConnectMetadataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.clientRecordId = str2;
        this.clientRecordVersion = j7;
        this.device = deviceModel;
        this.dataOrigin = dataOriginModel;
        this.lastModifiedTime = str3;
    }

    public static /* synthetic */ HealthConnectMetadataModel copy$default(HealthConnectMetadataModel healthConnectMetadataModel, String str, String str2, long j7, DeviceModel deviceModel, DataOriginModel dataOriginModel, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthConnectMetadataModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = healthConnectMetadataModel.clientRecordId;
        }
        if ((i13 & 4) != 0) {
            j7 = healthConnectMetadataModel.clientRecordVersion;
        }
        if ((i13 & 8) != 0) {
            deviceModel = healthConnectMetadataModel.device;
        }
        if ((i13 & 16) != 0) {
            dataOriginModel = healthConnectMetadataModel.dataOrigin;
        }
        if ((i13 & 32) != 0) {
            str3 = healthConnectMetadataModel.lastModifiedTime;
        }
        String str4 = str3;
        DeviceModel deviceModel2 = deviceModel;
        long j13 = j7;
        return healthConnectMetadataModel.copy(str, str2, j13, deviceModel2, dataOriginModel, str4);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectMetadataModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.clientRecordId);
        output.encodeLongElement(serialDesc, 2, self.clientRecordVersion);
        output.encodeNullableSerializableElement(serialDesc, 3, DeviceModel$$serializer.INSTANCE, self.device);
        output.encodeNullableSerializableElement(serialDesc, 4, DataOriginModel$$serializer.INSTANCE, self.dataOrigin);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.lastModifiedTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientRecordId() {
        return this.clientRecordId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getClientRecordVersion() {
        return this.clientRecordVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DeviceModel getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DataOriginModel getDataOrigin() {
        return this.dataOrigin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public final HealthConnectMetadataModel copy(String id4, String clientRecordId, long clientRecordVersion, DeviceModel device, DataOriginModel dataOrigin, String lastModifiedTime) {
        return new HealthConnectMetadataModel(id4, clientRecordId, clientRecordVersion, device, dataOrigin, lastModifiedTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectMetadataModel)) {
            return false;
        }
        HealthConnectMetadataModel healthConnectMetadataModel = (HealthConnectMetadataModel) other;
        return AbstractC22676k.m65745e(this.id, healthConnectMetadataModel.id) && AbstractC22676k.m65745e(this.clientRecordId, healthConnectMetadataModel.clientRecordId) && this.clientRecordVersion == healthConnectMetadataModel.clientRecordVersion && AbstractC22676k.m65745e(this.device, healthConnectMetadataModel.device) && AbstractC22676k.m65745e(this.dataOrigin, healthConnectMetadataModel.dataOrigin) && AbstractC22676k.m65745e(this.lastModifiedTime, healthConnectMetadataModel.lastModifiedTime);
    }

    public final String getClientRecordId() {
        return this.clientRecordId;
    }

    public final long getClientRecordVersion() {
        return this.clientRecordVersion;
    }

    public final DataOriginModel getDataOrigin() {
        return this.dataOrigin;
    }

    public final DeviceModel getDevice() {
        return this.device;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientRecordId;
        int iM30451e = AbstractC11266d.m30451e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.clientRecordVersion, 31);
        DeviceModel deviceModel = this.device;
        int iHashCode2 = (iM30451e + (deviceModel == null ? 0 : deviceModel.hashCode())) * 31;
        DataOriginModel dataOriginModel = this.dataOrigin;
        int iHashCode3 = (iHashCode2 + (dataOriginModel == null ? 0 : dataOriginModel.hashCode())) * 31;
        String str3 = this.lastModifiedTime;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final C26413c toHealthConnectMetadata() {
        return new C26413c(103, this.clientRecordId, this.clientRecordVersion);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.clientRecordId;
        long j7 = this.clientRecordVersion;
        DeviceModel deviceModel = this.device;
        DataOriginModel dataOriginModel = this.dataOrigin;
        String str3 = this.lastModifiedTime;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthConnectMetadataModel(id=", str, ", clientRecordId=", str2, ", clientRecordVersion=");
        sbM32001t.append(j7);
        sbM32001t.append(", device=");
        sbM32001t.append(deviceModel);
        sbM32001t.append(", dataOrigin=");
        sbM32001t.append(dataOriginModel);
        sbM32001t.append(", lastModifiedTime=");
        sbM32001t.append(str3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HealthConnectMetadataModel(String str, String str2, long j7, DeviceModel deviceModel, DataOriginModel dataOriginModel, String str3) {
        this.id = str;
        this.clientRecordId = str2;
        this.clientRecordVersion = j7;
        this.device = deviceModel;
        this.dataOrigin = dataOriginModel;
        this.lastModifiedTime = str3;
    }
}
