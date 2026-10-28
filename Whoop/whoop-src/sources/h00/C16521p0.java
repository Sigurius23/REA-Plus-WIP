package h00;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p474s.AbstractC32004s;
import p477s2.AbstractC32069a;
import p550vd.AbstractC35903f;
import p602x1.C37816b;
import p667z0.AbstractC39927i;

/* JADX INFO: renamed from: h00.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16521p0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63516w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f63517x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37816b f63518y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f63519z;

    public /* synthetic */ C16521p0(Modifier modifier, C37816b c37816b, int i13, int i14) {
        this.f63516w = i14;
        this.f63517x = modifier;
        this.f63518y = c37816b;
        this.f63519z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f63516w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC35903f.m114008c(this.f63517x, this.f63518y, composer, AbstractC28683x.m87244L(this.f63519z | 1));
                break;
            case 1:
                AbstractC32004s.m99533b(this.f63517x, this.f63518y, composer, AbstractC28683x.m87244L(this.f63519z | 1));
                break;
            case 2:
                AbstractC32004s.m99534c(this.f63517x, this.f63518y, composer, AbstractC28683x.m87244L(this.f63519z | 1));
                break;
            case 3:
                AbstractC39927i.m128088d(this.f63517x, this.f63518y, composer, AbstractC28683x.m87244L(this.f63519z | 1));
                break;
            case 4:
                AbstractC32069a.m99666d(this.f63517x, this.f63518y, composer, AbstractC28683x.m87244L(this.f63519z | 1));
                break;
            default:
                AbstractC32069a.m99665c(this.f63517x, this.f63518y, composer, AbstractC28683x.m87244L(this.f63519z | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
