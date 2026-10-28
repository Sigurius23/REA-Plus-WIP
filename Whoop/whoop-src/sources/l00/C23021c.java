package l00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p696zy.InterfaceC41211c;
import se.AbstractC32417h;

/* JADX INFO: renamed from: l00.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C23021c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90767w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC41211c f90768x;

    public /* synthetic */ C23021c(InterfaceC41211c interfaceC41211c, int i13, int i14) {
        this.f90767w = i14;
        this.f90768x = interfaceC41211c;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f90767w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC23024f.m66787f(this.f90768x, composer, AbstractC28683x.m87244L(1));
                break;
            default:
                AbstractC32417h.m101199h(this.f90768x, composer, AbstractC28683x.m87244L(1));
                break;
        }
        return C23454a0.f92919a;
    }
}
