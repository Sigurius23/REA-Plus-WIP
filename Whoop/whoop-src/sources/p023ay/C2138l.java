package p023ay;

import android.content.Intent;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import e93.AbstractC12889b;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23459e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import x20.C37848p;
import x20.C37855w;
import x20.EnumC37847o;

/* JADX INFO: renamed from: ay.l */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2138l implements InterfaceC13062m, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8528w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f8529x;

    public /* synthetic */ C2138l(Object obj, int i13) {
        this.f8528w = i13;
        this.f8529x = obj;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        Object value;
        C37848p c37848p;
        int i13 = this.f8528w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f8529x;
        switch (i13) {
            case 0:
                IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = (IntentConfirmationChallengeActivity) obj2;
                int i14 = IntentConfirmationChallengeActivity.f22141y;
                intentConfirmationChallengeActivity.setResult(4639, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract.extra_result", (InterfaceC2145s) obj))));
                intentConfirmationChallengeActivity.finish();
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                break;
            default:
                EnumC37847o enumC37847o = (EnumC37847o) obj;
                C13045h2 c13045h2 = ((C37855w) obj2).f162053y;
                do {
                    value = c13045h2.getValue();
                    c37848p = (C37848p) value;
                } while (!c13045h2.m36569i(value, C37848p.m121377a(c37848p, 0L, enumC37847o, c37848p.f162026d && enumC37847o == EnumC37847o.f162019w, 3)));
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                break;
        }
        return c23454a0;
    }

    public final boolean equals(Object obj) {
        switch (this.f8528w) {
            case 0:
                if ((obj instanceof InterfaceC13062m) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC13062m) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        switch (this.f8528w) {
            case 0:
                return new C22656a(2, 4, IntentConfirmationChallengeActivity.class, (IntentConfirmationChallengeActivity) this.f8529x, "dismissWithResult", "dismissWithResult(Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityResult;)V");
            default:
                return new C22656a(2, 4, C37855w.class, (C37855w) this.f8529x, "updatePollingState", "updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V");
        }
    }

    public final int hashCode() {
        switch (this.f8528w) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
