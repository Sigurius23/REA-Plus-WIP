package e81;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import jd2.AbstractC21613b;
import p706eo0.AbstractC13372c;
import qs1.AbstractC30574a;
import sq2.AbstractC32888e;
import zk2.AbstractC40856q;
import zz0.AbstractC41246g;

/* JADX INFO: renamed from: e81.g */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12828g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f43979E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43980w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f43981x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f43982y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f43983z;

    public /* synthetic */ C12828g(Modifier modifier, List list, int i13, int i14, int i15) {
        this.f43980w = i15;
        this.f43982y = modifier;
        this.f43981x = list;
        this.f43983z = i13;
        this.f43979E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43980w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f43982y;
                return AbstractC12836k.m35993Z(this.f43981x, modifier, this.f43983z, this.f43979E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f43982y;
                return AbstractC13372c.m37678i(this.f43981x, modifier2, this.f43983z, this.f43979E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                Modifier modifier3 = this.f43982y;
                return AbstractC21613b.m60786j(this.f43981x, modifier3, this.f43983z, this.f43979E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                Modifier modifier4 = this.f43982y;
                return AbstractC21613b.m60789m(this.f43981x, modifier4, this.f43983z, this.f43979E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC30574a.m93773w(this.f43982y, this.f43981x, this.f43983z, this.f43979E, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC30574a.m93774x(this.f43982y, this.f43981x, this.f43983z, this.f43979E, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                Modifier modifier5 = this.f43982y;
                return AbstractC32888e.m103260f(this.f43981x, modifier5, this.f43983z, this.f43979E, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                Modifier modifier6 = this.f43982y;
                return AbstractC40856q.m132412c(this.f43981x, modifier6, this.f43983z, this.f43979E, (Composer) obj, iIntValue8);
            default:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC41246g.m133964A(this.f43982y, this.f43981x, this.f43983z, this.f43979E, (Composer) obj, iIntValue9);
        }
    }

    public /* synthetic */ C12828g(List list, Modifier modifier, int i13, int i14, int i15) {
        this.f43980w = i15;
        this.f43981x = list;
        this.f43982y = modifier;
        this.f43983z = i13;
        this.f43979E = i14;
    }
}
