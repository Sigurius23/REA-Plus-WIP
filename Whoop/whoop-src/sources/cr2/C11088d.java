package cr2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: cr2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C11088d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35179w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11087c f35180x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f35181y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f35182z;

    public /* synthetic */ C11088d(C11087c c11087c, boolean z4, int i13, int i14) {
        this.f35179w = i14;
        this.f35180x = c11087c;
        this.f35181y = z4;
        this.f35182z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f35179w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC11089e.m29932g(this.f35180x, this.f35181y, this.f35182z, composer, iIntValue);
            default:
                return AbstractC11090f.m29941e(this.f35180x, this.f35181y, this.f35182z, composer, iIntValue);
        }
    }
}
