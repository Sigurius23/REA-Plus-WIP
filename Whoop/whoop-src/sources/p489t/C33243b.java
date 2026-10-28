package p489t;

import android.os.Handler;
import android.os.Looper;
import eh3.ThreadFactoryC13197a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: t.b */
/* JADX INFO: loaded from: classes.dex */
public final class C33243b extends AbstractC34132o {

    /* JADX INFO: renamed from: a */
    public final Object f138640a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f138641b = Executors.newFixedThreadPool(4, new ThreadFactoryC13197a());

    /* JADX INFO: renamed from: c */
    public volatile Handler f138642c;

    /* JADX INFO: renamed from: V */
    public final boolean m105476V() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
