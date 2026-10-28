package p384ow;

import java.io.IOException;
import p596ww.C37653a;
import p596ww.C37654b;

/* JADX INFO: renamed from: ow.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C28429y extends AbstractC28430z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC28430z f114649a;

    public C28429y(AbstractC28430z abstractC28430z) {
        this.f114649a = abstractC28430z;
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        if (c37653a.m121062o0() != 9) {
            return this.f114649a.mo86132b(c37653a);
        }
        c37653a.m121053T();
        return null;
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        if (obj == null) {
            c37654b.m121076m();
        } else {
            this.f114649a.mo86133c(c37654b, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f114649a + "]";
    }
}
