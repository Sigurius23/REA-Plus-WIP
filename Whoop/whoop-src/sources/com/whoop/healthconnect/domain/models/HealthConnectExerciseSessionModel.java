package com.whoop.healthconnect.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import lj1.C24473a;
import m83.C25271y;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p322m7.C25175u;
import p322m7.C25179w;
import p336n7.C26413c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fBs\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010#Jv\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010#J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010!J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010#R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b:\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b;\u0010#R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b<\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b=\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b@\u0010#¨\u0006C"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;", "Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;", "", "exerciseType", "", "notes", "title", "startTime", "startZoneOffset", "endTime", "endZoneOffset", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "metadata", "deviceZoneId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lm7/w;", "toRecord", "()Lm7/w;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getExerciseType", "Ljava/lang/String;", "getNotes", "getTitle", "getStartTime", "getStartZoneOffset", "getEndTime", "getEndZoneOffset", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "getMetadata", "getDeviceZoneId", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthConnectExerciseSessionModel implements HealthConnectBaseRecordModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("device_zone_id")
    private final String deviceZoneId;

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("end_zone_offset")
    private final String endZoneOffset;

    @SerializedName("exercise_type")
    private final int exerciseType;

    @SerializedName("metadata")
    private final HealthConnectMetadataModel metadata;

    @SerializedName("notes")
    private final String notes;

    @SerializedName("start_time")
    private final String startTime;

    @SerializedName("start_zone_offset")
    private final String startZoneOffset;

    @SerializedName("title")
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthConnectExerciseSessionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthConnectExerciseSessionModel(int i13, int i14, String str, String str2, String str3, String str4, String str5, String str6, HealthConnectMetadataModel healthConnectMetadataModel, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, HealthConnectExerciseSessionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.exerciseType = i14;
        this.notes = str;
        this.title = str2;
        this.startTime = str3;
        this.startZoneOffset = str4;
        this.endTime = str5;
        this.endZoneOffset = str6;
        this.metadata = healthConnectMetadataModel;
        this.deviceZoneId = str7;
    }

    public static /* synthetic */ HealthConnectExerciseSessionModel copy$default(HealthConnectExerciseSessionModel healthConnectExerciseSessionModel, int i13, String str, String str2, String str3, String str4, String str5, String str6, HealthConnectMetadataModel healthConnectMetadataModel, String str7, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = healthConnectExerciseSessionModel.exerciseType;
        }
        if ((i14 & 2) != 0) {
            str = healthConnectExerciseSessionModel.notes;
        }
        if ((i14 & 4) != 0) {
            str2 = healthConnectExerciseSessionModel.title;
        }
        if ((i14 & 8) != 0) {
            str3 = healthConnectExerciseSessionModel.startTime;
        }
        if ((i14 & 16) != 0) {
            str4 = healthConnectExerciseSessionModel.startZoneOffset;
        }
        if ((i14 & 32) != 0) {
            str5 = healthConnectExerciseSessionModel.endTime;
        }
        if ((i14 & 64) != 0) {
            str6 = healthConnectExerciseSessionModel.endZoneOffset;
        }
        if ((i14 & 128) != 0) {
            healthConnectMetadataModel = healthConnectExerciseSessionModel.metadata;
        }
        if ((i14 & 256) != 0) {
            str7 = healthConnectExerciseSessionModel.deviceZoneId;
        }
        HealthConnectMetadataModel healthConnectMetadataModel2 = healthConnectMetadataModel;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        String str12 = str2;
        return healthConnectExerciseSessionModel.copy(i13, str, str12, str3, str11, str9, str10, healthConnectMetadataModel2, str8);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(HealthConnectExerciseSessionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.exerciseType);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.notes);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.title);
        output.encodeStringElement(serialDesc, 3, self.startTime);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.startZoneOffset);
        output.encodeStringElement(serialDesc, 5, self.endTime);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.endZoneOffset);
        output.encodeNullableSerializableElement(serialDesc, 7, HealthConnectMetadataModel$$serializer.INSTANCE, self.metadata);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.deviceZoneId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getExerciseType() {
        return this.exerciseType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStartZoneOffset() {
        return this.startZoneOffset;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEndZoneOffset() {
        return this.endZoneOffset;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceZoneId() {
        return this.deviceZoneId;
    }

    public final HealthConnectExerciseSessionModel copy(int exerciseType, String notes, String title, String startTime, String startZoneOffset, String endTime, String endZoneOffset, HealthConnectMetadataModel metadata, String deviceZoneId) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        return new HealthConnectExerciseSessionModel(exerciseType, notes, title, startTime, startZoneOffset, endTime, endZoneOffset, metadata, deviceZoneId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectExerciseSessionModel)) {
            return false;
        }
        HealthConnectExerciseSessionModel healthConnectExerciseSessionModel = (HealthConnectExerciseSessionModel) other;
        return this.exerciseType == healthConnectExerciseSessionModel.exerciseType && AbstractC22676k.m65745e(this.notes, healthConnectExerciseSessionModel.notes) && AbstractC22676k.m65745e(this.title, healthConnectExerciseSessionModel.title) && AbstractC22676k.m65745e(this.startTime, healthConnectExerciseSessionModel.startTime) && AbstractC22676k.m65745e(this.startZoneOffset, healthConnectExerciseSessionModel.startZoneOffset) && AbstractC22676k.m65745e(this.endTime, healthConnectExerciseSessionModel.endTime) && AbstractC22676k.m65745e(this.endZoneOffset, healthConnectExerciseSessionModel.endZoneOffset) && AbstractC22676k.m65745e(this.metadata, healthConnectExerciseSessionModel.metadata) && AbstractC22676k.m65745e(this.deviceZoneId, healthConnectExerciseSessionModel.deviceZoneId);
    }

    public final String getDeviceZoneId() {
        return this.deviceZoneId;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getEndZoneOffset() {
        return this.endZoneOffset;
    }

    public final int getExerciseType() {
        return this.exerciseType;
    }

    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final String getNotes() {
        return this.notes;
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
        int iHashCode = Integer.hashCode(this.exerciseType) * 31;
        String str = this.notes;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.startTime);
        String str3 = this.startZoneOffset;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.endTime);
        String str4 = this.endZoneOffset;
        int iHashCode3 = (iM30450d2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        int iHashCode4 = (iHashCode3 + (healthConnectMetadataModel == null ? 0 : healthConnectMetadataModel.hashCode())) * 31;
        String str5 = this.deviceZoneId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.exerciseType;
        String str = this.notes;
        String str2 = this.title;
        String str3 = this.startTime;
        String str4 = this.startZoneOffset;
        String str5 = this.endTime;
        String str6 = this.endZoneOffset;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        String str7 = this.deviceZoneId;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "HealthConnectExerciseSessionModel(exerciseType=", ", notes=", str, ", title=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", startTime=", str3, ", startZoneOffset=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", endTime=", str5, ", endZoneOffset=");
        sbM53373n.append(str6);
        sbM53373n.append(", metadata=");
        sbM53373n.append(healthConnectMetadataModel);
        sbM53373n.append(", deviceZoneId=");
        return AbstractC25012a.m73376i(str7, ")", sbM53373n);
    }

    public HealthConnectExerciseSessionModel(int i13, String str, String str2, String startTime, String str3, String endTime, String str4, HealthConnectMetadataModel healthConnectMetadataModel, String str5) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        this.exerciseType = i13;
        this.notes = str;
        this.title = str2;
        this.startTime = startTime;
        this.startZoneOffset = str3;
        this.endTime = endTime;
        this.endZoneOffset = str4;
        this.metadata = healthConnectMetadataModel;
        this.deviceZoneId = str5;
    }

    @Override // com.whoop.healthconnect.domain.models.HealthConnectBaseRecordModel
    public C25179w toRecord() {
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
        int i13 = this.exerciseType;
        String str = this.title;
        String str2 = this.notes;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        if (healthConnectMetadataModel == null || (c26413c = healthConnectMetadataModel.toHealthConnectMetadata()) == null) {
            c26413c = new C26413c(127, null, 0L);
        }
        C25175u c25175u = new C25175u();
        C25271y c25271y = C25271y.f99162w;
        return new C25179w(instant, zoneOffsetOf, instant2, zoneOffsetOf2, i13, str, str2, c26413c, c25271y, c25271y, c25175u);
    }
}
