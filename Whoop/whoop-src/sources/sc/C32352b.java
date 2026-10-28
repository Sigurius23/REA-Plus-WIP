package sc;

import android.os.Handler;
import android.os.Looper;
import androidx.room.ExecutorC1834u1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import java.util.concurrent.Executor;
import p073cq.ExecutorC11050s;

/* JADX INFO: renamed from: sc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C32352b implements InterfaceC32351a {

    /* JADX INFO: renamed from: a */
    public final ExecutorC1834u1 f133915a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3076z f133916b;

    /* JADX INFO: renamed from: c */
    public final Handler f133917c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final ExecutorC11050s f133918d = new ExecutorC11050s(this);

    public C32352b(Executor executor) {
        ExecutorC1834u1 executorC1834u1 = new ExecutorC1834u1(executor, 1);
        this.f133915a = executorC1834u1;
        this.f133916b = AbstractC3006f0.m8723q(executorC1834u1);
    }
}
