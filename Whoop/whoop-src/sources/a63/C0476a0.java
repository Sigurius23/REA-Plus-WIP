package a63;

import bc3.InterfaceC3056s0;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a63.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0476a0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1616w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC3056s0 f1617x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0476a0(InterfaceC3056s0 interfaceC3056s0, int i13) {
        super(1);
        this.f1616w = i13;
        this.f1617x = interfaceC3056s0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1616w) {
            case 0:
                this.f1617x.dispose();
                break;
            default:
                this.f1617x.dispose();
                break;
        }
        return C23454a0.f92919a;
    }
}
