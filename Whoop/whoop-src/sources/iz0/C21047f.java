package iz0;

import af3.AbstractC0844t;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iz0.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21047f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C21054m f79807E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f79808F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f79809G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f79810H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f79811I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ boolean f79812J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int f79813K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f79814L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79815w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f79816x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f79817y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f79818z;

    public /* synthetic */ C21047f(AbstractC0844t abstractC0844t, Modifier modifier, C21054m c21054m, boolean z4, Function1 function1, int i13, int i14, int i15, boolean z13, int i16, int i17) {
        this.f79815w = 0;
        this.f79816x = abstractC0844t;
        this.f79817y = modifier;
        this.f79807E = c21054m;
        this.f79818z = z4;
        this.f79808F = function1;
        this.f79809G = i13;
        this.f79810H = i14;
        this.f79811I = i15;
        this.f79812J = z13;
        this.f79813K = i16;
        this.f79814L = i17;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f79815w) {
            case 0:
                return AbstractC21048g.m58795E0((AbstractC0844t) this.f79816x, this.f79817y, this.f79807E, this.f79818z, this.f79808F, this.f79809G, this.f79810H, this.f79811I, this.f79812J, this.f79813K, this.f79814L, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                AbstractC0844t abstractC0844t = (AbstractC0844t) this.f79816x;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC21048g.m58818X(abstractC0844t, this.f79817y, this.f79818z, this.f79807E, this.f79808F, this.f79809G, this.f79810H, this.f79811I, this.f79812J, this.f79813K, this.f79814L, composer, iIntValue);
            default:
                return AbstractC21048g.m58791C0((String) this.f79816x, this.f79817y, this.f79818z, this.f79807E, this.f79808F, this.f79809G, this.f79810H, this.f79811I, this.f79812J, this.f79813K, this.f79814L, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C21047f(Object obj, Modifier modifier, boolean z4, C21054m c21054m, Function1 function1, int i13, int i14, int i15, boolean z13, int i16, int i17, int i18) {
        this.f79815w = i18;
        this.f79816x = obj;
        this.f79817y = modifier;
        this.f79818z = z4;
        this.f79807E = c21054m;
        this.f79808F = function1;
        this.f79809G = i13;
        this.f79810H = i14;
        this.f79811I = i15;
        this.f79812J = z13;
        this.f79813K = i16;
        this.f79814L = i17;
    }
}
