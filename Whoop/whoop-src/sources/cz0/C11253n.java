package cz0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import k71.AbstractC22253j;

/* JADX INFO: renamed from: cz0.n */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11253n implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36103w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f36104x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f36105y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f36106z;

    public /* synthetic */ C11253n(float f13, List list, int i13) {
        this.f36105y = f13;
        this.f36104x = list;
        this.f36106z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f36103w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC11254o.m30386r(this.f36105y, this.f36104x, this.f36106z, composer, iIntValue);
            default:
                return AbstractC22253j.m63827M(this.f36104x, this.f36105y, this.f36106z, composer, iIntValue);
        }
    }

    public /* synthetic */ C11253n(List list, float f13, int i13) {
        this.f36104x = list;
        this.f36105y = f13;
        this.f36106z = i13;
    }
}
