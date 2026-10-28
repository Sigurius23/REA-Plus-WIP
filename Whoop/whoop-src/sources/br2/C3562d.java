package br2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import xq2.C38569i;

/* JADX INFO: renamed from: br2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3562d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f14411E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f14412F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f14413G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14414w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f14415x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38569i f14416y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f14417z;

    public /* synthetic */ C3562d(Modifier modifier, C38569i c38569i, boolean z4, int i13, int i14, int i15) {
        this.f14415x = modifier;
        this.f14416y = c38569i;
        this.f14417z = z4;
        this.f14411E = i13;
        this.f14412F = i14;
        this.f14413G = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14414w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f14415x;
                C38569i c38569i = this.f14416y;
                boolean z4 = this.f14417z;
                return AbstractC3563e.m10681g(c38569i, this.f14411E, modifier, z4, this.f14412F, this.f14413G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC3563e.m10686l(this.f14415x, this.f14416y, this.f14417z, this.f14411E, this.f14412F, this.f14413G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C3562d(C38569i c38569i, int i13, Modifier modifier, boolean z4, int i14, int i15) {
        this.f14416y = c38569i;
        this.f14411E = i13;
        this.f14415x = modifier;
        this.f14417z = z4;
        this.f14412F = i14;
        this.f14413G = i15;
    }
}
