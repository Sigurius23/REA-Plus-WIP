package com.whoop.healthconnect.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import lj1.C24473a;
import p000.AbstractC11266d;
import p322m7.C25127a;
import p336n7.C26413c;
import p452r7.C31008e;
import p452r7.C31020k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&JR\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010!R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b6\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b7\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010&¨\u0006<"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;", "Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;", "", "kilocalories", "", "startTime", "startZoneOffset", "endTime", "endZoneOffset", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "metadata", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lm7/a;", "toRecord", "()Lm7/a;", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getKilocalories", "Ljava/lang/String;", "getStartTime", "getStartZoneOffset", "getEndTime", "getEndZoneOffset", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "getMetadata", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectActiveCaloriesBurnedModel implements HealthConnectBaseRecordModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("end_zone_offset")
    private final String endZoneOffset;

    @SerializedName("kilocalories")
    private final double kilocalories;

    @SerializedName("metadata")
    private final HealthConnectMetadataModel metadata;

    @SerializedName("start_time")
    private final String startTime;

    @SerializedName("start_zone_offset")
    private final String startZoneOffset;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectActiveCaloriesBurnedModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HealthConnectActiveCaloriesBurnedModel(double d3, String startTime, String str, String endTime, String str2, HealthConnectMetadataModel healthConnectMetadataModel) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        this.kilocalories = d3;
        this.startTime = startTime;
        this.startZoneOffset = str;
        this.endTime = endTime;
        this.endZoneOffset = str2;
        this.metadata = healthConnectMetadataModel;
    }

    public static /* synthetic */ HealthConnectActiveCaloriesBurnedModel copy$default(HealthConnectActiveCaloriesBurnedModel healthConnectActiveCaloriesBurnedModel, double d3, String str, String str2, String str3, String str4, HealthConnectMetadataModel healthConnectMetadataModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = healthConnectActiveCaloriesBurnedModel.kilocalories;
        }
        double d14 = d3;
        if ((i13 & 2) != 0) {
            str = healthConnectActiveCaloriesBurnedModel.startTime;
        }
        String str5 = str;
        if ((i13 & 4) != 0) {
            str2 = healthConnectActiveCaloriesBurnedModel.startZoneOffset;
        }
        String str6 = str2;
        if ((i13 & 8) != 0) {
            str3 = healthConnectActiveCaloriesBurnedModel.endTime;
        }
        String str7 = str3;
        if ((i13 & 16) != 0) {
            str4 = healthConnectActiveCaloriesBurnedModel.endZoneOffset;
        }
        String str8 = str4;
        if ((i13 & 32) != 0) {
            healthConnectMetadataModel = healthConnectActiveCaloriesBurnedModel.metadata;
        }
        return healthConnectActiveCaloriesBurnedModel.copy(d14, str5, str6, str7, str8, healthConnectMetadataModel);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectActiveCaloriesBurnedModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.kilocalories);
        output.encodeStringElement(serialDesc, 1, self.startTime);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.startZoneOffset);
        output.encodeStringElement(serialDesc, 3, self.endTime);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.endZoneOffset);
        output.encodeNullableSerializableElement(serialDesc, 5, HealthConnectMetadataModel$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getKilocalories() {
        return this.kilocalories;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartZoneOffset() {
        return this.startZoneOffset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEndZoneOffset() {
        return this.endZoneOffset;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final HealthConnectActiveCaloriesBurnedModel copy(double kilocalories, String startTime, String startZoneOffset, String endTime, String endZoneOffset, HealthConnectMetadataModel metadata) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        return new HealthConnectActiveCaloriesBurnedModel(kilocalories, startTime, startZoneOffset, endTime, endZoneOffset, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectActiveCaloriesBurnedModel)) {
            return false;
        }
        HealthConnectActiveCaloriesBurnedModel healthConnectActiveCaloriesBurnedModel = (HealthConnectActiveCaloriesBurnedModel) other;
        return Double.compare(this.kilocalories, healthConnectActiveCaloriesBurnedModel.kilocalories) == 0 && AbstractC22676k.m65745e(this.startTime, healthConnectActiveCaloriesBurnedModel.startTime) && AbstractC22676k.m65745e(this.startZoneOffset, healthConnectActiveCaloriesBurnedModel.startZoneOffset) && AbstractC22676k.m65745e(this.endTime, healthConnectActiveCaloriesBurnedModel.endTime) && AbstractC22676k.m65745e(this.endZoneOffset, healthConnectActiveCaloriesBurnedModel.endZoneOffset) && AbstractC22676k.m65745e(this.metadata, healthConnectActiveCaloriesBurnedModel.metadata);
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getEndZoneOffset() {
        return this.endZoneOffset;
    }

    public final double getKilocalories() {
        return this.kilocalories;
    }

    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getStartZoneOffset() {
        return this.startZoneOffset;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Double.hashCode(this.kilocalories) * 31, 31, this.startTime);
        String str = this.startZoneOffset;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.endTime);
        String str2 = this.endZoneOffset;
        int iHashCode = (iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        return iHashCode + (healthConnectMetadataModel != null ? healthConnectMetadataModel.hashCode() : 0);
    }

    public String toString() {
        double d3 = this.kilocalories;
        String str = this.startTime;
        String str2 = this.startZoneOffset;
        String str3 = this.endTime;
        String str4 = this.endZoneOffset;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        StringBuilder sb4 = new StringBuilder("HealthConnectActiveCaloriesBurnedModel(kilocalories=");
        sb4.append(d3);
        sb4.append(", startTime=");
        sb4.append(str);
        AbstractC11266d.m30444B(sb4, ", startZoneOffset=", str2, ", endTime=", str3);
        sb4.append(", endZoneOffset=");
        sb4.append(str4);
        sb4.append(", metadata=");
        sb4.append(healthConnectMetadataModel);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // com.whoop.healthconnect.domain.models.HealthConnectBaseRecordModel
    public C25127a toRecord() {
        C26413c c26413c;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        Object obj = dateTimeFormatter.parse(this.startTime, new C24473a(0));
        AbstractC22676k.m65749i(obj, "parse(...)");
        Instant instant = (Instant) obj;
        ZoneOffset zoneOffsetOf = ZoneOffset.of(this.startZoneOffset);
        Object obj2 = dateTimeFormatter.parse(this.endTime, new C24473a(0));
        AbstractC22676k.m65749i(obj2, "parse(...)");
        Instant instant2 = (Instant) obj2;
        ZoneOffset zoneOffsetOf2 = ZoneOffset.of(this.endZoneOffset);
        C31008e c31008e = C31020k.f128009y;
        C31020k c31020kM95546a = C31008e.m95546a(this.kilocalories);
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        if (healthConnectMetadataModel == null || (c26413c = healthConnectMetadataModel.toHealthConnectMetadata()) == null) {
            c26413c = new C26413c(127, null, 0L);
        }
        return new C25127a(instant, zoneOffsetOf, instant2, zoneOffsetOf2, c31020kM95546a, c26413c);
    }

    public /* synthetic */ HealthConnectActiveCaloriesBurnedModel(int i13, double d3, String str, String str2, String str3, String str4, HealthConnectMetadataModel healthConnectMetadataModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, HealthConnectActiveCaloriesBurnedModel$$serializer.INSTANCE.getDescriptor());
        }
        this.kilocalories = d3;
        this.startTime = str;
        this.startZoneOffset = str2;
        this.endTime = str3;
        this.endZoneOffset = str4;
        this.metadata = healthConnectMetadataModel;
    }
}
