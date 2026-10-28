package or2;

import android.companion.CompanionDeviceManager;
import android.content.IntentSender;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p503tp.C34040k;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: or2.q */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28192q implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f113929w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f113930x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f113931y;

    public /* synthetic */ C28192q(int i13, Object obj, Object obj2) {
        this.f113929w = i13;
        this.f113930x = obj;
        this.f113931y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f113929w) {
            case 0:
                return AbstractC28189p.b.a.m85320h((CompanionDeviceManager.Callback) this.f113930x, (IntentSender) this.f113931y, ((Boolean) obj).booleanValue());
            case 1:
                return C28196r0.m85328d((C28196r0) this.f113930x, (InterfaceC4339a) this.f113931y, (C23454a0) obj);
            case 2:
                return C28199s0.m85345d((C28199s0) this.f113930x, (Function1) this.f113931y, obj);
            default:
                return C28217y0.m85440h((C28217y0) this.f113930x, (InterfaceC4339a) this.f113931y, (C34040k) obj);
        }
    }
}
