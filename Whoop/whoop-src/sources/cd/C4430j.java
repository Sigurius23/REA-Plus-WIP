package cd;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cd.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C4430j extends AbstractC4434n {

    /* JADX INFO: renamed from: b */
    public final String f17904b;

    public C4430j(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f17904b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4430j) && AbstractC22676k.m65745e(this.f17904b, ((C4430j) obj).f17904b);
    }

    public final int hashCode() {
        return this.f17904b.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("SdkUnknown("), this.f17904b, ')');
    }
}
