package lo2;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: lo2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Llo2/a;", "", "", "universalCheckoutWasConfigured", "effectiveScreenReadyForViewEmitted", "screenViewedEmitted", "stripeFlowControllerInitializationFailed", "Llo2/b;", "combinedResult", "<init>", "(ZZZZLlo2/b;)V", "a", "(ZZZZLlo2/b;)Llo2/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getUniversalCheckoutWasConfigured", "()Z", "b", "c", "d", "e", "Llo2/b;", "()Llo2/b;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C24619a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean universalCheckoutWasConfigured;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean effectiveScreenReadyForViewEmitted;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean screenViewedEmitted;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean stripeFlowControllerInitializationFailed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C24620b combinedResult;

    public C24619a(boolean z4, boolean z13, boolean z14, boolean z15, C24620b combinedResult) {
        AbstractC22676k.m65750j(combinedResult, "combinedResult");
        this.universalCheckoutWasConfigured = z4;
        this.effectiveScreenReadyForViewEmitted = z13;
        this.screenViewedEmitted = z14;
        this.stripeFlowControllerInitializationFailed = z15;
        this.combinedResult = combinedResult;
    }

    /* JADX INFO: renamed from: a */
    public final C24619a m71943a(boolean universalCheckoutWasConfigured, boolean effectiveScreenReadyForViewEmitted, boolean screenViewedEmitted, boolean stripeFlowControllerInitializationFailed, C24620b combinedResult) {
        AbstractC22676k.m65750j(combinedResult, "combinedResult");
        return new C24619a(universalCheckoutWasConfigured, effectiveScreenReadyForViewEmitted, screenViewedEmitted, stripeFlowControllerInitializationFailed, combinedResult);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C24620b getCombinedResult() {
        return this.combinedResult;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEffectiveScreenReadyForViewEmitted() {
        return this.effectiveScreenReadyForViewEmitted;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getScreenViewedEmitted() {
        return this.screenViewedEmitted;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getStripeFlowControllerInitializationFailed() {
        return this.stripeFlowControllerInitializationFailed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24619a)) {
            return false;
        }
        C24619a c24619a = (C24619a) other;
        return this.universalCheckoutWasConfigured == c24619a.universalCheckoutWasConfigured && this.effectiveScreenReadyForViewEmitted == c24619a.effectiveScreenReadyForViewEmitted && this.screenViewedEmitted == c24619a.screenViewedEmitted && this.stripeFlowControllerInitializationFailed == c24619a.stripeFlowControllerInitializationFailed && AbstractC22676k.m65745e(this.combinedResult, c24619a.combinedResult);
    }

    public int hashCode() {
        return this.combinedResult.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.universalCheckoutWasConfigured) * 31, 31, this.effectiveScreenReadyForViewEmitted), 31, this.screenViewedEmitted), 31, this.stripeFlowControllerInitializationFailed);
    }

    public String toString() {
        boolean z4 = this.universalCheckoutWasConfigured;
        boolean z13 = this.effectiveScreenReadyForViewEmitted;
        boolean z14 = this.screenViewedEmitted;
        boolean z15 = this.stripeFlowControllerInitializationFailed;
        C24620b c24620b = this.combinedResult;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("EmissionState(universalCheckoutWasConfigured=", ", effectiveScreenReadyForViewEmitted=", ", screenViewedEmitted=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", stripeFlowControllerInitializationFailed=", z15, ", combinedResult=");
        sbM32002u.append(c24620b);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C24619a(boolean z4, boolean z13, boolean z14, boolean z15, C24620b c24620b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15, (i13 & 16) != 0 ? new C24620b(null, null, 3, null) : c24620b);
    }
}
