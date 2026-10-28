package zq2;

import androidx.compose.runtime.Composer;
import java.util.List;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: zq2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40989b implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176906w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f176907x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f176908y;

    public /* synthetic */ C40989b(Object obj, Function1 function1, int i13) {
        this.f176906w = i13;
        this.f176908y = obj;
        this.f176907x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f176906w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC40991d.m133105e((List) this.f176908y, this.f176907x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC40996i.m133146l((C40993f) this.f176908y, this.f176907x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
        }
    }
}
