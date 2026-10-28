package c41;

import af3.C0847w;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import iz0.AbstractC21048g;
import iz0.C21054m;
import p715kotlin.jvm.functions.Function1;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: c41.u4 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4129u4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16779E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f16780F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f16781G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f16782H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f16783I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f16784J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f16785K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16786w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f16787x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f16788y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f16789z;

    public /* synthetic */ C4129u4(C0847w c0847w, C21054m c21054m, boolean z4, Function1 function1, int i13, int i14, int i15, boolean z13, int i16, int i17) {
        this.f16783I = c0847w;
        this.f16784J = c21054m;
        this.f16787x = z4;
        this.f16785K = function1;
        this.f16788y = i13;
        this.f16789z = i14;
        this.f16779E = i15;
        this.f16780F = z13;
        this.f16781G = i16;
        this.f16782H = i17;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16786w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4136v4.m12837f((Modifier) this.f16783I, this.f16788y, this.f16789z, this.f16779E, (EnumC39333f) this.f16784J, (EnumC39333f) this.f16785K, this.f16787x, this.f16780F, this.f16781G, this.f16782H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21048g.m58838i0((C0847w) this.f16783I, (C21054m) this.f16784J, this.f16787x, (Function1) this.f16785K, this.f16788y, this.f16789z, this.f16779E, this.f16780F, this.f16781G, this.f16782H, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C4129u4(Modifier modifier, int i13, int i14, int i15, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z4, boolean z13, int i16, int i17) {
        this.f16783I = modifier;
        this.f16788y = i13;
        this.f16789z = i14;
        this.f16779E = i15;
        this.f16784J = enumC39333f;
        this.f16785K = enumC39333f2;
        this.f16787x = z4;
        this.f16780F = z13;
        this.f16781G = i16;
        this.f16782H = i17;
    }
}
