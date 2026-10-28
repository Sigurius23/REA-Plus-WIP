package com.whoop.metrics.domain.models;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/metrics/domain/models/MetricEventModel;", "", "featureName", "", "requestName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureName", "()Ljava/lang/String;", "getRequestName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MetricEventModel {
    private final String featureName;
    private final String requestName;

    /* JADX WARN: Multi-variable type inference failed */
    public MetricEventModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MetricEventModel copy$default(MetricEventModel metricEventModel, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = metricEventModel.featureName;
        }
        if ((i13 & 2) != 0) {
            str2 = metricEventModel.requestName;
        }
        return metricEventModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFeatureName() {
        return this.featureName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestName() {
        return this.requestName;
    }

    public final MetricEventModel copy(String featureName, String requestName) {
        return new MetricEventModel(featureName, requestName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricEventModel)) {
            return false;
        }
        MetricEventModel metricEventModel = (MetricEventModel) other;
        return AbstractC22676k.m65745e(this.featureName, metricEventModel.featureName) && AbstractC22676k.m65745e(this.requestName, metricEventModel.requestName);
    }

    public final String getFeatureName() {
        return this.featureName;
    }

    public final String getRequestName() {
        return this.requestName;
    }

    public int hashCode() {
        String str = this.featureName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.requestName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC2875y.m8300m("MetricEventModel(featureName=", this.featureName, ", requestName=", this.requestName, ")");
    }

    public MetricEventModel(String str, String str2) {
        this.featureName = str;
        this.requestName = str2;
    }

    public /* synthetic */ MetricEventModel(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
    }
}
