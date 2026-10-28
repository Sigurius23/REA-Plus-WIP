package pt2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import p163g1.C15199y3;
import p715kotlin.jvm.functions.Function1;
import v41.AbstractC35664f;

/* JADX INFO: renamed from: pt2.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29525g implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f120169E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC35664f.a f120170F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120171w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15199y3 f120172x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f120173y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f120174z;

    public /* synthetic */ C29525g(C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, Function1 function1, Function1 function2, AbstractC35664f.a aVar, int i13) {
        this.f120171w = i13;
        this.f120172x = c15199y3;
        this.f120173y = interfaceC2994c0;
        this.f120174z = function1;
        this.f120169E = function2;
        this.f120170F = aVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f120171w) {
            case 0:
                return AbstractC29527i.m90256a0(this.f120172x, this.f120173y, this.f120174z, this.f120169E, this.f120170F);
            default:
                return AbstractC29530l.m90311P(this.f120172x, this.f120173y, this.f120174z, this.f120169E, this.f120170F);
        }
    }
}
