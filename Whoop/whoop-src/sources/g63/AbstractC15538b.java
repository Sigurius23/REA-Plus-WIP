package g63;

import io.sentry.hints.C20363j;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: g63.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15538b {

    /* JADX INFO: renamed from: a */
    public static final C20363j f58263a;

    /* JADX INFO: renamed from: b */
    public static final C20363j f58264b;

    /* JADX INFO: renamed from: c */
    public static final C20363j f58265c;

    /* JADX INFO: renamed from: d */
    public static final C20363j f58266d;

    /* JADX INFO: renamed from: e */
    public static final C20363j f58267e;

    static {
        int i13 = 25;
        f58263a = new C20363j(i13);
        f58264b = new C20363j(i13);
        f58265c = new C20363j(i13);
        f58266d = new C20363j(i13);
        f58267e = new C20363j(i13);
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m43736a(Throwable th3) {
        Throwable cause = th3;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (!cause.equals(cancellationException.getCause())) {
                cause = cancellationException.getCause();
            }
        }
        return cause == null ? th3 : cause;
    }
}
