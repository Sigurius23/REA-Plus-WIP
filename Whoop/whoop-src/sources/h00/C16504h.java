package h00;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import g00.AbstractC14936g;
import g00.C14931b;
import g11.C15218b;
import h40.C16845k;
import hg3.AbstractC17269i;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p097ds.AbstractC12313p;
import p114eb.C12991u0;
import p163g1.C15076m0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p599wz.AbstractC37713e1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: h00.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16504h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f63446E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C16508j f63447F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC4339a f63448G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4339a f63449H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC4339a f63450I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC4351m f63451J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Function1 f63452K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC4339a f63453L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ AbstractC37713e1 f63454M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Object f63455N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Object f63456O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ InterfaceC23459e f63457P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ Object f63458Q;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63459w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f63460x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f63461y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C12991u0 f63462z;

    public C16504h(Modifier modifier, Function3 function3, InterfaceC2994c0 interfaceC2994c0, Function1 function1, C12991u0 c12991u0, Function1 function2, C16508j c16508j, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4351m interfaceC4351m, Function1 function4, Function1 function5, Function1 function6, InterfaceC4339a interfaceC4339a4, AbstractC37713e1 abstractC37713e1) {
        this.f63460x = modifier;
        this.f63455N = function3;
        this.f63456O = interfaceC2994c0;
        this.f63461y = function1;
        this.f63462z = c12991u0;
        this.f63446E = function2;
        this.f63447F = c16508j;
        this.f63448G = interfaceC4339a;
        this.f63449H = interfaceC4339a2;
        this.f63450I = interfaceC4339a3;
        this.f63451J = interfaceC4351m;
        this.f63452K = function4;
        this.f63457P = function5;
        this.f63458Q = function6;
        this.f63453L = interfaceC4339a4;
        this.f63454M = abstractC37713e1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:22:0x0113  */
    /* JADX WARN: Code duplicated, block: B:24:0x0129  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        float f13;
        Function3 function3;
        C28655q c28655q;
        Object objM87133R;
        switch (this.f63459w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f63458Q;
                if ((iIntValue & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        f13 = 24;
                        AbstractC12313p.m34277b((C16845k) this.f63455N, null, f13, this.f63448G, AbstractC37817c.m121344e(-585057695, composer, new C16502g(this.f63460x, this.f63462z, this.f63447F, (C16845k) this.f63456O, this.f63461y, this.f63451J, this.f63446E, this.f63449H, this.f63450I, this.f63452K, this.f63453L, (InterfaceC4339a) this.f63457P, this.f63454M, interfaceC28601c1)), composer, 24968, 2);
                        function3 = (Function3) interfaceC28601c1.getValue();
                        if (function3 != null) {
                            C16845k c16845k = (C16845k) this.f63456O;
                            c28655q = (C28655q) composer;
                            c28655q.m87150e0(-645216949);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C15218b(15, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            AbstractC12313p.m34277b(c16845k, null, f13, (InterfaceC4339a) objM87133R, AbstractC37817c.m121344e(1590282394, c28655q, new C15076m0(4, function3)), c28655q, 28040, 2);
                        }
                    }
                } else {
                    f13 = 24;
                    AbstractC12313p.m34277b((C16845k) this.f63455N, null, f13, this.f63448G, AbstractC37817c.m121344e(-585057695, composer, new C16502g(this.f63460x, this.f63462z, this.f63447F, (C16845k) this.f63456O, this.f63461y, this.f63451J, this.f63446E, this.f63449H, this.f63450I, this.f63452K, this.f63453L, (InterfaceC4339a) this.f63457P, this.f63454M, interfaceC28601c1)), composer, 24968, 2);
                    function3 = (Function3) interfaceC28601c1.getValue();
                    if (function3 != null) {
                        C16845k c16845k2 = (C16845k) this.f63456O;
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(-645216949);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C15218b(15, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        AbstractC12313p.m34277b(c16845k2, null, f13, (InterfaceC4339a) objM87133R, AbstractC37817c.m121344e(1590282394, c28655q, new C15076m0(4, function3)), c28655q, 28040, 2);
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        C28655q c28655q4 = (C28655q) composer2;
                        c28655q4.m87150e0(-443512897);
                        C14931b c14931b = (C14931b) c28655q4.m87161k(AbstractC14936g.f55706c);
                        c28655q4.m87173q(false);
                        AbstractC17269i.m48898k(this.f63460x, null, c14931b.f55663b, 0L, null, 0.0f, AbstractC37817c.m121344e(1908841358, composer2, new C16529w((Function3) this.f63455N, (InterfaceC2994c0) this.f63456O, this.f63461y, this.f63462z, this.f63446E, this.f63447F, this.f63448G, this.f63449H, this.f63450I, this.f63451J, this.f63452K, (Function1) this.f63457P, (Function1) this.f63458Q, this.f63453L, this.f63454M)), composer2, 1572864, 58);
                    }
                } else {
                    C28655q c28655q5 = (C28655q) composer2;
                    c28655q5.m87150e0(-443512897);
                    C14931b c14931b2 = (C14931b) c28655q5.m87161k(AbstractC14936g.f55706c);
                    c28655q5.m87173q(false);
                    AbstractC17269i.m48898k(this.f63460x, null, c14931b2.f55663b, 0L, null, 0.0f, AbstractC37817c.m121344e(1908841358, composer2, new C16529w((Function3) this.f63455N, (InterfaceC2994c0) this.f63456O, this.f63461y, this.f63462z, this.f63446E, this.f63447F, this.f63448G, this.f63449H, this.f63450I, this.f63451J, this.f63452K, (Function1) this.f63457P, (Function1) this.f63458Q, this.f63453L, this.f63454M)), composer2, 1572864, 58);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C16504h(C16845k c16845k, InterfaceC4339a interfaceC4339a, Modifier modifier, C12991u0 c12991u0, C16508j c16508j, C16845k c16845k2, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Function1 function3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, AbstractC37713e1 abstractC37713e1, InterfaceC28601c1 interfaceC28601c1) {
        this.f63455N = c16845k;
        this.f63448G = interfaceC4339a;
        this.f63460x = modifier;
        this.f63462z = c12991u0;
        this.f63447F = c16508j;
        this.f63456O = c16845k2;
        this.f63461y = function1;
        this.f63451J = interfaceC4351m;
        this.f63446E = function2;
        this.f63449H = interfaceC4339a2;
        this.f63450I = interfaceC4339a3;
        this.f63452K = function3;
        this.f63453L = interfaceC4339a4;
        this.f63457P = interfaceC4339a5;
        this.f63454M = abstractC37713e1;
        this.f63458Q = interfaceC28601c1;
    }
}
