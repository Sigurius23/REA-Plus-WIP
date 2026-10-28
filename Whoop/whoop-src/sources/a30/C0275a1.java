package a30;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a30.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0275a1 extends AbstractC0287e1 {

    /* JADX INFO: renamed from: w */
    public final String f957w;

    /* JADX INFO: renamed from: x */
    public final String f958x;

    public C0275a1(String requested) {
        AbstractC22676k.m65750j(requested, "requested");
        this.f957w = requested;
        this.f958x = "noPaymentMethodTypesAvailable";
    }

    @Override // a30.AbstractC0287e1
    /* JADX INFO: renamed from: a */
    public final String mo816a() {
        return this.f958x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0275a1) && AbstractC22676k.m65745e(this.f957w, ((C0275a1) obj).f957w);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return AbstractC11895b.m31996o("None of the requested payment methods (", this.f957w, ") are supported.");
    }

    public final int hashCode() {
        return this.f957w.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC11895b.m31996o("NoPaymentMethodTypesAvailable(requested=", this.f957w, ")");
    }
}
