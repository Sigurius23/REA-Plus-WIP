package ev2;

import j93.AbstractC21478l0;
import java.util.Map;
import l83.C23454a0;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p133f1.C13977s1;
import p164g2.C15247s;
import p181h2.C16617b;
import p238j0.InterfaceC21083i;
import p329n0.InterfaceC26064q;
import p412q3.C29875i;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p510u0.C34362v;
import p510u0.EnumC34318g0;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ev2.s */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13710s implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f48605E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f48606F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f48607G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48608w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f48609x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f48610y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f48611z;

    public /* synthetic */ C13710s(InterfaceC25312u interfaceC25312u, Map map, boolean z4, InterfaceC21083i interfaceC21083i, Function1 function1, boolean z13) {
        this.f48611z = interfaceC25312u;
        this.f48605E = map;
        this.f48609x = z4;
        this.f48606F = interfaceC21083i;
        this.f48607G = function1;
        this.f48610y = z13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2464x2 interfaceC2464x2;
        switch (this.f48608w) {
            case 0:
                return AbstractC13712u.m38765X((InterfaceC25312u) this.f48611z, (Map) this.f48605E, this.f48609x, (InterfaceC21083i) this.f48606F, (Function1) this.f48607G, this.f48610y, (InterfaceC26064q) obj);
            default:
                C34354s0 c34354s0 = (C34354s0) this.f48611z;
                C15247s c15247s = (C15247s) this.f48605E;
                C13977s1 c13977s1 = (C13977s1) this.f48606F;
                InterfaceC29884r interfaceC29884r = (InterfaceC29884r) this.f48607G;
                C16617b c16617b = (C16617b) obj;
                if (!c34354s0.m108660b()) {
                    C15247s.m43350c(c15247s);
                } else if (!this.f48609x && (interfaceC2464x2 = c34354s0.f144309c) != null) {
                    ((C2463x1) interfaceC2464x2).m7443b();
                }
                if (c34354s0.m108660b() && this.f48610y) {
                    if (c34354s0.m108659a() != EnumC34318g0.f144087x) {
                        C34346p1 c34346p1M108662d = c34354s0.m108662d();
                        if (c34346p1M108662d != null) {
                            long j7 = c16617b.f63937a;
                            C29875i c29875i = c34354s0.f144310d;
                            C34362v c34362v = c34354s0.f144328v;
                            int iMo15743n = interfaceC29884r.mo15743n(c34346p1M108662d.m108649b(j7, true));
                            c34362v.invoke(C29891y.m91511b((C29891y) c29875i.f122095w, null, AbstractC21478l0.m60431f(iMo15743n, iMo15743n), 5));
                            if (c34354s0.f144307a.f144060a.f92135x.length() > 0) {
                                c34354s0.f144317k.setValue(EnumC34318g0.f144088y);
                            }
                        }
                    } else {
                        c13977s1.m39777g(c16617b);
                    }
                }
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C13710s(C34354s0 c34354s0, C15247s c15247s, boolean z4, boolean z13, C13977s1 c13977s1, InterfaceC29884r interfaceC29884r) {
        this.f48611z = c34354s0;
        this.f48605E = c15247s;
        this.f48609x = z4;
        this.f48610y = z13;
        this.f48606F = c13977s1;
        this.f48607G = interfaceC29884r;
    }
}
