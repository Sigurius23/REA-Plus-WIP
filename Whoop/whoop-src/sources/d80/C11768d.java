package d80;

import c93.InterfaceC4339a;
import g80.C15566g;
import p715kotlin.jvm.functions.Function1;
import q80.AbstractC30037i;

/* JADX INFO: renamed from: d80.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11768d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38108w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15566g f38109x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f38110y;

    public /* synthetic */ C11768d(C15566g c15566g, Function1 function1, int i13) {
        this.f38108w = i13;
        this.f38109x = c15566g;
        this.f38110y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f38108w) {
            case 0:
                return AbstractC11769e.m31527s(this.f38109x, this.f38110y);
            default:
                return AbstractC30037i.m91964v(this.f38109x, this.f38110y);
        }
    }
}
