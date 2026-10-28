package kj2;

import com.whoop.stress.domain.model.StressIntervention;
import ih0.AbstractC18489d0;
import nj2.AbstractC26771r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kj2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Lkj2/i;", "", "Lcom/whoop/stress/domain/model/StressIntervention;", "intervention", "Lnj2/r;", "domainState", "", "totalRounds", "<init>", "(Lcom/whoop/stress/domain/model/StressIntervention;Lnj2/r;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/stress/domain/model/StressIntervention;", "b", "()Lcom/whoop/stress/domain/model/StressIntervention;", "Lnj2/r;", "()Lnj2/r;", "c", "I", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C22525i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StressIntervention intervention;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC26771r domainState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int totalRounds;

    public C22525i(StressIntervention stressIntervention, AbstractC26771r abstractC26771r, int i13) {
        this.intervention = stressIntervention;
        this.domainState = abstractC26771r;
        this.totalRounds = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC26771r getDomainState() {
        return this.domainState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final StressIntervention getIntervention() {
        return this.intervention;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTotalRounds() {
        return this.totalRounds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22525i)) {
            return false;
        }
        C22525i c22525i = (C22525i) other;
        return AbstractC22676k.m65745e(this.intervention, c22525i.intervention) && AbstractC22676k.m65745e(this.domainState, c22525i.domainState) && this.totalRounds == c22525i.totalRounds;
    }

    public int hashCode() {
        StressIntervention stressIntervention = this.intervention;
        int iHashCode = (stressIntervention == null ? 0 : stressIntervention.hashCode()) * 31;
        AbstractC26771r abstractC26771r = this.domainState;
        return Integer.hashCode(this.totalRounds) + ((iHashCode + (abstractC26771r != null ? abstractC26771r.hashCode() : 0)) * 31);
    }

    public String toString() {
        StressIntervention stressIntervention = this.intervention;
        AbstractC26771r abstractC26771r = this.domainState;
        int i13 = this.totalRounds;
        StringBuilder sb4 = new StringBuilder("StressInterventionAccumulator(intervention=");
        sb4.append(stressIntervention);
        sb4.append(", domainState=");
        sb4.append(abstractC26771r);
        sb4.append(", totalRounds=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }

    public /* synthetic */ C22525i(StressIntervention stressIntervention, AbstractC26771r abstractC26771r, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : stressIntervention, (i14 & 2) != 0 ? null : abstractC26771r, (i14 & 4) != 0 ? 0 : i13);
    }
}
