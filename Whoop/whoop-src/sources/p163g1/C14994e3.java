package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p292l1.AbstractC23164r1;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: g1.e3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14994e3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f56069E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f56070F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f56071G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56072w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f56073x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f56074y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f56075z;

    public /* synthetic */ C14994e3(Object obj, String str, Modifier modifier, long j7, int i13, int i14, int i15) {
        this.f56072w = i15;
        this.f56071G = obj;
        this.f56073x = str;
        this.f56074y = modifier;
        this.f56075z = j7;
        this.f56069E = i13;
        this.f56070F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56072w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC15005f3.m43107a((AbstractC26165a) this.f56071G, this.f56073x, this.f56074y, this.f56075z, (Composer) obj, AbstractC28683x.m87244L(this.f56069E | 1), this.f56070F);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC23164r1.m67133b((C27430e) this.f56071G, this.f56073x, this.f56074y, this.f56075z, (Composer) obj, AbstractC28683x.m87244L(this.f56069E | 1), this.f56070F);
                break;
        }
        return C23454a0.f92919a;
    }
}
