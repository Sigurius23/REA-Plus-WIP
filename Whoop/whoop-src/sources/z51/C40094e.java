package z51;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import l83.C23465k;

/* JADX INFO: renamed from: z51.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40094e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C23465k f173025E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f173026F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ TextResource f173027G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ EnumC40100k f173028H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ float f173029I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ TextResource f173030J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ float f173031K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ TextResource f173032L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f173033M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Object f173034N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean f173035O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ InterfaceC4339a f173036P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ int f173037Q;

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ int f173038R;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173039w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f173040x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f173041y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f173042z;

    public /* synthetic */ C40094e(boolean z4, boolean z13, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, float f15, TextResource textResource2, float f16, TextResource textResource3, C40090a c40090a, C40090a c40090a2, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f173039w = i15;
        this.f173040x = z4;
        this.f173041y = z13;
        this.f173042z = f13;
        this.f173025E = c23465k;
        this.f173026F = f14;
        this.f173027G = textResource;
        this.f173028H = enumC40100k;
        this.f173029I = f15;
        this.f173030J = textResource2;
        this.f173031K = f16;
        this.f173032L = textResource3;
        this.f173033M = c40090a;
        this.f173034N = c40090a2;
        this.f173035O = z14;
        this.f173036P = interfaceC4339a;
        this.f173037Q = i13;
        this.f173038R = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f173039w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC40097h.m128590v(this.f173040x, this.f173041y, this.f173042z, this.f173025E, this.f173026F, this.f173027G, this.f173028H, this.f173029I, this.f173030J, this.f173031K, this.f173032L, (C40090a) this.f173033M, (C40090a) this.f173034N, this.f173035O, this.f173036P, this.f173037Q, this.f173038R, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40097h.m128593y(this.f173040x, this.f173041y, this.f173042z, this.f173025E, this.f173026F, this.f173027G, this.f173028H, this.f173029I, this.f173030J, this.f173031K, this.f173032L, (C40090a) this.f173033M, (C40090a) this.f173034N, this.f173035O, this.f173036P, this.f173037Q, this.f173038R, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC40097h.m128587s(this.f173040x, this.f173041y, this.f173042z, this.f173025E, this.f173026F, this.f173027G, this.f173028H, this.f173030J, this.f173029I, this.f173032L, (TextResource) this.f173033M, this.f173031K, (TextResource) this.f173034N, this.f173035O, this.f173036P, this.f173037Q, this.f173038R, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C40094e(boolean z4, boolean z13, float f13, C23465k c23465k, float f14, TextResource textResource, EnumC40100k enumC40100k, TextResource textResource2, float f15, TextResource textResource3, TextResource textResource4, float f16, TextResource textResource5, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f173039w = 2;
        this.f173040x = z4;
        this.f173041y = z13;
        this.f173042z = f13;
        this.f173025E = c23465k;
        this.f173026F = f14;
        this.f173027G = textResource;
        this.f173028H = enumC40100k;
        this.f173030J = textResource2;
        this.f173029I = f15;
        this.f173032L = textResource3;
        this.f173033M = textResource4;
        this.f173031K = f16;
        this.f173034N = textResource5;
        this.f173035O = z14;
        this.f173036P = interfaceC4339a;
        this.f173037Q = i13;
        this.f173038R = i14;
    }
}
