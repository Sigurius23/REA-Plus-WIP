package z53;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import ud3.AbstractC34799a1;
import zd3.C40571o;

/* JADX INFO: renamed from: z53.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C40114f extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173150w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f173151x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40114f(Object obj, int i13) {
        super(1);
        this.f173150w = i13;
        this.f173151x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f173150w) {
            case 0:
                AbstractC34799a1 abstractC34799a1 = (AbstractC34799a1) this.f173151x;
                if (abstractC34799a1 != null) {
                    abstractC34799a1.close();
                }
                break;
            default:
                ((C40571o) this.f173151x).cancel();
                break;
        }
        return C23454a0.f92919a;
    }
}
