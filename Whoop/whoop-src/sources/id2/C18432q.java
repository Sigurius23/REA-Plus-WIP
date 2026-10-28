package id2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import os0.AbstractC28309e;
import q62.AbstractC30002b;
import rs2.AbstractC31795a;
import uu2.AbstractC35252g0;
import v31.AbstractC35610f;

/* JADX INFO: renamed from: id2.q */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C18432q implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71690w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f71691x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f71692y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f71693z;

    public /* synthetic */ C18432q(int i13, int i14, int i15, int i16) {
        this.f71690w = i16;
        this.f71691x = i13;
        this.f71692y = i14;
        this.f71693z = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f71690w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC18435t.m53129u(this.f71691x, this.f71692y, this.f71693z, composer, iIntValue);
            case 1:
                return AbstractC28309e.m85769d(this.f71691x, this.f71692y, this.f71693z, composer, iIntValue);
            case 2:
                return AbstractC30002b.m91804e(this.f71691x, this.f71692y, this.f71693z, composer, iIntValue);
            case 3:
                return AbstractC31795a.m98745p(this.f71691x, this.f71692y, this.f71693z, composer, iIntValue);
            case 4:
                return AbstractC35252g0.m111715o(this.f71691x, this.f71692y, this.f71693z, composer, iIntValue);
            default:
                return AbstractC35610f.m112814k(this.f71691x, this.f71692y, this.f71693z, composer, iIntValue);
        }
    }
}
