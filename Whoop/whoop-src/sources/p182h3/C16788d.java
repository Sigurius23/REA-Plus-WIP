package p182h3;

import android.os.CancellationSignal;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C16788d extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64537w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CancellationSignal f64538x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16788d(CancellationSignal cancellationSignal, int i13) {
        super(1);
        this.f64537w = i13;
        this.f64538x = cancellationSignal;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f64537w) {
            case 0:
                if (((Throwable) obj) != null) {
                    this.f64538x.cancel();
                }
                break;
            case 1:
                this.f64538x.cancel();
                break;
            default:
                this.f64538x.cancel();
                break;
        }
        return C23454a0.f92919a;
    }
}
