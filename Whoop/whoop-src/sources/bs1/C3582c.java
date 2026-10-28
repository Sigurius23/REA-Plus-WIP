package bs1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import h91.C17027b;
import p715kotlin.jvm.functions.Function1;
import qj2.AbstractC30437b;

/* JADX INFO: renamed from: bs1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3582c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f14501E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f14502F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14503w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17027b f14504x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f14505y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f14506z;

    public /* synthetic */ C3582c(C17027b c17027b, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14) {
        this.f14503w = i14;
        this.f14504x = c17027b;
        this.f14505y = z4;
        this.f14506z = interfaceC4339a;
        this.f14501E = function1;
        this.f14502F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14503w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3587f.m10944o(this.f14504x, this.f14505y, this.f14506z, this.f14501E, this.f14502F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC30437b.m93110o(this.f14504x, this.f14505y, this.f14506z, this.f14501E, this.f14502F, (Composer) obj, iIntValue2);
        }
    }
}
