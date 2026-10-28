package h00;

import h40.C16845k;
import l83.C23454a0;
import p163g1.C15199y3;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C16500f extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63421w;

    /* JADX INFO: renamed from: x */
    public int f63422x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16845k f63423y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16500f(C16845k c16845k, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f63421w = i13;
        this.f63423y = c16845k;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f63421w) {
            case 0:
                return new C16500f(this.f63423y, interfaceC30057d, 0);
            case 1:
                return new C16500f(this.f63423y, interfaceC30057d, 1);
            default:
                return new C16500f(this.f63423y, interfaceC30057d, 2);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f63421w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C16500f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f63421w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f63422x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f63422x = 1;
                    if (this.f63423y.m47442b(this) == enumC31071a) {
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
                int i14 = this.f63422x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15199y3 c15199y3 = this.f63423y.f64729a;
                    this.f63422x = 1;
                    if (c15199y3.m43223d(this) == enumC31071a2) {
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
                int i15 = this.f63422x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15199y3 c15199y4 = this.f63423y.f64729a;
                    this.f63422x = 1;
                    if (c15199y4.m43225f(this) == enumC31071a3) {
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
