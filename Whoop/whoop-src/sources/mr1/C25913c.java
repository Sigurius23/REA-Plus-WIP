package mr1;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mr1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b \u0010\u001b¨\u0006!"}, m65681d2 = {"Lmr1/c;", "", "", "cartId", "", "isLoading", "error", "Lmr1/a;", "currentDialogType", "shouldNavigateToCheckout", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lmr1/a;Z)V", "a", "(Ljava/lang/String;ZLjava/lang/String;Lmr1/a;Z)Lmr1/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Z", "g", "()Z", "e", "d", "Lmr1/a;", "()Lmr1/a;", "f", "internal-tooling_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25913c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String error;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC25911a currentDialogType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean shouldNavigateToCheckout;

    public C25913c(String str, boolean z4, String str2, AbstractC25911a currentDialogType, boolean z13) {
        AbstractC22676k.m65750j(currentDialogType, "currentDialogType");
        this.cartId = str;
        this.isLoading = z4;
        this.error = str2;
        this.currentDialogType = currentDialogType;
        this.shouldNavigateToCheckout = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C25913c m76636b(C25913c c25913c, String str, boolean z4, String str2, AbstractC25911a abstractC25911a, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c25913c.cartId;
        }
        if ((i13 & 2) != 0) {
            z4 = c25913c.isLoading;
        }
        if ((i13 & 4) != 0) {
            str2 = c25913c.error;
        }
        if ((i13 & 8) != 0) {
            abstractC25911a = c25913c.currentDialogType;
        }
        if ((i13 & 16) != 0) {
            z13 = c25913c.shouldNavigateToCheckout;
        }
        boolean z14 = z13;
        String str3 = str2;
        return c25913c.m76637a(str, z4, str3, abstractC25911a, z14);
    }

    /* JADX INFO: renamed from: a */
    public final C25913c m76637a(String cartId, boolean isLoading, String error, AbstractC25911a currentDialogType, boolean shouldNavigateToCheckout) {
        AbstractC22676k.m65750j(currentDialogType, "currentDialogType");
        return new C25913c(cartId, isLoading, error, currentDialogType, shouldNavigateToCheckout);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC25911a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25913c)) {
            return false;
        }
        C25913c c25913c = (C25913c) other;
        return AbstractC22676k.m65745e(this.cartId, c25913c.cartId) && this.isLoading == c25913c.isLoading && AbstractC22676k.m65745e(this.error, c25913c.error) && AbstractC22676k.m65745e(this.currentDialogType, c25913c.currentDialogType) && this.shouldNavigateToCheckout == c25913c.shouldNavigateToCheckout;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShouldNavigateToCheckout() {
        return this.shouldNavigateToCheckout;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        String str = this.cartId;
        int iM8289b = AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.isLoading);
        String str2 = this.error;
        return Boolean.hashCode(this.shouldNavigateToCheckout) + ((this.currentDialogType.hashCode() + ((iM8289b + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        String str = this.cartId;
        boolean z4 = this.isLoading;
        String str2 = this.error;
        AbstractC25911a abstractC25911a = this.currentDialogType;
        boolean z13 = this.shouldNavigateToCheckout;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("UniversalCheckoutDataFetchDomainState(cartId=", str, ", isLoading=", ", error=", z4);
        sbM73379l.append(str2);
        sbM73379l.append(", currentDialogType=");
        sbM73379l.append(abstractC25911a);
        sbM73379l.append(", shouldNavigateToCheckout=");
        return AbstractC18489d0.m53372m(sbM73379l, z13, ")");
    }

    public /* synthetic */ C25913c(String str, boolean z4, String str2, AbstractC25911a abstractC25911a, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? AbstractC25911a.c.f102288a : abstractC25911a, (i13 & 16) != 0 ? false : z13);
    }
}
