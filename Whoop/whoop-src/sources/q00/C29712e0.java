package q00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: q00.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29712e0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC38794c0 f121491E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121492w;

    /* JADX INFO: renamed from: x */
    public int f121493x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f121494y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f121495z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29712e0(Function1 function1, Function1 function2, AbstractC38794c0 abstractC38794c0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f121492w = i13;
        this.f121494y = function1;
        this.f121495z = function2;
        this.f121491E = abstractC38794c0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f121492w) {
            case 0:
                return new C29712e0(this.f121494y, this.f121495z, this.f121491E, interfaceC30057d, 0);
            case 1:
                return new C29712e0(this.f121494y, this.f121495z, this.f121491E, interfaceC30057d, 1);
            default:
                return new C29712e0(this.f121494y, this.f121495z, this.f121491E, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f121492w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C29712e0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f121492w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f121493x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f121493x = 1;
                    if (this.f121494y.invoke(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f121495z.invoke(this.f121491E);
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f121493x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f121493x = 1;
                    if (this.f121494y.invoke(this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f121495z.invoke(this.f121491E);
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f121493x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f121493x = 1;
                    if (this.f121494y.invoke(this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f121495z.invoke(this.f121491E);
                return C23454a0.f92919a;
        }
    }
}
