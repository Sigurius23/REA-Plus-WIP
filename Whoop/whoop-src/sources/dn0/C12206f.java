package dn0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p745y81.InterfaceC39332e;
import qy0.AbstractC30773f;
import xo1.AbstractC38493b;

/* JADX INFO: renamed from: dn0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12206f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40802w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f40803x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC39332e f40804y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f40805z;

    public /* synthetic */ C12206f(float f13, InterfaceC39332e interfaceC39332e, int i13, int i14) {
        this.f40802w = i14;
        this.f40803x = f13;
        this.f40804y = interfaceC39332e;
        this.f40805z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f40802w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC12208h.m33847w(this.f40803x, this.f40804y, this.f40805z, composer, iIntValue);
            case 1:
                return AbstractC30773f.m94539m(this.f40803x, this.f40804y, this.f40805z, composer, iIntValue);
            default:
                return AbstractC38493b.m123352o(this.f40803x, this.f40804y, this.f40805z, composer, iIntValue);
        }
    }
}
