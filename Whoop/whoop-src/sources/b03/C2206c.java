package b03;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import id2.AbstractC18422g;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40458s0;
import xq2.AbstractC38576l0;

/* JADX INFO: renamed from: b03.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2206c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f8782E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8783w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f8784x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f8785y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f8786z;

    public /* synthetic */ C2206c(Modifier modifier, Function1 function1, int i13, int i14, int i15) {
        this.f8783w = i15;
        this.f8784x = modifier;
        this.f8785y = function1;
        this.f8786z = i13;
        this.f8782E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8783w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2207d.m7042j(this.f8784x, this.f8785y, this.f8786z, this.f8782E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18422g.m53019n(this.f8784x, this.f8785y, this.f8786z, this.f8782E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC38576l0.m123675G(this.f8784x, this.f8785y, this.f8786z, this.f8782E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC40458s0.m130814q(this.f8784x, this.f8785y, this.f8786z, this.f8782E, (Composer) obj, iIntValue4);
        }
    }
}
