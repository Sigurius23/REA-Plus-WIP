package p040c0;

import p390p1.InterfaceC28670t2;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C3787w extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15441w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3789x f15442x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3787w(C3789x c3789x, int i13) {
        super(1);
        this.f15441w = i13;
        this.f15442x = c3789x;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15441w) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C3789x c3789x = this.f15442x;
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) c3789x.f15451e.m129g(c3789x.f15447a.f36633d.getValue());
                long j7 = interfaceC28670t2 != null ? ((C39180l) interfaceC28670t2.getValue()).f168422a : 0L;
                long j13 = iIntValue;
                return Integer.valueOf((-((int) (c3789x.f15448b.mo7156a((j13 << 32) | (j13 & 4294967295L), j7, EnumC39181m.f168423w) >> 32))) - iIntValue);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                C3789x c3789x2 = this.f15442x;
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) c3789x2.f15451e.m129g(c3789x2.f15447a.f36633d.getValue());
                long j14 = interfaceC28670t3 != null ? ((C39180l) interfaceC28670t3.getValue()).f168422a : 0L;
                long j15 = iIntValue2;
                return Integer.valueOf((-((int) (c3789x2.f15448b.mo7156a((j15 << 32) | (j15 & 4294967295L), j14, EnumC39181m.f168423w) >> 32))) + ((int) (j14 >> 32)));
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                C3789x c3789x3 = this.f15442x;
                InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) c3789x3.f15451e.m129g(c3789x3.f15447a.f36633d.getValue());
                long j16 = interfaceC28670t4 != null ? ((C39180l) interfaceC28670t4.getValue()).f168422a : 0L;
                long j17 = iIntValue3;
                return Integer.valueOf((-((int) (c3789x3.f15448b.mo7156a((j17 << 32) | (j17 & 4294967295L), j16, EnumC39181m.f168423w) & 4294967295L))) - iIntValue3);
            default:
                int iIntValue4 = ((Number) obj).intValue();
                C3789x c3789x4 = this.f15442x;
                InterfaceC28670t2 interfaceC28670t5 = (InterfaceC28670t2) c3789x4.f15451e.m129g(c3789x4.f15447a.f36633d.getValue());
                long j18 = interfaceC28670t5 != null ? ((C39180l) interfaceC28670t5.getValue()).f168422a : 0L;
                long j19 = iIntValue4;
                return Integer.valueOf((-((int) (c3789x4.f15448b.mo7156a((j19 << 32) | (j19 & 4294967295L), j18, EnumC39181m.f168423w) & 4294967295L))) + ((int) (j18 & 4294967295L)));
        }
    }
}
