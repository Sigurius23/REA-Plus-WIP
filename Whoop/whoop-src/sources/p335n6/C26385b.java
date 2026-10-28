package p335n6;

import hb3.AbstractC17104a0;
import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n6.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C26385b extends AbstractC17104a0 {
    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: e */
    public final void mo700e(int i13, int i14, int i15) {
        AbstractC17104a0.m48351c(m78096n(), i13, i14, i15);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: f */
    public final void mo701f(int i13, int i14) {
        ArrayList arrayListM78096n = m78096n();
        if (i14 == 1) {
            arrayListM78096n.remove(i13);
        } else {
            arrayListM78096n.subList(i13, i14 + i13).clear();
        }
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: g */
    public final void mo702g(int i13, Object obj) {
        InterfaceC26392i interfaceC26392i = (InterfaceC26392i) obj;
        Object obj2 = this.f65707z;
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        int i14 = ((AbstractC26394k) obj2).f104848a;
        if (i14 > 0) {
            if (interfaceC26392i instanceof AbstractC26394k) {
                ((AbstractC26394k) interfaceC26392i).f104848a = i14 - 1;
            }
            m78096n().add(i13, interfaceC26392i);
            return;
        }
        StringBuilder sb4 = new StringBuilder("Too many embedded views for the current surface. The maximum depth is: ");
        Object obj3 = this.f65705x;
        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        sb4.append(((AbstractC26394k) obj3).f104848a);
        throw new IllegalArgumentException(sb4.toString().toString());
    }

    @Override // hb3.AbstractC17104a0
    /* JADX INFO: renamed from: j */
    public final void mo752j() {
        Object obj = this.f65705x;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        ((AbstractC26394k) obj).f104849b.clear();
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ void mo705k(int i13, Object obj) {
    }

    /* JADX INFO: renamed from: n */
    public final ArrayList m78096n() {
        InterfaceC26392i interfaceC26392i = (InterfaceC26392i) this.f65707z;
        if (interfaceC26392i instanceof AbstractC26394k) {
            return ((AbstractC26394k) interfaceC26392i).f104849b;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }
}
