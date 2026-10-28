package f31;

import c93.InterfaceC4353o;
import java.util.List;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f31.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14045b implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f50118E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50119w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f50120x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f50121y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4353o f50122z;

    public /* synthetic */ C14045b(List list, Object obj, InterfaceC4353o interfaceC4353o, int i13, int i14) {
        this.f50119w = i14;
        this.f50120x = list;
        this.f50121y = obj;
        this.f50122z = interfaceC4353o;
        this.f50118E = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f50119w) {
            case 0:
                return AbstractC14046c.m39969i(this.f50120x, this.f50121y, this.f50122z, this.f50118E, (InterfaceC26064q) obj);
            default:
                return AbstractC14046c.m39966f(this.f50120x, this.f50121y, this.f50122z, this.f50118E, (InterfaceC26064q) obj);
        }
    }
}
