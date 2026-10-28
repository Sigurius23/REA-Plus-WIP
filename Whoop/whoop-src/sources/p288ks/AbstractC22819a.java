package p288ks;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ks.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22819a {

    /* JADX INFO: renamed from: a */
    public static final Logger f89918a = Logger.getLogger(AbstractC22819a.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f89919b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static boolean m66183a() {
        return f89919b.get();
    }
}
