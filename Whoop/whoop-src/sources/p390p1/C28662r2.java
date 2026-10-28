package p390p1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q40.C29963a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p1.r2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28662r2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f115949E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115950w;

    /* JADX INFO: renamed from: x */
    public int f115951x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f115952y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f115953z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28662r2(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f115950w = i13;
        this.f115953z = interfaceC4351m;
        this.f115949E = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f115950w) {
            case 0:
                C28662r2 c28662r2 = new C28662r2(this.f115953z, this.f115949E, interfaceC30057d, 0);
                c28662r2.f115952y = obj;
                return c28662r2;
            case 1:
                C28662r2 c28662r3 = new C28662r2(this.f115953z, this.f115949E, interfaceC30057d, 1);
                c28662r3.f115952y = obj;
                return c28662r3;
            default:
                C28662r2 c28662r4 = new C28662r2(this.f115953z, this.f115949E, interfaceC30057d, 2);
                c28662r4.f115952y = obj;
                return c28662r4;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f115950w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C28662r2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f115950w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f115951x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28665s1 c28665s1 = new C28665s1(this.f115949E, ((InterfaceC2994c0) this.f115952y).getCoroutineContext());
                    this.f115951x = 1;
                    if (this.f115953z.invoke(c28665s1, this) == enumC31071a) {
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
                int i14 = this.f115951x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28665s1 c28665s2 = new C28665s1(this.f115949E, ((InterfaceC2994c0) this.f115952y).getCoroutineContext());
                    this.f115951x = 1;
                    if (this.f115953z.invoke(c28665s2, this) == enumC31071a2) {
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
                int i15 = this.f115951x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C29963a c29963a = new C29963a(this.f115949E, ((InterfaceC2994c0) this.f115952y).getCoroutineContext());
                    this.f115951x = 1;
                    if (this.f115953z.invoke(c29963a, this) == enumC31071a3) {
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
