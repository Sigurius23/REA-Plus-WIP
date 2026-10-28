package com.whoop.healthconnect.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import lj1.C24473a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p322m7.C25180w0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001d¨\u0006-"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/SleepStagesModel;", "", "", "startTime", "endTime", "", "stage", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_connect_release", "(Lcom/whoop/healthconnect/domain/models/SleepStagesModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lm7/w0;", "toRecord", "()Lm7/w0;", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/healthconnect/domain/models/SleepStagesModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartTime", "getEndTime", "I", "getStage", "Companion", "$serializer", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepStagesModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("end_time")
    private final String endTime;

    @SerializedName("stage")
    private final int stage;

    @SerializedName("start_time")
    private final String startTime;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/models/SleepStagesModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthconnect/domain/models/SleepStagesModel;", "serializer", "()Lwc3/c;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepStagesModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SleepStagesModel(int i13, String str, String str2, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SleepStagesModel$$serializer.INSTANCE.getDescriptor());
        }
        this.startTime = str;
        this.endTime = str2;
        this.stage = i14;
    }

    public static /* synthetic */ SleepStagesModel copy$default(SleepStagesModel sleepStagesModel, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = sleepStagesModel.startTime;
        }
        if ((i14 & 2) != 0) {
            str2 = sleepStagesModel.endTime;
        }
        if ((i14 & 4) != 0) {
            i13 = sleepStagesModel.stage;
        }
        return sleepStagesModel.copy(str, str2, i13);
    }

    public static final /* synthetic */ void write$Self$health_connect_release(SleepStagesModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.startTime);
        output.encodeStringElement(serialDesc, 1, self.endTime);
        output.encodeIntElement(serialDesc, 2, self.stage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStage() {
        return this.stage;
    }

    public final SleepStagesModel copy(String startTime, String endTime, int stage) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        return new SleepStagesModel(startTime, endTime, stage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepStagesModel)) {
            return false;
        }
        SleepStagesModel sleepStagesModel = (SleepStagesModel) other;
        return AbstractC22676k.m65745e(this.startTime, sleepStagesModel.startTime) && AbstractC22676k.m65745e(this.endTime, sleepStagesModel.endTime) && this.stage == sleepStagesModel.stage;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final int getStage() {
        return this.stage;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Integer.hashCode(this.stage) + AbstractC11266d.m30450d(this.startTime.hashCode() * 31, 31, this.endTime);
    }

    public final C25180w0 toRecord() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        Object obj = dateTimeFormatter.parse(this.startTime, new C24473a(0));
        AbstractC22676k.m65749i(obj, "parse(...)");
        Object obj2 = dateTimeFormatter.parse(this.endTime, new C24473a(0));
        AbstractC22676k.m65749i(obj2, "parse(...)");
        return new C25180w0((Instant) obj, (Instant) obj2, this.stage);
    }

    public String toString() {
        String str = this.startTime;
        String str2 = this.endTime;
        return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("SleepStagesModel(startTime=", str, ", endTime=", str2, ", stage="), this.stage, ")");
    }

    public SleepStagesModel(String startTime, String endTime, int i13) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        this.startTime = startTime;
        this.endTime = endTime;
        this.stage = i13;
    }
}
