package com.whoop.data.remote.domain.dto.healthmonitor;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import yo0.C39681c;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(Jj\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b8\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b9\u0010\"R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010(¨\u0006>"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;", "", "", "current_value", "current_deviation", "", "metric", "", "range_calibrating", "alert_type", "alert_status", "", "Lcom/whoop/data/remote/domain/dto/healthmonitor/Ranges;", "ranges", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getCurrent_value", "getCurrent_deviation", "Ljava/lang/String;", "getMetric", "Ljava/lang/Boolean;", "getRange_calibrating", "getAlert_type", "getAlert_status", "Ljava/util/List;", "getRanges", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthMonitorMetric {

    @SerializedName("alert_status")
    private final String alert_status;

    @SerializedName("alert_type")
    private final String alert_type;

    @SerializedName("current_deviation")
    private final Double current_deviation;

    @SerializedName("current_value")
    private final Double current_value;

    @SerializedName("metric")
    private final String metric;

    @SerializedName("range_calibrating")
    private final Boolean range_calibrating;

    @SerializedName("ranges")
    private final List<Ranges> ranges;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39681c(14))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthMonitorMetric$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthMonitorMetric(int i13, Double d3, Double d14, String str, Boolean bool, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, HealthMonitorMetric$$serializer.INSTANCE.getDescriptor());
        }
        this.current_value = d3;
        this.current_deviation = d14;
        this.metric = str;
        this.range_calibrating = bool;
        this.alert_type = str2;
        this.alert_status = str3;
        this.ranges = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Ranges$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthMonitorMetric copy$default(HealthMonitorMetric healthMonitorMetric, Double d3, Double d14, String str, Boolean bool, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = healthMonitorMetric.current_value;
        }
        if ((i13 & 2) != 0) {
            d14 = healthMonitorMetric.current_deviation;
        }
        if ((i13 & 4) != 0) {
            str = healthMonitorMetric.metric;
        }
        if ((i13 & 8) != 0) {
            bool = healthMonitorMetric.range_calibrating;
        }
        if ((i13 & 16) != 0) {
            str2 = healthMonitorMetric.alert_type;
        }
        if ((i13 & 32) != 0) {
            str3 = healthMonitorMetric.alert_status;
        }
        if ((i13 & 64) != 0) {
            list = healthMonitorMetric.ranges;
        }
        String str4 = str3;
        List list2 = list;
        String str5 = str2;
        String str6 = str;
        return healthMonitorMetric.copy(d3, d14, str6, bool, str5, str4, list2);
    }

    public static final /* synthetic */ void write$Self$core_release(HealthMonitorMetric self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, doubleSerializer, self.current_value);
        output.encodeNullableSerializableElement(serialDesc, 1, doubleSerializer, self.current_deviation);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.metric);
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.range_calibrating);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.alert_type);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.alert_status);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.ranges);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getCurrent_value() {
        return this.current_value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getCurrent_deviation() {
        return this.current_deviation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMetric() {
        return this.metric;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getRange_calibrating() {
        return this.range_calibrating;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAlert_type() {
        return this.alert_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAlert_status() {
        return this.alert_status;
    }

    public final List<Ranges> component7() {
        return this.ranges;
    }

    public final HealthMonitorMetric copy(Double current_value, Double current_deviation, String metric, Boolean range_calibrating, String alert_type, String alert_status, List<Ranges> ranges) {
        return new HealthMonitorMetric(current_value, current_deviation, metric, range_calibrating, alert_type, alert_status, ranges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthMonitorMetric)) {
            return false;
        }
        HealthMonitorMetric healthMonitorMetric = (HealthMonitorMetric) other;
        return AbstractC22676k.m65745e(this.current_value, healthMonitorMetric.current_value) && AbstractC22676k.m65745e(this.current_deviation, healthMonitorMetric.current_deviation) && AbstractC22676k.m65745e(this.metric, healthMonitorMetric.metric) && AbstractC22676k.m65745e(this.range_calibrating, healthMonitorMetric.range_calibrating) && AbstractC22676k.m65745e(this.alert_type, healthMonitorMetric.alert_type) && AbstractC22676k.m65745e(this.alert_status, healthMonitorMetric.alert_status) && AbstractC22676k.m65745e(this.ranges, healthMonitorMetric.ranges);
    }

    public final String getAlert_status() {
        return this.alert_status;
    }

    public final String getAlert_type() {
        return this.alert_type;
    }

    public final Double getCurrent_deviation() {
        return this.current_deviation;
    }

    public final Double getCurrent_value() {
        return this.current_value;
    }

    public final String getMetric() {
        return this.metric;
    }

    public final Boolean getRange_calibrating() {
        return this.range_calibrating;
    }

    public final List<Ranges> getRanges() {
        return this.ranges;
    }

    public int hashCode() {
        Double d3 = this.current_value;
        int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
        Double d14 = this.current_deviation;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.metric;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.range_calibrating;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.alert_type;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.alert_status;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Ranges> list = this.ranges;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Double d3 = this.current_value;
        Double d14 = this.current_deviation;
        String str = this.metric;
        Boolean bool = this.range_calibrating;
        String str2 = this.alert_type;
        String str3 = this.alert_status;
        List<Ranges> list = this.ranges;
        StringBuilder sb4 = new StringBuilder("HealthMonitorMetric(current_value=");
        sb4.append(d3);
        sb4.append(", current_deviation=");
        sb4.append(d14);
        sb4.append(", metric=");
        AbstractC36095b.m114692t(bool, str, ", range_calibrating=", ", alert_type=", sb4);
        AbstractC11266d.m30444B(sb4, str2, ", alert_status=", str3, ", ranges=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public HealthMonitorMetric(Double d3, Double d14, String str, Boolean bool, String str2, String str3, List<Ranges> list) {
        this.current_value = d3;
        this.current_deviation = d14;
        this.metric = str;
        this.range_calibrating = bool;
        this.alert_type = str2;
        this.alert_status = str3;
        this.ranges = list;
    }
}
