package cx1;

import bx1.InterfaceC3688b;
import dx1.InterfaceC12428b;
import ex1.InterfaceC13728b;
import fx1.C14846b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cx1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, m65681d2 = {"Lcx1/a;", "", "Lex1/b;", "membershipManagementScreen", "Lfx1/b;", "membershipAdjustmentCheckoutScreen", "Ldx1/b;", "manageMembershipScreen", "Lbx1/b;", "checkoutScreen", "<init>", "(Lex1/b;Lfx1/b;Ldx1/b;Lbx1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lex1/b;", "d", "()Lex1/b;", "b", "Lfx1/b;", "c", "()Lfx1/b;", "Ldx1/b;", "()Ldx1/b;", "Lbx1/b;", "()Lbx1/b;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11178a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13728b membershipManagementScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14846b membershipAdjustmentCheckoutScreen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC12428b manageMembershipScreen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC3688b checkoutScreen;

    public C11178a(InterfaceC13728b membershipManagementScreen, C14846b membershipAdjustmentCheckoutScreen, InterfaceC12428b manageMembershipScreen, InterfaceC3688b checkoutScreen) {
        AbstractC22676k.m65750j(membershipManagementScreen, "membershipManagementScreen");
        AbstractC22676k.m65750j(membershipAdjustmentCheckoutScreen, "membershipAdjustmentCheckoutScreen");
        AbstractC22676k.m65750j(manageMembershipScreen, "manageMembershipScreen");
        AbstractC22676k.m65750j(checkoutScreen, "checkoutScreen");
        this.membershipManagementScreen = membershipManagementScreen;
        this.membershipAdjustmentCheckoutScreen = membershipAdjustmentCheckoutScreen;
        this.manageMembershipScreen = manageMembershipScreen;
        this.checkoutScreen = checkoutScreen;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC3688b getCheckoutScreen() {
        return this.checkoutScreen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC12428b getManageMembershipScreen() {
        return this.manageMembershipScreen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C14846b getMembershipAdjustmentCheckoutScreen() {
        return this.membershipAdjustmentCheckoutScreen;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13728b getMembershipManagementScreen() {
        return this.membershipManagementScreen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11178a)) {
            return false;
        }
        C11178a c11178a = (C11178a) other;
        return AbstractC22676k.m65745e(this.membershipManagementScreen, c11178a.membershipManagementScreen) && AbstractC22676k.m65745e(this.membershipAdjustmentCheckoutScreen, c11178a.membershipAdjustmentCheckoutScreen) && AbstractC22676k.m65745e(this.manageMembershipScreen, c11178a.manageMembershipScreen) && AbstractC22676k.m65745e(this.checkoutScreen, c11178a.checkoutScreen);
    }

    public int hashCode() {
        return this.checkoutScreen.hashCode() + ((this.manageMembershipScreen.hashCode() + ((this.membershipAdjustmentCheckoutScreen.hashCode() + (this.membershipManagementScreen.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MembershipManagementCombinedDomainResult(membershipManagementScreen=" + this.membershipManagementScreen + ", membershipAdjustmentCheckoutScreen=" + this.membershipAdjustmentCheckoutScreen + ", manageMembershipScreen=" + this.manageMembershipScreen + ", checkoutScreen=" + this.checkoutScreen + ")";
    }
}
