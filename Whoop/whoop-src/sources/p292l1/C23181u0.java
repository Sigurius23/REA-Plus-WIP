package p292l1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p329n0.C26068u;
import p390p1.C28621h1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23181u0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91700w;

    /* JADX INFO: renamed from: x */
    public int f91701x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26068u f91702y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23181u0(int i13, C26068u c26068u, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f91700w = i13;
        this.f91702y = c26068u;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f91700w) {
            case 0:
                return new C23181u0(0, this.f91702y, interfaceC30057d);
            default:
                return new C23181u0(1, this.f91702y, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f91700w) {
            case 0:
                break;
        }
        return ((C23181u0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f91700w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f91701x;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C26068u c26068u = this.f91702y;
                        int iM87024x = ((C28621h1) c26068u.f103222e.f91958b).m87024x() + 1;
                        this.f91701x = 1;
                        if (c26068u.m77563f(iM87024x, 0, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    break;
                } catch (IllegalArgumentException unused) {
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f91701x;
                try {
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C26068u c26068u2 = this.f91702y;
                        int iM87024x2 = ((C28621h1) c26068u2.f103222e.f91958b).m87024x() - 1;
                        this.f91701x = 1;
                        if (c26068u2.m77563f(iM87024x2, 0, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    break;
                } catch (IllegalArgumentException unused2) {
                }
                return C23454a0.f92919a;
        }
    }
}
