package mh3;

import bh3.InterfaceC3254a;
import fh3.C14493a;
import java.util.concurrent.atomic.AtomicReference;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: mh3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C25565b implements InterfaceC38293t {

    /* JADX INFO: renamed from: y */
    public static final C25564a f100257y = new C25564a();

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100258w;

    /* JADX INFO: renamed from: x */
    public final AtomicReference f100259x;

    public C25565b(int i13) {
        this.f100258w = i13;
        switch (i13) {
            case 1:
                this.f100259x = new C14493a();
                break;
            default:
                this.f100259x = new AtomicReference();
                break;
        }
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        switch (this.f100258w) {
            case 0:
                return this.f100259x.get() == f100257y;
            default:
                return ((C14493a) this.f100259x).mo14749a();
        }
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        InterfaceC3254a interfaceC3254a;
        switch (this.f100258w) {
            case 0:
                AtomicReference atomicReference = this.f100259x;
                InterfaceC3254a interfaceC3254a2 = (InterfaceC3254a) atomicReference.get();
                C25564a c25564a = f100257y;
                if (interfaceC3254a2 != c25564a && (interfaceC3254a = (InterfaceC3254a) atomicReference.getAndSet(c25564a)) != null && interfaceC3254a != c25564a) {
                    interfaceC3254a.call();
                    break;
                }
                break;
            default:
                ((C14493a) this.f100259x).mo14750b();
                break;
        }
    }

    public C25565b(InterfaceC3254a interfaceC3254a) {
        this.f100258w = 0;
        this.f100259x = new AtomicReference(interfaceC3254a);
    }
}
