package pg3;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: pg3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C29221x extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118279w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC29182e f118280x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29221x(InterfaceC29182e interfaceC29182e, int i13) {
        super(1);
        this.f118279w = i13;
        this.f118280x = interfaceC29182e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f118279w) {
            case 0:
                this.f118280x.cancel();
                break;
            case 1:
                this.f118280x.cancel();
                break;
            default:
                this.f118280x.cancel();
                break;
        }
        return C23454a0.f92919a;
    }
}
