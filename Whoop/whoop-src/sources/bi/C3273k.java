package bi;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import coil3.network.HttpException;
import l83.C23454a0;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: bi.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C3273k extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12776w;

    /* JADX INFO: renamed from: x */
    public int f12777x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f12778y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC32275i f12779z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3273k(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f12776w = i13;
        switch (i13) {
            case 1:
                this.f12779z = (AbstractC32275i) interfaceC4351m;
                super(2, interfaceC30057d);
                break;
            case 2:
                this.f12779z = (AbstractC32275i) interfaceC4351m;
                super(2, interfaceC30057d);
                break;
            default:
                this.f12779z = (AbstractC32275i) interfaceC4351m;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f12776w) {
            case 0:
                C3273k c3273k = new C3273k(this.f12779z, interfaceC30057d, 0);
                c3273k.f12778y = obj;
                return c3273k;
            case 1:
                C3273k c3273k2 = new C3273k(this.f12779z, interfaceC30057d, 1);
                c3273k2.f12778y = obj;
                return c3273k2;
            default:
                C3273k c3273k3 = new C3273k(this.f12779z, interfaceC30057d, 2);
                c3273k3.f12778y = obj;
                return c3273k3;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12776w) {
            case 0:
                return ((C3273k) create((C3281s) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C3273k) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C3273k) create((AbstractC14134f) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v5, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v7, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f12776w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f12777x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C3281s c3281s = (C3281s) this.f12778y;
                int i14 = c3281s.f12810a;
                if ((200 > i14 || i14 >= 300) && i14 != 304) {
                    throw new HttpException("HTTP " + c3281s.f12810a);
                }
                this.f12777x = 1;
                Object objInvoke = this.f12779z.invoke(c3281s, this);
                return objInvoke == enumC31071a ? enumC31071a : objInvoke;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f12777x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f12778y;
                    this.f12777x = 1;
                    if (this.f12779z.invoke(interfaceC2994c0, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f12777x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C14129a c14129a = (C14129a) this.f12778y;
                    AbstractC34132o.m107864I(obj);
                    return c14129a;
                }
                AbstractC34132o.m107864I(obj);
                C14129a c14129aM40233c = ((AbstractC14134f) this.f12778y).m40233c();
                this.f12778y = c14129aM40233c;
                this.f12777x = 1;
                return this.f12779z.invoke(c14129aM40233c, this) == enumC31071a3 ? enumC31071a3 : c14129aM40233c;
        }
    }
}
