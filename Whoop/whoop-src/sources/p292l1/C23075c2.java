package p292l1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11344e;
import p161g.C14894a;
import p316m1.AbstractC24904h;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.c2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23075c2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91045w;

    /* JADX INFO: renamed from: x */
    public int f91046x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23081d2 f91047y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C14894a f91048z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23075c2(C23081d2 c23081d2, C14894a c14894a, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f91045w = i13;
        this.f91047y = c23081d2;
        this.f91048z = c14894a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f91045w) {
            case 0:
                return new C23075c2(this.f91047y, this.f91048z, interfaceC30057d, 0);
            default:
                return new C23075c2(this.f91047y, this.f91048z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f91045w) {
            case 0:
                break;
        }
        return ((C23075c2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f91045w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f91046x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e = this.f91047y.f91066e;
                    Float f13 = new Float(AbstractC24904h.f97555a.mo7226i(this.f91048z.f55564c));
                    this.f91046x = 1;
                    if (c11344e.m30551g(f13, this) == enumC31071a) {
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
                int i14 = this.f91046x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e2 = this.f91047y.f91066e;
                    Float f14 = new Float(AbstractC24904h.f97555a.mo7226i(this.f91048z.f55564c));
                    this.f91046x = 1;
                    if (c11344e2.m30551g(f14, this) == enumC31071a2) {
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
