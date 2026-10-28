package io2;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lio2/d;", "", "", "path", "cartId", "", "skipStripeCheckout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20754d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean skipStripeCheckout;

    public C20754d(String path, String cartId, boolean z4) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(cartId, "cartId");
        this.path = path;
        this.cartId = cartId;
        this.skipStripeCheckout = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSkipStripeCheckout() {
        return this.skipStripeCheckout;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20754d)) {
            return false;
        }
        C20754d c20754d = (C20754d) other;
        return AbstractC22676k.m65745e(this.path, c20754d.path) && AbstractC22676k.m65745e(this.cartId, c20754d.cartId) && this.skipStripeCheckout == c20754d.skipStripeCheckout;
    }

    public int hashCode() {
        return Boolean.hashCode(this.skipStripeCheckout) + AbstractC11266d.m30450d(this.path.hashCode() * 31, 31, this.cartId);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.cartId;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("Checkout(path=", str, ", cartId=", str2, ", skipStripeCheckout="), this.skipStripeCheckout, ")");
    }
}
