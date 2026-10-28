package g32;

import b30.C2591o4;
import c93.InterfaceC4339a;
import gv1.AbstractC16233g;
import l72.AbstractC23408o;
import l83.C23454a0;
import nw0.AbstractC27203j;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import pp1.AbstractC29436i;
import uw0.AbstractC35307q;

/* JADX INFO: renamed from: g32.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C15310j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57497w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f57498x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f57499y;

    public /* synthetic */ C15310j(InterfaceC4339a interfaceC4339a, Function1 function1, int i13) {
        this.f57497w = i13;
        this.f57499y = interfaceC4339a;
        this.f57498x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f57497w) {
            case 0:
                return AbstractC15311k.m43469O(this.f57498x, this.f57499y);
            case 1:
                return AbstractC16233g.m45945B(this.f57498x, this.f57499y);
            case 2:
                this.f57498x.invoke(this.f57499y.invoke());
                return C23454a0.f92919a;
            case 3:
                return AbstractC23408o.m67876v0(this.f57499y, this.f57498x);
            case 4:
                return AbstractC23408o.m67878w0(this.f57499y, this.f57498x);
            case 5:
                return AbstractC27203j.m81834A(this.f57499y, this.f57498x);
            case 6:
                return AbstractC27203j.m81855V(this.f57499y, this.f57498x);
            case 7:
                return AbstractC29436i.m89766e0(this.f57499y, this.f57498x);
            case 8:
                this.f57498x.invoke(new C37816b(new C2591o4(this.f57499y, 15), true, -1604931859));
                return C23454a0.f92919a;
            default:
                return AbstractC35307q.m112096i(this.f57499y, this.f57498x);
        }
    }

    public /* synthetic */ C15310j(Function1 function1, InterfaceC4339a interfaceC4339a, int i13) {
        this.f57497w = i13;
        this.f57498x = function1;
        this.f57499y = interfaceC4339a;
    }
}
