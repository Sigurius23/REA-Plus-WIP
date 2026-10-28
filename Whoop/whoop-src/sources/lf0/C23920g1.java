package lf0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lf0.g1 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C23920g1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f94552E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f94553F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94554w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23928i1 f94555x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f94556y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f94557z;

    public /* synthetic */ C23920g1(Modifier modifier, C23928i1 c23928i1, Function1 function1, int i13, int i14) {
        this.f94557z = modifier;
        this.f94555x = c23928i1;
        this.f94556y = function1;
        this.f94552E = i13;
        this.f94553F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f94554w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC23924h1.m70376j(this.f94557z, this.f94555x, this.f94556y, this.f94552E, this.f94553F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f94557z;
                return AbstractC23924h1.m70384r(this.f94555x, this.f94556y, modifier, this.f94552E, this.f94553F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C23920g1(C23928i1 c23928i1, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f94555x = c23928i1;
        this.f94556y = function1;
        this.f94557z = modifier;
        this.f94552E = i13;
        this.f94553F = i14;
    }
}
