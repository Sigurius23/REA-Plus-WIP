package p384ow;

import p596ww.C37653a;
import p596ww.C37654b;

/* JADX INFO: renamed from: ow.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C28416l extends AbstractC28430z {

    /* JADX INFO: renamed from: a */
    public AbstractC28430z f114612a;

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        AbstractC28430z abstractC28430z = this.f114612a;
        if (abstractC28430z != null) {
            return abstractC28430z.mo86132b(c37653a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) {
        AbstractC28430z abstractC28430z = this.f114612a;
        if (abstractC28430z == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC28430z.mo86133c(c37654b, obj);
    }
}
