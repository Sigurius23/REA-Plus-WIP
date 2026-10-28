package tu2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import su2.C33024d;

/* JADX INFO: renamed from: tu2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C34196a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143428w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33024d f143429x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f143430y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f143431z;

    public /* synthetic */ C34196a(C33024d c33024d, Function1 function1, int i13, int i14) {
        this.f143428w = i14;
        this.f143429x = c33024d;
        this.f143430y = function1;
        this.f143431z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f143428w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC34197b.m108094t(this.f143429x, this.f143430y, this.f143431z, composer, iIntValue);
            default:
                return AbstractC34197b.m108100z(this.f143429x, this.f143430y, this.f143431z, composer, iIntValue);
        }
    }
}
