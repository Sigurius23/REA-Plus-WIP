package p217ib;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ib.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18313j {

    /* JADX INFO: renamed from: a */
    private AtomicBoolean f71292a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    private CopyOnWriteArrayList<InterfaceC18311h> f71293b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public void mo52719a(InterfaceC18311h interfaceC18311h) {
        this.f71293b.add(interfaceC18311h);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo52696b();

    /* JADX INFO: renamed from: c */
    public boolean mo52720c() {
        return this.f71292a.get();
    }

    /* JADX INFO: renamed from: d */
    public void mo52721d(InterfaceC18311h interfaceC18311h) {
        this.f71293b.remove(interfaceC18311h);
    }
}
