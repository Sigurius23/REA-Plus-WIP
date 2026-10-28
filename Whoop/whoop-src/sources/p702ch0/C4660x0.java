package p702ch0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import j72.C21407l;
import j72.C21408m;
import l72.AbstractC23409p;
import p077d0.InterfaceC11372l;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p390p1.InterfaceC28601c1;
import p636y3.InterfaceC39171c;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import wb0.AbstractC37038i;
import yb0.AbstractC39388k;

/* JADX INFO: renamed from: ch0.x0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4660x0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f19042E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f19043F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19044w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f19045x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f19046y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f19047z;

    public /* synthetic */ C4660x0(int i13, Object obj, Object obj2, Object obj3, Object obj4, boolean z4) {
        this.f19044w = i13;
        this.f19045x = z4;
        this.f19046y = obj;
        this.f19047z = obj2;
        this.f19042E = obj3;
        this.f19043F = obj4;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f19044w) {
            case 0:
                return AbstractC4610c1.m14338I((InterfaceC2994c0) this.f19046y, (C15199y3) this.f19047z, this.f19045x, (InterfaceC4339a) this.f19043F, (C15199y3) this.f19042E);
            case 1:
                return new C15199y3((EnumC15209z3) this.f19046y, (InterfaceC39171c) this.f19047z, (Function1) this.f19042E, (InterfaceC11372l) this.f19043F, this.f19045x);
            case 2:
                return AbstractC23409p.m67900p(this.f19045x, (C39967p) this.f19046y, (C21407l) this.f19047z, (C21408m) this.f19042E, (Function1) this.f19043F);
            default:
                return AbstractC39388k.m125671O0(this.f19045x, (AbstractC37038i.d) this.f19046y, (Function1) this.f19047z, (InterfaceC28601c1) this.f19042E, (InterfaceC28601c1) this.f19043F);
        }
    }

    public /* synthetic */ C4660x0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, boolean z4, InterfaceC4339a interfaceC4339a, C15199y3 c15199y4) {
        this.f19044w = 0;
        this.f19046y = interfaceC2994c0;
        this.f19047z = c15199y3;
        this.f19045x = z4;
        this.f19043F = interfaceC4339a;
        this.f19042E = c15199y4;
    }

    public /* synthetic */ C4660x0(EnumC15209z3 enumC15209z3, InterfaceC39171c interfaceC39171c, Function1 function1, InterfaceC11372l interfaceC11372l, boolean z4) {
        this.f19044w = 1;
        this.f19046y = enumC15209z3;
        this.f19047z = interfaceC39171c;
        this.f19042E = function1;
        this.f19043F = interfaceC11372l;
        this.f19045x = z4;
    }
}
