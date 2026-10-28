package a30;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p537ux.C35330f;
import p537ux.C35334h;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32275i;
import sz.EnumC33131g;
import t40.C33536f;

/* JADX INFO: renamed from: a30.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C0317p extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1092w;

    /* JADX INFO: renamed from: x */
    public int f1093x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0274a0 f1094y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0317p(C0274a0 c0274a0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1092w = i13;
        this.f1094y = c0274a0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1092w) {
            case 0:
                return new C0317p(this.f1094y, interfaceC30057d, 0);
            default:
                return new C0317p(this.f1094y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f1092w) {
            case 0:
                break;
        }
        return ((C0317p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1092w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f1093x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C33536f c33536f = this.f1094y.f950n;
                    this.f1093x = 1;
                    if (c33536f.m105906a(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    ((C23468n) obj).getClass();
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f1093x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f1093x = 1;
                Object objM36575A = AbstractC13091v.m36575A(new C13084s1(new C32139c0(this.f1094y.f938b.m108532a(EnumC33131g.Production, C35334h.f150537w, C35330f.f150532w), null, 2)), this);
                return objM36575A == enumC31071a2 ? enumC31071a2 : objM36575A;
        }
    }
}
