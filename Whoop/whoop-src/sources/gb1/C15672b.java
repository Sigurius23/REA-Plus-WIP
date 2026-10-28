package gb1;

import c93.InterfaceC4339a;
import is0.AbstractC20916x;
import p134f2.C14015d;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gb1.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15672b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58828w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f58829x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f58830y;

    public /* synthetic */ C15672b(float f13, int i13, InterfaceC4339a interfaceC4339a) {
        this.f58828w = i13;
        this.f58829x = interfaceC4339a;
        this.f58830y = f13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58828w) {
            case 0:
                return AbstractC15674c.m44087k(this.f58829x, this.f58830y, (InterfaceC22129c) obj);
            case 1:
                return AbstractC20916x.m57936S(this.f58829x, this.f58830y, (InterfaceC22131e) obj);
            default:
                return AbstractC20916x.m57935R(this.f58830y, this.f58829x, (C14015d) obj);
        }
    }

    public /* synthetic */ C15672b(float f13, InterfaceC4339a interfaceC4339a) {
        this.f58828w = 2;
        this.f58830y = f13;
        this.f58829x = interfaceC4339a;
    }
}
