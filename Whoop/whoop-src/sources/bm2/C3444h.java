package bm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import d41.AbstractC11679e;
import eg2.AbstractC13181n;
import j11.AbstractC21206i;
import sg2.AbstractC32466q;
import v31.AbstractC35610f;

/* JADX INFO: renamed from: bm2.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3444h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13490w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f13491x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f13492y;

    public /* synthetic */ C3444h(int i13, int i14, int i15) {
        this.f13490w = i15;
        this.f13491x = i13;
        this.f13492y = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f13490w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3447i.m10077l(this.f13491x, this.f13492y, composer, iIntValue);
            case 1:
                return AbstractC11679e.m31102H(this.f13491x, this.f13492y, composer, iIntValue);
            case 2:
                return AbstractC13181n.m37062p(this.f13491x, this.f13492y, composer, iIntValue);
            case 3:
                return AbstractC21206i.m59470k(this.f13491x, this.f13492y, composer, iIntValue);
            case 4:
                return AbstractC32466q.m101408h(this.f13491x, this.f13492y, composer, iIntValue);
            default:
                return AbstractC35610f.m112811h(this.f13491x, this.f13492y, composer, iIntValue);
        }
    }
}
