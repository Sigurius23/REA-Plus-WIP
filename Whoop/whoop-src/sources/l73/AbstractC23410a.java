package l73;

import bi.AbstractC3269g;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: l73.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23410a {

    /* JADX INFO: renamed from: w */
    public static final int f92767w = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* JADX INFO: renamed from: a */
    public final void m67903a(InterfaceC23411b interfaceC23411b) {
        try {
            mo36114c(interfaceC23411b);
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

    /* JADX INFO: renamed from: c */
    public abstract void mo36114c(InterfaceC23411b interfaceC23411b);
}
