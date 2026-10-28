package com.whoop.trends.data.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;", "", "", "timestamp", "", "weightKg", "bodyFatPercent", "leanBodyMassKg", "<init>", "(Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "()Ljava/lang/Double;", "component4", "copy", "(Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;)Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTimestamp", "D", "getWeightKg", "Ljava/lang/Double;", "getBodyFatPercent", "getLeanBodyMassKg", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ManualMeasurementRequestBody {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double bodyFatPercent;
    private final Double leanBodyMassKg;
    private final String timestamp;
    private final double weightKg;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/ManualMeasurementRequestBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ManualMeasurementRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ManualMeasurementRequestBody(int i13, String str, double d3, Double d14, Double d15, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ManualMeasurementRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = str;
        this.weightKg = d3;
        this.bodyFatPercent = d14;
        this.leanBodyMassKg = d15;
    }

    public static /* synthetic */ ManualMeasurementRequestBody copy$default(ManualMeasurementRequestBody manualMeasurementRequestBody, String str, double d3, Double d14, Double d15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = manualMeasurementRequestBody.timestamp;
        }
        if ((i13 & 2) != 0) {
            d3 = manualMeasurementRequestBody.weightKg;
        }
        if ((i13 & 4) != 0) {
            d14 = manualMeasurementRequestBody.bodyFatPercent;
        }
        if ((i13 & 8) != 0) {
            d15 = manualMeasurementRequestBody.leanBodyMassKg;
        }
        return manualMeasurementRequestBody.copy(str, d3, d14, d15);
    }

    public static final /* synthetic */ void write$Self$trends_release(ManualMeasurementRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.timestamp);
        output.encodeDoubleElement(serialDesc, 1, self.weightKg);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, doubleSerializer, self.bodyFatPercent);
        output.encodeNullableSerializableElement(serialDesc, 3, doubleSerializer, self.leanBodyMassKg);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getWeightKg() {
        return this.weightKg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getBodyFatPercent() {
        return this.bodyFatPercent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getLeanBodyMassKg() {
        return this.leanBodyMassKg;
    }

    public final ManualMeasurementRequestBody copy(String timestamp, double weightKg, Double bodyFatPercent, Double leanBodyMassKg) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        return new ManualMeasurementRequestBody(timestamp, weightKg, bodyFatPercent, leanBodyMassKg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualMeasurementRequestBody)) {
            return false;
        }
        ManualMeasurementRequestBody manualMeasurementRequestBody = (ManualMeasurementRequestBody) other;
        return AbstractC22676k.m65745e(this.timestamp, manualMeasurementRequestBody.timestamp) && Double.compare(this.weightKg, manualMeasurementRequestBody.weightKg) == 0 && AbstractC22676k.m65745e(this.bodyFatPercent, manualMeasurementRequestBody.bodyFatPercent) && AbstractC22676k.m65745e(this.leanBodyMassKg, manualMeasurementRequestBody.leanBodyMassKg);
    }

    public final Double getBodyFatPercent() {
        return this.bodyFatPercent;
    }

    public final Double getLeanBodyMassKg() {
        return this.leanBodyMassKg;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final double getWeightKg() {
        return this.weightKg;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(this.timestamp.hashCode() * 31, 31, this.weightKg);
        Double d3 = this.bodyFatPercent;
        int iHashCode = (iM48499a + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.leanBodyMassKg;
        return iHashCode + (d14 != null ? d14.hashCode() : 0);
    }

    public String toString() {
        return "ManualMeasurementRequestBody(timestamp=" + this.timestamp + ", weightKg=" + this.weightKg + ", bodyFatPercent=" + this.bodyFatPercent + ", leanBodyMassKg=" + this.leanBodyMassKg + ")";
    }

    public ManualMeasurementRequestBody(String timestamp, double d3, Double d14, Double d15) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        this.timestamp = timestamp;
        this.weightKg = d3;
        this.bodyFatPercent = d14;
        this.leanBodyMassKg = d15;
    }
}
