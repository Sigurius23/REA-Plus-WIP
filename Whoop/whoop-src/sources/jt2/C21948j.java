package jt2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jt2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ljt2/j;", "", "Ljt2/m;", "domainState", "Ljt2/d;", "accumulatedStateForVS", "<init>", "(Ljt2/m;Ljt2/d;)V", "a", "(Ljt2/m;Ljt2/d;)Ljt2/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljt2/m;", "d", "()Ljt2/m;", "b", "Ljt2/d;", "c", "()Ljt2/d;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21948j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21951m domainState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21942d accumulatedStateForVS;

    public C21948j(AbstractC21951m domainState, C21942d accumulatedStateForVS) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(accumulatedStateForVS, "accumulatedStateForVS");
        this.domainState = domainState;
        this.accumulatedStateForVS = accumulatedStateForVS;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21948j m62591b(C21948j c21948j, AbstractC21951m abstractC21951m, C21942d c21942d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC21951m = c21948j.domainState;
        }
        if ((i13 & 2) != 0) {
            c21942d = c21948j.accumulatedStateForVS;
        }
        return c21948j.m62592a(abstractC21951m, c21942d);
    }

    /* JADX INFO: renamed from: a */
    public final C21948j m62592a(AbstractC21951m domainState, C21942d accumulatedStateForVS) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(accumulatedStateForVS, "accumulatedStateForVS");
        return new C21948j(domainState, accumulatedStateForVS);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C21942d getAccumulatedStateForVS() {
        return this.accumulatedStateForVS;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC21951m getDomainState() {
        return this.domainState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21948j)) {
            return false;
        }
        C21948j c21948j = (C21948j) other;
        return AbstractC22676k.m65745e(this.domainState, c21948j.domainState) && AbstractC22676k.m65745e(this.accumulatedStateForVS, c21948j.accumulatedStateForVS);
    }

    public int hashCode() {
        return this.accumulatedStateForVS.hashCode() + (this.domainState.hashCode() * 31);
    }

    public String toString() {
        return "HubAndSpokeCombinedDomainState(domainState=" + this.domainState + ", accumulatedStateForVS=" + this.accumulatedStateForVS + ")";
    }

    public /* synthetic */ C21948j(AbstractC21951m abstractC21951m, C21942d c21942d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21951m.e.f84859a : abstractC21951m, (i13 & 2) != 0 ? new C21942d(null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, 2097151, null) : c21942d);
    }
}
