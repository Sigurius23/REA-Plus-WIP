package p706eo0;

import androidx.compose.runtime.Composer;
import bo0.C3505c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: eo0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C13375f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f46790E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f46791F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f46792G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f46793w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3505c f46794x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f46795y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f46796z;

    public /* synthetic */ C13375f(C3505c c3505c, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13, int i14, int i15) {
        this.f46793w = i15;
        this.f46794x = c3505c;
        this.f46795y = function1;
        this.f46796z = interfaceC4339a;
        this.f46790E = function2;
        this.f46791F = i13;
        this.f46792G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46793w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13376g.m37690L(this.f46794x, this.f46795y, this.f46796z, this.f46790E, this.f46791F, this.f46792G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13376g.m37703Y(this.f46794x, this.f46795y, this.f46796z, this.f46790E, this.f46791F, this.f46792G, (Composer) obj, iIntValue2);
        }
    }
}
