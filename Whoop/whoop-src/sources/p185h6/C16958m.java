package p185h6;

import java.util.concurrent.ThreadPoolExecutor;
import p692zt.C41113q;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C16958m extends AbstractC37056f {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC37056f f65093c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ThreadPoolExecutor f65094d;

    public C16958m(AbstractC37056f abstractC37056f, ThreadPoolExecutor threadPoolExecutor) {
        this.f65093c = abstractC37056f;
        this.f65094d = threadPoolExecutor;
    }

    @Override // wb3.AbstractC37056f
    /* JADX INFO: renamed from: S */
    public final void mo47704S(Throwable th3) {
        ThreadPoolExecutor threadPoolExecutor = this.f65094d;
        try {
            this.f65093c.mo47704S(th3);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // wb3.AbstractC37056f
    /* JADX INFO: renamed from: T */
    public final void mo47705T(C41113q c41113q) {
        ThreadPoolExecutor threadPoolExecutor = this.f65094d;
        try {
            this.f65093c.mo47705T(c41113q);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
