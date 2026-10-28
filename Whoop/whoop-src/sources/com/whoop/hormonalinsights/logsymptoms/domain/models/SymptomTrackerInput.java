package com.whoop.hormonalinsights.logsymptoms.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)Jb\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b:\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b\r\u0010)¨\u0006A"}, m65681d2 = {"Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;", "", "", "answeredYes", "", "behaviorTrackerId", "", "timeInputValue", "", "timeInputLabel", "magnitudeInputLabel", "", "magnitudeInputValue", "isSuggested", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Ljava/lang/Double;", "component7", "()Z", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAnsweredYes", "Ljava/lang/Integer;", "getBehaviorTrackerId", "Ljava/lang/Long;", "getTimeInputValue", "Ljava/lang/String;", "getTimeInputLabel", "getMagnitudeInputLabel", "Ljava/lang/Double;", "getMagnitudeInputValue", "Z", "Companion", "$serializer", "a", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SymptomTrackerInput {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean answeredYes;
    private final Integer behaviorTrackerId;
    private final boolean isSuggested;
    private final String magnitudeInputLabel;
    private final Double magnitudeInputValue;
    private final String timeInputLabel;
    private final Long timeInputValue;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.logsymptoms.domain.models.SymptomTrackerInput$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SymptomTrackerInput$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SymptomTrackerInput() {
        this((Boolean) null, (Integer) null, (Long) null, (String) null, (String) null, (Double) null, false, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SymptomTrackerInput copy$default(SymptomTrackerInput symptomTrackerInput, Boolean bool, Integer num, Long l7, String str, String str2, Double d3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = symptomTrackerInput.answeredYes;
        }
        if ((i13 & 2) != 0) {
            num = symptomTrackerInput.behaviorTrackerId;
        }
        if ((i13 & 4) != 0) {
            l7 = symptomTrackerInput.timeInputValue;
        }
        if ((i13 & 8) != 0) {
            str = symptomTrackerInput.timeInputLabel;
        }
        if ((i13 & 16) != 0) {
            str2 = symptomTrackerInput.magnitudeInputLabel;
        }
        if ((i13 & 32) != 0) {
            d3 = symptomTrackerInput.magnitudeInputValue;
        }
        if ((i13 & 64) != 0) {
            z4 = symptomTrackerInput.isSuggested;
        }
        Double d14 = d3;
        boolean z13 = z4;
        String str3 = str2;
        Long l12 = l7;
        return symptomTrackerInput.copy(bool, num, l12, str, str3, d14, z13);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(SymptomTrackerInput self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.answeredYes != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.answeredYes);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.behaviorTrackerId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.behaviorTrackerId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.timeInputValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.timeInputValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.timeInputLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.timeInputLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.magnitudeInputLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.magnitudeInputLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.magnitudeInputValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, DoubleSerializer.INSTANCE, self.magnitudeInputValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.isSuggested) {
            output.encodeBooleanElement(serialDesc, 6, self.isSuggested);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAnsweredYes() {
        return this.answeredYes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBehaviorTrackerId() {
        return this.behaviorTrackerId;
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

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSuggested() {
        return this.isSuggested;
    }

    public final SymptomTrackerInput copy(Boolean answeredYes, Integer behaviorTrackerId, Long timeInputValue, String timeInputLabel, String magnitudeInputLabel, Double magnitudeInputValue, boolean isSuggested) {
        return new SymptomTrackerInput(answeredYes, behaviorTrackerId, timeInputValue, timeInputLabel, magnitudeInputLabel, magnitudeInputValue, isSuggested);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymptomTrackerInput)) {
            return false;
        }
        SymptomTrackerInput symptomTrackerInput = (SymptomTrackerInput) other;
        return AbstractC22676k.m65745e(this.answeredYes, symptomTrackerInput.answeredYes) && AbstractC22676k.m65745e(this.behaviorTrackerId, symptomTrackerInput.behaviorTrackerId) && AbstractC22676k.m65745e(this.timeInputValue, symptomTrackerInput.timeInputValue) && AbstractC22676k.m65745e(this.timeInputLabel, symptomTrackerInput.timeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputLabel, symptomTrackerInput.magnitudeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputValue, symptomTrackerInput.magnitudeInputValue) && this.isSuggested == symptomTrackerInput.isSuggested;
    }

    public final Boolean getAnsweredYes() {
        return this.answeredYes;
    }

    public final Integer getBehaviorTrackerId() {
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
        Boolean bool = this.answeredYes;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.behaviorTrackerId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l7 = this.timeInputValue;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str = this.timeInputLabel;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.magnitudeInputLabel;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.magnitudeInputValue;
        return Boolean.hashCode(this.isSuggested) + ((iHashCode5 + (d3 != null ? d3.hashCode() : 0)) * 31);
    }

    public final boolean isSuggested() {
        return this.isSuggested;
    }

    public String toString() {
        Boolean bool = this.answeredYes;
        Integer num = this.behaviorTrackerId;
        Long l7 = this.timeInputValue;
        String str = this.timeInputLabel;
        String str2 = this.magnitudeInputLabel;
        Double d3 = this.magnitudeInputValue;
        boolean z4 = this.isSuggested;
        StringBuilder sb4 = new StringBuilder("SymptomTrackerInput(answeredYes=");
        sb4.append(bool);
        sb4.append(", behaviorTrackerId=");
        sb4.append(num);
        sb4.append(", timeInputValue=");
        sb4.append(l7);
        sb4.append(", timeInputLabel=");
        sb4.append(str);
        sb4.append(", magnitudeInputLabel=");
        sb4.append(str2);
        sb4.append(", magnitudeInputValue=");
        sb4.append(d3);
        sb4.append(", isSuggested=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ SymptomTrackerInput(int i13, Boolean bool, Integer num, Long l7, String str, String str2, Double d3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.answeredYes = null;
        } else {
            this.answeredYes = bool;
        }
        if ((i13 & 2) == 0) {
            this.behaviorTrackerId = null;
        } else {
            this.behaviorTrackerId = num;
        }
        if ((i13 & 4) == 0) {
            this.timeInputValue = null;
        } else {
            this.timeInputValue = l7;
        }
        if ((i13 & 8) == 0) {
            this.timeInputLabel = null;
        } else {
            this.timeInputLabel = str;
        }
        if ((i13 & 16) == 0) {
            this.magnitudeInputLabel = null;
        } else {
            this.magnitudeInputLabel = str2;
        }
        if ((i13 & 32) == 0) {
            this.magnitudeInputValue = null;
        } else {
            this.magnitudeInputValue = d3;
        }
        if ((i13 & 64) == 0) {
            this.isSuggested = false;
        } else {
            this.isSuggested = z4;
        }
    }

    public SymptomTrackerInput(Boolean bool, Integer num, Long l7, String str, String str2, Double d3, boolean z4) {
        this.answeredYes = bool;
        this.behaviorTrackerId = num;
        this.timeInputValue = l7;
        this.timeInputLabel = str;
        this.magnitudeInputLabel = str2;
        this.magnitudeInputValue = d3;
        this.isSuggested = z4;
    }

    public /* synthetic */ SymptomTrackerInput(Boolean bool, Integer num, Long l7, String str, String str2, Double d3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : l7, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : d3, (i13 & 64) != 0 ? false : z4);
    }
}
