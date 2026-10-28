package g40;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p445r0.C30835c;
import p445r0.InterfaceC30833a;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g40.e2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15344e2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57656w;

    /* JADX INFO: renamed from: x */
    public int f57657x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC30833a f57658y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15344e2(InterfaceC30833a interfaceC30833a, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f57656w = i13;
        this.f57658y = interfaceC30833a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f57656w) {
            case 0:
                return new C15344e2(this.f57658y, interfaceC30057d, 0);
            default:
                return new C15344e2(this.f57658y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f57656w) {
            case 0:
                break;
        }
        return ((C15344e2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f57656w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f57657x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f57657x = 1;
                    if (((C30835c) this.f57658y).m94839b(null, this) == enumC31071a) {
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
                int i14 = this.f57657x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f57657x = 1;
                    if (((C30835c) this.f57658y).m94839b(null, this) == enumC31071a2) {
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
