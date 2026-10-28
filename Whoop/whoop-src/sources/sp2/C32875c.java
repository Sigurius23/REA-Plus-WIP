package sp2;

import com.whoop.universalcheckout.features.shippingmethod.domain.models.ShippingMethodModels;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: sp2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJh\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b#\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b$\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b)\u0010\u0013¨\u0006*"}, m65681d2 = {"Lsp2/c;", "", "", "cartId", "Lsp2/a;", "currentDialogType", "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;", "response", "selectedShippingMethodId", "", "isSubmitting", "manualRefresh", "displayRefreshingSpinner", "source", "<init>", "(Ljava/lang/String;Lsp2/a;Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Ljava/lang/String;ZZZLjava/lang/String;)V", "a", "(Ljava/lang/String;Lsp2/a;Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Ljava/lang/String;ZZZLjava/lang/String;)Lsp2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lsp2/a;", "d", "()Lsp2/a;", "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;", "g", "()Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "Z", "j", "()Z", "f", "i", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32875c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC32873a currentDialogType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ShippingMethodModels response;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedShippingMethodId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isSubmitting;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String source;

    public C32875c(String str, InterfaceC32873a interfaceC32873a, ShippingMethodModels shippingMethodModels, String str2, boolean z4, boolean z13, boolean z14, String source) {
        AbstractC22676k.m65750j(source, "source");
        this.cartId = str;
        this.currentDialogType = interfaceC32873a;
        this.response = shippingMethodModels;
        this.selectedShippingMethodId = str2;
        this.isSubmitting = z4;
        this.manualRefresh = z13;
        this.displayRefreshingSpinner = z14;
        this.source = source;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32875c m103156b(C32875c c32875c, String str, InterfaceC32873a interfaceC32873a, ShippingMethodModels shippingMethodModels, String str2, boolean z4, boolean z13, boolean z14, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c32875c.cartId;
        }
        if ((i13 & 2) != 0) {
            interfaceC32873a = c32875c.currentDialogType;
        }
        if ((i13 & 4) != 0) {
            shippingMethodModels = c32875c.response;
        }
        if ((i13 & 8) != 0) {
            str2 = c32875c.selectedShippingMethodId;
        }
        if ((i13 & 16) != 0) {
            z4 = c32875c.isSubmitting;
        }
        if ((i13 & 32) != 0) {
            z13 = c32875c.manualRefresh;
        }
        if ((i13 & 64) != 0) {
            z14 = c32875c.displayRefreshingSpinner;
        }
        if ((i13 & 128) != 0) {
            str3 = c32875c.source;
        }
        boolean z15 = z14;
        String str4 = str3;
        boolean z16 = z4;
        boolean z17 = z13;
        return c32875c.m103157a(str, interfaceC32873a, shippingMethodModels, str2, z16, z17, z15, str4);
    }

    /* JADX INFO: renamed from: a */
    public final C32875c m103157a(String cartId, InterfaceC32873a currentDialogType, ShippingMethodModels response, String selectedShippingMethodId, boolean isSubmitting, boolean manualRefresh, boolean displayRefreshingSpinner, String source) {
        AbstractC22676k.m65750j(source, "source");
        return new C32875c(cartId, currentDialogType, response, selectedShippingMethodId, isSubmitting, manualRefresh, displayRefreshingSpinner, source);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC32873a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32875c)) {
            return false;
        }
        C32875c c32875c = (C32875c) other;
        return AbstractC22676k.m65745e(this.cartId, c32875c.cartId) && AbstractC22676k.m65745e(this.currentDialogType, c32875c.currentDialogType) && AbstractC22676k.m65745e(this.response, c32875c.response) && AbstractC22676k.m65745e(this.selectedShippingMethodId, c32875c.selectedShippingMethodId) && this.isSubmitting == c32875c.isSubmitting && this.manualRefresh == c32875c.manualRefresh && this.displayRefreshingSpinner == c32875c.displayRefreshingSpinner && AbstractC22676k.m65745e(this.source, c32875c.source);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ShippingMethodModels getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSelectedShippingMethodId() {
        return this.selectedShippingMethodId;
    }

    public int hashCode() {
        String str = this.cartId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InterfaceC32873a interfaceC32873a = this.currentDialogType;
        int iHashCode2 = (iHashCode + (interfaceC32873a == null ? 0 : interfaceC32873a.hashCode())) * 31;
        ShippingMethodModels shippingMethodModels = this.response;
        int iHashCode3 = (iHashCode2 + (shippingMethodModels == null ? 0 : shippingMethodModels.hashCode())) * 31;
        String str2 = this.selectedShippingMethodId;
        return this.source.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isSubmitting), 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsSubmitting() {
        return this.isSubmitting;
    }

    public String toString() {
        String str = this.cartId;
        InterfaceC32873a interfaceC32873a = this.currentDialogType;
        ShippingMethodModels shippingMethodModels = this.response;
        String str2 = this.selectedShippingMethodId;
        boolean z4 = this.isSubmitting;
        boolean z13 = this.manualRefresh;
        boolean z14 = this.displayRefreshingSpinner;
        String str3 = this.source;
        StringBuilder sb4 = new StringBuilder("ShippingMethodDomainState(cartId=");
        sb4.append(str);
        sb4.append(", currentDialogType=");
        sb4.append(interfaceC32873a);
        sb4.append(", response=");
        sb4.append(shippingMethodModels);
        sb4.append(", selectedShippingMethodId=");
        sb4.append(str2);
        sb4.append(", isSubmitting=");
        AbstractC38963t7.m124392v(sb4, z4, ", manualRefresh=", z13, ", displayRefreshingSpinner=");
        return AbstractC21702c.m61139j(sb4, z14, ", source=", str3, ")");
    }

    public /* synthetic */ C32875c(String str, InterfaceC32873a interfaceC32873a, ShippingMethodModels shippingMethodModels, String str2, boolean z4, boolean z13, boolean z14, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : interfaceC32873a, (i13 & 4) != 0 ? null : shippingMethodModels, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? "" : str3);
    }
}
