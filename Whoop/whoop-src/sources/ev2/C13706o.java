package ev2;

import dv2.InterfaceC12394e;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ev2.o */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13706o implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48591w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC12394e.b f48592x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f48593y;

    public /* synthetic */ C13706o(InterfaceC12394e.b bVar, Function1 function1) {
        this.f48592x = bVar;
        this.f48593y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f48591w) {
            case 0:
                return AbstractC13712u.m38796i0(this.f48593y, this.f48592x, obj);
            default:
                return AbstractC13712u.m38787f0(this.f48592x, this.f48593y, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C13706o(Function1 function1, InterfaceC12394e.b bVar) {
        this.f48593y = function1;
        this.f48592x = bVar;
    }
}
