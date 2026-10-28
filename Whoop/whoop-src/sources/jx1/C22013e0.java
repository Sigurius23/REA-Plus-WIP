package jx1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jx1.e0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, m65681d2 = {"Ljx1/e0;", "", "Ljx1/c0;", "membershipManagementScreenViewState", "Ljx1/o;", "membershipAdjustmentCheckoutScreenViewState", "Ljx1/l;", "manageMembershipScreenViewState", "Ljx1/e;", "checkoutScreenViewState", "<init>", "(Ljx1/c0;Ljx1/o;Ljx1/l;Ljx1/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljx1/c0;", "d", "()Ljx1/c0;", "b", "Ljx1/o;", "c", "()Ljx1/o;", "Ljx1/l;", "()Ljx1/l;", "Ljx1/e;", "()Ljx1/e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22013e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22009c0 membershipManagementScreenViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22025o membershipAdjustmentCheckoutScreenViewState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22022l manageMembershipScreenViewState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22012e checkoutScreenViewState;

    public C22013e0(AbstractC22009c0 membershipManagementScreenViewState, AbstractC22025o membershipAdjustmentCheckoutScreenViewState, AbstractC22022l manageMembershipScreenViewState, AbstractC22012e checkoutScreenViewState) {
        AbstractC22676k.m65750j(membershipManagementScreenViewState, "membershipManagementScreenViewState");
        AbstractC22676k.m65750j(membershipAdjustmentCheckoutScreenViewState, "membershipAdjustmentCheckoutScreenViewState");
        AbstractC22676k.m65750j(manageMembershipScreenViewState, "manageMembershipScreenViewState");
        AbstractC22676k.m65750j(checkoutScreenViewState, "checkoutScreenViewState");
        this.membershipManagementScreenViewState = membershipManagementScreenViewState;
        this.membershipAdjustmentCheckoutScreenViewState = membershipAdjustmentCheckoutScreenViewState;
        this.manageMembershipScreenViewState = manageMembershipScreenViewState;
        this.checkoutScreenViewState = checkoutScreenViewState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22012e getCheckoutScreenViewState() {
        return this.checkoutScreenViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22022l getManageMembershipScreenViewState() {
        return this.manageMembershipScreenViewState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22025o getMembershipAdjustmentCheckoutScreenViewState() {
        return this.membershipAdjustmentCheckoutScreenViewState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC22009c0 getMembershipManagementScreenViewState() {
        return this.membershipManagementScreenViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22013e0)) {
            return false;
        }
        C22013e0 c22013e0 = (C22013e0) other;
        return AbstractC22676k.m65745e(this.membershipManagementScreenViewState, c22013e0.membershipManagementScreenViewState) && AbstractC22676k.m65745e(this.membershipAdjustmentCheckoutScreenViewState, c22013e0.membershipAdjustmentCheckoutScreenViewState) && AbstractC22676k.m65745e(this.manageMembershipScreenViewState, c22013e0.manageMembershipScreenViewState) && AbstractC22676k.m65745e(this.checkoutScreenViewState, c22013e0.checkoutScreenViewState);
    }

    public int hashCode() {
        return this.checkoutScreenViewState.hashCode() + ((this.manageMembershipScreenViewState.hashCode() + ((this.membershipAdjustmentCheckoutScreenViewState.hashCode() + (this.membershipManagementScreenViewState.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MembershipManagementViewState(membershipManagementScreenViewState=" + this.membershipManagementScreenViewState + ", membershipAdjustmentCheckoutScreenViewState=" + this.membershipAdjustmentCheckoutScreenViewState + ", manageMembershipScreenViewState=" + this.manageMembershipScreenViewState + ", checkoutScreenViewState=" + this.checkoutScreenViewState + ")";
    }

    public /* synthetic */ C22013e0(AbstractC22009c0 abstractC22009c0, AbstractC22025o abstractC22025o, AbstractC22022l abstractC22022l, AbstractC22012e abstractC22012e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC22009c0.e.f85268a : abstractC22009c0, (i13 & 2) != 0 ? AbstractC22025o.d.f85414b : abstractC22025o, (i13 & 4) != 0 ? AbstractC22022l.d.f85401a : abstractC22022l, (i13 & 8) != 0 ? AbstractC22012e.b.f85352a : abstractC22012e);
    }
}
