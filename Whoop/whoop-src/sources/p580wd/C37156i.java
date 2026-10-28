package p580wd;

import p470rv.AbstractC31834n;
import p474s.AbstractC32004s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C37156i extends AbstractC32004s {

    /* JADX INFO: renamed from: a */
    public final AbstractC31834n f158912a;

    public C37156i(AbstractC31834n abstractC31834n) {
        this.f158912a = abstractC31834n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37156i) && AbstractC22676k.m65745e(this.f158912a, ((C37156i) obj).f158912a);
    }

    public final int hashCode() {
        return this.f158912a.hashCode();
    }

    public final String toString() {
        return "Ok(provider=" + this.f158912a + ')';
    }
}
