package p710im1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c03.C3815c;
import c93.InterfaceC4351m;
import m80.AbstractC25225g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: im1.l */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18680l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f73290E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f73291F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73292w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f73293x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3815c f73294y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f73295z;

    public /* synthetic */ C18680l(Modifier modifier, C3815c c3815c, Function1 function1, int i13, int i14, int i15) {
        this.f73292w = i15;
        this.f73293x = modifier;
        this.f73294y = c3815c;
        this.f73295z = function1;
        this.f73290E = i13;
        this.f73291F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f73292w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18682m.m54247j(this.f73293x, this.f73294y, this.f73295z, this.f73290E, this.f73291F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC25225g.m73944g(this.f73293x, this.f73294y, this.f73295z, this.f73290E, this.f73291F, (Composer) obj, iIntValue2);
        }
    }
}
