package p161g;

import c93.InterfaceC4339a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14917t {

    /* JADX INFO: renamed from: a */
    private boolean f55597a;

    /* JADX INFO: renamed from: b */
    private final CopyOnWriteArrayList<InterfaceC14896b> f55598b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    private InterfaceC4339a f55599c;

    public AbstractC14917t(boolean z4) {
        this.f55597a = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m43008a(InterfaceC14896b cancellable) {
        AbstractC22676k.m65750j(cancellable, "cancellable");
        this.f55598b.add(cancellable);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a m43009b() {
        return this.f55599c;
    }

    /* JADX INFO: renamed from: c */
    public void mo4072c() {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo4073d();

    /* JADX INFO: renamed from: e */
    public void mo4074e(C14894a backEvent) {
        AbstractC22676k.m65750j(backEvent, "backEvent");
    }

    /* JADX INFO: renamed from: f */
    public void mo4075f(C14894a backEvent) {
        AbstractC22676k.m65750j(backEvent, "backEvent");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m43010g() {
        return this.f55597a;
    }

    /* JADX INFO: renamed from: h */
    public final void m43011h() {
        Iterator<T> it = this.f55598b.iterator();
        while (it.hasNext()) {
            ((InterfaceC14896b) it.next()).cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m43012i(InterfaceC14896b cancellable) {
        AbstractC22676k.m65750j(cancellable, "cancellable");
        this.f55598b.remove(cancellable);
    }

    /* JADX INFO: renamed from: j */
    public final void m43013j(boolean z4) {
        this.f55597a = z4;
        InterfaceC4339a interfaceC4339a = this.f55599c;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m43014k(InterfaceC4339a interfaceC4339a) {
        this.f55599c = interfaceC4339a;
    }
}
