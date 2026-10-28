package p180h0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p132f0.EnumC13840z0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.s2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16453s2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63226w;

    /* JADX INFO: renamed from: x */
    public int f63227x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16473w2 f63228y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f63229z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16453s2(C16473w2 c16473w2, long j7, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f63226w = i13;
        this.f63228y = c16473w2;
        this.f63229z = j7;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f63226w) {
            case 0:
                return new C16453s2(this.f63228y, this.f63229z, interfaceC30057d, 0);
            case 1:
                return new C16453s2(this.f63228y, this.f63229z, interfaceC30057d, 1);
            default:
                return new C16453s2(this.f63228y, this.f63229z, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f63226w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C16453s2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f63226w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f63227x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16372c3 c16372c3 = this.f63228y.f63298e0;
                    this.f63227x = 1;
                    if (c16372c3.m46569b(this.f63229z, false, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f63227x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16372c3 c16372c4 = this.f63228y.f63298e0;
                    EnumC13840z0 enumC13840z0 = EnumC13840z0.f49375x;
                    C16458t2 c16458t2 = new C16458t2(this.f63229z, null);
                    this.f63227x = 1;
                    if (c16372c4.m46573f(enumC13840z0, c16458t2, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f63227x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16372c3 c16372c5 = this.f63228y.f63298e0;
                    this.f63227x = 1;
                    if (c16372c5.m46569b(this.f63229z, true, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
