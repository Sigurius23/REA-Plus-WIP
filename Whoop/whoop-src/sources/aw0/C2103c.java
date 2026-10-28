package aw0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import cp0.AbstractC10959g;
import h02.AbstractC16570f;

/* JADX INFO: renamed from: aw0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C2103c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f8340E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8341w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f8342x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f8343y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f8344z;

    public /* synthetic */ C2103c(int i13, int i14, int i15, Modifier modifier, boolean z4) {
        this.f8341w = i15;
        this.f8343y = z4;
        this.f8342x = modifier;
        this.f8344z = i13;
        this.f8340E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8341w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = this.f8344z;
                return AbstractC2104d.m6650c(this.f8343y, this.f8342x, i13, this.f8340E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = this.f8344z;
                boolean z4 = this.f8343y;
                return AbstractC10959g.m29084k(this.f8342x, z4, i14, this.f8340E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                int i15 = this.f8344z;
                return AbstractC16570f.m46957m(this.f8343y, this.f8342x, i15, this.f8340E, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C2103c(int i13, int i14, Modifier modifier, boolean z4) {
        this.f8341w = 1;
        this.f8342x = modifier;
        this.f8343y = z4;
        this.f8344z = i13;
        this.f8340E = i14;
    }
}
