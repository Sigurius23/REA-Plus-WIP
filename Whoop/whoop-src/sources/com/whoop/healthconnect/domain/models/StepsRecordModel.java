package com.whoop.healthconnect.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import lj1.C24473a;
import p000.AbstractC11266d;
import p322m7.C25138d1;
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
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J<\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\"¨\u00066"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/StepsRecordModel;", "Lcom/whoop/healthconnect/domain/models/HealthConnectBaseRecordModel;", "", "stepCount", "", "startTime", "endTime", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "metadata", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/StepsRecordModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lm7/d1;", "toRecord", "()Lm7/d1;", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "copy", "(JLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;)Lcom/whoop/healthconnect/domain/models/StepsRecordModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getStepCount", "Ljava/lang/String;", "getStartTime", "getEndTime", "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;", "getMetadata", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StepsRecordModel implements HealthConnectBaseRecordModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("metadata")
    private final HealthConnectMetadataModel metadata;

    @SerializedName("start_time")
    private final String startTime;

    @SerializedName("step_count")
    private final long stepCount;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/StepsRecordModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/StepsRecordModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StepsRecordModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StepsRecordModel(int i13, long j7, String str, String str2, HealthConnectMetadataModel healthConnectMetadataModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StepsRecordModel$$serializer.INSTANCE.getDescriptor());
        }
        this.stepCount = j7;
        this.startTime = str;
        this.endTime = str2;
        this.metadata = healthConnectMetadataModel;
    }

    public static /* synthetic */ StepsRecordModel copy$default(StepsRecordModel stepsRecordModel, long j7, String str, String str2, HealthConnectMetadataModel healthConnectMetadataModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = stepsRecordModel.stepCount;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            str = stepsRecordModel.startTime;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = stepsRecordModel.endTime;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            healthConnectMetadataModel = stepsRecordModel.metadata;
        }
        return stepsRecordModel.copy(j13, str3, str4, healthConnectMetadataModel);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(StepsRecordModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.stepCount);
        output.encodeStringElement(serialDesc, 1, self.startTime);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.endTime);
        output.encodeNullableSerializableElement(serialDesc, 3, HealthConnectMetadataModel$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStepCount() {
        return this.stepCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final StepsRecordModel copy(long stepCount, String startTime, String endTime, HealthConnectMetadataModel metadata) {
        AbstractC22676k.m65750j(startTime, "startTime");
        return new StepsRecordModel(stepCount, startTime, endTime, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepsRecordModel)) {
            return false;
        }
        StepsRecordModel stepsRecordModel = (StepsRecordModel) other;
        return this.stepCount == stepsRecordModel.stepCount && AbstractC22676k.m65745e(this.startTime, stepsRecordModel.startTime) && AbstractC22676k.m65745e(this.endTime, stepsRecordModel.endTime) && AbstractC22676k.m65745e(this.metadata, stepsRecordModel.metadata);
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final HealthConnectMetadataModel getMetadata() {
        return this.metadata;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final long getStepCount() {
        return this.stepCount;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Long.hashCode(this.stepCount) * 31, 31, this.startTime);
        String str = this.endTime;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        return iHashCode + (healthConnectMetadataModel != null ? healthConnectMetadataModel.hashCode() : 0);
    }

    public String toString() {
        long j7 = this.stepCount;
        String str = this.startTime;
        String str2 = this.endTime;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("StepsRecordModel(stepCount=", ", startTime=", j7, str);
        sbM114685m.append(", endTime=");
        sbM114685m.append(str2);
        sbM114685m.append(", metadata=");
        sbM114685m.append(healthConnectMetadataModel);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    public StepsRecordModel(long j7, String startTime, String str, HealthConnectMetadataModel healthConnectMetadataModel) {
        AbstractC22676k.m65750j(startTime, "startTime");
        this.stepCount = j7;
        this.startTime = startTime;
        this.endTime = str;
        this.metadata = healthConnectMetadataModel;
    }

    @Override // com.whoop.healthconnect.domain.models.HealthConnectBaseRecordModel
    public C25138d1 toRecord() {
        C26413c c26413c;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        Object obj = dateTimeFormatter.parse(this.startTime, new C24473a(0));
        AbstractC22676k.m65749i(obj, "parse(...)");
        Instant instant = (Instant) obj;
        Object obj2 = dateTimeFormatter.parse(this.endTime, new C24473a(0));
        AbstractC22676k.m65749i(obj2, "parse(...)");
        Instant instant2 = (Instant) obj2;
        long j7 = this.stepCount;
        HealthConnectMetadataModel healthConnectMetadataModel = this.metadata;
        if (healthConnectMetadataModel == null || (c26413c = healthConnectMetadataModel.toHealthConnectMetadata()) == null) {
            c26413c = new C26413c(127, null, 0L);
        }
        return new C25138d1(instant, null, instant2, null, j7, c26413c);
    }
}
