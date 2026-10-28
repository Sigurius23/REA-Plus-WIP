package eo2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p474s.AbstractC32004s;
import p707gt1.AbstractC16202p;
import p71.AbstractC28956b;
import px0.AbstractC29593c;
import vy0.AbstractC36578h0;
import vy0.AbstractC36588p;
import wl0.AbstractC37352a;

/* JADX INFO: renamed from: eo2.l */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13392l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f46902E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f46903w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f46904x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f46905y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f46906z;

    public /* synthetic */ C13392l(Modifier modifier, String str, int i13, int i14, int i15) {
        this.f46903w = i15;
        this.f46904x = modifier;
        this.f46905y = str;
        this.f46906z = i13;
        this.f46902E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46903w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f46904x;
                return AbstractC13393m.m37807l(this.f46905y, modifier, this.f46906z, this.f46902E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC16202p.m45861q(this.f46904x, this.f46905y, this.f46906z, this.f46902E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f46904x;
                return AbstractC28956b.m87938w(this.f46905y, modifier2, this.f46906z, this.f46902E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                Modifier modifier3 = this.f46904x;
                return AbstractC28956b.m87939x(this.f46905y, modifier3, this.f46906z, this.f46902E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                Modifier modifier4 = this.f46904x;
                return AbstractC28956b.m87940y(this.f46905y, modifier4, this.f46906z, this.f46902E, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                Modifier modifier5 = this.f46904x;
                return AbstractC29593c.m90736E(this.f46905y, modifier5, this.f46906z, this.f46902E, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                Modifier modifier6 = this.f46904x;
                return AbstractC29593c.m90737F(this.f46905y, modifier6, this.f46906z, this.f46902E, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                Modifier modifier7 = this.f46904x;
                return AbstractC36588p.m117443e1(this.f46905y, modifier7, this.f46906z, this.f46902E, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                Modifier modifier8 = this.f46904x;
                return AbstractC36578h0.m117328F(this.f46905y, modifier8, this.f46906z, this.f46902E, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC37352a.m119619l(this.f46904x, this.f46905y, this.f46906z, this.f46902E, (Composer) obj, iIntValue10);
            default:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f46906z | 1);
                AbstractC32004s.m99532a(this.f46905y, this.f46904x, (Composer) obj, iM87244L, this.f46902E);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C13392l(String str, Modifier modifier, int i13, int i14, int i15) {
        this.f46903w = i15;
        this.f46905y = str;
        this.f46904x = modifier;
        this.f46906z = i13;
        this.f46902E = i14;
    }
}
