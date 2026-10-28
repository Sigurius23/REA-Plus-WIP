package com.whoop.data.remote.domain.request;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JV\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010#J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u001a\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b6\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010&¨\u0006;"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/TrackerInputEgg;", "", "", "answeredYes", "", "behaviorTrackerId", "", "timeInputValue", "", "timeInputLabel", "magnitudeInputLabel", "", "magnitudeInputValue", "<init>", "(Ljava/lang/Boolean;ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/request/TrackerInputEgg;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()I", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Ljava/lang/Double;", "copy", "(Ljava/lang/Boolean;ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/request/TrackerInputEgg;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAnsweredYes", "I", "getBehaviorTrackerId", "Ljava/lang/Long;", "getTimeInputValue", "Ljava/lang/String;", "getTimeInputLabel", "getMagnitudeInputLabel", "Ljava/lang/Double;", "getMagnitudeInputValue", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrackerInputEgg {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("answered_yes")
    private final Boolean answeredYes;

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

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/TrackerInputEgg$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/request/TrackerInputEgg;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrackerInputEgg$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrackerInputEgg(int i13, Boolean bool, int i14, Long l7, String str, String str2, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, TrackerInputEgg$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.answeredYes = null;
        } else {
            this.answeredYes = bool;
        }
        this.behaviorTrackerId = i14;
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
    }

    public static /* synthetic */ TrackerInputEgg copy$default(TrackerInputEgg trackerInputEgg, Boolean bool, int i13, Long l7, String str, String str2, Double d3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            bool = trackerInputEgg.answeredYes;
        }
        if ((i14 & 2) != 0) {
            i13 = trackerInputEgg.behaviorTrackerId;
        }
        if ((i14 & 4) != 0) {
            l7 = trackerInputEgg.timeInputValue;
        }
        if ((i14 & 8) != 0) {
            str = trackerInputEgg.timeInputLabel;
        }
        if ((i14 & 16) != 0) {
            str2 = trackerInputEgg.magnitudeInputLabel;
        }
        if ((i14 & 32) != 0) {
            d3 = trackerInputEgg.magnitudeInputValue;
        }
        String str3 = str2;
        Double d14 = d3;
        return trackerInputEgg.copy(bool, i13, l7, str, str3, d14);
    }

    public static final /* synthetic */ void write$Self$core_release(TrackerInputEgg self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.answeredYes != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.answeredYes);
        }
        output.encodeIntElement(serialDesc, 1, self.behaviorTrackerId);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.timeInputValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.timeInputValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.timeInputLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.timeInputLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.magnitudeInputLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.magnitudeInputLabel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.magnitudeInputValue == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, DoubleSerializer.INSTANCE, self.magnitudeInputValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAnsweredYes() {
        return this.answeredYes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBehaviorTrackerId() {
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

    public final TrackerInputEgg copy(Boolean answeredYes, int behaviorTrackerId, Long timeInputValue, String timeInputLabel, String magnitudeInputLabel, Double magnitudeInputValue) {
        return new TrackerInputEgg(answeredYes, behaviorTrackerId, timeInputValue, timeInputLabel, magnitudeInputLabel, magnitudeInputValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackerInputEgg)) {
            return false;
        }
        TrackerInputEgg trackerInputEgg = (TrackerInputEgg) other;
        return AbstractC22676k.m65745e(this.answeredYes, trackerInputEgg.answeredYes) && this.behaviorTrackerId == trackerInputEgg.behaviorTrackerId && AbstractC22676k.m65745e(this.timeInputValue, trackerInputEgg.timeInputValue) && AbstractC22676k.m65745e(this.timeInputLabel, trackerInputEgg.timeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputLabel, trackerInputEgg.magnitudeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputValue, trackerInputEgg.magnitudeInputValue);
    }

    public final Boolean getAnsweredYes() {
        return this.answeredYes;
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
        Boolean bool = this.answeredYes;
        int iM30448b = AbstractC11266d.m30448b(this.behaviorTrackerId, (bool == null ? 0 : bool.hashCode()) * 31, 31);
        Long l7 = this.timeInputValue;
        int iHashCode = (iM30448b + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str = this.timeInputLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.magnitudeInputLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.magnitudeInputValue;
        return iHashCode3 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        return "TrackerInputEgg(answeredYes=" + this.answeredYes + ", behaviorTrackerId=" + this.behaviorTrackerId + ", timeInputValue=" + this.timeInputValue + ", timeInputLabel=" + this.timeInputLabel + ", magnitudeInputLabel=" + this.magnitudeInputLabel + ", magnitudeInputValue=" + this.magnitudeInputValue + ")";
    }

    public TrackerInputEgg(Boolean bool, int i13, Long l7, String str, String str2, Double d3) {
        this.answeredYes = bool;
        this.behaviorTrackerId = i13;
        this.timeInputValue = l7;
        this.timeInputLabel = str;
        this.magnitudeInputLabel = str2;
        this.magnitudeInputValue = d3;
    }

    public /* synthetic */ TrackerInputEgg(Boolean bool, int i13, Long l7, String str, String str2, Double d3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : bool, i13, (i14 & 4) != 0 ? null : l7, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : d3);
    }
}
