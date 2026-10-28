package p217ib;

import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ib.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C18328y extends AbstractC18327x {

    /* JADX INFO: renamed from: a */
    public final C18312i f71339a;

    /* JADX INFO: renamed from: b */
    public final int f71340b;

    public C18328y(AbstractC18302a0 abstractC18302a0, int i13, int i14, Executor executor, AbstractC18314k abstractC18314k) {
        this.f71339a = new C18312i(abstractC18302a0, i13, executor, abstractC18314k);
        this.f71340b = i14;
    }

    @Override // p217ib.AbstractC18327x
    /* JADX INFO: renamed from: a */
    public final void mo52742a(List list) {
        C18312i c18312i = this.f71339a;
        if (((AbstractC18302a0) c18312i.f71288c).mo52720c()) {
            c18312i.m52715b(C18315l.f71294e);
        } else {
            c18312i.m52715b(new C18315l(0, 0, this.f71340b, list));
        }
    }
}
