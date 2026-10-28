package dn0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p745y81.InterfaceC39332e;
import qy0.AbstractC30773f;
import qy0.EnumC30774g;
import xo1.AbstractC38493b;

/* JADX INFO: renamed from: dn0.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12207g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC39332e f40806E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f40807F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ EnumC30774g f40808G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f40809H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40810w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f40811x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f40812y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC39332e f40813z;

    public /* synthetic */ C12207g(float f13, float f14, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, float f15, EnumC30774g enumC30774g, int i13, int i14) {
        this.f40810w = i14;
        this.f40811x = f13;
        this.f40812y = f14;
        this.f40813z = interfaceC39332e;
        this.f40806E = interfaceC39332e2;
        this.f40807F = f15;
        this.f40808G = enumC30774g;
        this.f40809H = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40810w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12208h.m33820C(this.f40811x, this.f40812y, this.f40813z, this.f40806E, this.f40807F, this.f40808G, this.f40809H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC30773f.m94526B(this.f40811x, this.f40812y, this.f40813z, this.f40806E, this.f40807F, this.f40808G, this.f40809H, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC38493b.m123333C(this.f40811x, this.f40812y, this.f40813z, this.f40806E, this.f40807F, this.f40808G, this.f40809H, (Composer) obj, iIntValue3);
        }
    }
}
