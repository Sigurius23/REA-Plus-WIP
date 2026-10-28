package bb2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import xc2.InterfaceC38193d;
import yc2.AbstractC39436c;

/* JADX INFO: renamed from: bb2.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C2932h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11814w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC38193d.d f11815x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f11816y;

    public /* synthetic */ C2932h(InterfaceC38193d.d dVar, int i13, int i14) {
        this.f11814w = i14;
        this.f11815x = dVar;
        this.f11816y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f11814w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC2933i.m8566t(this.f11815x, this.f11816y, composer, iIntValue);
            default:
                return AbstractC39436c.m125966P(this.f11815x, this.f11816y, composer, iIntValue);
        }
    }
}
