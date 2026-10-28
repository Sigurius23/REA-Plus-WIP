package b83;

/* JADX INFO: renamed from: b83.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2808d {

    /* JADX INFO: renamed from: a */
    public static final C2807c f10999a = new C2807c("No further exceptions", 0);

    /* JADX INFO: renamed from: a */
    public static RuntimeException m7993a(Throwable th3) {
        if (th3 instanceof Error) {
            throw ((Error) th3);
        }
        return th3 instanceof RuntimeException ? (RuntimeException) th3 : new RuntimeException(th3);
    }
}
