package uu2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gu2.C16214a;

/* JADX INFO: renamed from: uu2.d0 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C35246d0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Modifier f149942E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f149943F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f149944w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16214a f149945x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16214a f149946y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f149947z;

    public /* synthetic */ C35246d0(C16214a c16214a, C16214a c16214a2, Modifier modifier, Modifier modifier2, int i13, int i14) {
        this.f149944w = i14;
        this.f149945x = c16214a;
        this.f149946y = c16214a2;
        this.f149947z = modifier;
        this.f149942E = modifier2;
        this.f149943F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f149944w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC35248e0.m111692o(this.f149945x, this.f149946y, this.f149947z, this.f149942E, this.f149943F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35248e0.m111684g(this.f149945x, this.f149946y, this.f149947z, this.f149942E, this.f149943F, (Composer) obj, iIntValue2);
        }
    }
}
