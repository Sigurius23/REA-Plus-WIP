package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2591o4;
import b30.C2644w;
import c93.InterfaceC4351m;
import fd3.C14408a;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p291l0.C22966i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.e5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14996e5 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f56088E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C37816b f56089F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C37816b f56090G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4351m f56091H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC4351m f56092I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Function3 f56093J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C15040i5 f56094K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C14951a4 f56095w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22966i0 f56096x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f56097y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f56098z;

    public C14996e5(C14951a4 c14951a4, C22966i0 c22966i0, long j7, long j13, int i13, C37816b c37816b, C37816b c37816b2, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, Function3 function3, C15040i5 c15040i5) {
        this.f56095w = c14951a4;
        this.f56096x = c22966i0;
        this.f56097y = j7;
        this.f56098z = j13;
        this.f56088E = i13;
        this.f56089F = c37816b;
        this.f56090G = c37816b2;
        this.f56091H = interfaceC4351m;
        this.f56092I = interfaceC4351m2;
        this.f56093J = function3;
        this.f56094K = c15040i5;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(modifier) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
            C14951a4 c14951a4 = this.f56095w;
            boolean zM87153g = c28655q.m87153g(c14951a4);
            C22966i0 c22966i0 = this.f56096x;
            boolean zM87153g2 = zM87153g | c28655q.m87153g(c22966i0);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g2 || objM87133R == C28635l.f115821a) {
                objM87133R = new C14408a(11, c14951a4, c22966i0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17269i.m48898k(AbstractC37056f.m118997u(modifier, new C2591o4((Function1) objM87133R, 7)), null, this.f56097y, this.f56098z, null, 0.0f, AbstractC37817c.m121344e(-1761194824, c28655q, new C2644w(this.f56088E, this.f56089F, this.f56090G, this.f56091H, this.f56095w, this.f56092I, this.f56093J, this.f56094K)), c28655q, 1572864, 50);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
