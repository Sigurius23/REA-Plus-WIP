package p390p1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p1.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C28658q2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f115934E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115935w;

    /* JADX INFO: renamed from: x */
    public int f115936x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f115937y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f115938z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28658q2(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f115935w = i13;
        this.f115938z = interfaceC4351m;
        this.f115934E = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f115935w) {
            case 0:
                C28658q2 c28658q2 = new C28658q2(this.f115938z, this.f115934E, interfaceC30057d, 0);
                c28658q2.f115937y = obj;
                return c28658q2;
            default:
                C28658q2 c28658q3 = new C28658q2(this.f115938z, this.f115934E, interfaceC30057d, 1);
                c28658q3.f115937y = obj;
                return c28658q3;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f115935w) {
            case 0:
                break;
        }
        return ((C28658q2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f115935w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f115936x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28665s1 c28665s1 = new C28665s1(this.f115934E, ((InterfaceC2994c0) this.f115937y).getCoroutineContext());
                    this.f115936x = 1;
                    if (this.f115938z.invoke(c28665s1, this) == enumC31071a) {
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
                int i14 = this.f115936x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28665s1 c28665s2 = new C28665s1(this.f115934E, ((InterfaceC2994c0) this.f115937y).getCoroutineContext());
                    this.f115936x = 1;
                    if (this.f115938z.invoke(c28665s2, this) == enumC31071a2) {
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
