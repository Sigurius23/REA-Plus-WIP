package io2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: io2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, m65681d2 = {"Lio2/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "disclaimer", "ctaText", "", "checkoutPath", "cartId", "", "isEnabled", "skipStripeCheckout", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZ)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZ)Lio2/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "f", "c", "Ljava/lang/String;", "e", "d", "Z", "i", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20762h implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f77972g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource disclaimer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String checkoutPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean skipStripeCheckout;

    public C20762h(TextResource disclaimer, TextResource ctaText, String checkoutPath, String cartId, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(checkoutPath, "checkoutPath");
        AbstractC22676k.m65750j(cartId, "cartId");
        this.disclaimer = disclaimer;
        this.ctaText = ctaText;
        this.checkoutPath = checkoutPath;
        this.cartId = cartId;
        this.isEnabled = z4;
        this.skipStripeCheckout = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20762h m57170b(C20762h c20762h, TextResource textResource, TextResource textResource2, String str, String str2, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c20762h.disclaimer;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c20762h.ctaText;
        }
        if ((i13 & 4) != 0) {
            str = c20762h.checkoutPath;
        }
        if ((i13 & 8) != 0) {
            str2 = c20762h.cartId;
        }
        if ((i13 & 16) != 0) {
            z4 = c20762h.isEnabled;
        }
        if ((i13 & 32) != 0) {
            z13 = c20762h.skipStripeCheckout;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        return c20762h.m57171a(textResource, textResource2, str, str2, z14, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C20762h m57171a(TextResource disclaimer, TextResource ctaText, String checkoutPath, String cartId, boolean isEnabled, boolean skipStripeCheckout) {
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(checkoutPath, "checkoutPath");
        AbstractC22676k.m65750j(cartId, "cartId");
        return new C20762h(disclaimer, ctaText, checkoutPath, cartId, isEnabled, skipStripeCheckout);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCheckoutPath() {
        return this.checkoutPath;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20762h)) {
            return false;
        }
        C20762h c20762h = (C20762h) other;
        return AbstractC22676k.m65745e(this.disclaimer, c20762h.disclaimer) && AbstractC22676k.m65745e(this.ctaText, c20762h.ctaText) && AbstractC22676k.m65745e(this.checkoutPath, c20762h.checkoutPath) && AbstractC22676k.m65745e(this.cartId, c20762h.cartId) && this.isEnabled == c20762h.isEnabled && this.skipStripeCheckout == c20762h.skipStripeCheckout;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSkipStripeCheckout() {
        return this.skipStripeCheckout;
    }

    public int hashCode() {
        return Boolean.hashCode(this.skipStripeCheckout) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.disclaimer.hashCode() * 31, this.ctaText, 31), 31, this.checkoutPath), 31, this.cartId), 31, this.isEnabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        TextResource textResource = this.disclaimer;
        TextResource textResource2 = this.ctaText;
        String str = this.checkoutPath;
        String str2 = this.cartId;
        boolean z4 = this.isEnabled;
        boolean z13 = this.skipStripeCheckout;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CheckoutFooterViewState(disclaimer=", textResource, ", ctaText=", textResource2, ", checkoutPath=");
        AbstractC11266d.m30444B(sbM106658q, str, ", cartId=", str2, ", isEnabled=");
        return AbstractC36095b.m114682j(sbM106658q, z4, ", skipStripeCheckout=", z13, ")");
    }
}
