package dp0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gz0.AbstractC16300g;
import jk2.AbstractC21762c;
import m12.AbstractC24936d;
import p736sz0.AbstractC33164a1;
import p748zc1.AbstractC40304d6;

/* JADX INFO: renamed from: dp0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12246b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40958w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f40959x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f40960y;

    public /* synthetic */ C12246b(float f13, int i13, int i14) {
        this.f40958w = i14;
        this.f40959x = f13;
        this.f40960y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f40958w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC12247c.m34105j(this.f40959x, this.f40960y, composer, iIntValue);
            case 1:
                return AbstractC16300g.m46202g(this.f40959x, this.f40960y, composer, iIntValue);
            case 2:
                return AbstractC16300g.m46208m(this.f40959x, this.f40960y, composer, iIntValue);
            case 3:
                return AbstractC16300g.m46206k(this.f40959x, this.f40960y, composer, iIntValue);
            case 4:
                return AbstractC21762c.m61470s(this.f40959x, this.f40960y, composer, iIntValue);
            case 5:
                return AbstractC24936d.m73054P(this.f40959x, this.f40960y, composer, iIntValue);
            case 6:
                return AbstractC33164a1.m105039m(this.f40959x, this.f40960y, composer, iIntValue);
            default:
                return AbstractC40304d6.m129573y(this.f40959x, this.f40960y, composer, iIntValue);
        }
    }
}
