package h00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.C38915o4;

/* JADX INFO: renamed from: h00.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C16528v extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63555w;

    /* JADX INFO: renamed from: x */
    public int f63556x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f63557y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16528v(int i13, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63555w = i13;
        this.f63557y = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f63555w) {
            case 0:
                return new C16528v(0, this.f63557y, interfaceC30057d);
            case 1:
                return new C16528v(1, this.f63557y, interfaceC30057d);
            case 2:
                return new C16528v(2, this.f63557y, interfaceC30057d);
            default:
                return new C16528v(3, this.f63557y, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63555w) {
            case 0:
                return ((C16528v) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C16528v) create((C38915o4) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C16528v) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C16528v) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f63555w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f63556x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f63556x = 1;
                    if (this.f63557y.invoke(this) == enumC31071a) {
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
                int i14 = this.f63556x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f63556x = 1;
                Object objInvoke = this.f63557y.invoke(this);
                return objInvoke == enumC31071a2 ? enumC31071a2 : objInvoke;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f63556x;
                try {
                    if (i15 == 0) {
                        AbstractC34132o.m107864I(obj);
                        Function1 function1 = this.f63557y;
                        this.f63556x = 1;
                        obj = function1.invoke(this);
                        if (obj == enumC31071a3) {
                            return enumC31071a3;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    break;
                } catch (CancellationException e5) {
                    obj = AbstractC34132o.m107888l(e5);
                } catch (Throwable th3) {
                    obj = AbstractC34132o.m107888l(th3);
                }
                return new C23468n(obj);
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f63556x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f63556x = 1;
                    if (this.f63557y.invoke(this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
