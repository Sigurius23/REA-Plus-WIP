package uw1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: uw1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Luw1/g;", "", "Luw1/c;", "familyPlanScreenViewState", "Luw1/d;", "familyPlanInviteScreenViewState", "<init>", "(Luw1/c;Luw1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luw1/c;", "b", "()Luw1/c;", "Luw1/d;", "()Luw1/d;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35314g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35310c familyPlanScreenViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35311d familyPlanInviteScreenViewState;

    public C35314g(C35310c familyPlanScreenViewState, C35311d familyPlanInviteScreenViewState) {
        AbstractC22676k.m65750j(familyPlanScreenViewState, "familyPlanScreenViewState");
        AbstractC22676k.m65750j(familyPlanInviteScreenViewState, "familyPlanInviteScreenViewState");
        this.familyPlanScreenViewState = familyPlanScreenViewState;
        this.familyPlanInviteScreenViewState = familyPlanInviteScreenViewState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C35311d getFamilyPlanInviteScreenViewState() {
        return this.familyPlanInviteScreenViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C35310c getFamilyPlanScreenViewState() {
        return this.familyPlanScreenViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35314g)) {
            return false;
        }
        C35314g c35314g = (C35314g) other;
        return AbstractC22676k.m65745e(this.familyPlanScreenViewState, c35314g.familyPlanScreenViewState) && AbstractC22676k.m65745e(this.familyPlanInviteScreenViewState, c35314g.familyPlanInviteScreenViewState);
    }

    public int hashCode() {
        return this.familyPlanInviteScreenViewState.hashCode() + (this.familyPlanScreenViewState.hashCode() * 31);
    }

    public String toString() {
        return "FamilyPlanViewState(familyPlanScreenViewState=" + this.familyPlanScreenViewState + ", familyPlanInviteScreenViewState=" + this.familyPlanInviteScreenViewState + ")";
    }

    public /* synthetic */ C35314g(C35310c c35310c, C35311d c35311d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C35310c(null, null, null, 7, null) : c35310c, (i13 & 2) != 0 ? new C35311d(null, null, null, 4, null) : c35311d);
    }
}
