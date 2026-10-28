package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: g1.j8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15054j8 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f56356E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f56357F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56358w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f56359x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23285v0 f56360y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f56361z;

    public /* synthetic */ C15054j8(long j7, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m, int i13, int i14, int i15) {
        this.f56358w = i15;
        this.f56359x = j7;
        this.f56360y = c23285v0;
        this.f56361z = interfaceC4351m;
        this.f56356E = i13;
        this.f56357F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56358w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC15114p8.m43175b(this.f56359x, this.f56360y, this.f56361z, (Composer) obj, AbstractC28683x.m87244L(this.f56356E | 1), this.f56357F);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC36259c.m115696k(this.f56359x, this.f56360y, this.f56361z, (Composer) obj, AbstractC28683x.m87244L(this.f56356E | 1), this.f56357F);
                break;
        }
        return C23454a0.f92919a;
    }
}
