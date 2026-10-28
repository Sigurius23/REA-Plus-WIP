package p073cq;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p036bq.RunnableC3543b;
import p097ds.RunnableC12316s;

/* JADX INFO: renamed from: cq.o */
/* JADX INFO: loaded from: classes.dex */
public final class C11046o implements InterfaceC11047p, InterfaceC11037f, InterfaceC11036e, InterfaceC11034c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34657w;

    /* JADX INFO: renamed from: x */
    public final Executor f34658x;

    /* JADX INFO: renamed from: y */
    public final Object f34659y;

    /* JADX INFO: renamed from: z */
    public Object f34660z;

    public C11046o(Executor executor, InterfaceC11034c interfaceC11034c) {
        this.f34657w = 0;
        this.f34659y = new Object();
        this.f34658x = executor;
        this.f34660z = interfaceC11034c;
    }

    @Override // p073cq.InterfaceC11047p
    /* JADX INFO: renamed from: a */
    public final void mo29695a(Task task) {
        switch (this.f34657w) {
            case 0:
                if (task.isCanceled()) {
                    synchronized (this.f34659y) {
                        try {
                            if (((InterfaceC11034c) this.f34660z) != null) {
                                this.f34658x.execute(new RunnableC3543b(this, 3));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f34659y) {
                    try {
                        if (((InterfaceC11035d) this.f34660z) == null) {
                            return;
                        }
                        this.f34658x.execute(new RunnableC11044m(2, this, task));
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            case 2:
                if (task.isSuccessful() || task.isCanceled()) {
                    return;
                }
                synchronized (this.f34659y) {
                    try {
                        if (((InterfaceC11036e) this.f34660z) != null) {
                            this.f34658x.execute(new RunnableC12316s(this, task, false, 6));
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return;
            case 3:
                if (task.isSuccessful()) {
                    synchronized (this.f34659y) {
                        try {
                            if (((InterfaceC11037f) this.f34660z) != null) {
                                this.f34658x.execute(new RunnableC11044m(3, this, task));
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    return;
                }
                return;
            default:
                this.f34658x.execute(new RunnableC11044m(4, this, task));
                return;
        }
    }

    @Override // p073cq.InterfaceC11047p
    /* JADX INFO: renamed from: b */
    public final void mo29696b() {
        switch (this.f34657w) {
            case 0:
                synchronized (this.f34659y) {
                    this.f34660z = null;
                    break;
                }
                return;
            case 1:
                synchronized (this.f34659y) {
                    this.f34660z = null;
                    break;
                }
                return;
            case 2:
                synchronized (this.f34659y) {
                    this.f34660z = null;
                    break;
                }
                return;
            case 3:
                synchronized (this.f34659y) {
                    this.f34660z = null;
                    break;
                }
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p073cq.InterfaceC11034c
    /* JADX INFO: renamed from: d */
    public void mo2320d() {
        ((C11052u) this.f34660z).m29705d();
    }

    @Override // p073cq.InterfaceC11036e
    /* JADX INFO: renamed from: n */
    public void mo1681n(Exception exc) {
        ((C11052u) this.f34660z).m29704c(exc);
    }

    @Override // p073cq.InterfaceC11037f
    public void onSuccess(Object obj) {
        ((C11052u) this.f34660z).m29702a(obj);
    }

    public C11046o(Executor executor, InterfaceC11035d interfaceC11035d) {
        this.f34657w = 1;
        this.f34659y = new Object();
        this.f34658x = executor;
        this.f34660z = interfaceC11035d;
    }

    public C11046o(Executor executor, InterfaceC11036e interfaceC11036e) {
        this.f34657w = 2;
        this.f34659y = new Object();
        this.f34658x = executor;
        this.f34660z = interfaceC11036e;
    }

    public C11046o(Executor executor, InterfaceC11037f interfaceC11037f) {
        this.f34657w = 3;
        this.f34659y = new Object();
        this.f34658x = executor;
        this.f34660z = interfaceC11037f;
    }

    public C11046o(Executor executor, InterfaceC11039h interfaceC11039h, C11052u c11052u) {
        this.f34657w = 4;
        this.f34658x = executor;
        this.f34659y = interfaceC11039h;
        this.f34660z = c11052u;
    }
}
