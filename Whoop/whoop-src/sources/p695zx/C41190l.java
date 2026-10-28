package p695zx;

import p088dc.AbstractC11895b;
import p479s4.AbstractC32126g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zx.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C41190l extends AbstractC32126g {

    /* JADX INFO: renamed from: w */
    public final String f177707w;

    public C41190l(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f177707w = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41190l) && AbstractC22676k.m65745e(this.f177707w, ((C41190l) obj).f177707w);
    }

    public final int hashCode() {
        return this.f177707w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Validated(value=", this.f177707w, ")");
    }
}
