package p005a3;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p026b2.InterfaceC2315u;
import p669z2.InterfaceC40000c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0185c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f586w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0189d f587x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0185c(C0189d c0189d, int i13) {
        super(0);
        this.f586w = i13;
        this.f587x = c0189d;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f586w) {
            case 0:
                this.f587x.m463Z0();
                break;
            default:
                C0189d c0189d = this.f587x;
                InterfaceC2315u interfaceC2315u = c0189d.f616O;
                AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((InterfaceC40000c) interfaceC2315u).mo66704h(c0189d);
                break;
        }
        return C23454a0.f92919a;
    }
}
