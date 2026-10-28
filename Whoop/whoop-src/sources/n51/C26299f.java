package n51;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import pt2.AbstractC29543y;
import vv2.AbstractC36539e;
import zi1.AbstractC40677g;

/* JADX INFO: renamed from: n51.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C26299f implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f104522w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC25312u f104523x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f104524y;

    public /* synthetic */ C26299f(InterfaceC25312u interfaceC25312u, Function1 function1, int i13) {
        this.f104522w = i13;
        this.f104523x = interfaceC25312u;
        this.f104524y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f104522w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC26300g.m78041g(this.f104523x, this.f104524y, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC29543y.m90462D(this.f104523x, this.f104524y, (InterfaceC1103a) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC36539e.m117102L(this.f104523x, this.f104524y, (InterfaceC1103a) obj, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC36539e.m117098H(this.f104523x, this.f104524y, (InterfaceC1103a) obj, (Composer) obj2, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj3).intValue();
                return AbstractC40677g.m132054h(this.f104523x, this.f104524y, (InterfaceC1103a) obj, (Composer) obj2, iIntValue5);
        }
    }
}
