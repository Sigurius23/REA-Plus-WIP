package lb3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb3.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC23789n extends AbstractC23787m {

    /* JADX INFO: renamed from: x */
    public final AbstractC23763c0 f94171x;

    public AbstractC23789n(AbstractC23763c0 abstractC23763c0) {
        this.f94171x = abstractC23763c0;
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64125r0(boolean z4) {
        return z4 == mo69814k0() ? this : this.f94171x.mo64125r0(z4).mo64127t0(mo69843Y());
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return newAttributes != mo69843Y() ? new C23769e0(this, newAttributes) : this;
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: w0 */
    public final AbstractC23763c0 mo69810w0() {
        return this.f94171x;
    }
}
