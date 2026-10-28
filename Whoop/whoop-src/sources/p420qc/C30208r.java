package p420qc;

import l83.C23454a0;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C30208r implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f123659w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30211u f123660x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C30207q f123661y;

    public /* synthetic */ C30208r(C30211u c30211u, C30207q c30207q, int i13) {
        this.f123659w = i13;
        this.f123660x = c30211u;
        this.f123661y = c30207q;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC33687a _connection = (InterfaceC33687a) obj;
        switch (this.f123659w) {
            case 0:
                AbstractC22676k.m65750j(_connection, "_connection");
                this.f123660x.f123666b.insert(_connection, this.f123661y);
                break;
            default:
                AbstractC22676k.m65750j(_connection, "_connection");
                this.f123660x.f123667c.handle(_connection, this.f123661y);
                break;
        }
        return C23454a0.f92919a;
    }
}
