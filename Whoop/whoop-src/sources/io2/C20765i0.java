package io2;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io2.i0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio2/i0;", "", "", "cartId", "codeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20765i0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String codeId;

    public C20765i0(String cartId, String codeId) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(codeId, "codeId");
        this.cartId = cartId;
        this.codeId = codeId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCodeId() {
        return this.codeId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20765i0)) {
            return false;
        }
        C20765i0 c20765i0 = (C20765i0) other;
        return AbstractC22676k.m65745e(this.cartId, c20765i0.cartId) && AbstractC22676k.m65745e(this.codeId, c20765i0.codeId);
    }

    public int hashCode() {
        return this.codeId.hashCode() + (this.cartId.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("RemovePromoCode(cartId=", this.cartId, ", codeId=", this.codeId, ")");
    }
}
