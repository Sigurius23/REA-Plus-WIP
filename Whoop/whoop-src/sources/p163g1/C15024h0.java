package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g1.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15024h0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f56225E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f56226F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C37816b f56227G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4351m f56228H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f56229I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Function3 f56230J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56231w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f56232x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f56233y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f56234z;

    public /* synthetic */ C15024h0(int i13, Modifier modifier, long j7, long j13, float f13, C37816b c37816b, InterfaceC4351m interfaceC4351m, C37816b c37816b2, int i14) {
        this.f56232x = i13;
        this.f56233y = modifier;
        this.f56234z = j7;
        this.f56225E = j13;
        this.f56226F = f13;
        this.f56227G = c37816b;
        this.f56228H = interfaceC4351m;
        this.f56230J = c37816b2;
        this.f56229I = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56231w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC15086n0.m43160d(this.f56227G, this.f56233y, this.f56228H, this.f56230J, this.f56234z, this.f56225E, this.f56226F, (Composer) obj, AbstractC28683x.m87244L(this.f56232x | 1), this.f56229I);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC14977c8.m43098a(this.f56232x, this.f56233y, this.f56234z, this.f56225E, this.f56226F, this.f56227G, this.f56228H, (C37816b) this.f56230J, (Composer) obj, AbstractC28683x.m87244L(this.f56229I | 1));
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C15024h0(C37816b c37816b, Modifier modifier, InterfaceC4351m interfaceC4351m, Function3 function3, long j7, long j13, float f13, int i13, int i14) {
        this.f56227G = c37816b;
        this.f56233y = modifier;
        this.f56228H = interfaceC4351m;
        this.f56230J = function3;
        this.f56234z = j7;
        this.f56225E = j13;
        this.f56226F = f13;
        this.f56232x = i13;
        this.f56229I = i14;
    }
}
