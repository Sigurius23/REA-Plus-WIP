package com.whoop.service.network.model.cycles;

import java.util.Arrays;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/service/network/model/cycles/MetricData;", "", "name", "", "start", "", "values", "", "Lcom/whoop/service/network/model/cycles/MetricValue;", "<init>", "(Ljava/lang/String;J[Lcom/whoop/service/network/model/cycles/MetricValue;)V", "getName", "()Ljava/lang/String;", "getStart", "()J", "getValues", "()[Lcom/whoop/service/network/model/cycles/MetricValue;", "[Lcom/whoop/service/network/model/cycles/MetricValue;", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "(Ljava/lang/String;J[Lcom/whoop/service/network/model/cycles/MetricValue;)Lcom/whoop/service/network/model/cycles/MetricData;", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MetricData {
    private final String name;
    private final long start;
    private final MetricValue[] values;

    public MetricData(String name, long j7, MetricValue[] values) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(values, "values");
        this.name = name;
        this.start = j7;
        this.values = values;
    }

    public static /* synthetic */ MetricData copy$default(MetricData metricData, String str, long j7, MetricValue[] metricValueArr, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = metricData.name;
        }
        if ((i13 & 2) != 0) {
            j7 = metricData.start;
        }
        if ((i13 & 4) != 0) {
            metricValueArr = metricData.values;
        }
        return metricData.copy(str, j7, metricValueArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MetricValue[] getValues() {
        return this.values;
    }

    public final MetricData copy(String name, long start, MetricValue[] values) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(values, "values");
        return new MetricData(name, start, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!MetricData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.service.network.model.cycles.MetricData");
        MetricData metricData = (MetricData) other;
        return AbstractC22676k.m65745e(this.name, metricData.name) && this.start == metricData.start && Arrays.equals(this.values, metricData.values);
    }

    public final String getName() {
        return this.name;
    }

    public final long getStart() {
        return this.start;
    }

    public final MetricValue[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return Arrays.hashCode(this.values) + AbstractC11266d.m30451e(this.name.hashCode() * 31, this.start, 31);
    }

    public String toString() {
        String str = this.name;
        long j7 = this.start;
        return AbstractC2875y.m8304q(AbstractC11895b.m32000s("MetricData(name=", str, j7, ", start="), ", values=", Arrays.toString(this.values), ")");
    }
}
