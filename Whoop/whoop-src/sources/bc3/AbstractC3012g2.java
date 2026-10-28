package bc3;

/* JADX INFO: renamed from: bc3.g2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3012g2 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f12029a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static AbstractC2987a1 m8738a() {
        ThreadLocal threadLocal = f12029a;
        AbstractC2987a1 abstractC2987a1 = (AbstractC2987a1) threadLocal.get();
        if (abstractC2987a1 != null) {
            return abstractC2987a1;
        }
        C3009g c3009g = new C3009g(Thread.currentThread());
        threadLocal.set(c3009g);
        return c3009g;
    }
}
