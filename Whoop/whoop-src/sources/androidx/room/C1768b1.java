package androidx.room;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.room.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1768b1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6964w = 0;

    /* JADX INFO: renamed from: x */
    public int f6965x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f6966y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f6967z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768b1(Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6967z = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f6964w) {
            case 0:
                C1768b1 c1768b1 = new C1768b1(this.f6967z, interfaceC30057d);
                c1768b1.f6966y = obj;
                return c1768b1;
            default:
                C1768b1 c1768b2 = new C1768b1(interfaceC30057d, this.f6967z);
                c1768b2.f6966y = obj;
                return c1768b2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6964w) {
            case 0:
                return ((C1768b1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C1768b1) create((InterfaceC1837v1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6964w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f6965x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                if (((InterfaceC2994c0) this.f6966y).getCoroutineContext().get(C1831t1.f7178x) == null) {
                    throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
                }
                this.f6965x = 1;
                Object objInvoke = this.f6967z.invoke(this);
                return objInvoke == enumC31071a ? enumC31071a : objInvoke;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f6965x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f6965x = 1;
                Object objInvoke2 = this.f6967z.invoke(this);
                return objInvoke2 == enumC31071a2 ? enumC31071a2 : objInvoke2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768b1(InterfaceC30057d interfaceC30057d, Function1 function1) {
        super(2, interfaceC30057d);
        this.f6967z = function1;
    }
}
