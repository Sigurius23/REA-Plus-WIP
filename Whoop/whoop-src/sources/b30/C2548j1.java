package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p048ce.AbstractC4482w;
import p390p1.AbstractC28683x;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: b30.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2548j1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9899w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f9900x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f9901y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f9902z;

    public /* synthetic */ C2548j1(String str, int i13, Modifier modifier) {
        this.f9900x = str;
        this.f9901y = modifier;
        this.f9902z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f9899w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC35903f.m114006a(this.f9900x, this.f9901y, composer, AbstractC28683x.m87244L(this.f9902z | 1));
                break;
            default:
                AbstractC4482w.m14005o(this.f9900x, this.f9901y, composer, AbstractC28683x.m87244L(1), this.f9902z);
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2548j1(String str, Modifier modifier, int i13, int i14) {
        this.f9900x = str;
        this.f9901y = modifier;
        this.f9902z = i14;
    }
}
