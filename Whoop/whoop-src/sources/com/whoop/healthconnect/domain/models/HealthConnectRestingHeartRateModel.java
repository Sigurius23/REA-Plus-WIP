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
import p322m7.C25174t0;
import p336n7.C26413c;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J<\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\"¨\u00066"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;", "Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;", "", "beatsPerMinute", "", "time", "zoneOffset", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "metadata", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lm7/t0;", "toRecord", "()Lm7/t0;", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "copy", "(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBeatsPerMinute", "Ljava/lang/String;", "getTime", "getZoneOffset", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "getMetadata", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectRestingHeartRateModel implements HealthConnectBaseRecordModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("beats_per_minute")
    private final long beatsPerMinute;

    @SerializedName("metadata")
    private final HealthConnectMetadataModel metadata;

    @SerializedName("time")
    private final String time;

    @SerializedName("zone_offset")
    private final String zoneOffset;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectRestingHeartRateModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthConnectRestingHeartRateModel(int i13, long j7, String str, String str2, HealthConnectMetadataModel healthConnectMetadataModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, HealthConnectRestingHeartRateModel$$serializer.INSTANCE.getDescriptor());
        }
        this.beatsPerMinute = j7;
        this.time = str;
        this.zoneOffset = str2;
        this.metadata = healthConnectMetadataModel;
    }

    public static /* synthetic */ HealthConnectRestingHeartRateModel copy$default(HealthConnectRestingHeartRateModel healthConnectRestingHeartRateModel, long j7, String str, String str2, HealthConnectMetadataModel healthConnectMetadataModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = healthConnectRestingHeartRateModel.beatsPerMinute;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            str = healthConnectRestingHeartRateModel.time;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = healthConnectRestingHeartRateModel.zoneOffset;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            healthConnectMetadataModel = healthConnectRestingHeartRateModel.metadata;
        }
        return healthConnectRestingHeartRateModel.copy(j13, str3, str4, healthConnectMetadataModel);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectRestingHeartRateModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.beatsPerMinute);
        output.encodeStringElement(serialDesc, 1, self.time);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.zoneOffset);
        output.encodeNullableSerializableElement(serialDesc, 3, HealthConnectMetadataModel$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBeatsPerMinute() {
        return this.beatsPerMinute;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getZoneOffset() {
        return this.zoneOffset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final HealthConnectRestingHeartRateModel copy(long beatsPerMinute, String time, String zoneOffset, HealthConnectMetadataModel metadata) {
        AbstractC22676k.m65750j(time, "time");
        return new HealthConnectRestingHeartRateModel(beatsPerMinute, time, zoneOffset, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectRestingHeartRateModel)) {
            return false;
        }
        HealthConnectRestingHeartRateModel healthConnectRestingHeartRateModel = (HealthConnectRestingHeartRateModel) other;
        return this.beatsPerMinute == healthConnectRestingHeartRateModel.beatsPerMinute && AbstractC22676k.m65745e(this.time, healthConnectRestingHeartRateModel.time) && AbstractC22676k.m65745e(this.zoneOffset, healthConnectRestingHeartRateModel.zoneOffset) && AbstractC22676k.m65745e(this.metadata, healthConnectRestingHeartRateModel.metadata);
    }

    public final long getBeatsPerMinute() {
        return this.beatsPerMinute;
    }

    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Long.hashCode(this.beatsPerMinute) * 31, 31, this.time);
        String str = this.zoneOffset;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        return iHashCode + (healthConnectMetadataModel != null ? healthConnectMetadataModel.hashCode() : 0);
    }

    public String toString() {
        long j7 = this.beatsPerMinute;
        String str = this.time;
        String str2 = this.zoneOffset;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("HealthConnectRestingHeartRateModel(beatsPerMinute=", ", time=", j7, str);
        sbM114685m.append(", zoneOffset=");
        sbM114685m.append(str2);
        sbM114685m.append(", metadata=");
        sbM114685m.append(healthConnectMetadataModel);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    public HealthConnectRestingHeartRateModel(long j7, String time, String str, HealthConnectMetadataModel healthConnectMetadataModel) {
        AbstractC22676k.m65750j(time, "time");
        this.beatsPerMinute = j7;
        this.time = time;
        this.zoneOffset = str;
        this.metadata = healthConnectMetadataModel;
    }

    @Override // com.whoop.healthconnect.domain.models.HealthConnectBaseRecordModel
    public C25174t0 toRecord() {
        C26413c c26413c;
        Object obj = DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(this.time, new C24473a(0));
        AbstractC22676k.m65749i(obj, "parse(...)");
        Instant instant = (Instant) obj;
        ZoneOffset zoneOffsetOf = ZoneOffset.of(this.zoneOffset);
        long j7 = this.beatsPerMinute;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        if (healthConnectMetadataModel == null || (c26413c = healthConnectMetadataModel.toHealthConnectMetadata()) == null) {
            c26413c = new C26413c(127, null, 0L);
        }
        return new C25174t0(instant, zoneOffsetOf, j7, c26413c);
    }
}
