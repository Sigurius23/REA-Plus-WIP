package fh3;

import bh3.InterfaceC3259f;
import java.util.concurrent.atomic.AtomicReference;
import jh3.AbstractC21700a;
import p098dt.AbstractC12350b;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: fh3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14493a extends AtomicReference implements InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52922w = 1;

    public /* synthetic */ C14493a() {
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        switch (this.f52922w) {
            case 0:
                return get() == null;
            default:
                return get() == EnumC14494b.f52923w;
        }
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        InterfaceC3259f interfaceC3259f;
        InterfaceC38293t interfaceC38293t;
        switch (this.f52922w) {
            case 0:
                if (get() != null && (interfaceC3259f = (InterfaceC3259f) getAndSet(null)) != null) {
                    try {
                        interfaceC3259f.cancel();
                    } catch (Exception e5) {
                        AbstractC12350b.m34573V(e5);
                        AbstractC21700a.m61126a(e5);
                        return;
                    }
                    break;
                }
                break;
            default:
                InterfaceC38293t interfaceC38293t2 = (InterfaceC38293t) get();
                EnumC14494b enumC14494b = EnumC14494b.f52923w;
                if (interfaceC38293t2 != enumC14494b && (interfaceC38293t = (InterfaceC38293t) getAndSet(enumC14494b)) != null && interfaceC38293t != enumC14494b) {
                    interfaceC38293t.mo14750b();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m41405c(InterfaceC38293t interfaceC38293t) {
        InterfaceC38293t interfaceC38293t2;
        do {
            interfaceC38293t2 = (InterfaceC38293t) get();
            if (interfaceC38293t2 == EnumC14494b.f52923w) {
                interfaceC38293t.mo14750b();
                return;
            }
        } while (!compareAndSet(interfaceC38293t2, interfaceC38293t));
        if (interfaceC38293t2 != null) {
            interfaceC38293t2.mo14750b();
        }
    }

    public /* synthetic */ C14493a(Object obj) {
        super(obj);
    }
}
