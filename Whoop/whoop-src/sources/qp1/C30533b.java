package qp1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qp1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lqp1/b;", "", "Lqp1/e;", "hormonalResult", "Lqp1/a;", "fertilityResult", "<init>", "(Lqp1/e;Lqp1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqp1/e;", "b", "()Lqp1/e;", "Lqp1/a;", "()Lqp1/a;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30533b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC30536e hormonalResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC30532a fertilityResult;

    public C30533b(AbstractC30536e hormonalResult, AbstractC30532a abstractC30532a) {
        AbstractC22676k.m65750j(hormonalResult, "hormonalResult");
        this.hormonalResult = hormonalResult;
        this.fertilityResult = abstractC30532a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC30532a getFertilityResult() {
        return this.fertilityResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC30536e getHormonalResult() {
        return this.hormonalResult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30533b)) {
            return false;
        }
        C30533b c30533b = (C30533b) other;
        return AbstractC22676k.m65745e(this.hormonalResult, c30533b.hormonalResult) && AbstractC22676k.m65745e(this.fertilityResult, c30533b.fertilityResult);
    }

    public int hashCode() {
        int iHashCode = this.hormonalResult.hashCode() * 31;
        AbstractC30532a abstractC30532a = this.fertilityResult;
        return iHashCode + (abstractC30532a == null ? 0 : abstractC30532a.hashCode());
    }

    public String toString() {
        return "HormonalFertilityCombinedState(hormonalResult=" + this.hormonalResult + ", fertilityResult=" + this.fertilityResult + ")";
    }
}
