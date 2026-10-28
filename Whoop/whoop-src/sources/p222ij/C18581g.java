package p222ij;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ij.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C18581g extends AbstractC18583i {

    /* JADX INFO: renamed from: a */
    public final String f72592a;

    public C18581g(String error) {
        AbstractC22676k.m65750j(error, "error");
        this.f72592a = error;
    }

    /* JADX INFO: renamed from: a */
    public final String m53800a() {
        return this.f72592a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18581g) && AbstractC22676k.m65745e(this.f72592a, ((C18581g) obj).f72592a);
    }

    public final int hashCode() {
        return this.f72592a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Error(error="), this.f72592a, ')');
    }
}
