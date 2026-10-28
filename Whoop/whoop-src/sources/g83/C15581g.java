package g83;

import b83.C2810f;
import b83.EnumC2812h;
import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: g83.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C15581g extends AbstractC15583i {

    /* JADX INFO: renamed from: w */
    public final C15580f f58528w;

    /* JADX INFO: renamed from: x */
    public final AtomicReference f58529x = new AtomicReference(f58527z);

    /* JADX INFO: renamed from: y */
    public boolean f58530y;

    /* JADX INFO: renamed from: z */
    public static final C15579e[] f58527z = new C15579e[0];

    /* JADX INFO: renamed from: E */
    public static final C15579e[] f58525E = new C15579e[0];

    /* JADX INFO: renamed from: F */
    public static final Object[] f58526F = new Object[0];

    public C15581g(C15580f c15580f) {
        this.f58528w = c15580f;
    }

    /* JADX INFO: renamed from: e */
    public static C15581g m43877e() {
        return new C15581g(new C15580f());
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        if (this.f58530y) {
            interfaceC26443b.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l73.AbstractC23412c
    /* JADX INFO: renamed from: d */
    public final void mo43873d(InterfaceC23413d interfaceC23413d) {
        C15579e c15579e = new C15579e(interfaceC23413d, this);
        interfaceC23413d.mo13591b(c15579e);
        if (c15579e.f58521z) {
            return;
        }
        AtomicReference atomicReference = this.f58529x;
        loop0: while (true) {
            C15579e[] c15579eArr = (C15579e[]) atomicReference.get();
            if (c15579eArr == f58525E) {
                break;
            }
            int length = c15579eArr.length;
            C15579e[] c15579eArr2 = new C15579e[length + 1];
            System.arraycopy(c15579eArr, 0, c15579eArr2, 0, length);
            c15579eArr2[length] = c15579e;
            do {
                if (atomicReference.compareAndSet(c15579eArr, c15579eArr2)) {
                    if (!c15579e.f58521z) {
                        break loop0;
                    }
                    m43878f(c15579e);
                    return;
                }
            } while (atomicReference.get() == c15579eArr);
        }
        this.f58528w.m43876a(c15579e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m43878f(C15579e c15579e) {
        C15579e[] c15579eArr;
        while (true) {
            AtomicReference atomicReference = this.f58529x;
            C15579e[] c15579eArr2 = (C15579e[]) atomicReference.get();
            if (c15579eArr2 == f58525E || c15579eArr2 == (c15579eArr = f58527z)) {
                return;
            }
            int length = c15579eArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                } else if (c15579eArr2[i13] == c15579e) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                return;
            }
            if (length != 1) {
                c15579eArr = new C15579e[length - 1];
                System.arraycopy(c15579eArr2, 0, c15579eArr, 0, i13);
                System.arraycopy(c15579eArr2, i13 + 1, c15579eArr, i13, (length - i13) - 1);
            }
            while (!atomicReference.compareAndSet(c15579eArr2, c15579eArr)) {
                if (atomicReference.get() != c15579eArr2) {
                }
            }
            return;
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        if (this.f58530y) {
            return;
        }
        this.f58530y = true;
        EnumC2812h enumC2812h = EnumC2812h.f11003w;
        C15580f c15580f = this.f58528w;
        c15580f.f58522w.add(enumC2812h);
        c15580f.f58524y++;
        c15580f.f58523x = true;
        C15579e[] c15579eArr = f58525E;
        if (this.f58528w.compareAndSet(null, enumC2812h)) {
            c15579eArr = (C15579e[]) this.f58529x.getAndSet(c15579eArr);
        }
        for (C15579e c15579e : c15579eArr) {
            c15580f.m43876a(c15579e);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        AbstractC31056a.m95616a(th3, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f58530y) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        this.f58530y = true;
        C2810f c2810f = new C2810f(th3);
        C15580f c15580f = this.f58528w;
        c15580f.f58522w.add(c2810f);
        c15580f.f58524y++;
        c15580f.f58523x = true;
        C15579e[] c15579eArr = f58525E;
        if (this.f58528w.compareAndSet(null, c2810f)) {
            c15579eArr = (C15579e[]) this.f58529x.getAndSet(c15579eArr);
        }
        for (C15579e c15579e : c15579eArr) {
            c15580f.m43876a(c15579e);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        AbstractC31056a.m95616a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f58530y) {
            return;
        }
        C15580f c15580f = this.f58528w;
        c15580f.f58522w.add(obj);
        c15580f.f58524y++;
        for (C15579e c15579e : (C15579e[]) this.f58529x.get()) {
            c15580f.m43876a(c15579e);
        }
    }
}
