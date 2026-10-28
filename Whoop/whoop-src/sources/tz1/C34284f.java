package tz1;

import ao2.C1877b;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tz1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0004\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, m65681d2 = {"Ltz1/f;", "", "", "isLoading", "isError", "Ltz1/b;", "data", "Lao2/b;", "cartIndicator", "isUpsellShop", "<init>", "(ZZLtz1/b;Lao2/b;Z)V", "a", "(ZZLtz1/b;Lao2/b;Z)Ltz1/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "c", "Ltz1/b;", "d", "()Ltz1/b;", "Lao2/b;", "()Lao2/b;", "f", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34284f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34280b data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C1877b cartIndicator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isUpsellShop;

    public C34284f(boolean z4, boolean z13, C34280b c34280b, C1877b cartIndicator, boolean z14) {
        AbstractC22676k.m65750j(cartIndicator, "cartIndicator");
        this.isLoading = z4;
        this.isError = z13;
        this.data = c34280b;
        this.cartIndicator = cartIndicator;
        this.isUpsellShop = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C34284f m108584b(C34284f c34284f, boolean z4, boolean z13, C34280b c34280b, C1877b c1877b, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c34284f.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c34284f.isError;
        }
        if ((i13 & 4) != 0) {
            c34280b = c34284f.data;
        }
        if ((i13 & 8) != 0) {
            c1877b = c34284f.cartIndicator;
        }
        if ((i13 & 16) != 0) {
            z14 = c34284f.isUpsellShop;
        }
        boolean z15 = z14;
        C34280b c34280b2 = c34280b;
        return c34284f.m108585a(z4, z13, c34280b2, c1877b, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C34284f m108585a(boolean isLoading, boolean isError, C34280b data, C1877b cartIndicator, boolean isUpsellShop) {
        AbstractC22676k.m65750j(cartIndicator, "cartIndicator");
        return new C34284f(isLoading, isError, data, cartIndicator, isUpsellShop);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C1877b getCartIndicator() {
        return this.cartIndicator;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C34280b getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34284f)) {
            return false;
        }
        C34284f c34284f = (C34284f) other;
        return this.isLoading == c34284f.isLoading && this.isError == c34284f.isError && AbstractC22676k.m65745e(this.data, c34284f.data) && AbstractC22676k.m65745e(this.cartIndicator, c34284f.cartIndicator) && this.isUpsellShop == c34284f.isUpsellShop;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsUpsellShop() {
        return this.isUpsellShop;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        C34280b c34280b = this.data;
        return Boolean.hashCode(this.isUpsellShop) + ((this.cartIndicator.hashCode() + ((iM8289b + (c34280b == null ? 0 : c34280b.hashCode())) * 31)) * 31);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        C34280b c34280b = this.data;
        C1877b c1877b = this.cartIndicator;
        boolean z14 = this.isUpsellShop;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("NativeStoreViewState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(c34280b);
        sbM32002u.append(", cartIndicator=");
        sbM32002u.append(c1877b);
        sbM32002u.append(", isUpsellShop=");
        return AbstractC18489d0.m53372m(sbM32002u, z14, ")");
    }

    public /* synthetic */ C34284f(boolean z4, boolean z13, C34280b c34280b, C1877b c1877b, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : c34280b, (i13 & 8) != 0 ? new C1877b(0, null, null, 7, null) : c1877b, (i13 & 16) != 0 ? false : z14);
    }
}
