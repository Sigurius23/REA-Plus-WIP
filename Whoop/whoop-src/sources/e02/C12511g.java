package e02;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e02.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Le02/g;", "", "", "isLoading", "isError", "Le02/a;", "data", "<init>", "(ZZLe02/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "c", "Le02/a;", "()Le02/a;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12511g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12505a data;

    public C12511g(boolean z4, boolean z13, C12505a c12505a) {
        this.isLoading = z4;
        this.isError = z13;
        this.data = c12505a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C12505a getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12511g)) {
            return false;
        }
        C12511g c12511g = (C12511g) other;
        return this.isLoading == c12511g.isLoading && this.isError == c12511g.isError && AbstractC22676k.m65745e(this.data, c12511g.data);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        C12505a c12505a = this.data;
        return iM8289b + (c12505a == null ? 0 : c12505a.hashCode());
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        C12505a c12505a = this.data;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("SizeGuideViewState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(c12505a);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C12511g(boolean z4, boolean z13, C12505a c12505a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : c12505a);
    }
}
