package eg2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ir2.AbstractC20865d;
import ir2.C20862a;
import p748zc1.AbstractC40458s0;
import qk2.AbstractC30446b;
import w12.AbstractC36699b;
import zz0.AbstractC41246g;

/* JADX INFO: renamed from: eg2.l */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13179l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f45683E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45684w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f45685x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f45686y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f45687z;

    public /* synthetic */ C13179l(int i13, int i14, int i15, int i16, Modifier modifier) {
        this.f45684w = i16;
        this.f45685x = i13;
        this.f45686y = modifier;
        this.f45687z = i14;
        this.f45683E = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45684w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13181n.m37059m(this.f45685x, (Modifier) this.f45686y, this.f45687z, this.f45683E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13181n.m37068v(this.f45685x, (Modifier) this.f45686y, this.f45687z, this.f45683E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC30446b.m93136F(this.f45685x, (Modifier) this.f45686y, this.f45687z, this.f45683E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC36699b.m117813d(this.f45685x, this.f45687z, (Modifier) this.f45686y, this.f45683E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC40458s0.m130816s(this.f45685x, (Modifier) this.f45686y, this.f45687z, this.f45683E, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC41246g.m133970G((Modifier) this.f45686y, this.f45685x, this.f45687z, this.f45683E, (Composer) obj, iIntValue6);
            default:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC20865d.m57634i((C20862a) this.f45686y, this.f45685x, this.f45687z, this.f45683E, (Composer) obj, iIntValue7);
        }
    }

    public /* synthetic */ C13179l(int i13, int i14, int i15, Modifier modifier) {
        this.f45684w = 3;
        this.f45685x = i13;
        this.f45687z = i14;
        this.f45686y = modifier;
        this.f45683E = i15;
    }

    public /* synthetic */ C13179l(Object obj, int i13, int i14, int i15, int i16) {
        this.f45684w = i16;
        this.f45686y = obj;
        this.f45685x = i13;
        this.f45687z = i14;
        this.f45683E = i15;
    }
}
