package ow1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pw1.C29586b;
import qw1.C30689c;

/* JADX INFO: renamed from: ow1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Low1/a;", "", "Lpw1/b;", "familyPlanScreen", "Lqw1/c;", "inviteFamilyMemberScreen", "<init>", "(Lpw1/b;Lqw1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpw1/b;", "()Lpw1/b;", "b", "Lqw1/c;", "()Lqw1/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28436a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29586b familyPlanScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30689c inviteFamilyMemberScreen;

    public C28436a(C29586b familyPlanScreen, C30689c inviteFamilyMemberScreen) {
        AbstractC22676k.m65750j(familyPlanScreen, "familyPlanScreen");
        AbstractC22676k.m65750j(inviteFamilyMemberScreen, "inviteFamilyMemberScreen");
        this.familyPlanScreen = familyPlanScreen;
        this.inviteFamilyMemberScreen = inviteFamilyMemberScreen;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C29586b getFamilyPlanScreen() {
        return this.familyPlanScreen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C30689c getInviteFamilyMemberScreen() {
        return this.inviteFamilyMemberScreen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28436a)) {
            return false;
        }
        C28436a c28436a = (C28436a) other;
        return AbstractC22676k.m65745e(this.familyPlanScreen, c28436a.familyPlanScreen) && AbstractC22676k.m65745e(this.inviteFamilyMemberScreen, c28436a.inviteFamilyMemberScreen);
    }

    public int hashCode() {
        return this.inviteFamilyMemberScreen.hashCode() + (this.familyPlanScreen.hashCode() * 31);
    }

    public String toString() {
        return "FamilyPlanCombinedDomainResult(familyPlanScreen=" + this.familyPlanScreen + ", inviteFamilyMemberScreen=" + this.inviteFamilyMemberScreen + ")";
    }
}
