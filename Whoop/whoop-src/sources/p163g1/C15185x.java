package p163g1;

import c93.InterfaceC4351m;
import h20.C16621a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C15185x extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56986w = 1;

    /* JADX INFO: renamed from: x */
    public int f56987x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f56988y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC23459e f56989z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15185x(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f56989z = interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r0v6, types: [c93.m, s83.i] */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f56986w) {
            case 0:
                return new C15185x((C15205z) this.f56988y, (AbstractC32275i) this.f56989z, (InterfaceC30057d) obj3).invokeSuspend(C23454a0.f92919a);
            case 1:
                C15185x c15185x = new C15185x((InterfaceC4351m) this.f56989z, (InterfaceC30057d) obj3);
                c15185x.f56988y = (C16621a) obj2;
                return c15185x.invokeSuspend(C23454a0.f92919a);
            default:
                return new C15185x((C15205z) this.f56988y, (AbstractC32275i) this.f56989z, (InterfaceC30057d) obj3, (byte) 0).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v8, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f56986w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56987x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15195y c15195y = (C15195y) ((C15205z) this.f56988y).f57091b;
                    ?? r10 = (AbstractC32275i) this.f56989z;
                    this.f56987x = 1;
                    if (r10.invoke(c15195y, this) == enumC31071a) {
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
                int i14 = this.f56987x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C16621a c16621a = (C16621a) this.f56988y;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f56989z;
                this.f56987x = 1;
                Object objInvoke = interfaceC4351m.invoke(c16621a, this);
                return objInvoke == enumC31071a2 ? enumC31071a2 : objInvoke;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f56987x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15195y c15195y2 = (C15195y) ((C15205z) this.f56988y).f57091b;
                    ?? r14 = (AbstractC32275i) this.f56989z;
                    this.f56987x = 1;
                    if (r14.invoke(c15195y2, this) == enumC31071a3) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15185x(C15205z c15205z, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f56988y = c15205z;
        this.f56989z = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15185x(C15205z c15205z, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d, byte b) {
        super(3, interfaceC30057d);
        this.f56988y = c15205z;
        this.f56989z = (AbstractC32275i) interfaceC4351m;
    }
}
