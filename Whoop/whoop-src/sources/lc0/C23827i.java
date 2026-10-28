package lc0;

import c93.InterfaceC4339a;
import jc0.C21604d;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lc0.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C23827i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94258w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f94259x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21604d.c.a f94260y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f94261z;

    public /* synthetic */ C23827i(C21604d.c.a aVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f94260y = aVar;
        this.f94259x = function1;
        this.f94261z = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f94258w) {
            case 0:
                return AbstractC23828j.m70015y(this.f94260y, this.f94259x, this.f94261z);
            default:
                return AbstractC23828j.m70016z(this.f94259x, this.f94260y, this.f94261z);
        }
    }

    public /* synthetic */ C23827i(Function1 function1, C21604d.c.a aVar, InterfaceC28601c1 interfaceC28601c1) {
        this.f94259x = function1;
        this.f94260y = aVar;
        this.f94261z = interfaceC28601c1;
    }
}
