package no0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import lo0.C24571b0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no0.d0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26942d0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f107464E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107465w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24571b0 f107466x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f107467y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f107468z;

    public /* synthetic */ C26942d0(C24571b0 c24571b0, Function1 function1, int i13, int i14, int i15) {
        this.f107465w = i15;
        this.f107466x = c24571b0;
        this.f107467y = function1;
        this.f107468z = i13;
        this.f107464E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f107465w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC26948g0.m80493p(this.f107466x, this.f107467y, this.f107468z, this.f107464E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26948g0.m80500w(this.f107466x, this.f107467y, this.f107468z, this.f107464E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC26950h0.m80517n(this.f107466x, this.f107467y, this.f107468z, this.f107464E, (Composer) obj, iIntValue3);
        }
    }
}
