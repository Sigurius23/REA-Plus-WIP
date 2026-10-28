package dn0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.membership.management.navigation.AbstractC9127b;
import com.whoop.navigation.C9598e;
import ep1.AbstractC13414i;
import hp1.C17543c;
import j02.C21148j;
import j72.C21396a;
import kd1.AbstractC22390d;
import l72.AbstractC23396c;
import nx1.AbstractC27220b;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p668z1.C39967p;
import p71.AbstractC28956b;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32597d2;
import uw0.AbstractC35302l;
import v41.AbstractC35664f;
import zg0.C40628k;

/* JADX INFO: renamed from: dn0.k */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12211k implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f40835E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40836w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f40837x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f40838y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f40839z;

    public /* synthetic */ C12211k(InterfaceC4339a interfaceC4339a, boolean z4, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        this.f40836w = 8;
        this.f40838y = interfaceC4339a;
        this.f40837x = z4;
        this.f40839z = interfaceC2994c0;
        this.f40835E = aVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f40836w) {
            case 0:
                return AbstractC12216p.m33893T(this.f40837x, (C12209i) this.f40838y, (Function1) this.f40839z, (Function1) this.f40835E);
            case 1:
                return AbstractC13414i.m37974q(this.f40837x, (C39967p) this.f40838y, (C17543c) this.f40839z, (InterfaceC28593a1) this.f40835E);
            case 2:
                return AbstractC22390d.m64396G(this.f40837x, (C21148j) this.f40838y, (InterfaceC4339a) this.f40839z, (InterfaceC28601c1) this.f40835E);
            case 3:
                return AbstractC23396c.m67711D((C21396a) this.f40838y, (Function1) this.f40839z, this.f40837x, (Function1) this.f40835E);
            case 4:
                return AbstractC27220b.m81960j(this.f40837x, (Function1) this.f40839z, (AbstractC9127b) this.f40838y, (Function1) this.f40835E);
            case 5:
                return AbstractC28956b.m87932q(this.f40837x, (C9598e) this.f40838y, (Function1) this.f40839z, (InterfaceC28601c1) this.f40835E);
            case 6:
                return AbstractC32597d2.m101681J(this.f40837x, (C40628k) this.f40838y, (InterfaceC4351m) this.f40839z, (InterfaceC4351m) this.f40835E);
            case 7:
                return AbstractC32597d2.m101682K(this.f40837x, (C40628k) this.f40838y, (Function1) this.f40839z, (InterfaceC4351m) this.f40835E);
            default:
                return AbstractC35302l.m112033r((InterfaceC4339a) this.f40838y, this.f40837x, (InterfaceC2994c0) this.f40839z, (AbstractC35664f.a) this.f40835E);
        }
    }

    public /* synthetic */ C12211k(C21396a c21396a, Function1 function1, boolean z4, Function1 function2) {
        this.f40836w = 3;
        this.f40838y = c21396a;
        this.f40839z = function1;
        this.f40837x = z4;
        this.f40835E = function2;
    }

    public /* synthetic */ C12211k(boolean z4, Object obj, Object obj2, Object obj3, int i13) {
        this.f40836w = i13;
        this.f40837x = z4;
        this.f40838y = obj;
        this.f40839z = obj2;
        this.f40835E = obj3;
    }

    public /* synthetic */ C12211k(boolean z4, Function1 function1, AbstractC9127b abstractC9127b, Function1 function2) {
        this.f40836w = 4;
        this.f40837x = z4;
        this.f40839z = function1;
        this.f40838y = abstractC9127b;
        this.f40835E = function2;
    }
}
