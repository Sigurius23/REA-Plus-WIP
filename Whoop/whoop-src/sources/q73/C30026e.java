package q73;

import b83.AbstractC2808d;
import bi.AbstractC3269g;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import n73.InterfaceC26443b;
import y73.RunnableC39301m;

/* JADX INFO: renamed from: q73.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C30026e implements InterfaceC26443b, InterfaceC30023b {

    /* JADX INFO: renamed from: w */
    public LinkedList f122540w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f122541x;

    @Override // q73.InterfaceC30023b
    /* JADX INFO: renamed from: a */
    public final boolean mo78293a(InterfaceC26443b interfaceC26443b) {
        if (!this.f122541x) {
            synchronized (this) {
                try {
                    if (!this.f122541x) {
                        LinkedList linkedList = this.f122540w;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f122540w = linkedList;
                        }
                        linkedList.add(interfaceC26443b);
                        return true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        interfaceC26443b.dispose();
        return false;
    }

    @Override // q73.InterfaceC30023b
    /* JADX INFO: renamed from: b */
    public final boolean mo78294b(InterfaceC26443b interfaceC26443b) {
        if (this.f122541x) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f122541x) {
                    return false;
                }
                LinkedList linkedList = this.f122540w;
                if (linkedList != null && linkedList.remove(interfaceC26443b)) {
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // q73.InterfaceC30023b
    /* JADX INFO: renamed from: c */
    public final boolean mo78295c(InterfaceC26443b interfaceC26443b) {
        if (!mo78294b(interfaceC26443b)) {
            return false;
        }
        ((RunnableC39301m) interfaceC26443b).dispose();
        return true;
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f122541x) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f122541x) {
                    return;
                }
                this.f122541x = true;
                LinkedList linkedList = this.f122540w;
                ArrayList arrayList = null;
                this.f122540w = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC26443b) it.next()).dispose();
                    } catch (Throwable th3) {
                        AbstractC3269g.m9495a0(th3);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th3);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw AbstractC2808d.m7993a((Throwable) arrayList.get(0));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f122541x;
    }
}
