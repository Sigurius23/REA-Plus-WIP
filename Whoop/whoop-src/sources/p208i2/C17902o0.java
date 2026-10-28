package p208i2;

import j93.AbstractC21478l0;
import p181h2.C16618c;
import p181h2.C16619d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17902o0 extends AbstractC17904p0 {

    /* JADX INFO: renamed from: a */
    public final C16619d f69602a;

    /* JADX INFO: renamed from: b */
    public final C17891j f69603b;

    public C17902o0(C16619d c16619d) {
        C17891j c17891jM51478a;
        this.f69602a = c16619d;
        if (AbstractC21478l0.m60409O(c16619d)) {
            c17891jM51478a = null;
        } else {
            c17891jM51478a = AbstractC17897m.m51478a();
            InterfaceC17910s0.m51496b(c17891jM51478a, c16619d);
        }
        this.f69603b = c17891jM51478a;
    }

    @Override // p208i2.AbstractC17904p0
    /* JADX INFO: renamed from: a */
    public final C16618c mo51481a() {
        C16619d c16619d = this.f69602a;
        return new C16618c(c16619d.f63943a, c16619d.f63944b, c16619d.f63945c, c16619d.f63946d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17902o0) {
            return AbstractC22676k.m65745e(this.f69602a, ((C17902o0) obj).f69602a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69602a.hashCode();
    }
}
