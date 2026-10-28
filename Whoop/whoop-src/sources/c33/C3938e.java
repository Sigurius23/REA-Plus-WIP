package c33;

import a33.C0352d;
import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import hc3.C17171d;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23470p;
import t23.C33366b4;
import t23.C33403i3;
import t23.InterfaceC33408j3;

/* JADX INFO: renamed from: c33.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3938e {

    /* JADX INFO: renamed from: a */
    public final C3936c f16075a;

    /* JADX INFO: renamed from: b */
    public C17171d f16076b;

    public C3938e(C3936c c3936c) {
        this.f16075a = c3936c;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC2994c0 m11991a() {
        C0352d c0352d;
        InterfaceC3027k1 interfaceC3027k1;
        try {
            InterfaceC33408j3.f139483t.getClass();
            InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
            C33366b4 c33366b4 = interfaceC33408j3 instanceof C33366b4 ? (C33366b4) interfaceC33408j3 : null;
            if (c33366b4 == null || (c0352d = c33366b4.f139256c0) == null) {
                return null;
            }
            C17171d c17171d = this.f16076b;
            if (c17171d != null && (interfaceC3027k1 = (InterfaceC3027k1) c17171d.f65971w.get(C3023j1.f12041w)) != null && interfaceC3027k1.isActive()) {
                return c17171d;
            }
            C17171d c17171dM8708b = ((AtomicBoolean) c0352d.f1237x).get() ? null : AbstractC3006f0.m8708b(((InterfaceC2994c0) ((C23470p) c0352d.f1238y).getValue()).getCoroutineContext().plus(new C3031l1((InterfaceC3027k1) ((InterfaceC2994c0) ((C23470p) c0352d.f1238y).getValue()).getCoroutineContext().get(C3023j1.f12041w))));
            if (c17171dM8708b == null) {
                return null;
            }
            this.f16076b = c17171dM8708b;
            return c17171dM8708b;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
