package l73;

import bi.AbstractC3269g;
import p249jc.AbstractC21598x;
import r73.AbstractC31056a;
import w73.C36930p;

/* JADX INFO: renamed from: l73.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23412c {
    /* JADX INFO: renamed from: a */
    public final C36930p m67904a(AbstractC23416g abstractC23416g) {
        int i13 = AbstractC23410a.f92767w;
        AbstractC31056a.m95616a(abstractC23416g, "scheduler is null");
        AbstractC31056a.m95617b(i13, "bufferSize");
        return new C36930p(this, abstractC23416g, i13);
    }

    /* JADX INFO: renamed from: c */
    public final void m67905c(InterfaceC23413d interfaceC23413d) {
        AbstractC31056a.m95616a(interfaceC23413d, "observer is null");
        try {
            mo43873d(interfaceC23413d);
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            AbstractC21598x.m60677d0(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo43873d(InterfaceC23413d interfaceC23413d);
}
