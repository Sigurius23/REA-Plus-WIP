package com.whoop.data.interactor;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import yh2.C39543b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/data/interactor/MetricsHeartDataBundle;", "", "Lyh2/b;", "exportedHeartData", "Lud3/v0;", "fileAsRequestBody", "<init>", "(Lyh2/b;Lud3/v0;)V", "component1", "()Lyh2/b;", "component2", "()Lud3/v0;", "copy", "(Lyh2/b;Lud3/v0;)Lcom/whoop/data/interactor/MetricsHeartDataBundle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyh2/b;", "getExportedHeartData", "Lud3/v0;", "getFileAsRequestBody", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MetricsHeartDataBundle {
    public static final int $stable = 8;
    private final C39543b exportedHeartData;
    private final AbstractC34846v0 fileAsRequestBody;

    public MetricsHeartDataBundle(C39543b exportedHeartData, AbstractC34846v0 fileAsRequestBody) {
        AbstractC22676k.m65750j(exportedHeartData, "exportedHeartData");
        AbstractC22676k.m65750j(fileAsRequestBody, "fileAsRequestBody");
        this.exportedHeartData = exportedHeartData;
        this.fileAsRequestBody = fileAsRequestBody;
    }

    public static /* synthetic */ MetricsHeartDataBundle copy$default(MetricsHeartDataBundle metricsHeartDataBundle, C39543b c39543b, AbstractC34846v0 abstractC34846v0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c39543b = metricsHeartDataBundle.exportedHeartData;
        }
        if ((i13 & 2) != 0) {
            abstractC34846v0 = metricsHeartDataBundle.fileAsRequestBody;
        }
        return metricsHeartDataBundle.copy(c39543b, abstractC34846v0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C39543b getExportedHeartData() {
        return this.exportedHeartData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AbstractC34846v0 getFileAsRequestBody() {
        return this.fileAsRequestBody;
    }

    public final MetricsHeartDataBundle copy(C39543b exportedHeartData, AbstractC34846v0 fileAsRequestBody) {
        AbstractC22676k.m65750j(exportedHeartData, "exportedHeartData");
        AbstractC22676k.m65750j(fileAsRequestBody, "fileAsRequestBody");
        return new MetricsHeartDataBundle(exportedHeartData, fileAsRequestBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricsHeartDataBundle)) {
            return false;
        }
        MetricsHeartDataBundle metricsHeartDataBundle = (MetricsHeartDataBundle) other;
        return AbstractC22676k.m65745e(this.exportedHeartData, metricsHeartDataBundle.exportedHeartData) && AbstractC22676k.m65745e(this.fileAsRequestBody, metricsHeartDataBundle.fileAsRequestBody);
    }

    public final C39543b getExportedHeartData() {
        return this.exportedHeartData;
    }

    public final AbstractC34846v0 getFileAsRequestBody() {
        return this.fileAsRequestBody;
    }

    public int hashCode() {
        return this.fileAsRequestBody.hashCode() + (this.exportedHeartData.hashCode() * 31);
    }

    public String toString() {
        return "MetricsHeartDataBundle(exportedHeartData=" + this.exportedHeartData + ", fileAsRequestBody=" + this.fileAsRequestBody + ")";
    }
}
