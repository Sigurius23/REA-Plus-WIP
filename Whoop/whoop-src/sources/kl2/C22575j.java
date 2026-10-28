package kl2;

import bc3.InterfaceC2994c0;
import in1.InterfaceC18722b;
import ln1.AbstractC24539q;
import lx2.AbstractC24796a;
import nl2.C26816c;
import ny2.AbstractC27299a;
import ox2.AbstractC28462h;
import p163g1.C15199y3;
import p715kotlin.jvm.functions.Function1;
import p733ry2.AbstractC31916e;
import qu2.AbstractC30640h;
import uu2.AbstractC35261l;

/* JADX INFO: renamed from: kl2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C22575j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88825w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f88826x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f88827y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15199y3 f88828z;

    public /* synthetic */ C22575j(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, int i13) {
        this.f88825w = i13;
        this.f88827y = interfaceC2994c0;
        this.f88828z = c15199y3;
        this.f88826x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f88825w) {
            case 0:
                return AbstractC22576k.m65349L(this.f88826x, this.f88827y, this.f88828z, (C26816c.e) obj);
            case 1:
                return AbstractC22576k.m65350M(this.f88826x, this.f88827y, this.f88828z, obj);
            case 2:
                return AbstractC24539q.m71495F(this.f88827y, this.f88826x, this.f88828z, (InterfaceC18722b) obj);
            case 3:
                return AbstractC28462h.m86319D(this.f88827y, this.f88828z, this.f88826x, (AbstractC24796a) obj);
            case 4:
                return AbstractC28462h.m86321F(this.f88827y, this.f88828z, this.f88826x, (AbstractC24796a) obj);
            case 5:
                return AbstractC30640h.m94106Z(this.f88826x, this.f88827y, this.f88828z, obj);
            case 6:
                return AbstractC31916e.m99340x(this.f88827y, this.f88826x, this.f88828z, (AbstractC27299a) obj);
            case 7:
                return AbstractC35261l.m111768M(this.f88827y, this.f88828z, this.f88826x, obj);
            default:
                return AbstractC35261l.m111769N(this.f88827y, this.f88828z, this.f88826x, obj);
        }
    }

    public /* synthetic */ C22575j(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C15199y3 c15199y3, int i13) {
        this.f88825w = i13;
        this.f88827y = interfaceC2994c0;
        this.f88826x = function1;
        this.f88828z = c15199y3;
    }

    public /* synthetic */ C22575j(Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, int i13) {
        this.f88825w = i13;
        this.f88826x = function1;
        this.f88827y = interfaceC2994c0;
        this.f88828z = c15199y3;
    }
}
