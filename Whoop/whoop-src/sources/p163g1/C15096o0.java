package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p558vp.AbstractC36259c;
import p602x1.C37816b;

/* JADX INFO: renamed from: g1.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15096o0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56541w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37816b f56542x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37816b f56543y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f56544z;

    public /* synthetic */ C15096o0(C37816b c37816b, Modifier modifier, C37816b c37816b2, int i13) {
        this.f56542x = c37816b;
        this.f56544z = modifier;
        this.f56543y = c37816b2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f56541w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC15106p0.m43169a(AbstractC28683x.m87244L(391), composer, this.f56544z, this.f56542x, this.f56543y);
                break;
            default:
                AbstractC36259c.m115687e(AbstractC28683x.m87244L(55), composer, this.f56544z, this.f56542x, this.f56543y);
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C15096o0(C37816b c37816b, C37816b c37816b2, Modifier modifier, int i13) {
        this.f56542x = c37816b;
        this.f56543y = c37816b2;
        this.f56544z = modifier;
    }
}
