package androidx.lifecycle;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.lifecycle.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1561a0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6185w;

    /* JADX INFO: renamed from: x */
    public int f6186x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1565b0 f6187y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC32275i f6188z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1561a0(C1565b0 c1565b0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f6185w = i13;
        switch (i13) {
            case 1:
                this.f6187y = c1565b0;
                this.f6188z = (AbstractC32275i) interfaceC4351m;
                super(2, interfaceC30057d);
                break;
            default:
                this.f6187y = c1565b0;
                this.f6188z = (AbstractC32275i) interfaceC4351m;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r0v1, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f6185w) {
            case 0:
                return new C1561a0(this.f6187y, this.f6188z, interfaceC30057d, 0);
            default:
                return new C1561a0(this.f6187y, this.f6188z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f6185w) {
            case 0:
                break;
        }
        return ((C1561a0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6185w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f6186x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC1638x abstractC1638x = this.f6187y.f6190w;
                    this.f6186x = 1;
                    if (AbstractC1613o1.m5028r(abstractC1638x, EnumC1635w.f6327y, this.f6188z, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f6186x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC1638x abstractC1638x2 = this.f6187y.f6190w;
                    this.f6186x = 1;
                    if (AbstractC1613o1.m5028r(abstractC1638x2, EnumC1635w.f6323E, this.f6188z, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
