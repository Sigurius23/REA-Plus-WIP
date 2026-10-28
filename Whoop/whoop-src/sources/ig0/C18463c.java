package ig0;

import c93.InterfaceC4339a;
import gg0.C15824c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ig0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18463c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71891w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15824c.b f71892x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f71893y;

    public /* synthetic */ C18463c(C15824c.b bVar, Function1 function1, int i13) {
        this.f71891w = i13;
        this.f71892x = bVar;
        this.f71893y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f71891w) {
            case 0:
                return AbstractC18465e.m53218k(this.f71892x, this.f71893y);
            case 1:
                return AbstractC18465e.m53219l(this.f71892x, this.f71893y);
            case 2:
                return AbstractC18465e.m53220m(this.f71892x, this.f71893y);
            default:
                return AbstractC18465e.m53215h(this.f71892x, this.f71893y);
        }
    }
}
