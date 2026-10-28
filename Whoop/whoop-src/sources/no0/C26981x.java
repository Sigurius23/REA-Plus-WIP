package no0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c31.C3927k;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no0.x */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26981x implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f107640E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f107641F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107642w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f107643x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3927k f107644y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f107645z;

    public /* synthetic */ C26981x(Modifier modifier, C3927k c3927k, Function1 function1, int i13, int i14, int i15) {
        this.f107642w = i15;
        this.f107643x = modifier;
        this.f107644y = c3927k;
        this.f107645z = function1;
        this.f107640E = i13;
        this.f107641F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f107642w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC26985z.m80920m(this.f107643x, this.f107644y, this.f107645z, this.f107640E, this.f107641F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26933a0.m80414s(this.f107643x, this.f107644y, this.f107645z, this.f107640E, this.f107641F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC26952i0.m80564q(this.f107643x, this.f107644y, this.f107645z, this.f107640E, this.f107641F, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC26962n0.m80697A(this.f107643x, this.f107644y, this.f107645z, this.f107640E, this.f107641F, (Composer) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC26966p0.m80761r(this.f107643x, this.f107644y, this.f107645z, this.f107640E, this.f107641F, (Composer) obj, iIntValue5);
        }
    }
}
