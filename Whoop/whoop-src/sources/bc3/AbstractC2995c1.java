package bc3;

import a11.C0129g;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: bc3.c1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2995c1 extends AbstractC3076z implements Closeable, AutoCloseable {
    public static final C2991b1 Key = new C2991b1(AbstractC3076z.Key, new C0129g(13));

    public abstract Executor getExecutor();
}
