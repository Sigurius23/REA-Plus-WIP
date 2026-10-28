package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import l83.C23454a0;
import p097ds.AbstractC12314q;
import p390p1.AbstractC28683x;
import p460rg.AbstractC31366a;

/* JADX INFO: renamed from: g40.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15373j1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f57787E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f57788F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57789w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f57790x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f57791y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f57792z;

    public /* synthetic */ C15373j1(String str, Modifier modifier, boolean z4, int i13, int i14, int i15) {
        this.f57789w = i15;
        this.f57790x = str;
        this.f57791y = modifier;
        this.f57792z = z4;
        this.f57787E = i13;
        this.f57788F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57789w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC5583n.m16769b(this.f57790x, this.f57791y, this.f57792z, (Composer) obj, AbstractC28683x.m87244L(this.f57787E | 1), this.f57788F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC12314q.m34328h(this.f57790x, this.f57791y, this.f57792z, (Composer) obj, AbstractC28683x.m87244L(this.f57787E | 1), this.f57788F);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC31366a.m96466f(this.f57790x, this.f57791y, this.f57792z, (Composer) obj, AbstractC28683x.m87244L(this.f57787E | 1), this.f57788F);
                break;
        }
        return C23454a0.f92919a;
    }
}
