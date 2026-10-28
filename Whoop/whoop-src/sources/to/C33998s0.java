package to;

import com.google.android.gms.common.api.InterfaceC4982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p073cq.C11040i;
import p478s3.AbstractC32098d;
import p499t9.C33647p;
import p529uo.AbstractC35135w;
import p715kotlin.jvm.internal.AbstractC22674j;
import pg3.C29203o;

/* JADX INFO: renamed from: to.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33998s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142484a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC22674j f142485b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f142486c;

    public C33998s0(AbstractC22674j abstractC22674j, C11040i c11040i, C33647p c33647p) {
        this.f142485b = abstractC22674j;
        this.f142486c = c11040i;
    }

    /* JADX INFO: renamed from: a */
    public final void m107472a(Status status) {
        InterfaceC4982m interfaceC4982m;
        switch (this.f142484a) {
            case 0:
                ((Map) ((C29203o) this.f142486c).f118198w).remove((BasePendingResult) this.f142485b);
                return;
            default:
                if (!status.m15593b()) {
                    ((C11040i) this.f142486c).m29686a(AbstractC32098d.m99841g(status));
                    return;
                }
                AbstractC22674j abstractC22674j = this.f142485b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                BasePendingResult basePendingResult = (BasePendingResult) abstractC22674j;
                AbstractC35135w.m111096h("Result has already been consumed.", !basePendingResult.f20511g);
                try {
                    if (!basePendingResult.f20506b.await(0L, timeUnit)) {
                        basePendingResult.m15603Y(Status.f20491H);
                    }
                    break;
                } catch (InterruptedException unused) {
                    basePendingResult.m15603Y(Status.f20489F);
                }
                AbstractC35135w.m111096h("Result is not ready.", basePendingResult.m15604Z());
                synchronized (basePendingResult.f20505a) {
                    AbstractC35135w.m111096h("Result has already been consumed.", !basePendingResult.f20511g);
                    AbstractC35135w.m111096h("Result is not ready.", basePendingResult.m15604Z());
                    interfaceC4982m = basePendingResult.f20509e;
                    basePendingResult.f20509e = null;
                    basePendingResult.f20511g = true;
                    break;
                }
                if (basePendingResult.f20508d.getAndSet(null) != null) {
                    throw new ClassCastException();
                }
                AbstractC35135w.m111094f(interfaceC4982m);
                ((C11040i) this.f142486c).m29687b(null);
                return;
        }
    }

    public C33998s0(C29203o c29203o, BasePendingResult basePendingResult) {
        this.f142485b = basePendingResult;
        Objects.requireNonNull(c29203o);
        this.f142486c = c29203o;
    }
}
