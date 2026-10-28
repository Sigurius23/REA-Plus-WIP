package gb1;

import c93.InterfaceC4339a;
import p077d0.C11344e;
import p208i2.C17891j;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gb1.v */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15694v implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f58923E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58924w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f58925x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f58926y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f58927z;

    public /* synthetic */ C15694v(float f13, InterfaceC4339a interfaceC4339a, float f14, C17891j c17891j) {
        this.f58925x = f13;
        this.f58927z = interfaceC4339a;
        this.f58926y = f14;
        this.f58923E = c17891j;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58924w) {
            case 0:
                return AbstractC15695w.m44164g(this.f58925x, (InterfaceC4339a) this.f58927z, this.f58926y, (C17891j) this.f58923E, (InterfaceC22129c) obj);
            default:
                return AbstractC15697y.m44175h((C11344e) this.f58927z, (C17919x) this.f58923E, this.f58925x, this.f58926y, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C15694v(C11344e c11344e, C17919x c17919x, float f13, float f14) {
        this.f58927z = c11344e;
        this.f58923E = c17919x;
        this.f58925x = f13;
        this.f58926y = f14;
    }
}
