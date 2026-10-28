package bc3;

import hc3.C17188u;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: bc3.d2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3000d2 extends C17188u {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f12009E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3000d2(InterfaceC30063j interfaceC30063j, InterfaceC30057d interfaceC30057d, int i13) {
        super(interfaceC30063j, interfaceC30057d);
        this.f12009E = i13;
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: v */
    public final boolean mo8692v(Throwable th3) {
        switch (this.f12009E) {
            case 0:
                return false;
            default:
                if (th3 instanceof ChildCancelledException) {
                    return true;
                }
                return m8818o(th3);
        }
    }
}
