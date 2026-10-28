package lh3;

import bh3.C3257d;
import bh3.InterfaceC3255b;
import java.util.concurrent.atomic.AtomicReference;
import mh3.C25565b;
import p101dx.C12421b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38278e;

/* JADX INFO: renamed from: lh3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C24091n extends AtomicReference implements InterfaceC38278e {

    /* JADX INFO: renamed from: E */
    public InterfaceC3255b f95163E;

    /* JADX INFO: renamed from: w */
    public volatile Object f95164w;

    /* JADX INFO: renamed from: x */
    public boolean f95165x;

    /* JADX INFO: renamed from: y */
    public C3257d f95166y;

    /* JADX INFO: renamed from: z */
    public InterfaceC3255b f95167z;

    /* JADX INFO: renamed from: a */
    public final void m71004a(C24090m c24090m) {
        C24089l c24089l;
        C24089l c24089l2;
        do {
            c24089l = (C24089l) get();
            if (c24089l.f95156a) {
                return;
            }
            C24090m[] c24090mArr = c24089l.f95157b;
            int length = c24090mArr.length;
            c24089l2 = C24089l.f95155e;
            if (length != 1 || c24090mArr[0] != c24090m) {
                if (length != 0) {
                    int i13 = length - 1;
                    C24090m[] c24090mArr2 = new C24090m[i13];
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= length) {
                            if (i15 == 0) {
                                break;
                            }
                            if (i15 < i13) {
                                C24090m[] c24090mArr3 = new C24090m[i15];
                                System.arraycopy(c24090mArr2, 0, c24090mArr3, 0, i15);
                                c24090mArr2 = c24090mArr3;
                            }
                            c24089l2 = new C24089l(c24089l.f95156a, c24090mArr2);
                            break;
                        }
                        C24090m c24090m2 = c24090mArr[i14];
                        if (c24090m2 != c24090m) {
                            if (i15 == i13) {
                                c24089l2 = c24089l;
                                break;
                            } else {
                                c24090mArr2[i15] = c24090m2;
                                i15++;
                            }
                        }
                        i14++;
                    }
                } else {
                    c24089l2 = c24089l;
                    break;
                }
            }
            if (c24089l2 == c24089l) {
                return;
            }
        } while (!compareAndSet(c24089l, c24089l2));
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        C24089l c24089l;
        C24090m[] c24090mArr;
        AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
        C24090m c24090m = new C24090m(abstractC38292s);
        abstractC38292s.m122688c(new C25565b(new C12421b(3, this, c24090m)));
        this.f95166y.getClass();
        if (abstractC38292s.mo14749a()) {
            return;
        }
        do {
            c24089l = (C24089l) get();
            if (c24089l.f95156a) {
                this.f95163E.mo9472b(c24090m);
                return;
            }
            C24090m[] c24090mArr2 = c24089l.f95157b;
            int length = c24090mArr2.length;
            c24090mArr = new C24090m[length + 1];
            System.arraycopy(c24090mArr2, 0, c24090mArr, 0, length);
            c24090mArr[length] = c24090m;
        } while (!compareAndSet(c24089l, new C24089l(c24089l.f95156a, c24090mArr)));
        this.f95167z.mo9472b(c24090m);
        if (abstractC38292s.mo14749a()) {
            m71004a(c24090m);
        }
    }
}
