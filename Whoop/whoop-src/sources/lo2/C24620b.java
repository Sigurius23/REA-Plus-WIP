package lo2;

import jo2.C21839b;
import ko2.C22653c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lo2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Llo2/b;", "", "Lko2/c;", "universalCheckoutScreen", "Ljo2/b;", "stripeFlowControllerState", "<init>", "(Lko2/c;Ljo2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lko2/c;", "b", "()Lko2/c;", "Ljo2/b;", "()Ljo2/b;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24620b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22653c universalCheckoutScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21839b stripeFlowControllerState;

    public C24620b(C22653c universalCheckoutScreen, C21839b stripeFlowControllerState) {
        AbstractC22676k.m65750j(universalCheckoutScreen, "universalCheckoutScreen");
        AbstractC22676k.m65750j(stripeFlowControllerState, "stripeFlowControllerState");
        this.universalCheckoutScreen = universalCheckoutScreen;
        this.stripeFlowControllerState = stripeFlowControllerState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C21839b getStripeFlowControllerState() {
        return this.stripeFlowControllerState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C22653c getUniversalCheckoutScreen() {
        return this.universalCheckoutScreen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24620b)) {
            return false;
        }
        C24620b c24620b = (C24620b) other;
        return AbstractC22676k.m65745e(this.universalCheckoutScreen, c24620b.universalCheckoutScreen) && AbstractC22676k.m65745e(this.stripeFlowControllerState, c24620b.stripeFlowControllerState);
    }

    public int hashCode() {
        return this.stripeFlowControllerState.hashCode() + (this.universalCheckoutScreen.hashCode() * 31);
    }

    public String toString() {
        return "UniversalCheckoutCombinedDomainResult(universalCheckoutScreen=" + this.universalCheckoutScreen + ", stripeFlowControllerState=" + this.stripeFlowControllerState + ")";
    }

    public /* synthetic */ C24620b(C22653c c22653c, C21839b c21839b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C22653c(null, null, null, null, null, false, false, false, null, false, false, null, false, null, null, false, null, 131071, null) : c22653c, (i13 & 2) != 0 ? new C21839b(false, false, null, false, null, null, null, 127, null) : c21839b);
    }
}
