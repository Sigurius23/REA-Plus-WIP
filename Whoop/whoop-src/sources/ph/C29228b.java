package ph;

import ch.C4589j;
import mh.AbstractC25543k;
import mh.C25537e;
import mh.C25547o;
import p149fh.C14477a;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: ph.b */
/* JADX INFO: loaded from: classes.dex */
public final class C29228b implements InterfaceC29232f {

    /* JADX INFO: renamed from: a */
    public final C4589j f118300a;

    /* JADX INFO: renamed from: b */
    public final AbstractC25543k f118301b;

    /* JADX INFO: renamed from: c */
    public final int f118302c;

    public C29228b(C4589j c4589j, AbstractC25543k abstractC25543k, int i13) {
        this.f118300a = c4589j;
        this.f118301b = abstractC25543k;
        this.f118302c = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // ph.InterfaceC29232f
    /* JADX INFO: renamed from: a */
    public final void mo88738a() {
        this.f118300a.getClass();
        AbstractC25543k abstractC25543k = this.f118301b;
        boolean z4 = abstractC25543k instanceof C25547o;
        new C14477a(abstractC25543k.mo75114a(), abstractC25543k.mo75115b().f100133z, this.f118302c, (z4 && ((C25547o) abstractC25543k).f100158g) ? false : true);
        if (!z4 && !(abstractC25543k instanceof C25537e)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
