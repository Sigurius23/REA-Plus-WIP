package p599wz;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p631xz.C38747x;
import p715kotlin.NoWhenBranchMatchedException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: wz.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C37762v extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f161740w;

    /* JADX INFO: renamed from: x */
    public int f161741x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37770y f161742y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37762v(C37770y c37770y, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f161740w = i13;
        this.f161742y = c37770y;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f161740w) {
            case 0:
                return new C37762v(this.f161742y, interfaceC30057d, 0);
            case 1:
                return new C37762v(this.f161742y, interfaceC30057d, 1);
            default:
                return new C37762v(this.f161742y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f161740w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C37762v) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f161740w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f161741x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C38747x c38747x = this.f161742y.f161780x;
                    this.f161741x = 1;
                    if (c38747x.m124158i(this) == enumC31071a) {
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
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f161741x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C37770y c37770y = this.f161742y;
                    InterfaceC37739n0 interfaceC37739n0 = c37770y.f161766K;
                    if ((interfaceC37739n0 instanceof C37733l0) || (interfaceC37739n0 instanceof C37736m0) || (interfaceC37739n0 instanceof C37724i0) || (interfaceC37739n0 instanceof C37727j0)) {
                        this.f161741x = 1;
                        if (C37770y.m121166j(c37770y, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    } else {
                        if (!(interfaceC37739n0 instanceof C37730k0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC37760u0 abstractC37760u0 = ((C37730k0) interfaceC37739n0).f161676w;
                        this.f161741x = 2;
                        if (C37770y.m121165g(c37770y, abstractC37760u0, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                } else if (i14 == 1) {
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    Object obj2 = ((C23468n) obj).f92940w;
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f161741x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f161741x = 1;
                    if (C37770y.m121168t(this.f161742y, false, null, this, 2) == enumC31071a3) {
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
