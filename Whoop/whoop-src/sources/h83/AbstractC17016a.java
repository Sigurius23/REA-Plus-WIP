package h83;

import a83.EnumC0575c;
import eg3.InterfaceC13183b;
import j93.AbstractC21478l0;
import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23411b;
import n73.InterfaceC26443b;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: h83.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17016a implements InterfaceC23411b, InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    final AtomicReference<InterfaceC13183b> f65398w = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void m47994a() {
        this.f65398w.get().request(Long.MAX_VALUE);
    }

    @Override // eg3.InterfaceC13182a
    /* JADX INFO: renamed from: b */
    public final void mo36113b(InterfaceC13183b interfaceC13183b) {
        AtomicReference<InterfaceC13183b> atomicReference = this.f65398w;
        Class<?> cls = getClass();
        AbstractC31056a.m95616a(interfaceC13183b, "next is null");
        while (!atomicReference.compareAndSet(null, interfaceC13183b)) {
            if (atomicReference.get() != null) {
                interfaceC13183b.cancel();
                if (atomicReference.get() != EnumC0575c.f2049w) {
                    AbstractC21478l0.m60418X(cls);
                    return;
                }
                return;
            }
        }
        m47994a();
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        EnumC0575c.m1489a(this.f65398w);
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f65398w.get() == EnumC0575c.f2049w;
    }
}
