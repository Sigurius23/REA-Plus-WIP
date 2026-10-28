package hc3;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: hc3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17165a {

    /* JADX INFO: renamed from: a */
    public static final Method f65954a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f65954a = method;
    }
}
