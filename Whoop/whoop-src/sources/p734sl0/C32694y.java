package p734sl0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import nl0.C26804f;
import p027b3.InterfaceC2464x2;
import p163g1.C15199y3;
import p411q2.InterfaceC29805a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: sl0.y */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32694y implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135775w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f135776x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f135777y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f135778z;

    public /* synthetic */ C32694y(Object obj, Object obj2, Object obj3, int i13) {
        this.f135775w = i13;
        this.f135777y = obj;
        this.f135778z = obj2;
        this.f135776x = obj3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f135775w) {
            case 0:
                return AbstractC32686w.l.m102559j((InterfaceC4339a) this.f135777y, (C32659q) this.f135778z, (C26804f) this.f135776x);
            case 1:
                return AbstractC32650o0.m102083u((C22669g0) this.f135777y, (C26804f) this.f135776x, (Function1) this.f135778z);
            case 2:
                return AbstractC32679u0.m102373f0((InterfaceC2994c0) this.f135777y, (C15199y3) this.f135778z, (InterfaceC2464x2) this.f135776x);
            default:
                return AbstractC32626j1.m101898h((InterfaceC29805a) this.f135777y, (Function1) this.f135778z, (String) this.f135776x);
        }
    }

    public /* synthetic */ C32694y(C22669g0 c22669g0, C26804f c26804f, Function1 function1) {
        this.f135775w = 1;
        this.f135777y = c22669g0;
        this.f135776x = c26804f;
        this.f135778z = function1;
    }
}
