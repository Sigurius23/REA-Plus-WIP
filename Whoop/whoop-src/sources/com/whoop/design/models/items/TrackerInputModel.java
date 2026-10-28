package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010 Jb\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b6\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b;\u0010 ¨\u0006>"}, m65681d2 = {"Lcom/whoop/design/models/items/TrackerInputModel;", "", "", "behaviorTrackerId", "", "timeInputLabel", "", "timeInputValue", "magnitudeInputLabel", "", "magnitudeInputValue", "", "answeredYes", "source", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TrackerInputModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "component5", "()Ljava/lang/Double;", "component6", "()Ljava/lang/Boolean;", "component7", "copy", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/whoop/design/models/items/TrackerInputModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getBehaviorTrackerId", "Ljava/lang/String;", "getTimeInputLabel", "Ljava/lang/Long;", "getTimeInputValue", "getMagnitudeInputLabel", "Ljava/lang/Double;", "getMagnitudeInputValue", "Ljava/lang/Boolean;", "getAnsweredYes", "getSource", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrackerInputModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean answeredYes;
    private final int behaviorTrackerId;
    private final String magnitudeInputLabel;
    private final Double magnitudeInputValue;
    private final String source;
    private final String timeInputLabel;
    private final Long timeInputValue;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TrackerInputModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TrackerInputModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrackerInputModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrackerInputModel(int i13, int i14, String str, Long l7, String str2, Double d3, Boolean bool, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, TrackerInputModel$$serializer.INSTANCE.getDescriptor());
        }
        this.behaviorTrackerId = i14;
        this.timeInputLabel = str;
        this.timeInputValue = l7;
        this.magnitudeInputLabel = str2;
        this.magnitudeInputValue = d3;
        this.answeredYes = bool;
        this.source = str3;
    }

    public static /* synthetic */ TrackerInputModel copy$default(TrackerInputModel trackerInputModel, int i13, String str, Long l7, String str2, Double d3, Boolean bool, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = trackerInputModel.behaviorTrackerId;
        }
        if ((i14 & 2) != 0) {
            str = trackerInputModel.timeInputLabel;
        }
        if ((i14 & 4) != 0) {
            l7 = trackerInputModel.timeInputValue;
        }
        if ((i14 & 8) != 0) {
            str2 = trackerInputModel.magnitudeInputLabel;
        }
        if ((i14 & 16) != 0) {
            d3 = trackerInputModel.magnitudeInputValue;
        }
        if ((i14 & 32) != 0) {
            bool = trackerInputModel.answeredYes;
        }
        if ((i14 & 64) != 0) {
            str3 = trackerInputModel.source;
        }
        Boolean bool2 = bool;
        String str4 = str3;
        Double d14 = d3;
        Long l12 = l7;
        return trackerInputModel.copy(i13, str, l12, str2, d14, bool2, str4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TrackerInputModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.behaviorTrackerId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.timeInputLabel);
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.timeInputValue);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.magnitudeInputLabel);
        output.encodeNullableSerializableElement(serialDesc, 4, DoubleSerializer.INSTANCE, self.magnitudeInputValue);
        output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.answeredYes);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeInputLabel() {
        return this.timeInputLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimeInputValue() {
        return this.timeInputValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMagnitudeInputLabel() {
        return this.magnitudeInputLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getMagnitudeInputValue() {
        return this.magnitudeInputValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getAnsweredYes() {
        return this.answeredYes;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final TrackerInputModel copy(int behaviorTrackerId, String timeInputLabel, Long timeInputValue, String magnitudeInputLabel, Double magnitudeInputValue, Boolean answeredYes, String source) {
        return new TrackerInputModel(behaviorTrackerId, timeInputLabel, timeInputValue, magnitudeInputLabel, magnitudeInputValue, answeredYes, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackerInputModel)) {
            return false;
        }
        TrackerInputModel trackerInputModel = (TrackerInputModel) other;
        return this.behaviorTrackerId == trackerInputModel.behaviorTrackerId && AbstractC22676k.m65745e(this.timeInputLabel, trackerInputModel.timeInputLabel) && AbstractC22676k.m65745e(this.timeInputValue, trackerInputModel.timeInputValue) && AbstractC22676k.m65745e(this.magnitudeInputLabel, trackerInputModel.magnitudeInputLabel) && AbstractC22676k.m65745e(this.magnitudeInputValue, trackerInputModel.magnitudeInputValue) && AbstractC22676k.m65745e(this.answeredYes, trackerInputModel.answeredYes) && AbstractC22676k.m65745e(this.source, trackerInputModel.source);
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

    public final String getSource() {
        return this.source;
    }

    public final String getTimeInputLabel() {
        return this.timeInputLabel;
    }

    public final Long getTimeInputValue() {
        return this.timeInputValue;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.behaviorTrackerId) * 31;
        String str = this.timeInputLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.timeInputValue;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.magnitudeInputLabel;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.magnitudeInputValue;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.answeredYes;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.source;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.behaviorTrackerId;
        String str = this.timeInputLabel;
        Long l7 = this.timeInputValue;
        String str2 = this.magnitudeInputLabel;
        Double d3 = this.magnitudeInputValue;
        Boolean bool = this.answeredYes;
        String str3 = this.source;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "TrackerInputModel(behaviorTrackerId=", ", timeInputLabel=", str, ", timeInputValue=");
        sbM53373n.append(l7);
        sbM53373n.append(", magnitudeInputLabel=");
        sbM53373n.append(str2);
        sbM53373n.append(", magnitudeInputValue=");
        sbM53373n.append(d3);
        sbM53373n.append(", answeredYes=");
        sbM53373n.append(bool);
        sbM53373n.append(", source=");
        return AbstractC25012a.m73376i(str3, ")", sbM53373n);
    }

    public TrackerInputModel(int i13, String str, Long l7, String str2, Double d3, Boolean bool, String str3) {
        this.behaviorTrackerId = i13;
        this.timeInputLabel = str;
        this.timeInputValue = l7;
        this.magnitudeInputLabel = str2;
        this.magnitudeInputValue = d3;
        this.answeredYes = bool;
        this.source = str3;
    }
}
