package p00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import w71.AbstractC36874b0;

/* JADX INFO: renamed from: p00.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C28569f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115587w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f115588x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f115589y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f115590z;

    public /* synthetic */ C28569f(InterfaceC4339a interfaceC4339a, String str, boolean z4) {
        this.f115588x = str;
        this.f115589y = z4;
        this.f115590z = interfaceC4339a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f115587w) {
            case 0:
                num.getClass();
                AbstractC28571h.m86898a(this.f115588x, this.f115589y, this.f115590z, composer, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            default:
                return AbstractC36874b0.m118266e(this.f115588x, this.f115589y, this.f115590z, composer, num.intValue());
        }
    }

    public /* synthetic */ C28569f(String str, boolean z4, InterfaceC4339a interfaceC4339a, int i13) {
        this.f115588x = str;
        this.f115589y = z4;
        this.f115590z = interfaceC4339a;
    }
}
