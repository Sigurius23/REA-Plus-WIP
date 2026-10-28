package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import v51.AbstractC35703b;
import v51.C35704c;

/* JADX INFO: renamed from: b30.h5 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2536h5 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f9846E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f9847F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9848w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f9849x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f9850y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f9851z;

    public /* synthetic */ C2536h5(float f13, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13) {
        this.f9850y = f13;
        this.f9849x = z4;
        this.f9851z = interfaceC4339a;
        this.f9847F = modifier;
        this.f9846E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9848w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2592o5.m7503a(this.f9850y, this.f9849x, this.f9851z, (Modifier) this.f9847F, (Composer) obj, AbstractC28683x.m87244L(this.f9846E | 1));
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC35703b.m113164s((C35704c) this.f9847F, this.f9849x, this.f9850y, this.f9851z, this.f9846E, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C2536h5(C35704c c35704c, boolean z4, float f13, InterfaceC4339a interfaceC4339a, int i13) {
        this.f9847F = c35704c;
        this.f9849x = z4;
        this.f9850y = f13;
        this.f9851z = interfaceC4339a;
        this.f9846E = i13;
    }
}
