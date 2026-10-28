package p719m22;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p723o22.AbstractC27468b;

/* JADX INFO: renamed from: m22.o */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24960o implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f97678E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97679w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f97680x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f97681y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f97682z;

    public /* synthetic */ C24960o(float f13, Modifier modifier, int i13, int i14, int i15) {
        this.f97679w = i15;
        this.f97680x = f13;
        this.f97681y = modifier;
        this.f97682z = i13;
        this.f97678E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f97679w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC42788s.m73248t(this.f97680x, this.f97681y, this.f97682z, this.f97678E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC27468b.m82894f(this.f97680x, this.f97681y, this.f97682z, this.f97678E, (Composer) obj, iIntValue2);
        }
    }
}
