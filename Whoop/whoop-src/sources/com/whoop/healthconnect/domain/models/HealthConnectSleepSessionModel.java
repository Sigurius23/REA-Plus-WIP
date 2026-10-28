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
import p322m7.C25182x0;
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
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+Jp\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\"R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010+¨\u0006C"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;", "Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;", "", "notes", "title", "startTime", "startZoneOffset", "endTime", "endZoneOffset", "", "Lcom/whoop/healthconnect/domain/models/SleepStagesModel;", "stages", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lm7/x0;", "toRecord", "()Lm7/x0;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNotes", "getTitle", "getStartTime", "getStartZoneOffset", "getEndTime", "getEndZoneOffset", "Ljava/util/List;", "getStages", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "getMetadata", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectSleepSessionModel implements HealthConnectBaseRecordModel {

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("end_zone_offset")
    private final String endZoneOffset;

    @SerializedName("metadata")
    private final HealthConnectMetadataModel metadata;

    @SerializedName("notes")
    private final String notes;

    @SerializedName("stages")
    private final List<SleepStagesModel> stages;

    @SerializedName("start_time")
    private final String startTime;

    @SerializedName("start_zone_offset")
    private final String startZoneOffset;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24474b(7)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectSleepSessionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthConnectSleepSessionModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, List list, HealthConnectMetadataModel healthConnectMetadataModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, HealthConnectSleepSessionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.notes = str;
        this.title = str2;
        this.startTime = str3;
        this.startZoneOffset = str4;
        this.endTime = str5;
        this.endZoneOffset = str6;
        this.stages = list;
        this.metadata = healthConnectMetadataModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SleepStagesModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthConnectSleepSessionModel copy$default(HealthConnectSleepSessionModel healthConnectSleepSessionModel, String str, String str2, String str3, String str4, String str5, String str6, List list, HealthConnectMetadataModel healthConnectMetadataModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthConnectSleepSessionModel.notes;
        }
        if ((i13 & 2) != 0) {
            str2 = healthConnectSleepSessionModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = healthConnectSleepSessionModel.startTime;
        }
        if ((i13 & 8) != 0) {
            str4 = healthConnectSleepSessionModel.startZoneOffset;
        }
        if ((i13 & 16) != 0) {
            str5 = healthConnectSleepSessionModel.endTime;
        }
        if ((i13 & 32) != 0) {
            str6 = healthConnectSleepSessionModel.endZoneOffset;
        }
        if ((i13 & 64) != 0) {
            list = healthConnectSleepSessionModel.stages;
        }
        if ((i13 & 128) != 0) {
            healthConnectMetadataModel = healthConnectSleepSessionModel.metadata;
        }
        List list2 = list;
        HealthConnectMetadataModel healthConnectMetadataModel2 = healthConnectMetadataModel;
        String str7 = str5;
        String str8 = str6;
        return healthConnectSleepSessionModel.copy(str, str2, str3, str4, str7, str8, list2, healthConnectMetadataModel2);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectSleepSessionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.notes);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.title);
        output.encodeStringElement(serialDesc, 2, self.startTime);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.startZoneOffset);
        output.encodeStringElement(serialDesc, 4, self.endTime);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.endZoneOffset);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.stages);
        output.encodeNullableSerializableElement(serialDesc, 7, HealthConnectMetadataModel$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStartZoneOffset() {
        return this.startZoneOffset;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndZoneOffset() {
        return this.endZoneOffset;
    }

    public final List<SleepStagesModel> component7() {
        return this.stages;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final HealthConnectSleepSessionModel copy(String notes, String title, String startTime, String startZoneOffset, String endTime, String endZoneOffset, List<SleepStagesModel> stages, HealthConnectMetadataModel metadata) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(stages, "stages");
        return new HealthConnectSleepSessionModel(notes, title, startTime, startZoneOffset, endTime, endZoneOffset, stages, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectSleepSessionModel)) {
            return false;
        }
        HealthConnectSleepSessionModel healthConnectSleepSessionModel = (HealthConnectSleepSessionModel) other;
        return AbstractC22676k.m65745e(this.notes, healthConnectSleepSessionModel.notes) && AbstractC22676k.m65745e(this.title, healthConnectSleepSessionModel.title) && AbstractC22676k.m65745e(this.startTime, healthConnectSleepSessionModel.startTime) && AbstractC22676k.m65745e(this.startZoneOffset, healthConnectSleepSessionModel.startZoneOffset) && AbstractC22676k.m65745e(this.endTime, healthConnectSleepSessionModel.endTime) && AbstractC22676k.m65745e(this.endZoneOffset, healthConnectSleepSessionModel.endZoneOffset) && AbstractC22676k.m65745e(this.stages, healthConnectSleepSessionModel.stages) && AbstractC22676k.m65745e(this.metadata, healthConnectSleepSessionModel.metadata);
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

    public final String getNotes() {
        return this.notes;
    }

    public final List<SleepStagesModel> getStages() {
        return this.stages;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getStartZoneOffset() {
        return this.startZoneOffset;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.notes;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.startTime);
        String str3 = this.startZoneOffset;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.endTime);
        String str4 = this.endZoneOffset;
        int iM31983b = AbstractC11895b.m31983b((iM30450d2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.stages);
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        return iM31983b + (healthConnectMetadataModel != null ? healthConnectMetadataModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.notes;
        String str2 = this.title;
        String str3 = this.startTime;
        String str4 = this.startZoneOffset;
        String str5 = this.endTime;
        String str6 = this.endZoneOffset;
        List<SleepStagesModel> list = this.stages;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthConnectSleepSessionModel(notes=", str, ", title=", str2, ", startTime=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", startZoneOffset=", str4, ", endTime=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", endZoneOffset=", str6, ", stages=");
        sbM32001t.append(list);
        sbM32001t.append(", metadata=");
        sbM32001t.append(healthConnectMetadataModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HealthConnectSleepSessionModel(String str, String str2, String startTime, String str3, String endTime, String str4, List<SleepStagesModel> stages, HealthConnectMetadataModel healthConnectMetadataModel) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(stages, "stages");
        this.notes = str;
        this.title = str2;
        this.startTime = startTime;
        this.startZoneOffset = str3;
        this.endTime = endTime;
        this.endZoneOffset = str4;
        this.stages = stages;
        this.metadata = healthConnectMetadataModel;
    }

    @Override // com.whoop.healthconnect.domain.models.HealthConnectBaseRecordModel
    public C25182x0 toRecord() {
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
        String str = this.title;
        String str2 = this.notes;
        List<SleepStagesModel> list = this.stages;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SleepStagesModel) it.next()).toRecord());
        }
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        if (healthConnectMetadataModel == null || (c26413c = healthConnectMetadataModel.toHealthConnectMetadata()) == null) {
            c26413c = new C26413c(127, null, 0L);
        }
        return new C25182x0(instant, zoneOffsetOf, instant2, zoneOffsetOf2, str, str2, arrayList, c26413c);
    }
}
