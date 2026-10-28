package d33;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d33.j1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11608j1 extends AbstractC11611k1 {

    /* JADX INFO: renamed from: a */
    public final Exception f37473a;

    public C11608j1(Exception exc) {
        this.f37473a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11608j1) && AbstractC22676k.m65745e(this.f37473a, ((C11608j1) obj).f37473a);
    }

    public final int hashCode() {
        return this.f37473a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.f37473a + ")";
    }
}
