package b02;

import ao2.C1877b;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b02.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0004\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, m65681d2 = {"Lb02/e;", "", "", "isLoading", "isError", "Lb02/a;", "data", "Lao2/b;", "cartIndicator", "<init>", "(ZZLb02/a;Lao2/b;)V", "a", "(ZZLb02/a;Lao2/b;)Lb02/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "c", "Lb02/a;", "d", "()Lb02/a;", "Lao2/b;", "()Lao2/b;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2201e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C2197a data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C1877b cartIndicator;

    public C2201e(boolean z4, boolean z13, C2197a c2197a, C1877b cartIndicator) {
        AbstractC22676k.m65750j(cartIndicator, "cartIndicator");
        this.isLoading = z4;
        this.isError = z13;
        this.data = c2197a;
        this.cartIndicator = cartIndicator;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2201e m7000b(C2201e c2201e, boolean z4, boolean z13, C2197a c2197a, C1877b c1877b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c2201e.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c2201e.isError;
        }
        if ((i13 & 4) != 0) {
            c2197a = c2201e.data;
        }
        if ((i13 & 8) != 0) {
            c1877b = c2201e.cartIndicator;
        }
        return c2201e.m7001a(z4, z13, c2197a, c1877b);
    }

    /* JADX INFO: renamed from: a */
    public final C2201e m7001a(boolean isLoading, boolean isError, C2197a data, C1877b cartIndicator) {
        AbstractC22676k.m65750j(cartIndicator, "cartIndicator");
        return new C2201e(isLoading, isError, data, cartIndicator);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C1877b getCartIndicator() {
        return this.cartIndicator;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C2197a getData() {
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
        if (!(other instanceof C2201e)) {
            return false;
        }
        C2201e c2201e = (C2201e) other;
        return this.isLoading == c2201e.isLoading && this.isError == c2201e.isError && AbstractC22676k.m65745e(this.data, c2201e.data) && AbstractC22676k.m65745e(this.cartIndicator, c2201e.cartIndicator);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        C2197a c2197a = this.data;
        return this.cartIndicator.hashCode() + ((iM8289b + (c2197a == null ? 0 : c2197a.hashCode())) * 31);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        C2197a c2197a = this.data;
        C1877b c1877b = this.cartIndicator;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("PdpViewState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(c2197a);
        sbM32002u.append(", cartIndicator=");
        sbM32002u.append(c1877b);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C2201e(boolean z4, boolean z13, C2197a c2197a, C1877b c1877b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : c2197a, (i13 & 8) != 0 ? new C1877b(0, null, null, 7, null) : c1877b);
    }
}
