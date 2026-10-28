package p031b9;

import b30.C2570m;
import io.C20033m;
import java.util.concurrent.atomic.AtomicBoolean;
import p078d1.C11457j;
import p299l9.C23519p;
import p465rm.C31581z;
import p588wm.C37365g;
import p658yr.InterfaceC39722i;
import sn.C32746m0;

/* JADX INFO: renamed from: b9.n */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2853n implements InterfaceC39722i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11321w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f11322x;

    public /* synthetic */ C2853n(Object obj, int i13) {
        this.f11321w = i13;
        this.f11322x = obj;
    }

    @Override // p658yr.InterfaceC39722i
    public final Object get() {
        switch (this.f11321w) {
            case 0:
                return (C23519p) this.f11322x;
            case 1:
                return Boolean.valueOf(((C2848l0) this.f11322x).f11283d0);
            case 2:
                return Boolean.valueOf(((AtomicBoolean) this.f11322x).get());
            case 3:
                return (C20033m) this.f11322x;
            case 4:
                return Boolean.valueOf(((C31581z) this.f11322x).f130500Y);
            default:
                C2570m c2570m = (C2570m) this.f11322x;
                return new C32746m0((C11457j) c2570m.f9987x, (C37365g) c2570m.f9988y);
        }
    }
}
