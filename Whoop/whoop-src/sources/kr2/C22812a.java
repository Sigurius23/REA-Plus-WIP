package kr2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p077d0.C11393q0;

/* JADX INFO: renamed from: kr2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C22812a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f89827E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f89828F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89829w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11393q0 f89830x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f89831y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f89832z;

    public /* synthetic */ C22812a(C11393q0 c11393q0, Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, int i15) {
        this.f89829w = i15;
        this.f89830x = c11393q0;
        this.f89831y = modifier;
        this.f89832z = interfaceC4351m;
        this.f89827E = i13;
        this.f89828F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f89829w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC22813b.m66089p(this.f89830x, this.f89831y, this.f89832z, this.f89827E, this.f89828F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22813b.m66086m(this.f89830x, this.f89831y, this.f89832z, this.f89827E, this.f89828F, (Composer) obj, iIntValue2);
        }
    }
}
