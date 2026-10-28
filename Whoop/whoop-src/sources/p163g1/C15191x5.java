package p163g1;

import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.x5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15191x5 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57009w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ float f57010x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f57011y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15191x5(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(3, interfaceC30057d);
        this.f57009w = i13;
        this.f57011y = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f57009w;
        float fFloatValue = ((Number) obj2).floatValue();
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj3;
        switch (i13) {
            case 0:
                C15191x5 c15191x5 = new C15191x5((InterfaceC28601c1) this.f57011y, interfaceC30057d, 0);
                c15191x5.f57010x = fFloatValue;
                C23454a0 c23454a0 = C23454a0.f92919a;
                c15191x5.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C15191x5 c15191x6 = new C15191x5((Function1) this.f57011y, interfaceC30057d, 1);
                c15191x6.f57010x = fFloatValue;
                C23454a0 c23454a1 = C23454a0.f92919a;
                c15191x6.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f57009w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f57011y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((Function1) ((InterfaceC28601c1) obj2).getValue()).invoke(new Float(this.f57010x));
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((Function1) obj2).invoke(new Float(this.f57010x));
                break;
        }
        return c23454a0;
    }
}
