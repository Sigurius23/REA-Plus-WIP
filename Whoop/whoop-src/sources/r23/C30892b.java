package r23;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p007a6.C0416e;
import p505ts.AbstractC34132o;
import q30.C29938w0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: r23.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C30892b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127374w;

    /* JADX INFO: renamed from: x */
    public int f127375x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C30893c f127376y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30892b(C30893c c30893c, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f127374w = i13;
        this.f127376y = c30893c;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f127374w) {
            case 0:
                return new C30892b(this.f127376y, interfaceC30057d, 0);
            default:
                return new C30892b(this.f127376y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f127374w) {
            case 0:
                break;
        }
        return ((C30892b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f127374w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f127375x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C30893c c30893c = this.f127376y;
                C29938w0 c29938w0 = c30893c.f127379c;
                C0416e c0416e = new C0416e(c30893c, null, 15);
                this.f127375x = 1;
                Object objM91545A = c29938w0.m91545A(c0416e, this);
                return objM91545A == enumC31071a ? enumC31071a : objM91545A;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f127375x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f127375x = 1;
                Object objAwait = this.f127376y.await(this);
                return objAwait == enumC31071a2 ? enumC31071a2 : objAwait;
        }
    }
}
