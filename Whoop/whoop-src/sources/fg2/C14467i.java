package fg2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import uz1.AbstractC35428f;

/* JADX INFO: renamed from: fg2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C14467i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Modifier f52806E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f52807F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f52808G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52809w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f52810x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f52811y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f52812z;

    public /* synthetic */ C14467i(Modifier modifier, boolean z4, boolean z13, Function1 function1, int i13, int i14) {
        this.f52809w = 0;
        this.f52806E = modifier;
        this.f52810x = z4;
        this.f52811y = z13;
        this.f52812z = function1;
        this.f52807F = i13;
        this.f52808G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52809w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14468j.m41280q(this.f52806E, this.f52810x, this.f52811y, this.f52812z, this.f52807F, this.f52808G, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f52806E;
                return AbstractC35428f.m112427o(this.f52810x, this.f52811y, this.f52812z, modifier, this.f52807F, this.f52808G, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f52806E;
                return AbstractC35428f.m112424l(this.f52810x, this.f52811y, this.f52812z, modifier2, this.f52807F, this.f52808G, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C14467i(boolean z4, boolean z13, Function1 function1, Modifier modifier, int i13, int i14, int i15) {
        this.f52809w = i15;
        this.f52810x = z4;
        this.f52811y = z13;
        this.f52812z = function1;
        this.f52806E = modifier;
        this.f52807F = i13;
        this.f52808G = i14;
    }
}
