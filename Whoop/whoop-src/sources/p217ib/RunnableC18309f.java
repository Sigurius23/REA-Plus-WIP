package p217ib;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ib.f */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC18309f implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71276w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f71277x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f71278y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C18310g f71279z;

    public /* synthetic */ RunnableC18309f(C18310g c18310g, int i13, Object obj, int i14) {
        this.f71276w = i14;
        this.f71279z = c18310g;
        this.f71277x = i13;
        this.f71278y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f71276w) {
            case 0:
                C18310g c18310g = this.f71279z;
                AbstractC18307d abstractC18307d = c18310g.f71280L;
                if (!c18310g.f71308I.get()) {
                    if (!((C18323t) abstractC18307d).f71332c.mo52720c()) {
                        int i13 = c18310g.f71312y.f71299a;
                        Executor executor = c18310g.f71310w;
                        C18308e c18308e = c18310g.f71285Q;
                        C18323t c18323t = (C18323t) abstractC18307d;
                        int i14 = this.f71277x;
                        int i15 = i14 - 1;
                        if (i15 >= 0) {
                            c18323t.getClass();
                            int iMin = Math.min(i13, i14);
                            c18323t.f71332c.m52698h(2, (i15 - iMin) + 1, iMin, executor, c18308e);
                        } else {
                            c18323t.f71332c.m52698h(2, i15, 0, executor, c18308e);
                        }
                    } else {
                        c18310g.m52727d();
                    }
                    break;
                }
                break;
            default:
                C18310g c18310g2 = this.f71279z;
                AbstractC18307d abstractC18307d2 = c18310g2.f71280L;
                if (!c18310g2.f71308I.get()) {
                    if (!((C18323t) abstractC18307d2).f71332c.mo52720c()) {
                        ((C18323t) abstractC18307d2).f71332c.m52698h(1, this.f71277x + 1, c18310g2.f71312y.f71299a, c18310g2.f71310w, c18310g2.f71285Q);
                    } else {
                        c18310g2.m52727d();
                    }
                    break;
                }
                break;
        }
    }
}
