package c11;

import e93.AbstractC12889b;
import l83.C23454a0;
import p270k2.InterfaceC22131e;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c11.g */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3840g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15713w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f15714x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28670t2 f15715y;

    public /* synthetic */ C3840g(long j7, InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f15713w = i13;
        this.f15714x = j7;
        this.f15715y = interfaceC28670t2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15713w) {
            case 0:
                return AbstractC3841h.m11700F(this.f15714x, this.f15715y, (InterfaceC22131e) obj);
            case 1:
                InterfaceC22131e.m63383i0((InterfaceC22131e) obj, this.f15714x, 0L, 0L, ((Number) this.f15715y.getValue()).floatValue(), null, 0, 118);
                return C23454a0.f92919a;
            case 2:
                InterfaceC22131e.m63383i0((InterfaceC22131e) obj, this.f15714x, 0L, 0L, AbstractC12889b.m36283m(((Number) this.f15715y.getValue()).floatValue(), 0.0f, 1.0f), null, 0, 118);
                return C23454a0.f92919a;
            default:
                InterfaceC22131e.m63383i0((InterfaceC22131e) obj, this.f15714x, 0L, 0L, AbstractC12889b.m36283m(((Number) this.f15715y.getValue()).floatValue(), 0.0f, 1.0f), null, 0, 118);
                return C23454a0.f92919a;
        }
    }
}
