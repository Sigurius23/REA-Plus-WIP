package c41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c41.s1 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4112s1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f16684E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f16685F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f16686G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16687w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f16688x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C4140w1 f16689y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f16690z;

    public /* synthetic */ C4112s1(Modifier modifier, C4140w1 c4140w1, boolean z4, Function1 function1, int i13, int i14, int i15) {
        this.f16687w = i15;
        this.f16688x = modifier;
        this.f16689y = c4140w1;
        this.f16690z = z4;
        this.f16684E = function1;
        this.f16685F = i13;
        this.f16686G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16687w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4133v1.m12759A(this.f16688x, this.f16689y, this.f16690z, this.f16684E, this.f16685F, this.f16686G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4133v1.m12762D(this.f16688x, this.f16689y, this.f16690z, this.f16684E, this.f16685F, this.f16686G, (Composer) obj, iIntValue2);
        }
    }
}
