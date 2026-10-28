package mt2;

import c00.C3795a;
import c93.InterfaceC4339a;
import d00.C11433l;
import l83.C23454a0;
import nt2.C27133c;
import ot2.AbstractC28344m;
import p00.C28578o;
import p000.C31931s;
import p027b3.C2414n2;
import p027b3.InterfaceC2410m3;
import p114eb.C12987s0;
import p133f1.AbstractC13994y0;
import p133f1.C13977s1;
import p181h2.C16618c;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p298l8.AbstractC23420c;
import p322m7.C25158l0;
import p390p1.C28633k1;
import p412q3.C29867d0;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p442qy.C30765d;
import p510u0.AbstractC34339n0;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p510u0.EnumC34318g0;
import p599wz.C37755s1;
import p599wz.C37770y;
import p631xz.C38721f0;
import p635y2.InterfaceC39147y;
import p665yz.C39899b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mt2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C25942c implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f102462E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f102463F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f102464G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102465w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f102466x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f102467y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f102468z;

    public /* synthetic */ C25942c(C3795a c3795a, C11433l c11433l, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1) {
        this.f102462E = c3795a;
        this.f102463F = c11433l;
        this.f102466x = z4;
        this.f102467y = interfaceC4339a;
        this.f102468z = interfaceC4339a2;
        this.f102464G = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C29867d0 c29867d0;
        InterfaceC39147y interfaceC39147y;
        InterfaceC39147y interfaceC39147y2;
        switch (this.f102465w) {
            case 0:
                return AbstractC25944e.m76779w((AbstractC28344m) this.f102462E, (C27133c) this.f102463F, (InterfaceC4339a) this.f102467y, (InterfaceC4339a) this.f102468z, (C25945f) this.f102464G, this.f102466x, (C12987s0) obj);
            case 1:
                C3795a c3795a = (C3795a) this.f102462E;
                C11433l c11433l = (C11433l) this.f102463F;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f102467y;
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) this.f102468z;
                Function1 function1 = (Function1) this.f102464G;
                AbstractC23420c initializer = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer, "$this$initializer");
                return new C28578o(c11433l, (C38721f0) c3795a.f15516j.get(), c3795a.m11600b(), (C39899b) c3795a.f15474C.get(), (C30765d) c3795a.f15529u.get(), c3795a.f15508f, (C37755s1) c3795a.f15519k0.get(), this.f102466x, new C25158l0(1, c3795a.m11601c(), C37770y.class, "onVerificationSucceeded", "onVerificationSucceeded(Lcom/stripe/android/model/ConsumerSessionRefresh;)V", 0, 28), interfaceC4339a, interfaceC4339a2, function1);
            default:
                C34354s0 c34354s0 = (C34354s0) this.f102462E;
                C28633k1 c28633k1 = c34354s0.f144321o;
                InterfaceC2410m3 interfaceC2410m3 = (InterfaceC2410m3) this.f102463F;
                C13977s1 c13977s1 = (C13977s1) this.f102467y;
                C29891y c29891y = (C29891y) this.f102468z;
                InterfaceC29884r interfaceC29884r = (InterfaceC29884r) this.f102464G;
                InterfaceC39147y interfaceC39147y3 = (InterfaceC39147y) obj;
                c34354s0.f144314h = interfaceC39147y3;
                C34346p1 c34346p1M108662d = c34354s0.m108662d();
                if (c34346p1M108662d != null) {
                    c34346p1M108662d.f144283b = interfaceC39147y3;
                }
                if (this.f102466x) {
                    if (c34354s0.m108659a() == EnumC34318g0.f144087x) {
                        if (((Boolean) c34354s0.f144318l.getValue()).booleanValue() && ((Boolean) ((C2414n2) interfaceC2410m3).f9470c.getValue()).booleanValue()) {
                            c13977s1.m39787q();
                        } else {
                            c13977s1.m39784n();
                        }
                        c34354s0.f144319m.setValue(Boolean.valueOf(AbstractC13994y0.m39835x(c13977s1, true)));
                        c34354s0.f144320n.setValue(Boolean.valueOf(AbstractC13994y0.m39835x(c13977s1, false)));
                        c28633k1.setValue(Boolean.valueOf(C23283u0.m67357c(c29891y.f122126b)));
                    } else if (c34354s0.m108659a() == EnumC34318g0.f144088y) {
                        c28633k1.setValue(Boolean.valueOf(AbstractC13994y0.m39835x(c13977s1, true)));
                    }
                    AbstractC34339n0.m108641s(c34354s0, c29891y, interfaceC29884r);
                    C34346p1 c34346p1M108662d2 = c34354s0.m108662d();
                    if (c34346p1M108662d2 != null && (c29867d0 = c34354s0.f144311e) != null && c34354s0.m108660b() && (interfaceC39147y = c34346p1M108662d2.f144283b) != null && interfaceC39147y.mo3532g() && (interfaceC39147y2 = c34346p1M108662d2.f144284c) != null) {
                        C23277r0 c23277r0 = c34346p1M108662d2.f144282a;
                        C31931s c31931s = new C31931s(interfaceC39147y, 21);
                        C16618c c16618cM39837z = AbstractC13994y0.m39837z(interfaceC39147y);
                        C16618c c16618cMo3547r = interfaceC39147y.mo3547r(interfaceC39147y2, false);
                        if (AbstractC22676k.m65745e((C29867d0) c29867d0.f122086a.f122129b.get(), c29867d0)) {
                            c29867d0.f122087b.mo30724g(c29891y, interfaceC29884r, c23277r0, c31931s, c16618cM39837z, c16618cMo3547r);
                        }
                    }
                }
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C25942c(AbstractC28344m abstractC28344m, C27133c c27133c, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C25945f c25945f, boolean z4) {
        this.f102462E = abstractC28344m;
        this.f102463F = c27133c;
        this.f102467y = interfaceC4339a;
        this.f102468z = interfaceC4339a2;
        this.f102464G = c25945f;
        this.f102466x = z4;
    }

    public /* synthetic */ C25942c(C34354s0 c34354s0, boolean z4, InterfaceC2410m3 interfaceC2410m3, C13977s1 c13977s1, C29891y c29891y, InterfaceC29884r interfaceC29884r) {
        this.f102462E = c34354s0;
        this.f102466x = z4;
        this.f102463F = interfaceC2410m3;
        this.f102467y = c13977s1;
        this.f102468z = c29891y;
        this.f102464G = interfaceC29884r;
    }
}
