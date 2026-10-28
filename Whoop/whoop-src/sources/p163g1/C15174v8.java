package p163g1;

import e93.AbstractC12889b;
import i40.AbstractC18067a;
import i40.AbstractC18076j;
import i40.C18077k;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39133t0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.v8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15174v8 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f56930E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f56931F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC39104j1 f56932G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ AbstractC39104j1 f56933H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ AbstractC39104j1 f56934I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ AbstractC39104j1 f56935J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int f56936K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f56937L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC39133t0 f56938M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC39127r0 f56939N;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56940w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC39104j1 f56941x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f56942y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f56943z;

    public /* synthetic */ C15174v8(AbstractC39104j1 abstractC39104j1, int i13, int i14, int i15, int i16, AbstractC39104j1 abstractC39104j2, AbstractC39104j1 abstractC39104j3, AbstractC39104j1 abstractC39104j4, AbstractC39104j1 abstractC39104j5, InterfaceC39127r0 interfaceC39127r0, int i17, int i18, InterfaceC39133t0 interfaceC39133t0, int i19) {
        this.f56940w = i19;
        this.f56941x = abstractC39104j1;
        this.f56942y = i13;
        this.f56943z = i14;
        this.f56930E = i15;
        this.f56931F = i16;
        this.f56932G = abstractC39104j2;
        this.f56933H = abstractC39104j3;
        this.f56934I = abstractC39104j4;
        this.f56935J = abstractC39104j5;
        this.f56939N = interfaceC39127r0;
        this.f56936K = i17;
        this.f56937L = i18;
        this.f56938M = interfaceC39133t0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        float f13;
        int i14;
        float f14;
        float f15;
        int i15;
        float f16;
        int i16 = this.f56940w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC39133t0 interfaceC39133t0 = this.f56938M;
        int i17 = this.f56937L;
        int i18 = this.f56936K;
        InterfaceC39127r0 interfaceC39127r0 = this.f56939N;
        AbstractC39104j1 abstractC39104j1 = this.f56935J;
        AbstractC39104j1 abstractC39104j2 = this.f56934I;
        AbstractC39104j1 abstractC39104j3 = this.f56933H;
        AbstractC39104j1 abstractC39104j4 = this.f56932G;
        int i19 = this.f56931F;
        int i24 = this.f56930E;
        int i25 = this.f56943z;
        int i26 = this.f56942y;
        AbstractC39104j1 abstractC39104j5 = this.f56941x;
        switch (i16) {
            case 0:
                C15194x8 c15194x8 = (C15194x8) interfaceC39127r0;
                boolean z4 = c15194x8.f57027a;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                if (abstractC39104j5 == null) {
                    float density = interfaceC39133t0.getDensity();
                    InterfaceC22973k1 interfaceC22973k1 = c15194x8.f57029c;
                    float f17 = AbstractC15164u8.f56885a;
                    int iM36258X = AbstractC12889b.m36258X(interfaceC22973k1.mo43112d() * density);
                    if (abstractC39104j2 != null) {
                        i13 = 0;
                        AbstractC39101i1.m124624n(abstractC39104j2, 0, AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j2.f168212x) / 2.0f), abstractC39101i1);
                    } else {
                        i13 = 0;
                    }
                    if (abstractC39104j1 != null) {
                        i14 = 1;
                        f13 = 0.0f;
                        AbstractC39101i1.m124624n(abstractC39104j1, i24 - abstractC39104j1.f168211w, AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j1.f168212x) / 2.0f), abstractC39101i1);
                    } else {
                        f13 = 0.0f;
                        i14 = 1;
                    }
                    int iM31982a = z4 ? AbstractC11895b.m31982a(i14, f13, (i19 - abstractC39104j4.f168212x) / 2.0f) : iM36258X;
                    float f18 = AbstractC15114p8.f56624a;
                    AbstractC39101i1.m124624n(abstractC39104j4, abstractC39104j2 != null ? abstractC39104j2.f168211w : i13, iM31982a, abstractC39101i1);
                    if (abstractC39104j3 != null) {
                        if (z4) {
                            iM36258X = AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j3.f168212x) / 2.0f);
                        }
                        AbstractC39101i1.m124624n(abstractC39104j3, abstractC39104j2 != null ? abstractC39104j2.f168211w : i13, iM36258X, abstractC39101i1);
                    }
                } else {
                    int i27 = i26 - i25;
                    if (i27 < 0) {
                        i27 = 0;
                    }
                    int i28 = i18 + i17;
                    float f19 = c15194x8.f57028b;
                    float density2 = interfaceC39133t0.getDensity();
                    float f24 = AbstractC15164u8.f56885a;
                    if (abstractC39104j2 != null) {
                        AbstractC39101i1.m124624n(abstractC39104j2, 0, AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j2.f168212x) / 2.0f), abstractC39101i1);
                    }
                    if (abstractC39104j1 != null) {
                        f14 = 0.0f;
                        AbstractC39101i1.m124624n(abstractC39104j1, i24 - abstractC39104j1.f168211w, AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j1.f168212x) / 2.0f), abstractC39101i1);
                    } else {
                        f14 = 0.0f;
                    }
                    int iM31982a2 = z4 ? AbstractC11895b.m31982a(1, f14, (i19 - abstractC39104j5.f168212x) / 2.0f) : AbstractC12889b.m36258X(AbstractC15114p8.f56624a * density2);
                    int iM36258X2 = iM31982a2 - AbstractC12889b.m36258X((iM31982a2 - i27) * f19);
                    float f25 = AbstractC15114p8.f56624a;
                    AbstractC39101i1.m124624n(abstractC39104j5, abstractC39104j2 != null ? abstractC39104j2.f168211w : 0, iM36258X2, abstractC39101i1);
                    AbstractC39101i1.m124624n(abstractC39104j4, abstractC39104j2 != null ? abstractC39104j2.f168211w : 0, i28, abstractC39101i1);
                    if (abstractC39104j3 != null) {
                        AbstractC39101i1.m124624n(abstractC39104j3, abstractC39104j2 != null ? abstractC39104j2.f168211w : 0, i28, abstractC39101i1);
                    }
                }
                break;
            default:
                C18077k c18077k = (C18077k) interfaceC39127r0;
                boolean z13 = c18077k.f70280a;
                AbstractC39101i1 layout = (AbstractC39101i1) obj;
                AbstractC22676k.m65750j(layout, "$this$layout");
                if (abstractC39104j5 == null) {
                    float density3 = interfaceC39133t0.getDensity();
                    C22976l1 c22976l1 = c18077k.f70282c;
                    float f26 = AbstractC18076j.f70279a;
                    int iM36258X3 = AbstractC12889b.m36258X(c22976l1.f90647b * density3);
                    if (abstractC39104j2 != null) {
                        AbstractC39101i1.m124624n(abstractC39104j2, 0, AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j2.f168212x) / 2.0f), layout);
                    }
                    if (abstractC39104j1 != null) {
                        i15 = 1;
                        f15 = 0.0f;
                        AbstractC39101i1.m124624n(abstractC39104j1, i24 - abstractC39104j1.f168211w, AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j1.f168212x) / 2.0f), layout);
                    } else {
                        f15 = 0.0f;
                        i15 = 1;
                    }
                    AbstractC39101i1.m124624n(abstractC39104j4, abstractC39104j2 != null ? abstractC39104j2.f168211w : 0, z13 ? AbstractC11895b.m31982a(i15, f15, (i19 - abstractC39104j4.f168212x) / 2.0f) : iM36258X3, layout);
                    if (abstractC39104j3 != null) {
                        if (z13) {
                            iM36258X3 = AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j3.f168212x) / 2.0f);
                        }
                        AbstractC39101i1.m124624n(abstractC39104j3, abstractC39104j2 != null ? abstractC39104j2.f168211w : 0, iM36258X3, layout);
                    }
                } else {
                    int i29 = i26 - i25;
                    if (i29 < 0) {
                        i29 = 0;
                    }
                    int i34 = i18 + i17;
                    float f27 = c18077k.f70281b;
                    float density4 = interfaceC39133t0.getDensity();
                    float f28 = AbstractC18076j.f70279a;
                    if (abstractC39104j2 != null) {
                        AbstractC39101i1.m124624n(abstractC39104j2, 0, AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j2.f168212x) / 2.0f), layout);
                    }
                    if (abstractC39104j1 != null) {
                        f16 = 0.0f;
                        AbstractC39101i1.m124624n(abstractC39104j1, i24 - abstractC39104j1.f168211w, AbstractC11895b.m31982a(1, 0.0f, (i19 - abstractC39104j1.f168212x) / 2.0f), layout);
                    } else {
                        f16 = 0.0f;
                    }
                    int iM31982a3 = z13 ? AbstractC11895b.m31982a(1, f16, (i19 - abstractC39104j5.f168212x) / 2.0f) : AbstractC12889b.m36258X(AbstractC18067a.f70154b * density4);
                    AbstractC39101i1.m124624n(abstractC39104j5, abstractC39104j2 != null ? abstractC39104j2.f168211w : 0, iM31982a3 - AbstractC12889b.m36258X((iM31982a3 - i29) * f27), layout);
                    AbstractC39101i1.m124624n(abstractC39104j4, abstractC39104j2 != null ? abstractC39104j2.f168211w : 0, i34, layout);
                    if (abstractC39104j3 != null) {
                        AbstractC39101i1.m124624n(abstractC39104j3, abstractC39104j2 != null ? abstractC39104j2.f168211w : 0, i34, layout);
                    }
                }
                break;
        }
        return c23454a0;
    }
}
