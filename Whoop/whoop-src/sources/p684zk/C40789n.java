package p684zk;

import java.util.concurrent.Executor;
import pl.C29342e;

/* JADX INFO: renamed from: zk.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C40789n {

    /* JADX INFO: renamed from: a */
    public final C29342e f175908a;

    /* JADX INFO: renamed from: b */
    public final Executor f175909b;

    public C40789n(C29342e c29342e, Executor executor) {
        this.f175908a = c29342e;
        this.f175909b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C40789n) {
            return this.f175908a.equals(((C40789n) obj).f175908a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f175908a.hashCode();
    }
}
