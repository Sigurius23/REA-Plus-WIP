package com.whoop.healthconnect.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lj1.C24473a;
import lj1.C24474b;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p322m7.C25185z;
import p336n7.C26413c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010 R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010 R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010'¨\u0006="}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;", "Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;", "", "startTime", "startZoneOffset", "endTime", "endZoneOffset", "", "Lcom/whoop/healthconnect/domain/models/HeartRateSampleModel;", "samples", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lm7/z;", "toRecord", "()Lm7/z;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartTime", "getStartZoneOffset", "getEndTime", "getEndZoneOffset", "Ljava/util/List;", "getSamples", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "getMetadata", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectHeartRateModel implements HealthConnectBaseRecordModel {

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("end_zone_offset")
    private final String endZoneOffset;

    @SerializedName("metadata")
    private final HealthConnectMetadataModel metadata;

    @SerializedName("samples")
    private final List<HeartRateSampleModel> samples;

    @SerializedName("start_time")
    private final String startTime;

    @SerializedName("start_zone_offset")
    private final String startZoneOffset;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24474b(4)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectHeartRateModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthConnectHeartRateModel(int i13, String str, String str2, String str3, String str4, List list, HealthConnectMetadataModel healthConnectMetadataModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, HealthConnectHeartRateModel$$serializer.INSTANCE.getDescriptor());
        }
        this.startTime = str;
        this.startZoneOffset = str2;
        this.endTime = str3;
        this.endZoneOffset = str4;
        this.samples = list;
        this.metadata = healthConnectMetadataModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HeartRateSampleModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthConnectHeartRateModel copy$default(HealthConnectHeartRateModel healthConnectHeartRateModel, String str, String str2, String str3, String str4, List list, HealthConnectMetadataModel healthConnectMetadataModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthConnectHeartRateModel.startTime;
        }
        if ((i13 & 2) != 0) {
            str2 = healthConnectHeartRateModel.startZoneOffset;
        }
        if ((i13 & 4) != 0) {
            str3 = healthConnectHeartRateModel.endTime;
        }
        if ((i13 & 8) != 0) {
            str4 = healthConnectHeartRateModel.endZoneOffset;
        }
        if ((i13 & 16) != 0) {
            list = healthConnectHeartRateModel.samples;
        }
        if ((i13 & 32) != 0) {
            healthConnectMetadataModel = healthConnectHeartRateModel.metadata;
        }
        List list2 = list;
        HealthConnectMetadataModel healthConnectMetadataModel2 = healthConnectMetadataModel;
        return healthConnectHeartRateModel.copy(str, str2, str3, str4, list2, healthConnectMetadataModel2);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectHeartRateModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.startTime);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.startZoneOffset);
        output.encodeStringElement(serialDesc, 2, self.endTime);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.endZoneOffset);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.samples);
        output.encodeNullableSerializableElement(serialDesc, 5, HealthConnectMetadataModel$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartZoneOffset() {
        return this.startZoneOffset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEndZoneOffset() {
        return this.endZoneOffset;
    }

    public final List<HeartRateSampleModel> component5() {
        return this.samples;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final HealthConnectHeartRateModel copy(String startTime, String startZoneOffset, String endTime, String endZoneOffset, List<HeartRateSampleModel> samples, HealthConnectMetadataModel metadata) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(samples, "samples");
        return new HealthConnectHeartRateModel(startTime, startZoneOffset, endTime, endZoneOffset, samples, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectHeartRateModel)) {
            return false;
        }
        HealthConnectHeartRateModel healthConnectHeartRateModel = (HealthConnectHeartRateModel) other;
        return AbstractC22676k.m65745e(this.startTime, healthConnectHeartRateModel.startTime) && AbstractC22676k.m65745e(this.startZoneOffset, healthConnectHeartRateModel.startZoneOffset) && AbstractC22676k.m65745e(this.endTime, healthConnectHeartRateModel.endTime) && AbstractC22676k.m65745e(this.endZoneOffset, healthConnectHeartRateModel.endZoneOffset) && AbstractC22676k.m65745e(this.samples, healthConnectHeartRateModel.samples) && AbstractC22676k.m65745e(this.metadata, healthConnectHeartRateModel.metadata);
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getEndZoneOffset() {
        return this.endZoneOffset;
    }

    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final List<HeartRateSampleModel> getSamples() {
        return this.samples;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getStartZoneOffset() {
        return this.startZoneOffset;
    }

    public int hashCode() {
        int iHashCode = this.startTime.hashCode() * 31;
        String str = this.startZoneOffset;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.endTime);
        String str2 = this.endZoneOffset;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.samples);
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        return iM31983b + (healthConnectMetadataModel != null ? healthConnectMetadataModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.startTime;
        String str2 = this.startZoneOffset;
        String str3 = this.endTime;
        String str4 = this.endZoneOffset;
        List<HeartRateSampleModel> list = this.samples;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthConnectHeartRateModel(startTime=", str, ", startZoneOffset=", str2, ", endTime=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", endZoneOffset=", str4, ", samples=");
        sbM32001t.append(list);
        sbM32001t.append(", metadata=");
        sbM32001t.append(healthConnectMetadataModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HealthConnectHeartRateModel(String startTime, String str, String endTime, String str2, List<HeartRateSampleModel> samples, HealthConnectMetadataModel healthConnectMetadataModel) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(samples, "samples");
        this.startTime = startTime;
        this.startZoneOffset = str;
        this.endTime = endTime;
        this.endZoneOffset = str2;
        this.samples = samples;
        this.metadata = healthConnectMetadataModel;
    }

    @Override // com.whoop.healthconnect.domain.models.HealthConnectBaseRecordModel
    public C25185z toRecord() {
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
        List<HeartRateSampleModel> list = this.samples;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((HeartRateSampleModel) it.next()).toHeartRateRecordSample());
        }
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        if (healthConnectMetadataModel == null || (c26413c = healthConnectMetadataModel.toHealthConnectMetadata()) == null) {
            c26413c = new C26413c(127, null, 0L);
        }
        return new C25185z(instant, zoneOffsetOf, instant2, zoneOffsetOf2, arrayList, c26413c);
    }
}
