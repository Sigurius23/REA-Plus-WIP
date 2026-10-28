package lh3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p098dt.AbstractC12350b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38278e;
import xg3.InterfaceC38281h;

/* JADX INFO: renamed from: lh3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C24081d extends AtomicReference implements InterfaceC38278e, InterfaceC38281h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95135w = 0;

    /* JADX INFO: renamed from: x */
    public Object f95136x;

    /* JADX INFO: renamed from: y */
    public static final C24080c[] f95133y = new C24080c[0];

    /* JADX INFO: renamed from: z */
    public static final C24080c[] f95134z = new C24080c[0];

    /* JADX INFO: renamed from: E */
    public static final C24083f[] f95131E = new C24083f[0];

    /* JADX INFO: renamed from: F */
    public static final C24083f[] f95132F = new C24083f[0];

    public /* synthetic */ C24081d() {
    }

    /* JADX INFO: renamed from: a */
    public void m70998a(C24080c c24080c) {
        C24080c[] c24080cArr;
        C24080c[] c24080cArr2;
        do {
            c24080cArr = (C24080c[]) get();
            if (c24080cArr == f95134z || c24080cArr == (c24080cArr2 = f95133y)) {
                return;
            }
            int length = c24080cArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (c24080cArr[i13] == c24080c) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length != 1) {
                c24080cArr2 = new C24080c[length - 1];
                System.arraycopy(c24080cArr, 0, c24080cArr2, 0, i13);
                System.arraycopy(c24080cArr, i13 + 1, c24080cArr2, i13, (length - i13) - 1);
            }
        } while (!compareAndSet(c24080cArr, c24080cArr2));
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        C24080c[] c24080cArr;
        C24080c[] c24080cArr2;
        C24083f[] c24083fArr;
        C24083f[] c24083fArr2;
        switch (this.f95135w) {
            case 0:
                AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
                C24080c c24080c = new C24080c(this, abstractC38292s);
                abstractC38292s.m122688c(c24080c);
                abstractC38292s.mo14765f(c24080c);
                do {
                    c24080cArr = (C24080c[]) get();
                    if (c24080cArr == f95134z) {
                        Throwable th3 = (Throwable) this.f95136x;
                        if (th3 == null) {
                            abstractC38292s.onCompleted();
                        } else {
                            abstractC38292s.onError(th3);
                        }
                    } else {
                        int length = c24080cArr.length;
                        c24080cArr2 = new C24080c[length + 1];
                        System.arraycopy(c24080cArr, 0, c24080cArr2, 0, length);
                        c24080cArr2[length] = c24080c;
                    }
                    break;
                } while (!compareAndSet(c24080cArr, c24080cArr2));
                if (c24080c.mo14749a()) {
                    m70998a(c24080c);
                }
                break;
            default:
                AbstractC38292s abstractC38292s2 = (AbstractC38292s) obj;
                C24083f c24083f = new C24083f(this, abstractC38292s2);
                abstractC38292s2.m122688c(c24083f);
                abstractC38292s2.mo14765f(c24083f);
                do {
                    c24083fArr = (C24083f[]) get();
                    if (c24083fArr != f95132F) {
                        int length2 = c24083fArr.length;
                        c24083fArr2 = new C24083f[length2 + 1];
                        System.arraycopy(c24083fArr, 0, c24083fArr2, 0, length2);
                        c24083fArr2[length2] = c24083f;
                    }
                    ((C24085h) this.f95136x).m71001a(c24083f);
                    break;
                } while (!compareAndSet(c24083fArr, c24083fArr2));
                if (c24083f.f95138w.mo14749a()) {
                    m70999c(c24083f);
                }
                ((C24085h) this.f95136x).m71001a(c24083f);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m70999c(C24083f c24083f) {
        C24083f[] c24083fArr;
        C24083f[] c24083fArr2;
        do {
            c24083fArr = (C24083f[]) get();
            if (c24083fArr == f95132F || c24083fArr == (c24083fArr2 = f95131E)) {
                return;
            }
            int length = c24083fArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (c24083fArr[i13] == c24083f) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length != 1) {
                c24083fArr2 = new C24083f[length - 1];
                System.arraycopy(c24083fArr, 0, c24083fArr2, 0, i13);
                System.arraycopy(c24083fArr, i13 + 1, c24083fArr2, i13, (length - i13) - 1);
            }
        } while (!compareAndSet(c24083fArr, c24083fArr2));
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        switch (this.f95135w) {
            case 0:
                for (C24080c c24080c : (C24080c[]) getAndSet(f95134z)) {
                    c24080c.onCompleted();
                }
                break;
            default:
                C24085h c24085h = (C24085h) this.f95136x;
                c24085h.f95147e = true;
                for (C24083f c24083f : (C24083f[]) getAndSet(f95132F)) {
                    c24085h.m71001a(c24083f);
                }
                break;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        switch (this.f95135w) {
            case 0:
                this.f95136x = th3;
                ArrayList arrayList = null;
                for (C24080c c24080c : (C24080c[]) getAndSet(f95134z)) {
                    try {
                        c24080c.onError(th3);
                    } catch (Throwable th4) {
                        if (arrayList == null) {
                            arrayList = new ArrayList(1);
                        }
                        arrayList.add(th4);
                    }
                }
                AbstractC12350b.m34572U(arrayList);
                break;
            default:
                C24085h c24085h = (C24085h) this.f95136x;
                c24085h.f95148f = th3;
                c24085h.f95147e = true;
                ArrayList arrayList2 = null;
                for (C24083f c24083f : (C24083f[]) getAndSet(f95132F)) {
                    try {
                        c24085h.m71001a(c24083f);
                    } catch (Throwable th5) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(th5);
                    }
                }
                AbstractC12350b.m34572U(arrayList2);
                break;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        switch (this.f95135w) {
            case 0:
                for (C24080c c24080c : (C24080c[]) get()) {
                    c24080c.onNext(obj);
                }
                break;
            default:
                C24085h c24085h = (C24085h) this.f95136x;
                c24085h.getClass();
                C24084g c24084g = new C24084g(obj);
                c24085h.f95145c.set(c24084g);
                c24085h.f95145c = c24084g;
                int i13 = c24085h.f95146d;
                if (i13 == c24085h.f95143a) {
                    c24085h.f95144b = (C24084g) c24085h.f95144b.get();
                } else {
                    c24085h.f95146d = i13 + 1;
                }
                for (C24083f c24083f : (C24083f[]) get()) {
                    c24085h.m71001a(c24083f);
                }
                break;
        }
    }

    public C24081d(C24085h c24085h) {
        this.f95136x = c24085h;
        lazySet(f95131E);
    }
}
