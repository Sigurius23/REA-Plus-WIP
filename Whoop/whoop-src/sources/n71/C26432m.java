package n71;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: n71.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C26432m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f104983E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f104984w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f104985x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26436q f104986y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f104987z;

    public /* synthetic */ C26432m(Modifier modifier, C26436q c26436q, int i13, int i14, int i15) {
        this.f104984w = i15;
        this.f104985x = modifier;
        this.f104986y = c26436q;
        this.f104987z = i13;
        this.f104983E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f104984w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC26434o.m78211J(this.f104985x, this.f104986y, this.f104987z, this.f104983E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26434o.m78213L(this.f104985x, this.f104986y, this.f104987z, this.f104983E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC26434o.m78208G(this.f104985x, this.f104986y, this.f104987z, this.f104983E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC26434o.m78222U(this.f104985x, this.f104986y, this.f104987z, this.f104983E, (Composer) obj, iIntValue4);
        }
    }
}
