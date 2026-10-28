package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.TrackerValue;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)JV\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010&J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u001a\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b;\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010)¨\u0006@"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/TrackerValueDto;", "", "", "behaviorTrackerId", "", "answered", "", "timeInputValue", "", "timeInputLabel", "magnitudeInputLabel", "", "magnitudeInputValue", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/TrackerValueDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/TrackerValue;", "toTrackerValue", "()Lcom/whoop/data/remote/domain/response/journal/TrackerValue;", "component1", "()I", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Ljava/lang/Double;", "copy", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/TrackerValueDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getBehaviorTrackerId", "Ljava/lang/Boolean;", "getAnswered", "getAnswered$annotations", "()V", "Ljava/lang/Long;", "getTimeInputValue", "Ljava/lang/String;", "getTimeInputLabel", "getMagnitudeInputLabel", "Ljava/lang/Double;", "getMagnitudeInputValue", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrackerValueDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("answered_yes")
    private final Boolean answered;

    @SerializedName("behavior_tracker_id")
    private final int behaviorTrackerId;

    @SerializedName("magnitude_input_label")
    private final String magnitudeInputLabel;

    @SerializedName("magnitude_input_value")
    private final Double magnitudeInputValue;

    @SerializedName("time_input_label")
    private final String timeInputLabel;

    @SerializedName("time_input_value")
    private final Long timeInputValue;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/TrackerValueDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/TrackerValueDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrackerValueDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrackerValueDto(int i13, int i14, Boolean bool, Long l7, String str, String str2, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, TrackerValueDto$$serializer.INSTANCE.getDescriptor());
        }
        this.behaviorTrackerId = i14;
        this.answered = bool;
        this.timeInputValue = l7;
        this.timeInputLabel = str;
        this.magnitudeInputLabel = str2;
        this.magnitudeInputValue = d3;
    }

    public static /* synthetic */ TrackerValueDto copy$default(TrackerValueDto trackerValueDto, int i13, Boolean bool, Long l7, String str, String str2, Double d3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = trackerValueDto.behaviorTrackerId;
        }
        if ((i14 & 2) != 0) {
            bool = trackerValueDto.answered;
        }
        if ((i14 & 4) != 0) {
            l7 = trackerValueDto.timeInputValue;
        }
        if ((i14 & 8) != 0) {
            str = trackerValueDto.timeInputLabel;
        }
        if ((i14 & 16) != 0) {
            str2 = trackerValueDto.magnitudeInputLabel;
        }
        if ((i14 & 32) != 0) {
            d3 = trackerValueDto.magnitudeInputValue;
        }
        String str3 = str2;
        Double d14 = d3;
        return trackerValueDto.copy(i13, bool, l7, str, str3, d14);
    }

    @InterfaceC37143h("answered_yes")
    public static /* synthetic */ void getAnswered$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(TrackerValueDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.behaviorTrackerId);
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.answered);
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.timeInputValue);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.timeInputLabel);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.magnitudeInputLabel);
        output.encodeNullableSerializableElement(serialDesc, 5, DoubleSerializer.INSTANCE, self.magnitudeInputValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAnswered() {
        return this.answered;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimeInputValue() {
        return this.timeInputValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeInputLabel() {
        return this.timeInputLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMagnitudeInputLabel() {
        return this.magnitudeInputLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getMagnitudeInputValue() {
        return this.magnitudeInputValue;
    }

    public final TrackerValueDto copy(int behaviorTrackerId, Boolean answered, Long timeInputValue, String timeInputLabel, String magnitudeInputLabel, Double magnitudeInputValue) {
        return new TrackerValueDto(behaviorTrackerId, answered, timeInputValue, timeInputLabel, magnitudeInputLabel, magnitudeInputValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackerValueDto)) {
            return false;
        }
        TrackerValueDto trackerValueDto = (TrackerValueDto) other;
        return this.behaviorTrackerId == trackerValueDto.behaviorTrackerId && AbstractC22676k.m65745e(this.answered, trackerValueDto.answered) && AbstractC22676k.m65745e(this.timeInputValue, trackerValueDto.timeInputValue) && AbstractC22676k.m65745e(this.timeInputLabel, trackerValueDto.timeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputLabel, trackerValueDto.magnitudeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputValue, trackerValueDto.magnitudeInputValue);
    }

    public final Boolean getAnswered() {
        return this.answered;
    }

    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    public final String getMagnitudeInputLabel() {
        return this.magnitudeInputLabel;
    }

    public final Double getMagnitudeInputValue() {
        return this.magnitudeInputValue;
    }

    public final String getTimeInputLabel() {
        return this.timeInputLabel;
    }

    public final Long getTimeInputValue() {
        return this.timeInputValue;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.behaviorTrackerId) * 31;
        Boolean bool = this.answered;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l7 = this.timeInputValue;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str = this.timeInputLabel;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.magnitudeInputLabel;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.magnitudeInputValue;
        return iHashCode5 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        return "TrackerValueDto(behaviorTrackerId=" + this.behaviorTrackerId + ", answered=" + this.answered + ", timeInputValue=" + this.timeInputValue + ", timeInputLabel=" + this.timeInputLabel + ", magnitudeInputLabel=" + this.magnitudeInputLabel + ", magnitudeInputValue=" + this.magnitudeInputValue + ")";
    }

    public final TrackerValue toTrackerValue() {
        Boolean bool = this.answered;
        return new TrackerValue(this.behaviorTrackerId, bool != null ? bool.booleanValue() : false, this.timeInputLabel, this.timeInputValue, this.magnitudeInputLabel, this.magnitudeInputValue);
    }

    public TrackerValueDto(int i13, Boolean bool, Long l7, String str, String str2, Double d3) {
        this.behaviorTrackerId = i13;
        this.answered = bool;
        this.timeInputValue = l7;
        this.timeInputLabel = str;
        this.magnitudeInputLabel = str2;
        this.magnitudeInputValue = d3;
    }
}
