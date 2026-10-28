package ca2;

import com.whoop.domain.model.MetricsProcessedTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ca2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lca2/d;", "", "Lcom/whoop/domain/model/MetricsProcessedTime;", "metricsProcessedTime", "Lca2/c;", "newState", "<init>", "(Lcom/whoop/domain/model/MetricsProcessedTime;Lca2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/domain/model/MetricsProcessedTime;", "()Lcom/whoop/domain/model/MetricsProcessedTime;", "b", "Lca2/c;", "()Lca2/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C4364d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MetricsProcessedTime metricsProcessedTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC4363c newState;

    public C4364d(MetricsProcessedTime metricsProcessedTime, EnumC4363c newState) {
        AbstractC22676k.m65750j(metricsProcessedTime, "metricsProcessedTime");
        AbstractC22676k.m65750j(newState, "newState");
        this.metricsProcessedTime = metricsProcessedTime;
        this.newState = newState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final MetricsProcessedTime getMetricsProcessedTime() {
        return this.metricsProcessedTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC4363c getNewState() {
        return this.newState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4364d)) {
            return false;
        }
        C4364d c4364d = (C4364d) other;
        return AbstractC22676k.m65745e(this.metricsProcessedTime, c4364d.metricsProcessedTime) && this.newState == c4364d.newState;
    }

    public int hashCode() {
        return this.newState.hashCode() + (this.metricsProcessedTime.hashCode() * 31);
    }

    public String toString() {
        return "EmitAction(metricsProcessedTime=" + this.metricsProcessedTime + ", newState=" + this.newState + ")";
    }
}
