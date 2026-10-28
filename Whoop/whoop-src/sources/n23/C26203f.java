package n23;

import hc3.AbstractC17176i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n23.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C26203f extends AbstractC26205h {

    /* JADX INFO: renamed from: a */
    public final AbstractC26202e f103918a;

    public C26203f(AbstractC26202e value) {
        AbstractC22676k.m65750j(value, "value");
        this.f103918a = value;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC26202e m77813e() {
        return this.f103918a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26203f) && AbstractC22676k.m65745e(this.f103918a, ((C26203f) obj).f103918a);
    }

    public final int hashCode() {
        return this.f103918a.hashCode();
    }

    public final String toString() {
        return AbstractC17176i.m48503e("Failure(value=", this.f103918a, ")");
    }
}
