package n73;

import b83.AbstractC2808d;
import b83.C2813i;
import bi.AbstractC3269g;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import q73.InterfaceC30023b;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: n73.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C26442a implements InterfaceC26443b, InterfaceC30023b {

    /* JADX INFO: renamed from: w */
    public C2813i f105040w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f105041x;

    /* JADX INFO: renamed from: e */
    public static void m78292e(C2813i c2813i) {
        if (c2813i == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : (Object[]) c2813i.f11008d) {
            if (obj instanceof InterfaceC26443b) {
                try {
                    ((InterfaceC26443b) obj).dispose();
                } catch (Throwable th3) {
                    AbstractC3269g.m9495a0(th3);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th3);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw AbstractC2808d.m7993a((Throwable) arrayList.get(0));
        }
    }

    @Override // q73.InterfaceC30023b
    /* JADX INFO: renamed from: a */
    public final boolean mo78293a(InterfaceC26443b interfaceC26443b) {
        AbstractC31056a.m95616a(interfaceC26443b, "disposable is null");
        if (!this.f105041x) {
            synchronized (this) {
                try {
                    if (!this.f105041x) {
                        C2813i c2813i = this.f105040w;
                        if (c2813i == null) {
                            c2813i = new C2813i();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            c2813i.f11005a = iNumberOfLeadingZeros - 1;
                            c2813i.f11007c = (int) (0.75f * iNumberOfLeadingZeros);
                            c2813i.f11008d = new Object[iNumberOfLeadingZeros];
                            this.f105040w = c2813i;
                        }
                        c2813i.m7994a(interfaceC26443b);
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
        Object obj;
        AbstractC31056a.m95616a(interfaceC26443b, "disposables is null");
        if (this.f105041x) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f105041x) {
                    return false;
                }
                C2813i c2813i = this.f105040w;
                if (c2813i != null) {
                    Object[] objArr = (Object[]) c2813i.f11008d;
                    int i13 = c2813i.f11005a;
                    int iHashCode = interfaceC26443b.hashCode() * (-1640531527);
                    int i14 = (iHashCode ^ (iHashCode >>> 16)) & i13;
                    Object obj2 = objArr[i14];
                    if (obj2 != null) {
                        if (obj2.equals(interfaceC26443b)) {
                            c2813i.m7997d(i14, i13, objArr);
                        } else {
                            do {
                                i14 = (i14 + 1) & i13;
                                obj = objArr[i14];
                                if (obj == null) {
                                }
                            } while (!obj.equals(interfaceC26443b));
                            c2813i.m7997d(i14, i13, objArr);
                        }
                        return true;
                    }
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
        interfaceC26443b.dispose();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m78296d() {
        if (this.f105041x) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f105041x) {
                    return;
                }
                C2813i c2813i = this.f105040w;
                this.f105040w = null;
                m78292e(c2813i);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f105041x) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f105041x) {
                    return;
                }
                this.f105041x = true;
                C2813i c2813i = this.f105040w;
                this.f105040w = null;
                m78292e(c2813i);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f105041x;
    }
}
