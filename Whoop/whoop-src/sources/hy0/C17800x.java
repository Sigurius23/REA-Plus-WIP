package hy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gz0.EnumC16313m0;
import j50.AbstractC21331c;

/* JADX INFO: renamed from: hy0.x */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17800x implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f69226E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69227w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f69228x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f69229y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f69230z;

    public /* synthetic */ C17800x(Modifier modifier, long j7, float f13, int i13) {
        this.f69226E = modifier;
        this.f69229y = j7;
        this.f69228x = f13;
        this.f69230z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69227w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17803y.m51171p((Modifier) this.f69226E, this.f69229y, this.f69228x, this.f69230z, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21331c.m59876p((EnumC16313m0) this.f69226E, this.f69228x, this.f69229y, this.f69230z, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C17800x(EnumC16313m0 enumC16313m0, float f13, long j7, int i13) {
        this.f69226E = enumC16313m0;
        this.f69228x = f13;
        this.f69229y = j7;
        this.f69230z = i13;
    }
}
