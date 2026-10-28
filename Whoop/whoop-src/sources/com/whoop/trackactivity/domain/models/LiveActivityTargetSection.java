package com.whoop.trackactivity.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.DoubleSerializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u001b¨\u0006/"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;", "", "", "targetValue", "", "unit", "format", "label", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$track_activity_release", "(Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getTargetValue", "Ljava/lang/String;", "getUnit", "getFormat", "getLabel", "Companion", "$serializer", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LiveActivityTargetSection {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String format;
    private final String label;
    private final Double targetValue;
    private final String unit;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;", "serializer", "()Lwc3/c;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LiveActivityTargetSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LiveActivityTargetSection() {
        this((Double) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LiveActivityTargetSection copy$default(LiveActivityTargetSection liveActivityTargetSection, Double d3, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = liveActivityTargetSection.targetValue;
        }
        if ((i13 & 2) != 0) {
            str = liveActivityTargetSection.unit;
        }
        if ((i13 & 4) != 0) {
            str2 = liveActivityTargetSection.format;
        }
        if ((i13 & 8) != 0) {
            str3 = liveActivityTargetSection.label;
        }
        return liveActivityTargetSection.copy(d3, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$track_activity_release(LiveActivityTargetSection self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.targetValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.targetValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.unit != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.unit);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.format != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.format);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.label == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.label);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getTargetValue() {
        return this.targetValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final LiveActivityTargetSection copy(Double targetValue, String unit, String format, String label) {
        return new LiveActivityTargetSection(targetValue, unit, format, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveActivityTargetSection)) {
            return false;
        }
        LiveActivityTargetSection liveActivityTargetSection = (LiveActivityTargetSection) other;
        return AbstractC22676k.m65745e(this.targetValue, liveActivityTargetSection.targetValue) && AbstractC22676k.m65745e(this.unit, liveActivityTargetSection.unit) && AbstractC22676k.m65745e(this.format, liveActivityTargetSection.format) && AbstractC22676k.m65745e(this.label, liveActivityTargetSection.label);
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Double getTargetValue() {
        return this.targetValue;
    }

    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        Double d3 = this.targetValue;
        int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
        String str = this.unit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.format;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Double d3 = this.targetValue;
        String str = this.unit;
        String str2 = this.format;
        String str3 = this.label;
        StringBuilder sb4 = new StringBuilder("LiveActivityTargetSection(targetValue=");
        sb4.append(d3);
        sb4.append(", unit=");
        sb4.append(str);
        sb4.append(", format=");
        return AbstractC11266d.m30464r(sb4, str2, ", label=", str3, ")");
    }

    public /* synthetic */ LiveActivityTargetSection(int i13, Double d3, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.targetValue = null;
        } else {
            this.targetValue = d3;
        }
        if ((i13 & 2) == 0) {
            this.unit = null;
        } else {
            this.unit = str;
        }
        if ((i13 & 4) == 0) {
            this.format = null;
        } else {
            this.format = str2;
        }
        if ((i13 & 8) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
    }

    public LiveActivityTargetSection(Double d3, String str, String str2, String str3) {
        this.targetValue = d3;
        this.unit = str;
        this.format = str2;
        this.label = str3;
    }

    public /* synthetic */ LiveActivityTargetSection(Double d3, String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : d3, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }
}
