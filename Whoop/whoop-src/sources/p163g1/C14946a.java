package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p292l1.AbstractC23060a;
import p390p1.AbstractC28683x;
import p602x1.C37816b;

/* JADX INFO: renamed from: g1.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14946a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55760w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f55761x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f55762y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37816b f55763z;

    public /* synthetic */ C14946a(float f13, float f14, C37816b c37816b, int i13, int i14) {
        this.f55760w = i14;
        this.f55761x = f13;
        this.f55762y = f14;
        this.f55763z = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f55760w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC15055k.m43142c(this.f55761x, this.f55762y, this.f55763z, composer, AbstractC28683x.m87244L(439));
                break;
            default:
                AbstractC23060a.m67040a(this.f55761x, this.f55762y, this.f55763z, composer, AbstractC28683x.m87244L(439));
                break;
        }
        return C23454a0.f92919a;
    }
}
