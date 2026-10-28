package t23;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.s2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33452s2 extends AbstractC33472w2 {

    /* JADX INFO: renamed from: a */
    public final Exception f139696a;

    public C33452s2(Exception exc) {
        this.f139696a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33452s2) && AbstractC22676k.m65745e(this.f139696a, ((C33452s2) obj).f139696a);
    }

    public final int hashCode() {
        return this.f139696a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.f139696a + ")";
    }
}
