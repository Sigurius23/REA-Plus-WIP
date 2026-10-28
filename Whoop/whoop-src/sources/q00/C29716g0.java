package q00;

import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import g40.InterfaceC15391m3;
import l83.C23454a0;
import o23.C27486p;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.InterfaceC3764o;
import p164g2.InterfaceC15237i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p550vd.AbstractC35903f;
import p602x1.AbstractC37817c;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import ug.AbstractC34924m;
import x30.C37884e0;

/* JADX INFO: renamed from: q00.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29716g0 implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f121515E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f121516F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function1 f121517G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Function1 f121518H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC2994c0 f121519I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Function1 f121520J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Function1 f121521K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Function1 f121522L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Function1 f121523M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC4339a f121524N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC4339a f121525O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ InterfaceC4339a f121526P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ InterfaceC4339a f121527Q;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C29720i0 f121528w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f121529x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC15391m3 f121530y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37884e0 f121531z;

    public C29716g0(C29720i0 c29720i0, InterfaceC4339a interfaceC4339a, InterfaceC15391m3 interfaceC15391m3, C37884e0 c37884e0, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC2994c0 interfaceC2994c0, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5) {
        this.f121528w = c29720i0;
        this.f121529x = interfaceC4339a;
        this.f121530y = interfaceC15391m3;
        this.f121531z = c37884e0;
        this.f121515E = function1;
        this.f121516F = function2;
        this.f121517G = function3;
        this.f121518H = function4;
        this.f121519I = interfaceC2994c0;
        this.f121520J = function5;
        this.f121521K = function6;
        this.f121522L = function7;
        this.f121523M = function8;
        this.f121524N = interfaceC4339a2;
        this.f121525O = interfaceC4339a3;
        this.f121526P = interfaceC4339a4;
        this.f121527Q = interfaceC4339a5;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC3764o AnimatedContent = (InterfaceC3764o) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        if (zBooleanValue) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1064805310);
            AbstractC34924m.m110141b(AbstractC1136a.m3599a(C2314t.f9131w, "wallet_screen_loader_tag"), null, c28655q, 6, 2);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1064968029);
            c28655q2.m87150e0(1835467136);
            C29720i0 c29720i0 = this.f121528w;
            InterfaceC41211c interfaceC41211c = c29720i0.f121556u;
            if (interfaceC41211c != null) {
                AbstractC32417h.m101194c(interfaceC41211c, this.f121529x, c28655q2, 0);
            }
            c28655q2.m87173q(false);
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            Boolean boolValueOf = Boolean.valueOf(c29720i0.f121542g);
            c28655q2.m87150e0(1835476943);
            boolean zM87153g = c28655q2.m87153g(c29720i0) | c28655q2.m87157i(interfaceC15237i);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C27486p(c29720i0, interfaceC15237i, null, 5);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, boolValueOf);
            AbstractC35903f.m114008c(null, AbstractC37817c.m121344e(-719989403, c28655q2, new C29714f0(this.f121528w, this.f121530y, this.f121531z, this.f121515E, this.f121516F, this.f121517G, this.f121518H, this.f121519I, this.f121520J, this.f121521K, this.f121522L, this.f121523M, this.f121524N, this.f121525O, this.f121526P, this.f121527Q)), c28655q2, 48);
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }
}
