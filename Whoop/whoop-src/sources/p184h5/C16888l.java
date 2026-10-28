package p184h5;

import androidx.lifecycle.C1626t;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import java.util.concurrent.CopyOnWriteArrayList;
import kd1.AbstractC22392e;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: h5.l */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16888l implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64835w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f64836x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f64837y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f64838z;

    public /* synthetic */ C16888l(Object obj, Object obj2, Object obj3, int i13) {
        this.f64835w = i13;
        this.f64836x = obj;
        this.f64837y = obj2;
        this.f64838z = obj3;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
        switch (this.f64835w) {
            case 0:
                C16894n c16894n = (C16894n) this.f64836x;
                EnumC1635w enumC1635w = (EnumC1635w) this.f64837y;
                InterfaceC16897o interfaceC16897o = (InterfaceC16897o) this.f64838z;
                c16894n.getClass();
                Runnable runnable = c16894n.f64845a;
                CopyOnWriteArrayList copyOnWriteArrayList = c16894n.f64846b;
                EnumC1632v.Companion.getClass();
                if (enumC1632v == C1626t.m5034b(enumC1635w)) {
                    copyOnWriteArrayList.add(interfaceC16897o);
                    runnable.run();
                } else if (enumC1632v == EnumC1632v.ON_DESTROY) {
                    c16894n.m47564b(interfaceC16897o);
                } else if (enumC1632v == C1626t.m5033a(enumC1635w)) {
                    copyOnWriteArrayList.remove(interfaceC16897o);
                    runnable.run();
                }
                break;
            default:
                AbstractC22392e.m64446g((EnumC1632v) this.f64836x, (InterfaceC2994c0) this.f64837y, (InterfaceC28670t2) this.f64838z, interfaceC1585g0, enumC1632v);
                break;
        }
    }
}
