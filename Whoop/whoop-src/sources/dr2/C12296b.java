package dr2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import er2.AbstractC13583e;
import er2.C13580b;

/* JADX INFO: renamed from: dr2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12296b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f41201w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13580b f41202x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f41203y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f41204z;

    public /* synthetic */ C12296b(C13580b c13580b, boolean z4, int i13, int i14) {
        this.f41201w = i14;
        this.f41202x = c13580b;
        this.f41203y = z4;
        this.f41204z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f41201w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC12297c.m34234g(this.f41202x, this.f41203y, this.f41204z, composer, iIntValue);
            default:
                return AbstractC13583e.m38338h(this.f41202x, this.f41203y, this.f41204z, composer, iIntValue);
        }
    }
}
