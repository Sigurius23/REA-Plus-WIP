package f53;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import x43.AbstractC37979k;
import x43.C37981m;

/* JADX INFO: renamed from: f53.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14116d extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50729w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37981m f50730x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14116d(C37981m c37981m, int i13) {
        super(1);
        this.f50729w = i13;
        this.f50730x = c37981m;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f50729w) {
            case 0:
                AbstractC37979k it = (AbstractC37979k) obj;
                AbstractC22676k.m65750j(it, "it");
                it.mo40222g(this.f50730x);
                break;
            default:
                AbstractC37979k it3 = (AbstractC37979k) obj;
                AbstractC22676k.m65750j(it3, "it");
                it3.mo40222g(this.f50730x);
                break;
        }
        return C23454a0.f92919a;
    }
}
