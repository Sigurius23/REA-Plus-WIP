package jo2;

import d13.AbstractC11478a;
import h20.InterfaceC16642d2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q20.C29814e;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: jo2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jt\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b(\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b+\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\"\u00104\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u00100\u001a\u0004\b&\u00101\"\u0004\b2\u00103¨\u00065"}, m65681d2 = {"Ljo2/c;", "", "", "isConfigured", "", "configuredId", "isError", "", "stripeInitializationErrorMessage", "path", "cartId", "Lq20/e;", "initialPaymentMethod", "selectedPaymentMethod", "setupFutureUsage", "<init>", "(ZLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq20/e;Lq20/e;Ljava/lang/Boolean;)V", "a", "(ZLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq20/e;Lq20/e;Ljava/lang/Boolean;)Ljo2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "k", "()Z", "b", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "c", "l", "Ljava/lang/String;", "j", "e", "g", "f", "Lq20/e;", "()Lq20/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lh20/d2;", "Lh20/d2;", "()Lh20/d2;", "m", "(Lh20/d2;)V", "flowController", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21840c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isConfigured;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Long configuredId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String stripeInitializationErrorMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C29814e initialPaymentMethod;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C29814e selectedPaymentMethod;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Boolean setupFutureUsage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public InterfaceC16642d2 flowController;

    public C21840c(boolean z4, Long l7, boolean z13, String str, String path, String cartId, C29814e c29814e, C29814e c29814e2, Boolean bool) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(cartId, "cartId");
        this.isConfigured = z4;
        this.configuredId = l7;
        this.isError = z13;
        this.stripeInitializationErrorMessage = str;
        this.path = path;
        this.cartId = cartId;
        this.initialPaymentMethod = c29814e;
        this.selectedPaymentMethod = c29814e2;
        this.setupFutureUsage = bool;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21840c m61785b(C21840c c21840c, boolean z4, Long l7, boolean z13, String str, String str2, String str3, C29814e c29814e, C29814e c29814e2, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c21840c.isConfigured;
        }
        if ((i13 & 2) != 0) {
            l7 = c21840c.configuredId;
        }
        if ((i13 & 4) != 0) {
            z13 = c21840c.isError;
        }
        if ((i13 & 8) != 0) {
            str = c21840c.stripeInitializationErrorMessage;
        }
        if ((i13 & 16) != 0) {
            str2 = c21840c.path;
        }
        if ((i13 & 32) != 0) {
            str3 = c21840c.cartId;
        }
        if ((i13 & 64) != 0) {
            c29814e = c21840c.initialPaymentMethod;
        }
        if ((i13 & 128) != 0) {
            c29814e2 = c21840c.selectedPaymentMethod;
        }
        if ((i13 & 256) != 0) {
            bool = c21840c.setupFutureUsage;
        }
        C29814e c29814e3 = c29814e2;
        Boolean bool2 = bool;
        String str4 = str3;
        C29814e c29814e4 = c29814e;
        String str5 = str2;
        boolean z14 = z13;
        return c21840c.m61786a(z4, l7, z14, str, str5, str4, c29814e4, c29814e3, bool2);
    }

    /* JADX INFO: renamed from: a */
    public final C21840c m61786a(boolean isConfigured, Long configuredId, boolean isError, String stripeInitializationErrorMessage, String path, String cartId, C29814e initialPaymentMethod, C29814e selectedPaymentMethod, Boolean setupFutureUsage) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(cartId, "cartId");
        return new C21840c(isConfigured, configuredId, isError, stripeInitializationErrorMessage, path, cartId, initialPaymentMethod, selectedPaymentMethod, setupFutureUsage);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getConfiguredId() {
        return this.configuredId;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC16642d2 m61789e() {
        InterfaceC16642d2 interfaceC16642d2 = this.flowController;
        if (interfaceC16642d2 != null) {
            return interfaceC16642d2;
        }
        AbstractC22676k.m65757q("flowController");
        throw null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21840c)) {
            return false;
        }
        C21840c c21840c = (C21840c) other;
        return this.isConfigured == c21840c.isConfigured && AbstractC22676k.m65745e(this.configuredId, c21840c.configuredId) && this.isError == c21840c.isError && AbstractC22676k.m65745e(this.stripeInitializationErrorMessage, c21840c.stripeInitializationErrorMessage) && AbstractC22676k.m65745e(this.path, c21840c.path) && AbstractC22676k.m65745e(this.cartId, c21840c.cartId) && AbstractC22676k.m65745e(this.initialPaymentMethod, c21840c.initialPaymentMethod) && AbstractC22676k.m65745e(this.selectedPaymentMethod, c21840c.selectedPaymentMethod) && AbstractC22676k.m65745e(this.setupFutureUsage, c21840c.setupFutureUsage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C29814e getInitialPaymentMethod() {
        return this.initialPaymentMethod;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C29814e getSelectedPaymentMethod() {
        return this.selectedPaymentMethod;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isConfigured) * 31;
        Long l7 = this.configuredId;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.isError);
        String str = this.stripeInitializationErrorMessage;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.path), 31, this.cartId);
        C29814e c29814e = this.initialPaymentMethod;
        int iHashCode2 = (iM30450d + (c29814e == null ? 0 : c29814e.hashCode())) * 31;
        C29814e c29814e2 = this.selectedPaymentMethod;
        int iHashCode3 = (iHashCode2 + (c29814e2 == null ? 0 : c29814e2.hashCode())) * 31;
        Boolean bool = this.setupFutureUsage;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getStripeInitializationErrorMessage() {
        return this.stripeInitializationErrorMessage;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsConfigured() {
        return this.isConfigured;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: m */
    public final void m61797m(InterfaceC16642d2 interfaceC16642d2) {
        AbstractC22676k.m65750j(interfaceC16642d2, "<set-?>");
        this.flowController = interfaceC16642d2;
    }

    public String toString() {
        boolean z4 = this.isConfigured;
        Long l7 = this.configuredId;
        boolean z13 = this.isError;
        String str = this.stripeInitializationErrorMessage;
        String str2 = this.path;
        String str3 = this.cartId;
        C29814e c29814e = this.initialPaymentMethod;
        C29814e c29814e2 = this.selectedPaymentMethod;
        Boolean bool = this.setupFutureUsage;
        StringBuilder sb4 = new StringBuilder("StripeFlowControllerInternalState(isConfigured=");
        sb4.append(z4);
        sb4.append(", configuredId=");
        sb4.append(l7);
        sb4.append(", isError=");
        AbstractC38963t7.m124391u(sb4, z13, ", stripeInitializationErrorMessage=", str, ", path=");
        AbstractC11266d.m30444B(sb4, str2, ", cartId=", str3, ", initialPaymentMethod=");
        sb4.append(c29814e);
        sb4.append(", selectedPaymentMethod=");
        sb4.append(c29814e2);
        sb4.append(", setupFutureUsage=");
        return AbstractC11478a.m30858j(sb4, bool, ")");
    }

    public /* synthetic */ C21840c(boolean z4, Long l7, boolean z13, String str, String str2, String str3, C29814e c29814e, C29814e c29814e2, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : l7, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? "" : str2, (i13 & 32) != 0 ? "" : str3, (i13 & 64) != 0 ? null : c29814e, (i13 & 128) != 0 ? null : c29814e2, (i13 & 256) != 0 ? null : bool);
    }
}
