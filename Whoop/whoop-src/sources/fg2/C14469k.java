package fg2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p729qs0.Function0;
import p732rs0.AbstractC42792e;

/* JADX INFO: renamed from: fg2.k */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C14469k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f52813E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f52814F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52815w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f52816x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f52817y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f52818z;

    public /* synthetic */ C14469k(Modifier modifier, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f52815w = 0;
        this.f52818z = modifier;
        this.f52816x = interfaceC4339a;
        this.f52817y = interfaceC4339a2;
        this.f52813E = i13;
        this.f52814F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52815w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14471m.m41293m(this.f52818z, this.f52816x, this.f52817y, this.f52813E, this.f52814F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f52818z;
                return Function0.m93726k(this.f52816x, this.f52817y, modifier, this.f52813E, this.f52814F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f52818z;
                return AbstractC42792e.m98721e(this.f52816x, this.f52817y, modifier2, this.f52813E, this.f52814F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C14469k(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Modifier modifier, int i13, int i14, int i15) {
        this.f52815w = i15;
        this.f52816x = interfaceC4339a;
        this.f52817y = interfaceC4339a2;
        this.f52818z = modifier;
        this.f52813E = i13;
        this.f52814F = i14;
    }
}
