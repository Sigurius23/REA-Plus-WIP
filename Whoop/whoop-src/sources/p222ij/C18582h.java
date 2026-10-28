package p222ij;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ij.h */
/* JADX INFO: loaded from: classes.dex */
public final class C18582h extends AbstractC18583i {

    /* JADX INFO: renamed from: a */
    public final String f72593a;

    public C18582h(String data) {
        AbstractC22676k.m65750j(data, "data");
        this.f72593a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18582h) && AbstractC22676k.m65745e(this.f72593a, ((C18582h) obj).f72593a);
    }

    public final int hashCode() {
        return this.f72593a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Success(data="), this.f72593a, ')');
    }
}
