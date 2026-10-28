package c41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import f02.AbstractC13916b;
import gz2.AbstractC16341h;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c41.k0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4055k0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16482E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f16483F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16484w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f16485x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f16486y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f16487z;

    public /* synthetic */ C4055k0(Modifier modifier, String str, Function1 function1, int i13, int i14) {
        this.f16487z = modifier;
        this.f16485x = str;
        this.f16486y = function1;
        this.f16482E = i13;
        this.f16483F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16484w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4062l0.m12428p(this.f16487z, this.f16485x, this.f16486y, this.f16482E, this.f16483F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f16487z;
                return AbstractC13916b.m39661r(this.f16485x, this.f16486y, modifier, this.f16482E, this.f16483F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f16487z;
                return AbstractC16341h.m46558e(this.f16485x, modifier2, this.f16486y, this.f16482E, this.f16483F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C4055k0(String str, Modifier modifier, Function1 function1, int i13, int i14) {
        this.f16485x = str;
        this.f16487z = modifier;
        this.f16486y = function1;
        this.f16482E = i13;
        this.f16483F = i14;
    }

    public /* synthetic */ C4055k0(String str, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f16485x = str;
        this.f16486y = function1;
        this.f16487z = modifier;
        this.f16482E = i13;
        this.f16483F = i14;
    }
}
