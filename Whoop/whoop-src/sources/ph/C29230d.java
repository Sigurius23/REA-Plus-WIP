package ph;

import android.graphics.drawable.Drawable;
import ch.C4589j;
import mh.AbstractC25543k;
import mh.C25537e;
import mh.C25547o;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: ph.d */
/* JADX INFO: loaded from: classes.dex */
public final class C29230d implements InterfaceC29232f {

    /* JADX INFO: renamed from: a */
    public final C4589j f118303a;

    /* JADX INFO: renamed from: b */
    public final AbstractC25543k f118304b;

    public C29230d(C4589j c4589j, AbstractC25543k abstractC25543k) {
        this.f118303a = c4589j;
        this.f118304b = abstractC25543k;
    }

    @Override // ph.InterfaceC29232f
    /* JADX INFO: renamed from: a */
    public final void mo88738a() {
        AbstractC25543k abstractC25543k = this.f118304b;
        boolean z4 = abstractC25543k instanceof C25547o;
        C4589j c4589j = this.f118303a;
        if (z4) {
            Drawable drawable = ((C25547o) abstractC25543k).f100152a;
            c4589j.getClass();
        } else {
            if (!(abstractC25543k instanceof C25537e)) {
                throw new NoWhenBranchMatchedException();
            }
            ((C25537e) abstractC25543k).mo75114a();
            c4589j.getClass();
        }
    }
}
