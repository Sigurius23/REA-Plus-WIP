package v31;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lv31/a;", "", "Lv31/b;", "type", "", "discreteStepTotal", "discreteFilledTotal", "", "continuousProgress", "<init>", "(Lv31/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv31/b;", "d", "()Lv31/b;", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ljava/lang/Float;", "()Ljava/lang/Float;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35605a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC35606b type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer discreteStepTotal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer discreteFilledTotal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Float continuousProgress;

    public C35605a(EnumC35606b type, Integer num, Integer num2, Float f13) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.discreteStepTotal = num;
        this.discreteFilledTotal = num2;
        this.continuousProgress = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getContinuousProgress() {
        return this.continuousProgress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDiscreteFilledTotal() {
        return this.discreteFilledTotal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getDiscreteStepTotal() {
        return this.discreteStepTotal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC35606b getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35605a)) {
            return false;
        }
        C35605a c35605a = (C35605a) other;
        return this.type == c35605a.type && AbstractC22676k.m65745e(this.discreteStepTotal, c35605a.discreteStepTotal) && AbstractC22676k.m65745e(this.discreteFilledTotal, c35605a.discreteFilledTotal) && AbstractC22676k.m65745e(this.continuousProgress, c35605a.continuousProgress);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Integer num = this.discreteStepTotal;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discreteFilledTotal;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f13 = this.continuousProgress;
        return iHashCode3 + (f13 != null ? f13.hashCode() : 0);
    }

    public String toString() {
        return "StepperBar(type=" + this.type + ", discreteStepTotal=" + this.discreteStepTotal + ", discreteFilledTotal=" + this.discreteFilledTotal + ", continuousProgress=" + this.continuousProgress + ")";
    }
}
