package com.whoop.service.network.model.cycles;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/service/network/model/cycles/MetricValue;", "", "data", "", "time", "", "<init>", "(IJ)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MetricValue {
    public final int data;
    public final long time;

    public MetricValue() {
        this(0, 0L, 3, null);
    }

    public static /* synthetic */ MetricValue copy$default(MetricValue metricValue, int i13, long j7, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = metricValue.data;
        }
        if ((i14 & 2) != 0) {
            j7 = metricValue.time;
        }
        return metricValue.copy(i13, j7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final MetricValue copy(int data, long time) {
        return new MetricValue(data, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricValue)) {
            return false;
        }
        MetricValue metricValue = (MetricValue) other;
        return this.data == metricValue.data && this.time == metricValue.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time) + (Integer.hashCode(this.data) * 31);
    }

    public String toString() {
        return "MetricValue(data=" + this.data + ", time=" + this.time + ")";
    }

    public MetricValue(int i13, long j7) {
        this.data = i13;
        this.time = j7;
    }

    public /* synthetic */ MetricValue(int i13, long j7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? 0L : j7);
    }
}
