package p133f1;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f1.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13979t0 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49874w;

    /* JADX INFO: renamed from: x */
    public int f49875x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13988w0 f49876y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13979t0(C13988w0 c13988w0, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f49874w = i13;
        this.f49876y = c13988w0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f49874w) {
            case 0:
                return new C13979t0(this.f49876y, interfaceC30057d, 0);
            default:
                return new C13979t0(this.f49876y, interfaceC30057d, 1);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f49874w) {
            case 0:
                break;
        }
        return ((C13979t0) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49874w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f49875x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f49875x = 1;
                    if (C13988w0.m39796a(this.f49876y, this) == enumC31071a) {
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
                int i14 = this.f49875x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f49875x = 1;
                    if (C13988w0.m39796a(this.f49876y, this) == enumC31071a2) {
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
