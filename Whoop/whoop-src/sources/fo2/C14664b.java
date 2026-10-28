package fo2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import is0.AbstractC20903q0;
import lw1.AbstractC24772h;
import vy0.AbstractC36588p;

/* JADX INFO: renamed from: fo2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C14664b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f54148E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54149w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f54150x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f54151y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f54152z;

    public /* synthetic */ C14664b(Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, int i15) {
        this.f54149w = i15;
        this.f54150x = modifier;
        this.f54151y = interfaceC4351m;
        this.f54152z = i13;
        this.f54148E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54149w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14665c.m41904r(this.f54150x, this.f54151y, this.f54152z, this.f54148E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC20903q0.m57886k(this.f54150x, this.f54151y, this.f54152z, this.f54148E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC24772h.m72578i(this.f54150x, this.f54151y, this.f54152z, this.f54148E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC36588p.m117472o0(this.f54150x, this.f54151y, this.f54152z, this.f54148E, (Composer) obj, iIntValue4);
        }
    }
}
