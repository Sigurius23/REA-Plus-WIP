package wr0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.models.DesignSystemModel;
import j81.C21425i;
import p01.C28582b;
import p748zc1.AbstractC40386l0;
import p748zc1.AbstractC40428p0;
import w41.AbstractC36826z;
import wt2.C37622c;
import x41.AbstractC37953a;
import xd2.C38207c;
import y01.AbstractC39019b;
import y01.C39020c;
import y11.AbstractC39050c;
import y11.C39051d;
import y41.AbstractC39213d;
import y41.C39216g;
import y41.C39217h;
import yd2.AbstractC39462d;
import yt2.AbstractC39780k;
import zy0.AbstractC41214b;
import zy0.EnumC41217e;

/* JADX INFO: renamed from: wr0.y */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37564y implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160638w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f160639x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f160640y;

    public /* synthetic */ C37564y(Object obj, int i13, int i14) {
        this.f160638w = i14;
        this.f160640y = obj;
        this.f160639x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f160638w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC37566z.m120579j((C37558v) this.f160640y, this.f160639x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC37523d0.m120326g((C21425i) this.f160640y, this.f160639x, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC37953a.m121547c((AbstractC36826z.a) this.f160640y, this.f160639x, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC39019b.m124420l((C39020c) this.f160640y, this.f160639x, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC39050c.m124490s((C39051d) this.f160640y, this.f160639x, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC39213d.m124910r((C39216g) this.f160640y, this.f160639x, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC39213d.m124908p((C39217h) this.f160640y, this.f160639x, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC39462d.m126023k((C38207c) this.f160640y, this.f160639x, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC39780k.m127418w((C37622c) this.f160640y, this.f160639x, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC40386l0.m130223f((DesignSystemModel) this.f160640y, this.f160639x, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC40428p0.m130575f((C28582b[]) this.f160640y, this.f160639x, (Composer) obj, iIntValue11);
            default:
                int iIntValue12 = ((Integer) obj2).intValue();
                return AbstractC41214b.m133894e((EnumC41217e) this.f160640y, this.f160639x, (Composer) obj, iIntValue12);
        }
    }
}
