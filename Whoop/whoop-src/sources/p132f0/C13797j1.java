package p132f0;

import e93.AbstractC12889b;
import i93.InterfaceC18280f;
import java.util.List;
import l83.C23454a0;
import p209i3.AbstractC18041w;
import p209i3.C18026h;
import p209i3.InterfaceC18044z;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;
import xq2.AbstractC38554c1;

/* JADX INFO: renamed from: f0.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13797j1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49229w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f49230x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f49231y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f49232z;

    public /* synthetic */ C13797j1(float f13, InterfaceC18280f interfaceC18280f, int i13) {
        this.f49231y = f13;
        this.f49232z = interfaceC18280f;
        this.f49230x = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f49229w) {
            case 0:
                InterfaceC18280f interfaceC18280f = (InterfaceC18280f) this.f49232z;
                AbstractC18041w.m51809h((InterfaceC18044z) obj, new C18026h(((Number) AbstractC12889b.m36288r(Float.valueOf(this.f49231y), interfaceC18280f)).floatValue(), interfaceC18280f, this.f49230x));
                return C23454a0.f92919a;
            default:
                return AbstractC38554c1.m123574a0(this.f49230x, this.f49231y, (List) this.f49232z, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C13797j1(float f13, List list, int i13) {
        this.f49230x = i13;
        this.f49231y = f13;
        this.f49232z = list;
    }
}
