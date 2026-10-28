package b30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: b30.j6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2553j6 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9920w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2659y0 f9921x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f9922y;

    public /* synthetic */ C2553j6(C2659y0 c2659y0, int i13, int i14) {
        this.f9920w = i14;
        this.f9921x = c2659y0;
        this.f9922y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f9920w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC34870c0.m110000i(this.f9921x, composer, AbstractC28683x.m87244L(this.f9922y | 1));
                break;
            case 1:
                AbstractC34870c0.m110022x(this.f9921x, composer, AbstractC28683x.m87244L(this.f9922y | 1));
                break;
            default:
                AbstractC34870c0.m110020v(this.f9921x, composer, AbstractC28683x.m87244L(this.f9922y | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
