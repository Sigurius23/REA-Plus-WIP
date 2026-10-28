package qx0;

import hf1.InterfaceC17234a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qx0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lqx0/c;", "", "Lhf1/a;", "experiment", "", "currentVariant", "<init>", "(Lhf1/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhf1/a;", "b", "()Lhf1/a;", "Ljava/lang/String;", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30747c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC17234a experiment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String currentVariant;

    public C30747c(InterfaceC17234a experiment, String currentVariant) {
        AbstractC22676k.m65750j(experiment, "experiment");
        AbstractC22676k.m65750j(currentVariant, "currentVariant");
        this.experiment = experiment;
        this.currentVariant = currentVariant;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrentVariant() {
        return this.currentVariant;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC17234a getExperiment() {
        return this.experiment;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30747c)) {
            return false;
        }
        C30747c c30747c = (C30747c) other;
        return AbstractC22676k.m65745e(this.experiment, c30747c.experiment) && AbstractC22676k.m65745e(this.currentVariant, c30747c.currentVariant);
    }

    public int hashCode() {
        return this.currentVariant.hashCode() + (this.experiment.hashCode() * 31);
    }

    public String toString() {
        return "ExperimentCard(experiment=" + this.experiment + ", currentVariant=" + this.currentVariant + ")";
    }
}
