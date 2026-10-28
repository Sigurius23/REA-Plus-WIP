package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l00.AbstractC23024f;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import sc3.AbstractC32398l;
import se.AbstractC32416g;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: b30.v3 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2641v3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10308w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f10309x;

    public /* synthetic */ C2641v3(Modifier modifier, int i13, int i14) {
        this.f10308w = i14;
        this.f10309x = modifier;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f10308w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC2495c4.m7460g(this.f10309x, composer, AbstractC28683x.m87244L(1));
                break;
            case 1:
                AbstractC32416g.m101150g(this.f10309x, composer, AbstractC28683x.m87244L(7));
                break;
            case 2:
                AbstractC34924m.m110149j(this.f10309x, composer, AbstractC28683x.m87244L(1));
                break;
            case 3:
                AbstractC34924m.m110142c(this.f10309x, composer, AbstractC28683x.m87244L(7));
                break;
            case 4:
                AbstractC23024f.m66784c(this.f10309x, composer, AbstractC28683x.m87244L(1));
                break;
            case 5:
                AbstractC23024f.m66785d(this.f10309x, composer, AbstractC28683x.m87244L(1));
                break;
            default:
                AbstractC32398l.m100968a(this.f10309x, composer, AbstractC28683x.m87244L(1));
                break;
        }
        return C23454a0.f92919a;
    }
}
