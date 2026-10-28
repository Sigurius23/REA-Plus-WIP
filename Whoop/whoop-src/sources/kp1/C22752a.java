package kp1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kp1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lkp1/a;", "", "Lkp1/d;", "domainResult", "Lkp1/f;", "localState", "<init>", "(Lkp1/d;Lkp1/f;)V", "a", "()Lkp1/d;", "b", "()Lkp1/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkp1/d;", "getDomainResult", "Lkp1/f;", "getLocalState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22752a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22755d domainResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22757f localState;

    public C22752a(AbstractC22755d domainResult, AbstractC22757f localState) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(localState, "localState");
        this.domainResult = domainResult;
        this.localState = localState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22755d getDomainResult() {
        return this.domainResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22757f getLocalState() {
        return this.localState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22752a)) {
            return false;
        }
        C22752a c22752a = (C22752a) other;
        return AbstractC22676k.m65745e(this.domainResult, c22752a.domainResult) && AbstractC22676k.m65745e(this.localState, c22752a.localState);
    }

    public int hashCode() {
        return this.localState.hashCode() + (this.domainResult.hashCode() * 31);
    }

    public String toString() {
        return "PregnancyInsightsCombinedResult(domainResult=" + this.domainResult + ", localState=" + this.localState + ")";
    }
}
