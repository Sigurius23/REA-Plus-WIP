package g72;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g72.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lg72/d;", "", "Lg72/b;", "accumulatedState", "Lg72/b$g;", "lastSuccessState", "<init>", "(Lg72/b;Lg72/b$g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg72/b;", "()Lg72/b;", "b", "Lg72/b$g;", "()Lg72/b$g;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C15550d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC15548b accumulatedState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC15548b.g lastSuccessState;

    public C15550d(AbstractC15548b accumulatedState, AbstractC15548b.g gVar) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        this.accumulatedState = accumulatedState;
        this.lastSuccessState = gVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC15548b getAccumulatedState() {
        return this.accumulatedState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC15548b.g getLastSuccessState() {
        return this.lastSuccessState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15550d)) {
            return false;
        }
        C15550d c15550d = (C15550d) other;
        return AbstractC22676k.m65745e(this.accumulatedState, c15550d.accumulatedState) && AbstractC22676k.m65745e(this.lastSuccessState, c15550d.lastSuccessState);
    }

    public int hashCode() {
        int iHashCode = this.accumulatedState.hashCode() * 31;
        AbstractC15548b.g gVar = this.lastSuccessState;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public String toString() {
        return "SageOnboardingInteractorAccumulation(accumulatedState=" + this.accumulatedState + ", lastSuccessState=" + this.lastSuccessState + ")";
    }

    public /* synthetic */ C15550d(AbstractC15548b abstractC15548b, AbstractC15548b.g gVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC15548b, (i13 & 2) != 0 ? null : gVar);
    }
}
