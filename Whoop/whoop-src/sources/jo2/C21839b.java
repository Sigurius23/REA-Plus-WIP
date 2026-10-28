package jo2;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q20.C29814e;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: jo2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0017\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001a\u0010%¨\u0006&"}, m65681d2 = {"Ljo2/b;", "", "", "isLoading", "isError", "", "stripeInitializationErrorMessage", "isConfigured", "cartId", "", "configuredId", "Lq20/e;", "initialSavedPaymentMethod", "<init>", "(ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lq20/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "e", "c", "Ljava/lang/String;", "d", "getCartId", "f", "Ljava/lang/Long;", "()Ljava/lang/Long;", "g", "Lq20/e;", "()Lq20/e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21839b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String stripeInitializationErrorMessage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isConfigured;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Long configuredId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C29814e initialSavedPaymentMethod;

    public C21839b(boolean z4, boolean z13, String str, boolean z14, String cartId, Long l7, C29814e c29814e) {
        AbstractC22676k.m65750j(cartId, "cartId");
        this.isLoading = z4;
        this.isError = z13;
        this.stripeInitializationErrorMessage = str;
        this.isConfigured = z14;
        this.cartId = cartId;
        this.configuredId = l7;
        this.initialSavedPaymentMethod = c29814e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getConfiguredId() {
        return this.configuredId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C29814e getInitialSavedPaymentMethod() {
        return this.initialSavedPaymentMethod;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStripeInitializationErrorMessage() {
        return this.stripeInitializationErrorMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsConfigured() {
        return this.isConfigured;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21839b)) {
            return false;
        }
        C21839b c21839b = (C21839b) other;
        return this.isLoading == c21839b.isLoading && this.isError == c21839b.isError && AbstractC22676k.m65745e(this.stripeInitializationErrorMessage, c21839b.stripeInitializationErrorMessage) && this.isConfigured == c21839b.isConfigured && AbstractC22676k.m65745e(this.cartId, c21839b.cartId) && AbstractC22676k.m65745e(this.configuredId, c21839b.configuredId) && AbstractC22676k.m65745e(this.initialSavedPaymentMethod, c21839b.initialSavedPaymentMethod);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        String str = this.stripeInitializationErrorMessage;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isConfigured), 31, this.cartId);
        Long l7 = this.configuredId;
        int iHashCode = (iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31;
        C29814e c29814e = this.initialSavedPaymentMethod;
        return iHashCode + (c29814e != null ? c29814e.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        String str = this.stripeInitializationErrorMessage;
        boolean z14 = this.isConfigured;
        String str2 = this.cartId;
        Long l7 = this.configuredId;
        C29814e c29814e = this.initialSavedPaymentMethod;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("StripeFlowControllerFlowData(isLoading=", ", isError=", ", stripeInitializationErrorMessage=", z4, z13);
        AbstractC38963t7.m124390t(sbM32002u, str, ", isConfigured=", z14, ", cartId=");
        sbM32002u.append(str2);
        sbM32002u.append(", configuredId=");
        sbM32002u.append(l7);
        sbM32002u.append(", initialSavedPaymentMethod=");
        sbM32002u.append(c29814e);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C21839b(boolean z4, boolean z13, String str, boolean z14, String str2, Long l7, C29814e c29814e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        z4 = (i13 & 1) != 0 ? true : z4;
        z13 = (i13 & 2) != 0 ? false : z13;
        this(z4, z13, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? (z4 || z13) ? false : true : z14, (i13 & 16) != 0 ? "" : str2, (i13 & 32) != 0 ? null : l7, (i13 & 64) != 0 ? null : c29814e);
    }
}
