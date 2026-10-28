package g20;

import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import d30.C11552o;
import kz.AbstractC22917n;
import l83.InterfaceC23459e;
import p003a1.C0106e;
import p236j.InterfaceC21063b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q00.C29718h0;
import v10.C35526b;

/* JADX INFO: renamed from: g20.q */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15271q implements InterfaceC21063b, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57342w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f57343x;

    public /* synthetic */ C15271q(Object obj, int i13) {
        this.f57342w = i13;
        this.f57343x = obj;
    }

    @Override // p236j.InterfaceC21063b
    /* JADX INFO: renamed from: a */
    public final void mo364a(Object obj) {
        switch (this.f57342w) {
            case 0:
                C35526b p13 = (C35526b) obj;
                AbstractC22676k.m65750j(p13, "p0");
                C15272r c15272r = (C15272r) this.f57343x;
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c15272r), null, null, new C11552o(c15272r, p13, null, 20), 3);
                break;
            case 1:
                AbstractC22917n p14 = (AbstractC22917n) obj;
                AbstractC22676k.m65750j(p14, "p0");
                ((C0106e) this.f57343x).invoke(p14);
                break;
            default:
                ((C29718h0) this.f57343x).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f57342w) {
            case 0:
                if ((obj instanceof InterfaceC21063b) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof InterfaceC21063b) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC21063b) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        switch (this.f57342w) {
            case 0:
                return new C22672i(1, 0, C15272r.class, (C15272r) this.f57343x, "onPaymentFlowResult", "onPaymentFlowResult$payments_core_release(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V");
            case 1:
                return new C22672i(1, 0, Function1.class, (C0106e) this.f57343x, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;");
            default:
                return (C29718h0) this.f57343x;
        }
    }

    public final int hashCode() {
        switch (this.f57342w) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
