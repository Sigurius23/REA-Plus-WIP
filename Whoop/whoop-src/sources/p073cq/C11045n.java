package p073cq;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: cq.n */
/* JADX INFO: loaded from: classes.dex */
public final class C11045n implements InterfaceC11047p, InterfaceC11037f, InterfaceC11036e, InterfaceC11034c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34653w;

    /* JADX INFO: renamed from: x */
    public final Executor f34654x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC11033b f34655y;

    /* JADX INFO: renamed from: z */
    public final C11052u f34656z;

    public /* synthetic */ C11045n(Executor executor, InterfaceC11033b interfaceC11033b, C11052u c11052u, int i13) {
        this.f34653w = i13;
        this.f34654x = executor;
        this.f34655y = interfaceC11033b;
        this.f34656z = c11052u;
    }

    @Override // p073cq.InterfaceC11047p
    /* JADX INFO: renamed from: a */
    public final void mo29695a(Task task) {
        switch (this.f34653w) {
            case 0:
                this.f34654x.execute(new RunnableC11044m(0, this, task));
                break;
            default:
                this.f34654x.execute(new RunnableC11044m(1, this, task));
                break;
        }
    }

    @Override // p073cq.InterfaceC11047p
    /* JADX INFO: renamed from: b */
    public final void mo29696b() {
        switch (this.f34653w) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p073cq.InterfaceC11034c
    /* JADX INFO: renamed from: d */
    public void mo2320d() {
        this.f34656z.m29705d();
    }

    @Override // p073cq.InterfaceC11036e
    /* JADX INFO: renamed from: n */
    public void mo1681n(Exception exc) {
        this.f34656z.m29704c(exc);
    }

    @Override // p073cq.InterfaceC11037f
    public void onSuccess(Object obj) {
        this.f34656z.m29702a(obj);
    }
}
