package p133f1;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f1.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13947i1 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49718w;

    /* JADX INFO: renamed from: x */
    public int f49719x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13977s1 f49720y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13947i1(C13977s1 c13977s1, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f49718w = i13;
        this.f49720y = c13977s1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f49718w) {
            case 0:
                return new C13947i1(this.f49720y, interfaceC30057d, 0);
            default:
                return new C13947i1(this.f49720y, interfaceC30057d, 1);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f49718w) {
            case 0:
                break;
        }
        return ((C13947i1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49718w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f49719x;
                C13977s1 c13977s1 = this.f49720y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                this.f49719x = 1;
                if (c13977s1.m39788r(this) == enumC31071a) {
                    return enumC31071a;
                }
                this.f49719x = 2;
                if (C13977s1.m39772b(c13977s1, this) == enumC31071a) {
                    return enumC31071a;
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f49719x;
                C13977s1 c13977s2 = this.f49720y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    c13977s2.f49844B = true;
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                this.f49719x = 1;
                if (c13977s2.m39788r(this) == enumC31071a2) {
                    return enumC31071a2;
                }
                this.f49719x = 2;
                if (C13977s1.m39772b(c13977s2, this) == enumC31071a2) {
                    return enumC31071a2;
                }
                c13977s2.f49844B = true;
                return C23454a0.f92919a;
        }
    }
}
