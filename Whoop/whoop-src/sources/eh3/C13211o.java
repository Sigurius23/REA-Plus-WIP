package eh3;

import gh3.C15868m;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import mh3.C25566c;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: eh3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C13211o extends AtomicBoolean implements InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45789w;

    /* JADX INFO: renamed from: x */
    public final RunnableC13212p f45790x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC38293t f45791y;

    public /* synthetic */ C13211o(RunnableC13212p runnableC13212p, InterfaceC38293t interfaceC38293t, int i13) {
        this.f45789w = i13;
        this.f45790x = runnableC13212p;
        this.f45791y = interfaceC38293t;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        switch (this.f45789w) {
            case 0:
                break;
        }
        return this.f45790x.f45792w.f59975x;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        switch (this.f45789w) {
            case 0:
                if (compareAndSet(false, true)) {
                    C15868m c15868m = (C15868m) this.f45791y;
                    RunnableC13212p runnableC13212p = this.f45790x;
                    if (c15868m.f59975x) {
                        return;
                    }
                    synchronized (c15868m) {
                        LinkedList linkedList = c15868m.f59974w;
                        if (!c15868m.f59975x && linkedList != null) {
                            boolean zRemove = linkedList.remove(runnableC13212p);
                            if (zRemove) {
                                runnableC13212p.mo14750b();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (compareAndSet(false, true)) {
                    ((C25566c) this.f45791y).m75181e(this.f45790x);
                    return;
                }
                return;
        }
    }
}
