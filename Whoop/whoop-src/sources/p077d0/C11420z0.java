package p077d0;

import bc3.AbstractC3006f0;
import cz.C11194d;
import l83.C23454a0;
import p390p1.C28633k1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d0.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11420z0 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C11421z1 f36625E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36626w = 1;

    /* JADX INFO: renamed from: x */
    public int f36627x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11350f1 f36628y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f36629z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11420z0(C11350f1 c11350f1, Object obj, C11421z1 c11421z1, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f36628y = c11350f1;
        this.f36629z = obj;
        this.f36625E = c11421z1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f36626w) {
            case 0:
                return new C11420z0(this.f36625E, this.f36628y, this.f36629z, interfaceC30057d);
            default:
                return new C11420z0(this.f36628y, this.f36629z, this.f36625E, interfaceC30057d);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f36626w) {
            case 0:
                break;
        }
        return ((C11420z0) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        float f13;
        switch (this.f36626w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f36627x;
                C11421z1 c11421z1 = this.f36625E;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11194d c11194d = new C11194d(this.f36628y, this.f36629z, c11421z1, (InterfaceC30057d) null);
                    this.f36627x = 1;
                    if (AbstractC3006f0.m8719m(c11194d, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                c11421z1.m30667i();
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f36627x;
                C11421z1 c11421z2 = this.f36625E;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11350f1 c11350f1 = this.f36628y;
                    c11350f1.m30583M0();
                    C28633k1 c28633k1 = c11350f1.f36394y;
                    c11350f1.f36388M = Long.MIN_VALUE;
                    c11350f1.m30586Q0(0.0f);
                    Object value = c11350f1.f36395z.getValue();
                    Object obj2 = this.f36629z;
                    if (obj2.equals(value)) {
                        f13 = -4.0f;
                    } else {
                        f13 = obj2.equals(c28633k1.getValue()) ? -5.0f : -3.0f;
                    }
                    c11421z2.m30674p(obj2);
                    c11421z2.m30672n(0L);
                    c28633k1.setValue(obj2);
                    c11350f1.m30586Q0(0.0f);
                    c11350f1.mo2414B0(obj2);
                    c11421z2.m30668j(f13);
                    if (f13 == -3.0f) {
                        this.f36627x = 1;
                        if (C11350f1.m30580K0(c11350f1, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                c11421z2.m30667i();
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11420z0(C11421z1 c11421z1, C11350f1 c11350f1, Object obj, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f36625E = c11421z1;
        this.f36628y = c11350f1;
        this.f36629z = obj;
    }
}
