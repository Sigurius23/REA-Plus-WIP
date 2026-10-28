package p208i2;

import p181h2.C16618c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17900n0 extends AbstractC17904p0 {

    /* JADX INFO: renamed from: a */
    public final C16618c f69601a;

    public C17900n0(C16618c c16618c) {
        this.f69601a = c16618c;
    }

    @Override // p208i2.AbstractC17904p0
    /* JADX INFO: renamed from: a */
    public final C16618c mo51481a() {
        return this.f69601a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17900n0) {
            return AbstractC22676k.m65745e(this.f69601a, ((C17900n0) obj).f69601a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69601a.hashCode();
    }
}
