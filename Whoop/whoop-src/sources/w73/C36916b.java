package w73;

import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.EnumC30024c;

/* JADX INFO: renamed from: w73.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C36916b extends AtomicReference implements InterfaceC23413d {

    /* JADX INFO: renamed from: w */
    public final C36917c f157959w;

    /* JADX INFO: renamed from: x */
    public final int f157960x;

    public C36916b(C36917c c36917c, int i13) {
        this.f157959w = c36917c;
        this.f157960x = i13;
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        EnumC30024c.m91916b(this, interfaceC26443b);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        C36917c c36917c = this.f157959w;
        int i13 = this.f157960x;
        synchronized (c36917c) {
            try {
                Object[] objArr = c36917c.f157970z;
                if (objArr == null) {
                    return;
                }
                boolean z4 = objArr[i13] == null;
                if (z4) {
                    c36917c.f157963G = true;
                } else {
                    int i14 = c36917c.f157966J + 1;
                    c36917c.f157966J = i14;
                    if (i14 == objArr.length) {
                        c36917c.f157963G = true;
                    }
                }
                if (z4) {
                    c36917c.m118545a();
                }
                c36917c.m118547c();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        C36917c c36917c = this.f157959w;
        if (!c36917c.f157964H.m7991a(th3)) {
            AbstractC21598x.m60677d0(th3);
        } else {
            c36917c.m118545a();
            c36917c.m118547c();
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        boolean z4;
        C36917c c36917c = this.f157959w;
        int i13 = this.f157960x;
        synchronized (c36917c) {
            try {
                Object[] objArr = c36917c.f157970z;
                if (objArr == null) {
                    return;
                }
                Object obj2 = objArr[i13];
                int i14 = c36917c.f157965I;
                if (obj2 == null) {
                    i14++;
                    c36917c.f157965I = i14;
                }
                objArr[i13] = obj;
                if (i14 == objArr.length) {
                    c36917c.f157961E.offer(objArr.clone());
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    c36917c.m118547c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
