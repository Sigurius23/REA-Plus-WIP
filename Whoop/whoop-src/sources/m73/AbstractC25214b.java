package m73;

import bi.AbstractC3269g;

/* JADX INFO: renamed from: m73.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25214b {

    /* JADX INFO: renamed from: a */
    public static final C25217e f99025a;

    static {
        try {
            C25217e c25217e = AbstractC25213a.f99024a;
            if (c25217e == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f99025a = c25217e;
        } catch (Throwable th3) {
            AbstractC3269g.m9487P(th3);
            throw null;
        }
    }
}
