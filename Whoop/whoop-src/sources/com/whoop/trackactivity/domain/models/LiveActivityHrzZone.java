package com.whoop.trackactivity.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.DoubleSerializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/models/LiveActivityHrzZone;", "", "", "zone", "", "targetValue", "label", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$track_activity_release", "(Lcom/whoop/trackactivity/domain/models/LiveActivityHrzZone;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/whoop/trackactivity/domain/models/LiveActivityHrzZone;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getZone", "Ljava/lang/Double;", "getTargetValue", "getLabel", "Companion", "$serializer", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LiveActivityHrzZone {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String label;
    private final Double targetValue;
    private final String zone;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/models/LiveActivityHrzZone$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trackactivity/domain/models/LiveActivityHrzZone;", "serializer", "()Lwc3/c;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LiveActivityHrzZone$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LiveActivityHrzZone() {
        this((String) null, (Double) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LiveActivityHrzZone copy$default(LiveActivityHrzZone liveActivityHrzZone, String str, Double d3, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = liveActivityHrzZone.zone;
        }
        if ((i13 & 2) != 0) {
            d3 = liveActivityHrzZone.targetValue;
        }
        if ((i13 & 4) != 0) {
            str2 = liveActivityHrzZone.label;
        }
        return liveActivityHrzZone.copy(str, d3, str2);
    }

    public static final /* synthetic */ void write$Self$track_activity_release(LiveActivityHrzZone self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.zone != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.zone);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.targetValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, DoubleSerializer.INSTANCE, self.targetValue);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.label == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.label);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getZone() {
        return this.zone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getTargetValue() {
        return this.targetValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final LiveActivityHrzZone copy(String zone, Double targetValue, String label) {
        return new LiveActivityHrzZone(zone, targetValue, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveActivityHrzZone)) {
            return false;
        }
        LiveActivityHrzZone liveActivityHrzZone = (LiveActivityHrzZone) other;
        return AbstractC22676k.m65745e(this.zone, liveActivityHrzZone.zone) && AbstractC22676k.m65745e(this.targetValue, liveActivityHrzZone.targetValue) && AbstractC22676k.m65745e(this.label, liveActivityHrzZone.label);
    }

    public final String getLabel() {
        return this.label;
    }

    public final Double getTargetValue() {
        return this.targetValue;
    }

    public final String getZone() {
        return this.zone;
    }

    public int hashCode() {
        String str = this.zone;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d3 = this.targetValue;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str2 = this.label;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.zone;
        Double d3 = this.targetValue;
        String str2 = this.label;
        StringBuilder sb4 = new StringBuilder("LiveActivityHrzZone(zone=");
        sb4.append(str);
        sb4.append(", targetValue=");
        sb4.append(d3);
        sb4.append(", label=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public /* synthetic */ LiveActivityHrzZone(int i13, String str, Double d3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.zone = null;
        } else {
            this.zone = str;
        }
        if ((i13 & 2) == 0) {
            this.targetValue = null;
        } else {
            this.targetValue = d3;
        }
        if ((i13 & 4) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
    }

    public LiveActivityHrzZone(String str, Double d3, String str2) {
        this.zone = str;
        this.targetValue = d3;
        this.label = str2;
    }

    public /* synthetic */ LiveActivityHrzZone(String str, Double d3, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : d3, (i13 & 4) != 0 ? null : str2);
    }
}
