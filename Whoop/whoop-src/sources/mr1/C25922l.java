package mr1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: mr1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u000f¨\u0006$"}, m65681d2 = {"Lmr1/l;", "", "", "cartId", "", "isLoading", "error", "canNavigateToCheckout", "shouldNavigateToCheckout", "showDialog", "dialogTitle", "dialogMessage", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "e", "()Z", "c", "d", "getCanNavigateToCheckout", "f", "g", "getDialogTitle", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getDialogMessage", "internal-tooling_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25922l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String error;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean canNavigateToCheckout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean shouldNavigateToCheckout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean showDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String dialogTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String dialogMessage;

    public C25922l(String str, boolean z4, String str2, boolean z13, boolean z14, boolean z15, String dialogTitle, String dialogMessage) {
        AbstractC22676k.m65750j(dialogTitle, "dialogTitle");
        AbstractC22676k.m65750j(dialogMessage, "dialogMessage");
        this.cartId = str;
        this.isLoading = z4;
        this.error = str2;
        this.canNavigateToCheckout = z13;
        this.shouldNavigateToCheckout = z14;
        this.showDialog = z15;
        this.dialogTitle = dialogTitle;
        this.dialogMessage = dialogMessage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShouldNavigateToCheckout() {
        return this.shouldNavigateToCheckout;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowDialog() {
        return this.showDialog;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25922l)) {
            return false;
        }
        C25922l c25922l = (C25922l) other;
        return AbstractC22676k.m65745e(this.cartId, c25922l.cartId) && this.isLoading == c25922l.isLoading && AbstractC22676k.m65745e(this.error, c25922l.error) && this.canNavigateToCheckout == c25922l.canNavigateToCheckout && this.shouldNavigateToCheckout == c25922l.shouldNavigateToCheckout && this.showDialog == c25922l.showDialog && AbstractC22676k.m65745e(this.dialogTitle, c25922l.dialogTitle) && AbstractC22676k.m65745e(this.dialogMessage, c25922l.dialogMessage);
    }

    public int hashCode() {
        String str = this.cartId;
        int iM8289b = AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.isLoading);
        String str2 = this.error;
        return this.dialogMessage.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.canNavigateToCheckout), 31, this.shouldNavigateToCheckout), 31, this.showDialog), 31, this.dialogTitle);
    }

    public String toString() {
        String str = this.cartId;
        boolean z4 = this.isLoading;
        String str2 = this.error;
        boolean z13 = this.canNavigateToCheckout;
        boolean z14 = this.shouldNavigateToCheckout;
        boolean z15 = this.showDialog;
        String str3 = this.dialogTitle;
        String str4 = this.dialogMessage;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("UniversalCheckoutDataFetchViewState(cartId=", str, ", isLoading=", ", error=", z4);
        AbstractC38963t7.m124390t(sbM73379l, str2, ", canNavigateToCheckout=", z13, ", shouldNavigateToCheckout=");
        AbstractC38963t7.m124392v(sbM73379l, z14, ", showDialog=", z15, ", dialogTitle=");
        return AbstractC11266d.m30464r(sbM73379l, str3, ", dialogMessage=", str4, ")");
    }

    public /* synthetic */ C25922l(String str, boolean z4, String str2, boolean z13, boolean z14, boolean z15, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? false : z15, (i13 & 64) != 0 ? "" : str3, (i13 & 128) != 0 ? "" : str4);
    }
}
