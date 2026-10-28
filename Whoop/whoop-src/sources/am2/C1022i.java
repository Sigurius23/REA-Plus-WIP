package am2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gb1.AbstractC15689q;
import p329n0.C26068u;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1022i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f3832E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f3833F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f3834G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3835w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26068u f3836x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f3837y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f3838z;

    public /* synthetic */ C1022i(C26068u c26068u, int i13, String str, Function1 function1, int i14, int i15, int i16) {
        this.f3835w = i16;
        this.f3836x = c26068u;
        this.f3837y = i13;
        this.f3838z = str;
        this.f3832E = function1;
        this.f3833F = i14;
        this.f3834G = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3835w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC1026k.m2762e0(this.f3836x, this.f3837y, this.f3838z, this.f3832E, this.f3833F, this.f3834G, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC1046w.m2990B(this.f3836x, this.f3837y, this.f3838z, this.f3832E, this.f3833F, this.f3834G, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC15689q.m44144l(this.f3836x, this.f3837y, this.f3838z, this.f3832E, this.f3833F, this.f3834G, (Composer) obj, iIntValue3);
        }
    }
}
