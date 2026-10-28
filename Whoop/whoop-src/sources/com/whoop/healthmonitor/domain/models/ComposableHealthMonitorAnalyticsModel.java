package com.whoop.healthmonitor.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;", "", "", "highestSeverityStatus", "", "metricsWithValues", "metricsInRange", "", "ranges", "<init>", "(Ljava/lang/String;IILjava/util/Map;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_monitor_release", "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;IILjava/util/Map;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHighestSeverityStatus", "I", "getMetricsWithValues", "getMetricsInRange", "Ljava/util/Map;", "getRanges", "Companion", "$serializer", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ComposableHealthMonitorAnalyticsModel {
    private final String highestSeverityStatus;
    private final int metricsInRange;
    private final int metricsWithValues;
    private final Map<String, String> ranges;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39434a(7))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;", "serializer", "()Lwc3/c;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ComposableHealthMonitorAnalyticsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ComposableHealthMonitorAnalyticsModel(int i13, String str, int i14, int i15, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ComposableHealthMonitorAnalyticsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.highestSeverityStatus = str;
        this.metricsWithValues = i14;
        this.metricsInRange = i15;
        this.ranges = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposableHealthMonitorAnalyticsModel copy$default(ComposableHealthMonitorAnalyticsModel composableHealthMonitorAnalyticsModel, String str, int i13, int i14, Map map, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = composableHealthMonitorAnalyticsModel.highestSeverityStatus;
        }
        if ((i15 & 2) != 0) {
            i13 = composableHealthMonitorAnalyticsModel.metricsWithValues;
        }
        if ((i15 & 4) != 0) {
            i14 = composableHealthMonitorAnalyticsModel.metricsInRange;
        }
        if ((i15 & 8) != 0) {
            map = composableHealthMonitorAnalyticsModel.ranges;
        }
        return composableHealthMonitorAnalyticsModel.copy(str, i13, i14, map);
    }

    public static final /* synthetic */ void write$Self$health_monitor_release(ComposableHealthMonitorAnalyticsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.highestSeverityStatus);
        output.encodeIntElement(serialDesc, 1, self.metricsWithValues);
        output.encodeIntElement(serialDesc, 2, self.metricsInRange);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.ranges);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHighestSeverityStatus() {
        return this.highestSeverityStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMetricsWithValues() {
        return this.metricsWithValues;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMetricsInRange() {
        return this.metricsInRange;
    }

    public final Map<String, String> component4() {
        return this.ranges;
    }

    public final ComposableHealthMonitorAnalyticsModel copy(String highestSeverityStatus, int metricsWithValues, int metricsInRange, Map<String, String> ranges) {
        AbstractC22676k.m65750j(highestSeverityStatus, "highestSeverityStatus");
        AbstractC22676k.m65750j(ranges, "ranges");
        return new ComposableHealthMonitorAnalyticsModel(highestSeverityStatus, metricsWithValues, metricsInRange, ranges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposableHealthMonitorAnalyticsModel)) {
            return false;
        }
        ComposableHealthMonitorAnalyticsModel composableHealthMonitorAnalyticsModel = (ComposableHealthMonitorAnalyticsModel) other;
        return AbstractC22676k.m65745e(this.highestSeverityStatus, composableHealthMonitorAnalyticsModel.highestSeverityStatus) && this.metricsWithValues == composableHealthMonitorAnalyticsModel.metricsWithValues && this.metricsInRange == composableHealthMonitorAnalyticsModel.metricsInRange && AbstractC22676k.m65745e(this.ranges, composableHealthMonitorAnalyticsModel.ranges);
    }

    public final String getHighestSeverityStatus() {
        return this.highestSeverityStatus;
    }

    public final int getMetricsInRange() {
        return this.metricsInRange;
    }

    public final int getMetricsWithValues() {
        return this.metricsWithValues;
    }

    public final Map<String, String> getRanges() {
        return this.ranges;
    }

    public int hashCode() {
        return this.ranges.hashCode() + AbstractC11266d.m30448b(this.metricsInRange, AbstractC11266d.m30448b(this.metricsWithValues, this.highestSeverityStatus.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.highestSeverityStatus;
        int i13 = this.metricsWithValues;
        int i14 = this.metricsInRange;
        Map<String, String> map = this.ranges;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "ComposableHealthMonitorAnalyticsModel(highestSeverityStatus=", str, ", metricsWithValues=", ", metricsInRange=");
        sbM30467u.append(i14);
        sbM30467u.append(", ranges=");
        sbM30467u.append(map);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public ComposableHealthMonitorAnalyticsModel(String highestSeverityStatus, int i13, int i14, Map<String, String> ranges) {
        AbstractC22676k.m65750j(highestSeverityStatus, "highestSeverityStatus");
        AbstractC22676k.m65750j(ranges, "ranges");
        this.highestSeverityStatus = highestSeverityStatus;
        this.metricsWithValues = i13;
        this.metricsInRange = i14;
        this.ranges = ranges;
    }
}
