package fz0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import n71.AbstractC26427h;

/* JADX INFO: renamed from: fz0.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14887b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f55546E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55547w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f55548x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14889d f55549y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f55550z;

    public /* synthetic */ C14887b(Modifier modifier, C14889d c14889d, int i13, int i14, int i15) {
        this.f55547w = i15;
        this.f55548x = modifier;
        this.f55549y = c14889d;
        this.f55550z = i13;
        this.f55546E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55547w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14888c.m42963i(this.f55548x, this.f55549y, this.f55550z, this.f55546E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26427h.m78198k(this.f55548x, this.f55549y, this.f55550z, this.f55546E, (Composer) obj, iIntValue2);
        }
    }
}
