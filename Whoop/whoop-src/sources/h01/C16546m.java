package h01;

import k71.AbstractC22253j;
import l83.C23454a0;
import p105e1.C12528o;
import p294l3.C23277r0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h01.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16546m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63671w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f63672x;

    public /* synthetic */ C16546m(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f63671w = i13;
        this.f63672x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f63671w) {
            case 0:
                return AbstractC16549p.m46755I(this.f63672x, (C23277r0) obj);
            case 1:
                return AbstractC16549p.m46757K(this.f63672x, ((Boolean) obj).booleanValue());
            case 2:
                return AbstractC16559z.m46874p(this.f63672x, (C23277r0) obj);
            case 3:
                return AbstractC22253j.m63820F(this.f63672x, ((Boolean) obj).booleanValue());
            default:
                C12528o c12528o = (C12528o) obj;
                this.f63672x.setValue(c12528o.m35194d() ? c12528o.m35193c() : c12528o.m35192b());
                return C23454a0.f92919a;
        }
    }
}
