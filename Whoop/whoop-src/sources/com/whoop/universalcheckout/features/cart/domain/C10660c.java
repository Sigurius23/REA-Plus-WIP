package com.whoop.universalcheckout.features.cart.domain;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/c;", "", "Lcom/whoop/universalcheckout/features/cart/domain/b;", "state", "", "isUpdating", "", "cartId", "storeDomain", "<init>", "(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)V", "a", "(Lcom/whoop/universalcheckout/features/cart/domain/b;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/universalcheckout/features/cart/domain/b;", "d", "()Lcom/whoop/universalcheckout/features/cart/domain/b;", "b", "Z", "f", "()Z", "c", "Ljava/lang/String;", "e", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C10660c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC10659b state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isUpdating;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String storeDomain;

    public C10660c(AbstractC10659b state, boolean z4, String str, String str2) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
        this.isUpdating = z4;
        this.cartId = str;
        this.storeDomain = str2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C10660c m27620b(C10660c c10660c, AbstractC10659b abstractC10659b, boolean z4, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC10659b = c10660c.state;
        }
        if ((i13 & 2) != 0) {
            z4 = c10660c.isUpdating;
        }
        if ((i13 & 4) != 0) {
            str = c10660c.cartId;
        }
        if ((i13 & 8) != 0) {
            str2 = c10660c.storeDomain;
        }
        return c10660c.m27621a(abstractC10659b, z4, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C10660c m27621a(AbstractC10659b state, boolean isUpdating, String cartId, String storeDomain) {
        AbstractC22676k.m65750j(state, "state");
        return new C10660c(state, isUpdating, cartId, storeDomain);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC10659b getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStoreDomain() {
        return this.storeDomain;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10660c)) {
            return false;
        }
        C10660c c10660c = (C10660c) other;
        return AbstractC22676k.m65745e(this.state, c10660c.state) && this.isUpdating == c10660c.isUpdating && AbstractC22676k.m65745e(this.cartId, c10660c.cartId) && AbstractC22676k.m65745e(this.storeDomain, c10660c.storeDomain);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsUpdating() {
        return this.isUpdating;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.state.hashCode() * 31, 31, this.isUpdating);
        String str = this.cartId;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.storeDomain;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        AbstractC10659b abstractC10659b = this.state;
        boolean z4 = this.isUpdating;
        String str = this.cartId;
        String str2 = this.storeDomain;
        StringBuilder sb4 = new StringBuilder("CartDomainResultState(state=");
        sb4.append(abstractC10659b);
        sb4.append(", isUpdating=");
        sb4.append(z4);
        sb4.append(", cartId=");
        return AbstractC11266d.m30464r(sb4, str, ", storeDomain=", str2, ")");
    }

    public /* synthetic */ C10660c(AbstractC10659b abstractC10659b, boolean z4, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC10659b.c.f32468a : abstractC10659b, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2);
    }
}
