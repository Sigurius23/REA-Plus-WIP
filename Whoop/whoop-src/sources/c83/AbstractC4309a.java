package c83;

import j93.AbstractC21478l0;
import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import q73.EnumC30024c;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: c83.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4309a implements InterfaceC23413d, InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    final AtomicReference<InterfaceC26443b> f17494w = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void mo13590a() {
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        AtomicReference<InterfaceC26443b> atomicReference = this.f17494w;
        Class<?> cls = getClass();
        AbstractC31056a.m95616a(interfaceC26443b, "next is null");
        while (!atomicReference.compareAndSet(null, interfaceC26443b)) {
            if (atomicReference.get() != null) {
                interfaceC26443b.dispose();
                if (atomicReference.get() != EnumC30024c.f122536w) {
                    AbstractC21478l0.m60418X(cls);
                    return;
                }
                return;
            }
        }
        mo13590a();
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        EnumC30024c.m91915a(this.f17494w);
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f17494w.get() == EnumC30024c.f122536w;
    }
}
