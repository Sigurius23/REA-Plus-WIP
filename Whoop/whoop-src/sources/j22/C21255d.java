package j22;

import androidx.compose.runtime.Composer;
import k22.C22164d;
import p114eb.C12982q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: j22.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21255d implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81134w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22164d f81135x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f81136y;

    public /* synthetic */ C21255d(C22164d c22164d, Function1 function1) {
        this.f81135x = c22164d;
        this.f81136y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f81134w;
        C12982q c12982q = (C12982q) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i13) {
            case 0:
                return AbstractC21256e.m59620W(this.f81136y, this.f81135x, c12982q, composer, iIntValue);
            default:
                return AbstractC21256e.m59622Y(this.f81135x, this.f81136y, c12982q, composer, iIntValue);
        }
    }

    public /* synthetic */ C21255d(Function1 function1, C22164d c22164d) {
        this.f81136y = function1;
        this.f81135x = c22164d;
    }
}
