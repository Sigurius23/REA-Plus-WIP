package aa3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0623h0 extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final String f2188a;

    public C0623h0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f2188a = value;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return this.f2188a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0623h0) && AbstractC22676k.m65745e(this.f2188a, ((C0623h0) obj).f2188a);
    }

    public final int hashCode() {
        return this.f2188a.hashCode();
    }
}
