package androidx.room;

import androidx.lifecycle.RunnableC1605m;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p073cq.ExecutorC11049r;
import p073cq.RunnableC11044m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1834u1 implements Executor {

    /* JADX INFO: renamed from: E */
    public final Object f7182E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7183w;

    /* JADX INFO: renamed from: x */
    public final ArrayDeque f7184x;

    /* JADX INFO: renamed from: y */
    public final Executor f7185y;

    /* JADX INFO: renamed from: z */
    public Runnable f7186z;

    public ExecutorC1834u1(Executor executor, int i13) {
        this.f7183w = i13;
        switch (i13) {
            case 1:
                this.f7185y = executor;
                this.f7184x = new ArrayDeque();
                this.f7182E = new Object();
                break;
            default:
                AbstractC22676k.m65750j(executor, "executor");
                this.f7185y = executor;
                this.f7184x = new ArrayDeque();
                this.f7182E = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5453a() {
        switch (this.f7183w) {
            case 0:
                synchronized (this.f7182E) {
                    Object objPoll = this.f7184x.poll();
                    Runnable runnable = (Runnable) objPoll;
                    this.f7186z = runnable;
                    if (objPoll != null) {
                        this.f7185y.execute(runnable);
                    }
                    break;
                }
                return;
            case 1:
                Runnable runnable2 = (Runnable) this.f7184x.poll();
                this.f7186z = runnable2;
                if (runnable2 != null) {
                    this.f7185y.execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.f7182E) {
                    try {
                        Runnable runnable3 = (Runnable) this.f7184x.poll();
                        this.f7186z = runnable3;
                        if (runnable3 != null) {
                            ((ExecutorC11049r) this.f7185y).execute(runnable3);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f7183w) {
            case 0:
                AbstractC22676k.m65750j(command, "command");
                synchronized (this.f7182E) {
                    this.f7184x.offer(new RunnableC1605m(command, this, 1));
                    if (this.f7186z == null) {
                        m5453a();
                    }
                    break;
                }
                return;
            case 1:
                synchronized (this.f7182E) {
                    try {
                        this.f7184x.add(new RunnableC11044m(this, command, false, 11));
                        if (this.f7186z == null) {
                            m5453a();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f7182E) {
                    try {
                        this.f7184x.add(new RunnableC1605m(26, this, command));
                        if (this.f7186z == null) {
                            m5453a();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
        }
    }

    public ExecutorC1834u1(ExecutorC11049r executorC11049r) {
        this.f7183w = 2;
        this.f7182E = new Object();
        this.f7184x = new ArrayDeque();
        this.f7185y = executorC11049r;
    }
}
