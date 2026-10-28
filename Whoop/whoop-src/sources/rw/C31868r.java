package rw;

import p000.AbstractC11266d;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p384ow.InterfaceC28405a0;
import p563vw.C36540a;

/* JADX INFO: renamed from: rw.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C31868r implements InterfaceC28405a0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Class f132155w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Class f132156x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC28430z f132157y;

    public C31868r(Class cls, Class cls2, AbstractC28430z abstractC28430z) {
        this.f132155w = cls;
        this.f132156x = cls2;
        this.f132157y = abstractC28430z;
    }

    @Override // p384ow.InterfaceC28405a0
    /* JADX INFO: renamed from: a */
    public final AbstractC28430z mo86129a(C28417m c28417m, C36540a c36540a) {
        Class cls = c36540a.f156459a;
        if (cls == this.f132155w || cls == this.f132156x) {
            return this.f132157y;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Factory[type=");
        AbstractC11266d.m30443A(this.f132156x, sb4, "+");
        AbstractC11266d.m30443A(this.f132155w, sb4, ",adapter=");
        sb4.append(this.f132157y);
        sb4.append("]");
        return sb4.toString();
    }
}
