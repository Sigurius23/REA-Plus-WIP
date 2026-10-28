package xb3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: xb3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C38166a implements InterfaceC38174i {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f163461a;

    public C38166a(InterfaceC38174i interfaceC38174i) {
        this.f163461a = new AtomicReference(interfaceC38174i);
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        InterfaceC38174i interfaceC38174i = (InterfaceC38174i) this.f163461a.getAndSet(null);
        if (interfaceC38174i != null) {
            return interfaceC38174i.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
