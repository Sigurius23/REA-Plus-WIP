package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.TrackerInput;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJBq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012B}\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0086\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u001a\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bB\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bE\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bF\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bI\u0010\u001f¨\u0006L"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/TrackerInputDto;", "", "", "answeredYes", "", "behaviorTrackerId", "", "createdAt", "id", "journalEntryId", "", "magnitudeInputLabel", "magnitudeInputValue", "timeInputLabel", "", "timeInputValue", "updatedAt", "<init>", "(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/whoop/data/remote/domain/response/journal/TrackerInput;", "toTrackerInput", "()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;", "component1", "()Ljava/lang/Boolean;", "component2", "()I", "component3", "()Ljava/lang/Double;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "()Ljava/lang/Long;", "component10", "copy", "(Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/TrackerInputDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/TrackerInputDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/Boolean;", "getAnsweredYes", "I", "getBehaviorTrackerId", "Ljava/lang/Double;", "getCreatedAt", "Ljava/lang/Integer;", "getId", "getJournalEntryId", "Ljava/lang/String;", "getMagnitudeInputLabel", "getMagnitudeInputValue", "getTimeInputLabel", "Ljava/lang/Long;", "getTimeInputValue", "getUpdatedAt", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrackerInputDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("answered_yes")
    private final Boolean answeredYes;

    @SerializedName("behavior_tracker_id")
    private final int behaviorTrackerId;

    @SerializedName("created_at")
    private final Double createdAt;

    @SerializedName("id")
    private final Integer id;

    @SerializedName("journal_entry_id")
    private final Integer journalEntryId;

    @SerializedName("magnitude_input_label")
    private final String magnitudeInputLabel;

    @SerializedName("magnitude_input_value")
    private final Double magnitudeInputValue;

    @SerializedName("time_input_label")
    private final String timeInputLabel;

    @SerializedName("time_input_value")
    private final Long timeInputValue;

    @SerializedName("updated_at")
    private final Double updatedAt;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/TrackerInputDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/TrackerInputDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrackerInputDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrackerInputDto(int i13, Boolean bool, int i14, Double d3, Integer num, Integer num2, String str, Double d14, String str2, Long l7, Double d15, SerializationConstructorMarker serializationConstructorMarker) {
        if (483 != (i13 & 483)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 483, TrackerInputDto$$serializer.INSTANCE.getDescriptor());
        }
        this.answeredYes = bool;
        this.behaviorTrackerId = i14;
        if ((i13 & 4) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = d3;
        }
        if ((i13 & 8) == 0) {
            this.id = null;
        } else {
            this.id = num;
        }
        if ((i13 & 16) == 0) {
            this.journalEntryId = null;
        } else {
            this.journalEntryId = num2;
        }
        this.magnitudeInputLabel = str;
        this.magnitudeInputValue = d14;
        this.timeInputLabel = str2;
        this.timeInputValue = l7;
        if ((i13 & 512) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = d15;
        }
    }

    public static /* synthetic */ TrackerInputDto copy$default(TrackerInputDto trackerInputDto, Boolean bool, int i13, Double d3, Integer num, Integer num2, String str, Double d14, String str2, Long l7, Double d15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            bool = trackerInputDto.answeredYes;
        }
        if ((i14 & 2) != 0) {
            i13 = trackerInputDto.behaviorTrackerId;
        }
        if ((i14 & 4) != 0) {
            d3 = trackerInputDto.createdAt;
        }
        if ((i14 & 8) != 0) {
            num = trackerInputDto.id;
        }
        if ((i14 & 16) != 0) {
            num2 = trackerInputDto.journalEntryId;
        }
        if ((i14 & 32) != 0) {
            str = trackerInputDto.magnitudeInputLabel;
        }
        if ((i14 & 64) != 0) {
            d14 = trackerInputDto.magnitudeInputValue;
        }
        if ((i14 & 128) != 0) {
            str2 = trackerInputDto.timeInputLabel;
        }
        if ((i14 & 256) != 0) {
            l7 = trackerInputDto.timeInputValue;
        }
        if ((i14 & 512) != 0) {
            d15 = trackerInputDto.updatedAt;
        }
        Long l12 = l7;
        Double d16 = d15;
        Double d17 = d14;
        String str3 = str2;
        Integer num3 = num2;
        String str4 = str;
        return trackerInputDto.copy(bool, i13, d3, num, num3, str4, d17, str3, l12, d16);
    }

    public static final /* synthetic */ void write$Self$core_release(TrackerInputDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.answeredYes);
        output.encodeIntElement(serialDesc, 1, self.behaviorTrackerId);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.createdAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, DoubleSerializer.INSTANCE, self.createdAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.journalEntryId != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.journalEntryId);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.magnitudeInputLabel);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, doubleSerializer, self.magnitudeInputValue);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.timeInputLabel);
        output.encodeNullableSerializableElement(serialDesc, 8, LongSerializer.INSTANCE, self.timeInputValue);
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.updatedAt == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, doubleSerializer, self.updatedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAnsweredYes() {
        return this.answeredYes;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getJournalEntryId() {
        return this.journalEntryId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMagnitudeInputLabel() {
        return this.magnitudeInputLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getMagnitudeInputValue() {
        return this.magnitudeInputValue;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTimeInputLabel() {
        return this.timeInputLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getTimeInputValue() {
        return this.timeInputValue;
    }

    public final TrackerInputDto copy(Boolean answeredYes, int behaviorTrackerId, Double createdAt, Integer id4, Integer journalEntryId, String magnitudeInputLabel, Double magnitudeInputValue, String timeInputLabel, Long timeInputValue, Double updatedAt) {
        return new TrackerInputDto(answeredYes, behaviorTrackerId, createdAt, id4, journalEntryId, magnitudeInputLabel, magnitudeInputValue, timeInputLabel, timeInputValue, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackerInputDto)) {
            return false;
        }
        TrackerInputDto trackerInputDto = (TrackerInputDto) other;
        return AbstractC22676k.m65745e(this.answeredYes, trackerInputDto.answeredYes) && this.behaviorTrackerId == trackerInputDto.behaviorTrackerId && AbstractC22676k.m65745e(this.createdAt, trackerInputDto.createdAt) && AbstractC22676k.m65745e(this.id, trackerInputDto.id) && AbstractC22676k.m65745e(this.journalEntryId, trackerInputDto.journalEntryId) && AbstractC22676k.m65745e(this.magnitudeInputLabel, trackerInputDto.magnitudeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputValue, trackerInputDto.magnitudeInputValue) && AbstractC22676k.m65745e(this.timeInputLabel, trackerInputDto.timeInputLabel) && AbstractC22676k.m65745e(this.timeInputValue, trackerInputDto.timeInputValue) && AbstractC22676k.m65745e(this.updatedAt, trackerInputDto.updatedAt);
    }

    public final Boolean getAnsweredYes() {
        return this.answeredYes;
    }

    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    public final Double getCreatedAt() {
        return this.createdAt;
    }

    public final Integer getId() {
        return this.id;
    }

    public final Integer getJournalEntryId() {
        return this.journalEntryId;
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

    public final Double getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Boolean bool = this.answeredYes;
        int iM30448b = AbstractC11266d.m30448b(this.behaviorTrackerId, (bool == null ? 0 : bool.hashCode()) * 31, 31);
        Double d3 = this.createdAt;
        int iHashCode = (iM30448b + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.journalEntryId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.magnitudeInputLabel;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.magnitudeInputValue;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str2 = this.timeInputLabel;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l7 = this.timeInputValue;
        int iHashCode7 = (iHashCode6 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Double d15 = this.updatedAt;
        return iHashCode7 + (d15 != null ? d15.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.answeredYes;
        int i13 = this.behaviorTrackerId;
        Double d3 = this.createdAt;
        Integer num = this.id;
        Integer num2 = this.journalEntryId;
        String str = this.magnitudeInputLabel;
        Double d14 = this.magnitudeInputValue;
        String str2 = this.timeInputLabel;
        Long l7 = this.timeInputValue;
        Double d15 = this.updatedAt;
        StringBuilder sb4 = new StringBuilder("TrackerInputDto(answeredYes=");
        sb4.append(bool);
        sb4.append(", behaviorTrackerId=");
        sb4.append(i13);
        sb4.append(", createdAt=");
        sb4.append(d3);
        sb4.append(", id=");
        sb4.append(num);
        sb4.append(", journalEntryId=");
        AbstractC13673n.m38577x(num2, ", magnitudeInputLabel=", str, ", magnitudeInputValue=", sb4);
        sb4.append(d14);
        sb4.append(", timeInputLabel=");
        sb4.append(str2);
        sb4.append(", timeInputValue=");
        sb4.append(l7);
        sb4.append(", updatedAt=");
        sb4.append(d15);
        sb4.append(")");
        return sb4.toString();
    }

    public final TrackerInput toTrackerInput() {
        return new TrackerInput(this.answeredYes, this.behaviorTrackerId, this.createdAt, this.id, this.journalEntryId, this.magnitudeInputLabel, this.magnitudeInputValue, this.timeInputLabel, this.timeInputValue, this.updatedAt);
    }

    public TrackerInputDto(Boolean bool, int i13, Double d3, Integer num, Integer num2, String str, Double d14, String str2, Long l7, Double d15) {
        this.answeredYes = bool;
        this.behaviorTrackerId = i13;
        this.createdAt = d3;
        this.id = num;
        this.journalEntryId = num2;
        this.magnitudeInputLabel = str;
        this.magnitudeInputValue = d14;
        this.timeInputLabel = str2;
        this.timeInputValue = l7;
        this.updatedAt = d15;
    }

    public /* synthetic */ TrackerInputDto(Boolean bool, int i13, Double d3, Integer num, Integer num2, String str, Double d14, String str2, Long l7, Double d15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, i13, (i14 & 4) != 0 ? null : d3, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2, str, d14, str2, l7, (i14 & 512) != 0 ? null : d15);
    }
}
