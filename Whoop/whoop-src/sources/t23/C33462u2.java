package t23;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.u2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33462u2 extends AbstractC33472w2 {

    /* JADX INFO: renamed from: a */
    public final String f139723a;

    public C33462u2(String str) {
        this.f139723a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33462u2) && AbstractC22676k.m65745e(this.f139723a, ((C33462u2) obj).f139723a);
    }

    public final int hashCode() {
        return this.f139723a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("PreconditionNotMet(reason=", this.f139723a, ")");
    }
}
