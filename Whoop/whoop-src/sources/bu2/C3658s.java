package bu2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c81.AbstractC4304d;
import c93.InterfaceC4351m;
import p208i2.InterfaceC17869a1;
import qk2.AbstractC30446b;

/* JADX INFO: renamed from: bu2.s */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C3658s implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f14883E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f14884F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f14885G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14886w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f14887x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f14888y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f14889z;

    public /* synthetic */ C3658s(float f13, long j7, Object obj, Modifier modifier, int i13, int i14, int i15) {
        this.f14886w = i15;
        this.f14888y = f13;
        this.f14883E = j7;
        this.f14885G = obj;
        this.f14887x = modifier;
        this.f14889z = i13;
        this.f14884F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14886w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3663x.m11290A(this.f14888y, this.f14883E, (InterfaceC4351m) this.f14885G, this.f14887x, this.f14889z, this.f14884F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4304d.m13564h(this.f14887x, (String) this.f14885G, this.f14888y, this.f14889z, this.f14883E, this.f14884F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC30446b.m93133C(this.f14888y, this.f14883E, (InterfaceC17869a1) this.f14885G, this.f14887x, this.f14889z, this.f14884F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C3658s(Modifier modifier, String str, float f13, int i13, long j7, int i14) {
        this.f14886w = 1;
        this.f14887x = modifier;
        this.f14885G = str;
        this.f14888y = f13;
        this.f14889z = i13;
        this.f14883E = j7;
        this.f14884F = i14;
    }
}
