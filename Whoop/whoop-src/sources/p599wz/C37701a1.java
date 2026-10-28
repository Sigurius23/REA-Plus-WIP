package p599wz;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37701a1 {

    /* JADX INFO: renamed from: a */
    public final String f161558a;

    public C37701a1(String str) {
        this.f161558a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37701a1) && AbstractC22676k.m65745e(this.f161558a, ((C37701a1) obj).f161558a);
    }

    public final int hashCode() {
        String str = this.f161558a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("BillingDetailsUpdateFlow(cvc=", this.f161558a, ")");
    }
}
