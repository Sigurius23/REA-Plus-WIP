package w60;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import u60.C34551c;

/* JADX INFO: renamed from: w60.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C36856d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f157631E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f157632F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157633w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34551c f157634x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f157635y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f157636z;

    public /* synthetic */ C36856d(C34551c c34551c, Function1 function1, Function1 function2, int i13, int i14, int i15) {
        this.f157633w = i15;
        this.f157634x = c34551c;
        this.f157635y = function1;
        this.f157636z = function2;
        this.f157631E = i13;
        this.f157632F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157633w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC36857e.m118178n(this.f157634x, this.f157635y, this.f157636z, this.f157631E, this.f157632F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36857e.m118182r(this.f157634x, this.f157635y, this.f157636z, this.f157631E, this.f157632F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC36858f.m118202p(this.f157634x, this.f157635y, this.f157636z, this.f157631E, this.f157632F, (Composer) obj, iIntValue3);
        }
    }
}
