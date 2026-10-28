package id2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import sg2.AbstractC32453d;
import yb0.AbstractC39388k;

/* JADX INFO: renamed from: id2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C18416a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f71651E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f71652F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71653w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f71654x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f71655y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f71656z;

    public /* synthetic */ C18416a(boolean z4, Function1 function1, Modifier modifier, int i13, int i14, int i15) {
        this.f71653w = i15;
        this.f71654x = z4;
        this.f71655y = function1;
        this.f71656z = modifier;
        this.f71651E = i13;
        this.f71652F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f71653w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18417b.m53002c(this.f71654x, this.f71655y, this.f71656z, this.f71651E, this.f71652F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32453d.m101348h(this.f71654x, this.f71655y, this.f71656z, this.f71651E, this.f71652F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC39388k.m125735n1(this.f71654x, this.f71655y, this.f71656z, this.f71651E, this.f71652F, (Composer) obj, iIntValue3);
        }
    }
}
