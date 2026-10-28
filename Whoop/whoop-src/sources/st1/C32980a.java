package st1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import rt1.InterfaceC31810h;

/* JADX INFO: renamed from: st1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C32980a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137338w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC31810h.b f137339x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f137340y;

    public /* synthetic */ C32980a(InterfaceC31810h.b bVar, int i13, int i14) {
        this.f137338w = i14;
        this.f137339x = bVar;
        this.f137340y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f137338w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC32982c.m104128f(this.f137339x, this.f137340y, composer, iIntValue);
            case 1:
                return AbstractC32988i.m104148c(this.f137339x, this.f137340y, composer, iIntValue);
            default:
                return AbstractC32994o.m104220c(this.f137339x, this.f137340y, composer, iIntValue);
        }
    }
}
