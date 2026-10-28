package bc3;

import ge3.AbstractC15751g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: bc3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C3001e {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12010b = AtomicIntegerFieldUpdater.newUpdater(C3001e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a */
    public final InterfaceC3018i0[] f12011a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C3001e(InterfaceC3018i0[] interfaceC3018i0Arr) {
        this.f12011a = interfaceC3018i0Arr;
        this.notCompletedCount$volatile = interfaceC3018i0Arr.length;
    }

    /* JADX INFO: renamed from: a */
    public final Object m8693a(InterfaceC30057d interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        InterfaceC3027k1[] interfaceC3027k1Arr = this.f12011a;
        int length = interfaceC3027k1Arr.length;
        C2993c[] c2993cArr = new C2993c[length];
        for (int i13 = 0; i13 < length; i13++) {
            InterfaceC3027k1 interfaceC3027k1 = interfaceC3027k1Arr[i13];
            ((C3060t1) interfaceC3027k1).start();
            C2993c c2993c = new C2993c(this, c3033m);
            c2993c.f12000F = AbstractC3006f0.m8728v(interfaceC3027k1, true, c2993c);
            c2993cArr[i13] = c2993c;
        }
        C2997d c2997d = new C2997d(c2993cArr);
        for (int i14 = 0; i14 < length; i14++) {
            C2993c c2993c2 = c2993cArr[i14];
            c2993c2.getClass();
            C2993c.f11998H.set(c2993c2, c2997d);
        }
        if (c3033m.m8778w()) {
            c2997d.m8689b();
        } else {
            c3033m.m8777v(c2997d);
        }
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }
}
