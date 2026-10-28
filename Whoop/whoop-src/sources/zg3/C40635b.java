package zg3;

import android.os.Handler;
import android.os.Message;
import bh3.InterfaceC3254a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mh3.AbstractC25568e;
import mh3.C25567d;
import xg3.AbstractC38283j;
import xg3.InterfaceC38293t;
import yg3.C39532a;
import yg3.C39533b;

/* JADX INFO: renamed from: zg3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C40635b extends AbstractC38283j {

    /* JADX INFO: renamed from: w */
    public final Handler f175385w;

    /* JADX INFO: renamed from: x */
    public final C39533b f175386x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f175387y;

    public C40635b(Handler handler) {
        this.f175385w = handler;
        AtomicReference atomicReference = C39532a.f170082b.f170083a;
        if (atomicReference.get() == null) {
            while (!atomicReference.compareAndSet(null, C39533b.f170084a) && atomicReference.get() == null) {
            }
        }
        this.f175386x = (C39533b) atomicReference.get();
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f175387y;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        this.f175387y = true;
        this.f175385w.removeCallbacksAndMessages(this);
    }

    @Override // xg3.AbstractC38283j
    /* JADX INFO: renamed from: c */
    public final InterfaceC38293t mo37106c(InterfaceC3254a interfaceC3254a) {
        return mo37107d(interfaceC3254a, 0L, TimeUnit.MILLISECONDS);
    }

    @Override // xg3.AbstractC38283j
    /* JADX INFO: renamed from: d */
    public final InterfaceC38293t mo37107d(InterfaceC3254a interfaceC3254a, long j7, TimeUnit timeUnit) {
        C25567d c25567d = AbstractC25568e.f100262a;
        if (this.f175387y) {
            return c25567d;
        }
        this.f175386x.getClass();
        Handler handler = this.f175385w;
        RunnableC40636c runnableC40636c = new RunnableC40636c(interfaceC3254a, handler);
        Message messageObtain = Message.obtain(handler, runnableC40636c);
        messageObtain.obj = this;
        this.f175385w.sendMessageDelayed(messageObtain, timeUnit.toMillis(j7));
        if (!this.f175387y) {
            return runnableC40636c;
        }
        this.f175385w.removeCallbacks(runnableC40636c);
        return c25567d;
    }
}
