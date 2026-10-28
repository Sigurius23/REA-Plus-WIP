package oo1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oo1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Loo1/c;", "", "Loo1/f;", "domainResult", "Loo1/h;", "localState", "<init>", "(Loo1/f;Loo1/h;)V", "a", "()Loo1/f;", "b", "()Loo1/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loo1/f;", "getDomainResult", "Loo1/h;", "getLocalState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28057c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC28060f domainResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC28062h localState;

    public C28057c(AbstractC28060f domainResult, AbstractC28062h localState) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(localState, "localState");
        this.domainResult = domainResult;
        this.localState = localState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC28060f getDomainResult() {
        return this.domainResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC28062h getLocalState() {
        return this.localState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28057c)) {
            return false;
        }
        C28057c c28057c = (C28057c) other;
        return AbstractC22676k.m65745e(this.domainResult, c28057c.domainResult) && AbstractC22676k.m65745e(this.localState, c28057c.localState);
    }

    public int hashCode() {
        return this.localState.hashCode() + (this.domainResult.hashCode() * 31);
    }

    public String toString() {
        return "MciOverviewCombinedResult(domainResult=" + this.domainResult + ", localState=" + this.localState + ")";
    }
}
