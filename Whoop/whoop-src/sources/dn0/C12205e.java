package dn0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p745y81.InterfaceC39332e;
import qy0.AbstractC30773f;
import xo1.AbstractC38493b;

/* JADX INFO: renamed from: dn0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12205e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC39332e f40796E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f40797F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40798w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f40799x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f40800y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f40801z;

    public /* synthetic */ C12205e(float f13, boolean z4, float f14, InterfaceC39332e interfaceC39332e, int i13, int i14) {
        this.f40798w = i14;
        this.f40799x = f13;
        this.f40800y = z4;
        this.f40801z = f14;
        this.f40796E = interfaceC39332e;
        this.f40797F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40798w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12208h.m33849y(this.f40799x, this.f40800y, this.f40801z, this.f40796E, this.f40797F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC30773f.m94541o(this.f40799x, this.f40800y, this.f40801z, this.f40796E, this.f40797F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC38493b.m123354q(this.f40799x, this.f40800y, this.f40801z, this.f40796E, this.f40797F, (Composer) obj, iIntValue3);
        }
    }
}
